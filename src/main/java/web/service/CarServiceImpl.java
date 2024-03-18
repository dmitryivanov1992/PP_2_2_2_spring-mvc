package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarsDao;
import web.model.Car;


import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    @Autowired
    private CarsDao carsDao;

    @Override
    public List<Car> getCarsList(Integer count) {
        return carsDao.getCarsList(count);
    }
}
