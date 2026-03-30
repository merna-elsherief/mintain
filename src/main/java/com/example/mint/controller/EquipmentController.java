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

    @GetMapping("/types")
    public List<MaintainableUnitType> getTypes() {
        return service.getAllTypes();
    }

    @GetMapping("/types/{id}")
    public MaintainableUnitType getType(@PathVariable String id) {
        return service.getTypeById(id);
    }

    @PostMapping("/types")
    public MaintainableUnitType addType(@RequestBody MaintainableUnitType t) {
        return service.saveType(t);
    }

    @PutMapping("/types/{id}")
    public MaintainableUnitType updateType(@PathVariable String id, @RequestBody MaintainableUnitType t) {
        return service.updateType(id, t);
    }

    @DeleteMapping("/types/{id}")
    public String deleteType(@PathVariable String id) {
        service.deleteType(id);
        return "Type deleted successfully";
    }

    @GetMapping("/models")
    public List<MaintainableUnit> getAllModels() {
        return service.getAllModelsOnly();
    }

    @GetMapping("/models/{id}")
    public MaintainableUnit getModel(@PathVariable String id) {
        return service.getUnitById(id);
    }

    @PostMapping("/models")
    public MaintainableUnit addModel(@RequestBody MaintainableUnit m) {
        return service.saveModel(m);
    }

    @PutMapping("/models/{id}")
    public MaintainableUnit updateModel(@PathVariable String id, @RequestBody MaintainableUnit m) {
        return service.updateModel(id, m);
    }

    @GetMapping("/equipment")
    public List<MaintainableUnit> getAllEquipments() {
        return service.getAllEquipmentsOnly();
    }

    @GetMapping("/equipment/{id}")
    public MaintainableUnit getEquip(@PathVariable String id) {
        return service.getUnitById(id);
    }

    @PostMapping("/equipment")
    public MaintainableUnit addEquip(@RequestBody MaintainableUnit e) {
        return service.saveEquipment(e);
    }

    @PutMapping("/equipment/{id}")
    public MaintainableUnit updateEquip(@PathVariable String id, @RequestBody MaintainableUnit e) {
        return service.updateEquipment(id, e);
    }

    @GetMapping("/units")
    public List<MaintainableUnit> getAll() {
        return service.getAllUnits();
    }

    @GetMapping("/test-count")
    public String getCount() {
        return "Total records: " + service.countAll();
    }

    @DeleteMapping("/units/{id}")
    public String delete(@PathVariable String id) {
        service.deleteUnit(id);
        return "Unit deleted successfully";
    }

    @PostMapping("/manufacturers")
    public Manufactory addFact(@RequestBody Manufactory f) {
        return service.saveManufacturer(f);
    }

    @PostMapping("/characteristics")
    public OperationalCharacteristic addC(@RequestBody OperationalCharacteristic c) {
        return service.saveChar(c);
    }
}