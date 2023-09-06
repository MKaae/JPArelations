package com.example.jparelations.repositories;

import com.example.jparelations.entity.Town;
import org.springframework.data.jpa.repository.JpaRepository;
public interface TownRepository extends JpaRepository<Town, Integer> {
}
