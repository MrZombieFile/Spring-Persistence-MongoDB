package cat.itacademy.barcelonactiva.adria.s04.t02.n01.S04T02N01Adria.repository;

import cat.itacademy.barcelonactiva.adria.s04.t02.n01.S04T02N01Adria.entity.Fruita;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;



public interface FruitaRepository extends MongoRepository<Fruita, String> {
    public Optional<Fruita> findByName(String name);
}
