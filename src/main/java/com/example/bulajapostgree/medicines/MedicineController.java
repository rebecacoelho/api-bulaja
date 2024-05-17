package com.example.bulajapostgree.medicines;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/api")
public class MedicineController {

    private final MedicineRepository medicineRepository;

    public MedicineController(MedicineRepository medicineRepository) {
        this.medicineRepository = medicineRepository;
    }


    @GetMapping("/medicines")
    public List<Medicine> list() {
        return this.medicineRepository.findAll();
    }

    @GetMapping("/medicine/{id}")
    public ResponseEntity<Medicine> medicineById(@PathVariable Long id) {
        Optional<Medicine> medicine = medicineRepository.findById(id);
        return medicine.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/medicine")
    public Medicine create(@RequestBody Medicine medicine) {
        return this.medicineRepository.save(medicine);
    }

    @DeleteMapping("/medicine/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        medicineRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
