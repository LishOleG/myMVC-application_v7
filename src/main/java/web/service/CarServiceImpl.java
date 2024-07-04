package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    @Autowired
    private CarDao carDao;

    public  CarServiceImpl (CarDao carDao) {
        this.carDao = carDao;
    }


    @Override
    public List<Car> viewsCars(int cout) {
        return carDao.viewsCars(cout);
    }
}




