package com.example.mint.controller;

import com.example.mint.entity.*;
import com.example.mint.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/maintenance")
public class EquipmentController {

    @Autowired private EquipmentService service;

    @PostMapping("/types")
    public MaintainableUnitType addType(@RequestBody MaintainableUnitType t) {
        return service.saveType(t);
    }

    @PostMapping("/models")
    public MaintainableUnit addModel(@RequestBody MaintainableUnit m) {
        return service.saveModel(m);
    }

    @PostMapping("/equipment")
    public MaintainableUnit addEquipment(@RequestBody MaintainableUnit e) {
        return service.saveEquipment(e);
    }

    @GetMapping("/units")
    public List<MaintainableUnit> getUnits() {
        return service.getAllUnits();
    }

    @PutMapping("/units")
    public MaintainableUnit updateUnit(@RequestBody MaintainableUnit u) {
        return service.updateUnit(u);
    }

    @DeleteMapping("/units/{id}")
    public void deleteUnit(@PathVariable String id) {
        service.deleteUnit(id);
    }

    @PostMapping("/manufacturers")
    public Manufactory addFactory(@RequestBody Manufactory f) {
        return service.saveManufacturer(f);
    }

    @PostMapping("/characteristics")
    public OperationalCharacteristic addChar(@RequestBody OperationalCharacteristic c) {
        return service.saveCharacteristic(c);
    }
}
