package com.ekinakin.money_transfer_project.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Person extends BaseEntity{
    private String name;
    private String surname;
}
