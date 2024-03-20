package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarsDao;
import web.model.Car;


import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private CarsDao carsDao;

    @Autowired
    private CarServiceImpl(CarsDao carsDao) {
        this.carsDao = carsDao;
    }

    @Override
    public List<Car> getCarsList(Integer count) {
        return carsDao.getCarsList(count);
    }
}
