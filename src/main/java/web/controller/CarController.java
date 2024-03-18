package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;


@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String carController(@RequestParam(required = false) Integer count, ModelMap model) {
        model.addAttribute(new CarServiceImpl().carsListCounted(count));
        return "cars";
    }
}

//
