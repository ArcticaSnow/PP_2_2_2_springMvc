package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.dao.CarDaoImp;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final CarDao carDao;

    public CarServiceImpl(CarDaoImp carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> allCarsList() {
        return carDao.allCarsList();
    }

    @Override
    public List<Car> someCarsList(int count) {
        return carDao.someCarsList(count);
    }
}
