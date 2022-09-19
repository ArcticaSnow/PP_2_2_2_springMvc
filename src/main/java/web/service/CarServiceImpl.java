package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.dao.CarDaoImp;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private final CarDao carDao = new CarDaoImp();

    @Override
    public List<Car> allCarsList() {
        return carDao.allCarsList();
    }

    @Override
    public List<Car> someCarsList(int count) {
        return carDao.someCarsList(count);
    }
}
