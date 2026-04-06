package com.example.mint.dao;

import com.example.mint.dto.EquipmentDTO;
import com.example.mint.entity.MaintainableUnit;
import org.springframework.stereotype.Component;

@Component
public class EquipmentDAO {

    public EquipmentDTO mapToDTO(MaintainableUnit unit) {
        if (unit == null) return null;
        return new EquipmentDTO(
                unit.getId(),
                unit.getUnitNo(),
                unit.getUnitName(),
                unit.getParentId(),
                unit.getUnitLevel(),
                unit.getManufacturer(),
                unit.getMainTypeId(),
                unit.getEquipStatus(),
                unit.getSysDate()
        );
    }

    public MaintainableUnit mapToEntity(EquipmentDTO dto, MaintainableUnit entity) {
        entity.setUnitNo(dto.unitNo());
        entity.setUnitName(dto.unitName());
        entity.setParentId(dto.parentId());
        entity.setUnitLevel(dto.unitLevel());
        entity.setManufacturer(dto.manufacturer());
        entity.setMainTypeId(dto.mainTypeId());
        entity.setEquipStatus(dto.equipStatus());
        return entity;
    }
}