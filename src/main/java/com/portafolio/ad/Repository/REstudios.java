
package com.portafolio.ad.Repository;

import com.portafolio.ad.Entity.Estudios;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface REstudios extends JpaRepository<Estudios, Integer> {
        public Optional<Estudios> findByNombreE(String nombreE);
        public boolean existsByNombreE(String nombreE);
    }

