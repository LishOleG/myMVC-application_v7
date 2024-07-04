package web.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao {

    private static int CAR_COUNT;

    public List<Car> listAuto;

    {
        listAuto = Arrays.asList();

        listAuto.add(new Car(++CAR_COUNT, "Mercedes_2021", 63));
        listAuto.add(new Car(++CAR_COUNT, "BMW_2023", 5));
        listAuto.add(new Car(++CAR_COUNT, "Li_2023", 9));
        listAuto.add(new Car(++CAR_COUNT, "Audi_2020", 7));
        listAuto.add(new Car(++CAR_COUNT, "Land Cruiser_2022", 300));

    }

    @Override
    public List<Car> viewsCars(int count) {
        if (count >= listAuto.size()) {
            return listAuto;
        } else {
            return listAuto.subList(0, count);
        }
    }

}
