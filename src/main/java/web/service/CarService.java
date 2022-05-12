package web.service;

import org.springframework.stereotype.Service;
import web.models.ModelsCar;

import java.util.List;
@Service
public interface CarService {
    List<ModelsCar> index(int num);
}
