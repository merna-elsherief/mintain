package com.example.mint.dto;

import java.time.LocalDate;

public record EquipmentDTO(
        String id,
        String unitNo,
        String unitName,
        String parentId,
        Integer unitLevel,
        String manufacturer,
        String mainTypeId,
        String equipStatus,
        java.util.Date sysDate
) {}