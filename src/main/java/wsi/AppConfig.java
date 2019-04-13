package wsi;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

@Configuration
//@PropertySource("classpath:aa.properties")
public class AppConfig extends WebMvcAutoConfiguration {

    @Bean
    @ConfigurationProperties(prefix="my.datasource")
    public DataSource myDataSource() {
        return DataSourceBuilder.create().build();
    }

}
