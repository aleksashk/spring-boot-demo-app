package by.flameksandr.springbootdemoapp.controller;

import by.flameksandr.springbootdemoapp.domen.Car;
import by.flameksandr.springbootdemoapp.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/car")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping
    public List<Car> getAll() {
        return carService.getAll();
    }

    @GetMapping("/{id}")
    public Car getById(@PathVariable("id") Car car) {
        return car;
    }

    @PostMapping
    public Car save(@RequestBody Car car) {
        return carService.save(car);
    }

    @PutMapping("/{id}")
    public Car update(@PathVariable("id") Car car, @RequestBody Car carClient) {
        return carService.update(car, carClient);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Car car) {
        carService.delete(car);
    }
}
