package org.example.catbotspringai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.component.page.AppShellConfigurator;

@SpringBootApplication
@Theme("my-theme")
@Theme("my-theme")
@Theme("my-theme")
public class CatBotSpringAiApplication implements AppShellConfigurator {

    public static void main(String[] args) {
        SpringApplication.run(CatBotSpringAiApplication.class, args);
    }
}
