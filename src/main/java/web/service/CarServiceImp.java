package web.service;

import org.springframework.stereotype.Service;
import model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService{
    @Override
    public List<Car> printCarList (List<Car> carList, int number) {
        if(number == 0 || number > 5){return carList;}
        return carList.stream().limit(number).collect(Collectors.toList());
    }



}
