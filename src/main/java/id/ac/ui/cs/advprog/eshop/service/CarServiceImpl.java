package id.ac.ui.cs.advprog.eshop.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import id.ac.ui.cs.advprog.eshop.model.Car;
import id.ac.ui.cs.advprog.eshop.repository.CarRepository;

@Service
public class CarServiceImpl implements CarService{
    @Autowired
    private CarRepository carRepository;
    @Override
    public Car create(Car car) {
        // TODO Auto-generated method stub
        carRepository.create(car);
        return car;
    }
    @Override
    public List<Car> findAll() {
        // TODO Auto-generated method stub
        Iterator<Car> carIterator = carRepository.findAll();
        List<Car> allCar = new ArrayList<>();
        carIterator.forEachRemaining(allCar::add);
        return allCar;
    }

    @Override
    public Car findById(String id) {
        return carRepository.findById(id);
    }
    @Override
    public void update(String carId, Car car) {
        carRepository.update(carId, car);
    }
    @Override
    public void deleteCarById(String carId) {
        carRepository.delete(carId);
    }
}