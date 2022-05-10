package kg.easy.sqlextasks.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Data
public class Laptop {
    @Id
    private Integer code;
    @ManyToOne
    @JoinColumn(name = "model")
    private Product product;
    private int speed;
    private int hd;
    private int ram;
    private double price;
    private int screen;
}
