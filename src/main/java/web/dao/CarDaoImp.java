package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {
    @Override
    public List<Car> allCarsList() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Audi", 1999, "red"));
        carList.add(new Car("Ford", 2015, "black"));
        carList.add(new Car("Honda", 2003, "blue"));
        carList.add(new Car("Lada", 2014, "gray"));
        carList.add(new Car("Mazda", 1995, "green"));
        return carList;
    }

    @Override
    public List<Car> someCarsList(int count) {
        return allCarsList().stream().limit(count).toList();
    }
}
