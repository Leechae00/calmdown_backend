package com.example.calmdown.repository;

import com.example.calmdown.entity.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicineRepository extends JpaRepository<Medicine, Long> {

    Medicine findMedicineByUser_Id(@Param("userID") Long userID);
}
