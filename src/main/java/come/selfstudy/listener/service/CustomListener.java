package come.selfstudy.listener.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

//@Component
public class CustomListener implements ApplicationListener<ContextRefreshedEvent> {
    private static final Logger logger = LogManager.getLogger(CustomListener.class);
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        logger.info("This is my customListener!");
        System.out.println("Our spring boot starter is working!");
    }
}

