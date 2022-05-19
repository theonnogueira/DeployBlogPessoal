package repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import models.Tema;

public interface TemaRepository extends JpaRepository<Tema, Long> {

	List<Tema> findAllByDescricaoContainingIgnoreCase(@Param("descricao") String descricao);

}
