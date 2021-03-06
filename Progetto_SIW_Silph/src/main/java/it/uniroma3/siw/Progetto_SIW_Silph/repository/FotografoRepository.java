package it.uniroma3.siw.Progetto_SIW_Silph.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.uniroma3.siw.Progetto_SIW_Silph.model.Fotografo;

@Repository
public interface FotografoRepository extends CrudRepository <Fotografo,Long> {
	//Aggiungere poi le query necessarie
	public List<Fotografo> findByNome (String nome);
}
