package web.service;

import org.springframework.stereotype.Component;
import model.Car;

import java.util.List;
@Component()
public interface CarService {

   public List<Car> printCarList(List<Car> carList, int number);


}
