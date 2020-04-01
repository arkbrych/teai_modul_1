package pl.brych.teai_modul_1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
public class Car {

    private String model;
    private String mark;

    public Car (String model, String mark){
        this.model = model;
        this.mark = mark;
    }

}
