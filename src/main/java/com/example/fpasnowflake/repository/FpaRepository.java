package com.example.fpasnowflake.repository;

import com.example.fpasnowflake.entity.FpaFileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FpaRepository extends JpaRepository<FpaFileEntity, Integer> {

    @Query(value = "SELECT FPAID as \"fpaid\", FIRSTNAME as \"firstname\", LASTNAME as \"lastname\", AGE as \"age\" FROM FPA WHERE FPAID = ?", nativeQuery = true)
    FpaFileEntity getFpa(int id);

}
