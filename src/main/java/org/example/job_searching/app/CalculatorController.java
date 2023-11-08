package org.example.job_searching.app;

import org.example.job_searching.core.CalculationService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class CalculatorController {

    private final CalculationService service;

    public CalculatorController(CalculationService service) {
        this.service = service;
    }

    @PostMapping("/add")
    @ResponseBody
    public int getSum(@RequestBody ArrayList<Integer> numsToSum){
        return service.getSum(numsToSum);
    }

    @PostMapping("/mul")
    @ResponseBody
    public int getMul(@RequestBody ArrayList<Integer> numsToMul){
        return service.getMul(numsToMul);
    }

    @GetMapping("/strange_operation/{num1}/{num2}/{num3}")
    @ResponseBody
    public int getResult(@PathVariable int num1, @PathVariable int num2, @PathVariable int num3){
        return service.getMixedOperation(num1, num2, num3);
    }

    @GetMapping("/factorial/{n}")
    @ResponseBody
    public int getFactorial(@PathVariable int n){
        return service.getFactorial(n);
    }

}
