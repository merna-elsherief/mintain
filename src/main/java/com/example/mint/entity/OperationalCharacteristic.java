package com.example.mint.entity;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "OPERATIONAL_CHARACTERISTIC")
public class OperationalCharacteristic {
    @Id
    private String id;
    private String typeCode;
    private String eqId;
    private String axesNo;
    private String tankCapacity;
    private String fuelType;
}
