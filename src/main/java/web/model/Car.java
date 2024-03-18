package web.model;

import org.springframework.stereotype.Component;

public class Car {
    public String model;
    public int productionYear;
    public int price;

    public Car(String model, int productionYear, int price) {
        this.model = model;
        this.productionYear = productionYear;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", productionYear=" + productionYear +
                ", price=" + price +
                '}';
    }
}
