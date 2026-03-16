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

    public List<MaintainableUnitType> getAllTypes() { return typeRepo.findAll(); }
    public MaintainableUnitType getTypeById(String id) { return typeRepo.findById(id).orElse(null); }
    public MaintainableUnitType saveType(MaintainableUnitType t) { return typeRepo.save(t); }
    public void deleteType(String id) { typeRepo.deleteById(id); }

    public MaintainableUnit saveModel(MaintainableUnit m) {
        m.setParentId("0");
        m.setUnitLevel(1);
        return unitRepo.save(m);
    }

    public MaintainableUnit updateModel(String id, MaintainableUnit details) {
        return unitRepo.findById(id).map(existing -> {
            existing.setUnitNo(details.getUnitNo());
            existing.setUnitName(details.getUnitName());
            existing.setMainTypeId(details.getMainTypeId());
            existing.setUnitLevel(1);
            existing.setParentId("0");
            return unitRepo.save(existing);
        }).orElse(null);
    }

    public MaintainableUnit saveEquipment(MaintainableUnit e) {
        e.setUnitLevel(3);
        return unitRepo.save(e);
    }

    public MaintainableUnit updateEquipment(String id, MaintainableUnit details) {
        return unitRepo.findById(id).map(existing -> {
            existing.setUnitNo(details.getUnitNo());
            existing.setUnitName(details.getUnitName());
            existing.setManufacturer(details.getManufacturer());
            existing.setParentId(details.getParentId());
            existing.setUnitLevel(3);
            return unitRepo.save(existing);
        }).orElse(null);
    }

    public List<MaintainableUnit> getAllUnits() { return unitRepo.findAll(); }
    public MaintainableUnit getUnitById(String id) { return unitRepo.findById(id).orElse(null); }
    public void deleteUnit(String id) { unitRepo.deleteById(id); }

    public Manufactory saveManufacturer(Manufactory f) { return factoryRepo.save(f); }
    public OperationalCharacteristic saveChar(OperationalCharacteristic c) { return charRepo.save(c); }

    public MaintainableUnitType updateType(String id, MaintainableUnitType details) {
        return typeRepo.findById(id).map(existing -> {
            existing.setTypeName(details.getTypeName());
            existing.setNotes(details.getNotes());
            existing.setEnAbbreviation(details.getEnAbbreviation());
            existing.setBasicCounter(details.getBasicCounter());
            return typeRepo.save(existing);
        }).orElse(null);
    }
}