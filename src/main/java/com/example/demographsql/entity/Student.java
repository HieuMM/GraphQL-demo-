package com.example.demographsql.entity;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.asm.Advice;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table()
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    private String isn;
    private String title;
    private String name;
}
