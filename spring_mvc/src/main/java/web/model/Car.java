package web.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Car {
    private String model;
    private int series;
    private String color;

    public Car () {
    }

    public Car(String model, int series, String color){
        this.model = model;
        this.series = series;
        this.color = color;
    }

    public List<Car> getCarList() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Toyota", 5, "Red"));
        carList.add(new Car("Lexus", 5, "Black"));
        carList.add(new Car("Subaru", 1, "White"));
        carList.add(new Car("Lada", 9, "Green"));
        carList.add(new Car("Peugeot", 8, "Blue"));
        return carList;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", color='" + color + '\'' +
                '}';
    }
}
