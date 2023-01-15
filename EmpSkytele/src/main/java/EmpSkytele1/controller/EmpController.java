package EmpSkytele1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import EmpSkytele1.entities.EmpSky;
import EmpSkytele1.service.EmpService;


@Controller
public class EmpController {

    @Autowired
    private EmpService empService;

    @PostMapping
    public EmpSky createEmps(@RequestBody EmpSky emp) {
        return empService.saveemp(emp);
    }


    @GetMapping
    public List<EmpSky> getemps(@RequestParam(value = "limit", defaultValue = "3") int limit) {
        return empService.getemps(limit);
    }

    @GetMapping("/ages")
    public List<EmpSky> getUsersByAgeGreaterThan(@RequestParam("gt") int age) {
        return empService.findeempByAgeGreaterThan(age);
    }
}

