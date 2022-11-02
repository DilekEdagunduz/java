package Veteriner.demo.Repositories;

import Veteriner.demo.Entities.Uye;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UyeRepository extends JpaRepository<Uye,Long> {

    Optional<Uye> _findByUsername(String username);
    Optional<Uye> _Save(Uye uye);

}

