package com.example.mint.entity;

import lombok.Data;
import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "MAINTAINABLE_UNIT")
public class MaintainableUnit {
    @Id
    private String id;
    private String parentId;
    private Integer unitLevel;
    private String unitNo;
    private String unitName;
    private String manufacturer;
    private String mainTypeId;
    @Temporal(TemporalType.DATE)
    private Date sysDate;
    private String equipStatus;
}