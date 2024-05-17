package come.selfstudy.listener.config;

import come.selfstudy.listener.service.CustomListener;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomConfiguration {
    @Bean
    public CustomListener customListener() {
        return new CustomListener();
    }
}
