package com.example.mint.entity;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "MANUFACTORY")
public class Manufactory {
    @Id
    private String id;
    private String arName;
    private String enName;
    private String country;
    private String abbreviationName;
}