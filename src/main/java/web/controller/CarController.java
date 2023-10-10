package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarService carService;

    private List<Car> carList;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    {
        System.out.println("List is exist");
        carList = new ArrayList<>();
        carList.add(new Car(1, "car1", 11));
        carList.add(new Car(2, "car2", 22));
        carList.add(new Car(3, "car3", 33));
        carList.add(new Car(4, "car4", 44));
        carList.add(new Car(5, "car5", 55));
    }
    @GetMapping()
    public String printCarList(@RequestParam(value = "count", defaultValue = "5") int cars, Model model) {
        List<Car> list = carService.printCarList(carList,cars);
        model.addAttribute("carList", list);
        return "cars";
    }

}
