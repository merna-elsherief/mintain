package com.example.mint.service;

import com.example.mint.entity.*;
import com.example.mint.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EquipmentService {

    @Autowired private UnitRepo unitRepo;
    @Autowired private UnitTypeRepo typeRepo;
    @Autowired private ManufactoryRepo factoryRepo;
    @Autowired private CharacteristicRepo charRepo;

    public MaintainableUnitType saveType(MaintainableUnitType type) {
        return typeRepo.save(type);
    }

    public List<MaintainableUnitType> getAllTypes() {
        return typeRepo.findAll();
    }

    public MaintainableUnit saveModel(MaintainableUnit model) {
        model.setParentId("0");
        model.setUnitLevel(1);
        return unitRepo.save(model);
    }

    public MaintainableUnit saveEquipment(MaintainableUnit equipment) {
        equipment.setUnitLevel(3);
        return unitRepo.save(equipment);
    }

    public MaintainableUnit updateUnit(MaintainableUnit unit) {
        return unitRepo.save(unit);
    }

    public void deleteUnit(String id) {
        unitRepo.deleteById(id);
    }

    public List<MaintainableUnit> getAllUnits() {
        return unitRepo.findAll();
    }

    public Manufactory saveManufacturer(Manufactory factory) {
        return factoryRepo.save(factory);
    }

    public OperationalCharacteristic saveCharacteristic(OperationalCharacteristic characteristic) {
        return charRepo.save(characteristic);
    }
}
