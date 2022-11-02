package Veteriner.demo.Entities;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
@Data
@Entity
@Getter
@Setter
@Table(name="Uye", schema="MUSTERI")
@NoArgsConstructor
public class Uye {
    @Id
    @Column(name="Id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name="Name")
    private String name;
}
