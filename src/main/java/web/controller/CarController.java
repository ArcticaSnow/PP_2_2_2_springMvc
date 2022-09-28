package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(defaultValue = "5") int count, ModelMap model) {
        model.addAttribute("table_name", "Cars");
        model.addAttribute("cars", carService.someCarsList(count));
        return "cars";
    }
}