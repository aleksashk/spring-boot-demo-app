package by.flameksandr.springbootdemoapp.repository;

import by.flameksandr.springbootdemoapp.domen.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Integer> {

}
