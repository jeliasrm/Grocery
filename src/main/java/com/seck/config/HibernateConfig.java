package com.seck.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;


import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.util.Properties;

/**
 * Created by elias on 19/06/17.
 */

@Configuration
@EnableJpaRepositories(basePackages = {"com.seck.repository"})
@EnableTransactionManagement
@PropertySource("classpath:hibernate.properties")
public class HibernateConfig {

    @Qualifier("environment")
    @Autowired
    private Environment env;

    @Bean
    public PlatformTransactionManager transactionManager(EntityManagerFactory emf) throws PropertyVetoException {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(emf);
        transactionManager.setDataSource(dataSource());
        return transactionManager;
    }

//    @Bean
//    public PersistenceExceptionTranslationPostProcessor exceptionTranslation(){
//       return new PersistenceExceptionTranslationPostProcessor();
//    }

    @Bean
    public ComboPooledDataSource dataSource() throws PropertyVetoException {

        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass(env.getProperty("db.driver"));
        dataSource.setJdbcUrl(env.getProperty("db.url"));
        dataSource.setUser(env.getProperty("db.username"));
        dataSource.setPassword(env.getProperty("db.password"));

        dataSource.setAcquireIncrement(1);
        dataSource.setMinPoolSize(Integer.parseInt(env.getProperty("hibernate.c3p0.min_size")));
        dataSource.setMaxPoolSize(Integer.parseInt(env.getProperty("hibernate.c3p0.max_size")));
        dataSource.setCheckoutTimeout(Integer.parseInt(env.getProperty("hibernate.c3p0.timeout")));
        dataSource.setMaxIdleTime(Integer.parseInt(env.getProperty("hibernate.c3p0.idle_max")));
        dataSource.setIdleConnectionTestPeriod(Integer.parseInt(env.getProperty("hibernate.c3p0.idle_test_period")));

        return dataSource;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() throws PropertyVetoException {

        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();

        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        vendorAdapter.setShowSql(true);


        factory.setDataSource(dataSource());
        factory.setJpaVendorAdapter(vendorAdapter);
        factory.setPackagesToScan(new String[] {"com.seck.model"});



        factory.setJpaProperties(hibernateProperties());

        return factory;
    }
    @Bean
    public LocalSessionFactoryBean sessionFactory() throws PropertyVetoException {
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
//        sessionFactory.setPackagesToScan(new String[] {"com.sanmina.dle.model"});
//        sessionFactory.setHibernateProperties(hibernateProperties());

        return sessionFactory;
    }

    Properties hibernateProperties() {
        Properties jpaProperties = new Properties();
        //hibernateProperties.put("hibernate.hbm2ddl.import_files", env.getProperty("hibernate.hbm2ddl.import_files"));
        jpaProperties.put("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
        jpaProperties.put("hibernate.ejb.naming_strategy", env.getProperty("hibernate.ejb.naming_strategy"));
        jpaProperties.put("hibernate.dialect", env.getProperty("hibernate.dialect"));
        jpaProperties.put("hibernate.temp.use_jdbc_metadata_defaults",env.getProperty("hibernate.temp.use_jdbc_metadata_defaults"));
        return jpaProperties;
    }

//    @Autowired
//    private Environment env;
//
//    @Bean
//    public PlatformTransactionManager transactionManager(EntityManagerFactory emf) throws PropertyVetoException {
//        JpaTransactionManager transactionManager = new JpaTransactionManager();
//        transactionManager.setEntityManagerFactory(emf);
//        transactionManager.setDataSource(dataSource());
//        return transactionManager;
//    }
//
//    @Bean
//    public ComboPooledDataSource dataSource() throws PropertyVetoException {
//        ComboPooledDataSource dataSource = new ComboPooledDataSource();
//        dataSource.setDriverClass("org.postgresql.Driver");
//        dataSource.setJdbcUrl("jdbc:postgresql://localhost:5432/grocery");
//        dataSource.setUser("usuario");
//        dataSource.setPassword("postgres");
//
//        dataSource.setAcquireIncrement(1);
//        dataSource.setMinPoolSize(1);
//        dataSource.setMaxPoolSize(100);
//        dataSource.setCheckoutTimeout(0);
//        dataSource.setMaxIdleTime(10);
//        dataSource.setIdleConnectionTestPeriod(10);
//
//        return dataSource;
//    }
//
//    @Bean
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory() throws PropertyVetoException {
//
//        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
//        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
//        vendorAdapter.setShowSql(true);
//
//        factory.setDataSource(dataSource());
//        factory.setJpaVendorAdapter(vendorAdapter);
//        factory.setPackagesToScan(new String[] {"com.seck.model"});
//
//        factory.setJpaProperties(hibernateProperties());
//
//        return factory;
//    }
//
//    @Bean
//    public LocalSessionFactoryBean sessionFactory() throws PropertyVetoException {
//        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
//        sessionFactory.setDataSource(dataSource());
//
//        return sessionFactory;
//    }
//
//    public Properties hibernateProperties(){
//        Properties jpaProperties = new Properties();
//
//        jpaProperties.put("hibernate.hbm2ddl.auto", "update");
//        jpaProperties.put("hibernate.ejb.naming_strategy", "org.hibernate.cfg.ImprovedNamingStrategy");
//        jpaProperties.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
//        jpaProperties.put("hibernate.temp.use_jdbc_metadata_defaults","true");
//
//        return jpaProperties;
//    }

//    @Bean
//    public DataSource dataSource(){
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName("org.postgresql.Driver");
//        dataSource.setUrl("jdbc:postgresql://localhost:5432/grocery");
//        dataSource.setUsername("usuario");
//        dataSource.setPassword("postgres");
//
//        return dataSource;
//    }

//    @Bean
//    public LocalSessionFactoryBean sessionFactory(){
//        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
//        sessionFactory.setDataSource(dataSource());
//        sessionFactory.setPackagesToScan("com.seck.model");
//        sessionFactory.setHibernateProperties(hibernateProperties());
//
//        return sessionFactory;
//    }

//    public Properties hibernateProperties(){
//        Properties properties = new Properties();
//        properties.put("hibernate.hbm2ddl.auto", "update");
//        properties.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
//        properties.put("hibernate.show_sql", "true");
//
//        return properties;
//    }

}
