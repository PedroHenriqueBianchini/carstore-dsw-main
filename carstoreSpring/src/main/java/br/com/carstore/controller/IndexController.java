package br.com.carstore.controller;

import br.com.carstore.model.Car;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/")
    public String index() {

        return "<h1>Hello, world!</h1>";

    }

    @GetMapping("/car")
    public ResponseEntity<Car> home() {

        Car car = new Car();
        car.setName("Fusca");
        car.setColor("Amarelo");

        return ResponseEntity.ok(car);

    }

    @PostMapping("/create-car")
    public ResponseEntity<Car> createCar(@RequestBody Car car) {

        System.out.printf("Car name: " + car.getName());
        System.out.println("Car color: " + car.getColor());

        return ResponseEntity.ok(car);

    }

}