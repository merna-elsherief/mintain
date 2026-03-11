package com.example.mint.entity;

import lombok.Data;
import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "MAINTAINABLE_UNIT_TYPE")
public class MaintainableUnitType {
    @Id
    private String id;
    private String typeName;
    private String notes;
    private String createdBy;
    @Temporal(TemporalType.DATE)
    private Date creationTime;
    private String enAbbreviation;
    private String isAgroupEq;
    private String isNotStandalone;
    private String basicCounter;
}