package web.dao;

import web.model.Car;

import java.util.List;

public interface CarsDao {
    List<Car> getCarsList(Integer count);

}
