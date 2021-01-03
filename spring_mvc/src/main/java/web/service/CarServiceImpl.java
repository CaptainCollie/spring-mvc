package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl {

    @Autowired
    private Car car;

    public List<Car> getCarCountList(int count) {
        List<Car> carList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            carList.add(car.getCarList().get(i));
        }
        return carList;
    }
}
