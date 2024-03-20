package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class CarsDaoImpl implements CarsDao {
    private List<Car> carList;
    @Override
    public List<Car> getCarsList(Integer count) {
        carList = new ArrayList<>();
        carList.add(new Car("Kia K5", 2021, 35000));
        carList.add(new Car("Mercedes E200", 2019, 40000));
        carList.add(new Car("Audi A4", 2017, 30000));
        carList.add(new Car("Mitsubishi L200", 2014, 18000));
        carList.add(new Car("Hyundai I40", 2016, 22000));
        Collections.shuffle(carList);
        if (count != null && count > 0 && count < 5) {
            return carList.subList(0, count);
        } else {
            return carList;
        }
    }
}
