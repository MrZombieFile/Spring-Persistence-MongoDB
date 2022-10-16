package cat.itacademy.barcelonactiva.adria.s04.t02.n01.S04T02N01Adria.model.service;

import cat.itacademy.barcelonactiva.adria.s04.t02.n01.S04T02N01Adria.model.domain.Fruita;

import java.util.Optional;

public interface FruitaService {

    public Iterable<Fruita> findAll();

    public Optional<Fruita> findById(String id);

    public String deleteById(String id);

    public Fruita save(Fruita fruita);


}
