package com.example.calmdown.service;

import com.example.calmdown.dto.MedicineRequest;
import com.example.calmdown.dto.MedicineResponse;
import com.example.calmdown.entity.Medicine;
import com.example.calmdown.entity.User;
import com.example.calmdown.repository.MedicineRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MedicineService {

    private final MedicineRepository medicineRepository;

    public void create(MedicineRequest medicineRequest){
        Medicine medicine = new Medicine(
                null, medicineRequest.getDosing(), medicineRequest.getTime(),
                new User(medicineRequest.getUser_id())
        );

        medicineRepository.save(medicine);
    }
    public MedicineResponse read(Long userID){
        Medicine medicine = medicineRepository.findMedicineByUser_Id(userID);
        if(medicine == null){
            return null;
        }

        MedicineResponse medicineResponse = new MedicineResponse(
                medicine.getDosing(),
                medicine.getTime()
        );

        return medicineResponse;
    }
}
