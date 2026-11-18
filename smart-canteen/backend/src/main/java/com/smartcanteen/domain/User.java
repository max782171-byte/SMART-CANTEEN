package com.smartcanteen.domain;
import jakarta.persistence.*;
@Entity @Table(name="users") public class User { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) public Long id; @Column(unique=true, nullable=false) public String email; public String name; public String password; @Enumerated(EnumType.STRING) public Role role; public User(){} public User(String email,String name,String password,Role role){this.email=email;this.name=name;this.password=password;this.role=role;} public enum Role{STUDENT,STAFF,ADMIN} }
