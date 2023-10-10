package web.service;

import org.springframework.stereotype.Service;
import model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService{
    static List<Car> carList;

    static {
        System.out.println("List is exist");
        carList = new ArrayList<>();
        carList.add(new Car(1, "car1", 11));
        carList.add(new Car(2, "car2", 22));
        carList.add(new Car(3, "car3", 33));
        carList.add(new Car(4, "car4", 44));
        carList.add(new Car(5, "car5", 55));
    }


    @Override
    public List<Car> printCarList (int number) {




        if(number == 0 || number > 5){return carList;}
        return carList.stream().limit(number).collect(Collectors.toList());
    }



}
