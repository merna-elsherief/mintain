package com.example.mint.entity;

import lombok.Data;
import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "MAINTAINABLE_UNIT")
public class MaintainableUnit {

    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "PARENT_ID")
    private String parentId;

    @Column(name = "UNIT_LEVEL")
    private Integer unitLevel;

    @Column(name = "UNIT_NO")
    private String unitNo;

    @Column(name = "UNIT_NAME")
    private String unitName;

    @Column(name = "MANUFACTURER")
    private String manufacturer;

    @Column(name = "MAIN_TYPE_ID")
    private String mainTypeId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "SYS_DATE")
    private Date sysDate;

    @Column(name = "SITE")
    private String site;

    @Column(name = "TYPE_OF_RATE")
    private String typeOfRate;

    @Column(name = "EQUIP_STATUS")
    private String equipStatus;

    @PrePersist
    protected void onCreate() {
        if (this.sysDate == null) {
            this.sysDate = new Date();
        }
    }
}