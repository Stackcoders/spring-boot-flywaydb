package com.stackcoders.flyway;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.sql.DataSource;
import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;

import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/***
Created by Balaji SUndarajan on 20/01/2019
***/


@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "flywayEntityManagerFactory",
        transactionManagerRef = "flywayTransactionManager",
        basePackages = {"com.stackcoders.flyway.repositories"}
)
public class DataSourceConfig {

    @Primary
    @Bean(name = "primaryDataSource")
    @ConfigurationProperties(prefix = "primary.datasource")
    public DataSource flywayDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    public Flyway flyway() {
        Flyway flyway = new Flyway();
        flyway.setDataSource(flywayDataSource());
        flyway.setBaselineOnMigrate(false);
        flyway.setLocations("classpath:db/migration/primary");
        flyway.migrate();
        return flyway;
    }

  
    @Bean
    @Primary
    @DependsOn("flyway")
    @PersistenceContext(unitName = "primary") 
    public LocalContainerEntityManagerFactoryBean flywayEntityManagerFactory(EntityManagerFactoryBuilder builder,
            @Qualifier("primaryDataSource") DataSource dataSource) {

        return builder.dataSource(dataSource)
                .packages("com.stackcoders.flyway.model")
                .persistenceUnit("primary")
                .build();
    }

    @Bean
    @Primary
    public PlatformTransactionManager flywayTransactionManager(@Qualifier("flywayEntityManagerFactory") EntityManagerFactory entityManagerFactory) {
        return new JpaTransactionManager(entityManagerFactory);
    }
}
