package web.service;

import web.models.ModelsCar;

import java.util.List;

public interface CarService {
    List<ModelsCar> index(int num);
}
