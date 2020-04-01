package pl.brych.teai_modul_1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.brych.teai_modul_1.model.Car;
import pl.brych.teai_modul_1.service.CarService;

import java.util.List;

@RestController
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping
    public List<Car> get(){
        return carService.getCarList();
    }
}
