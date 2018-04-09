package com.guotl.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.logging.Level;

/**
 * Created by guotianlin on 2018/4/9.
 */
@Log4j2
@Configuration
public class C3p0Configration {


    @Value("${mybatis.mapper-locations}")
    private String mapperLocations;

    @Bean(name = "dataSource")
    @Primary
    @ConfigurationProperties(prefix = "c3p0")
    public DataSource dataSource(){
        ComboPooledDataSource dataSource = DataSourceBuilder.create().type(com.mchange.v2.c3p0.ComboPooledDataSource.class).build();
//        dataSource.setAutoCommitOnClose(false);//TODO 为啥有的人这里要设置成false
        return dataSource;
    }

    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactoryBean sqlSessionFactory() {
        SqlSessionFactoryBean bean=new SqlSessionFactoryBean();
        bean.setDataSource(dataSource());
        //mapper文件目录
        try {
            Resource[] resources = new PathMatchingResourcePatternResolver().getResources(mapperLocations);
            if (resources == null || resources.length == 0){
                log.error("["+mapperLocations+"] can`t find Resources!");
            }else {
                bean.setMapperLocations(resources);
            }
        } catch (IOException e) {
            e.printStackTrace();
            log.error(e.getMessage());
        }
        return bean;
    }

}
