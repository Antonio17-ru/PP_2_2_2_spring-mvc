package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.models.ModelsCar;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    private List<ModelsCar> cars = Arrays.asList(new ModelsCar(1, "Lada", "2101"),
            new ModelsCar(2,
                    "Toyota", "Camry"),
            new ModelsCar(3, "KIA", "K5"),
            new ModelsCar(4, "Honda", "Civic"),
            new ModelsCar(5, "Tesla", "Model3"));

    public List<ModelsCar> index(int num) {
        return cars.stream().limit(num).collect(Collectors.toList());
    }
}

