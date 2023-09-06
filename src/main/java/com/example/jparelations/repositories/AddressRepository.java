package com.example.jparelations.repositories;

import com.example.jparelations.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
public interface AddressRepository extends JpaRepository<Address, Integer> {
}
