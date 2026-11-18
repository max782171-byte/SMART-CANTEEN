package com.smartcanteen.domain;
import jakarta.persistence.*;
@Entity public class MenuItem { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) public Long id; public String name; public String category; public String description; public String emoji; public Integer price; public boolean available=true; public MenuItem(){} public MenuItem(String name,String category,String description,String emoji,Integer price){this.name=name;this.category=category;this.description=description;this.emoji=emoji;this.price=price;} }
