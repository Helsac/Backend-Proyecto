package com.proyecto.crud.repositories;

import com.proyecto.crud.entities.GovernmentBFP;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RepositoryGovernmentBFP extends JpaRepository<GovernmentBFP, Long> {
	@Query("select gbfp from  GovernmentBFP gbfp where cast(gbfp.yearOfBalance as string) like %:filter% or "
			+ "gbfp.state like %:filter% or "
			+ "gbfp.category like %:filter% or "
			+ "gbfp.item like %:filter% or "
			+ "cast(gbfp.amount as string) like %:filter% or "
			+ "cast(gbfp.percentOfGdp as string) like %:filter%")
    List<GovernmentBFP> filterBy(@Param("filter") String filter);
}
