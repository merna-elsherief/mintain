package com.example.mint.dto;

import java.util.Date;

public record EquipmentDTO(
        String id,
        String unitNo,
        String unitName,
        String parentId,
        Integer unitLevel,
        String manufacturer,
        String mainTypeId,
        String equipStatus,
        String site,
        String typeOfRate,
        Date sysDate
) {}