package kodlama.io.rentACar.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "cars")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "plate", unique = true, nullable = false)
    private String plate;

    @Column(name = "dailyPrice")
    private Double dailyPrice;

    @Column(name = "modelYear")
    private Integer modelYear;

    @Column(name = "state")
    private Integer state;

    @ManyToOne
    @JoinColumn(name = "model_id")
    private Model model;
}