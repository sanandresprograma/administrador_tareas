package com.sanandres.administrador_tareas.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "user")
@Entity
@ToString
@EqualsAndHashCode

public class Usuario {
     @Id
     @Getter @Setter @Column(name = "id")
     private Long id;
     @Getter @Setter @Column(name = "name")
     private String name;
     @Getter @Setter @Column(name = "email")
     private String email;
     @Getter @Setter @Column(name = "profile")
     private String profile;
     @Getter @Setter @Column(name = "tasks")
     private String tasks;
     @Getter @Setter @Column(name = "created_at")
     private Date created_at;



     public void created_at(String s) {
     }
}