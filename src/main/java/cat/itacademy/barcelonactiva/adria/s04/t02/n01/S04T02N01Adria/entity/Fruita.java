package cat.itacademy.barcelonactiva.adria.s04.t02.n01.S04T02N01Adria.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "fruites")
public class Fruita implements Serializable {
    @Id
    private String id;

    private String name;

    private int quantityKilos;

    public Fruita(String name, int quantityKilos){
        this.name = name;
        this.quantityKilos = quantityKilos;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantityKilos() {
        return quantityKilos;
    }

    public void setQuantityKilos(int quantityKilos) {
        this.quantityKilos = quantityKilos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }



}
