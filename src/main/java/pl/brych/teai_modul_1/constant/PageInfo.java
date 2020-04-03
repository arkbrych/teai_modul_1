package pl.brych.teai_modul_1.constant;

import lombok.Data;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix = "page-info")
public class PageInfo {


    private String author;

    private int creationDate;

    @EventListener(ApplicationReadyEvent.class)
    public void get() {
        System.out.println(author);
        System.out.println(creationDate);
    }
}
