package EmpSkytele1.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import EmpSkytele1.EmpRepository;
import EmpSkytele1.entities.EmpSky;


@Service
public class EmpService {

    @Autowired
    private EmpRepository empRepository;

    public EmpSky saveemp(EmpSky emp) {
       return  empRepository.save(emp);
    }

    public List<EmpSky> getemps(int limit) {
        return empRepository.findAll().stream().limit(limit).collect(Collectors.toList());
    }

    public List<EmpSky> findeempByAgeGreaterThan(int age) {
        return empRepository.findByAgeGreaterThan(age);
    }
}

