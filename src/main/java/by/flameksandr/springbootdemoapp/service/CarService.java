package by.flameksandr.springbootdemoapp.service;

import by.flameksandr.springbootdemoapp.domen.Car;
import by.flameksandr.springbootdemoapp.repository.CarRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public Car save(Car car) {
        return carRepository.save(car);
    }

    public Car getById(Integer id) {
        Optional<Car> car = carRepository.findById(id);
        return car.orElse(null);
    }

    public List<Car> getAll() {
        return carRepository.findAll();
    }

    public Car update(Car carFromDb, Car carFromClient) {
        BeanUtils.copyProperties(carFromClient, carFromDb, "id");
        return carRepository.save(carFromDb);
    }

    public void delete(Car car) {
        carRepository.delete(car);
    }
}
