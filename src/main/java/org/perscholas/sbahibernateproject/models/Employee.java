package org.perscholas.sbahibernateproject.models;

import java.util.LinkedList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString.Exclude;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
public class Employee {
   @Id
   @NonNull
   int id;
   @NonNull
   String name;
   @NonNull 
   @Exclude
   String password;
   
   @ManyToMany
   List<Office> office = new LinkedList<>();
}

