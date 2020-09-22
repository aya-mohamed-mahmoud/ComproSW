package com.miu.comproJobMicroservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TMRecord {
    @Id
    @GeneratedValue
    private int id;
}
