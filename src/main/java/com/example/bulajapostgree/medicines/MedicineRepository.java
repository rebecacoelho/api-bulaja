package com.example.bulajapostgree.medicines;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface MedicineRepository extends JpaRepository<Medicine, Long> {
}

