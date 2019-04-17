package com.sim.ws.SimProject;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "Bug", path = "bug")

//This repository is an interface and will allow you to perform various operations
// involving Empresa objects.
// It gets these operations by extending the PagingAndSortingRepository
// interface defined in Spring Data Commons.
// https://docs.spring.io/spring-data/commons/docs/current/api/org/springframework/data/repository/PagingAndSortingRepository.html

public interface BugRepository extends PagingAndSortingRepository<Bug,Integer> {

    List<Bug> findByUsuari(@Param("usuari") String usuari);

    @Transactional(readOnly = false)
    @Modifying
    @Query(value = "delete from Bug b where b.usuari = ?1")
    void deleteByUsuari(@Param("usuari") String usuari);

}

