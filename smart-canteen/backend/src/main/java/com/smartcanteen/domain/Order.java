package com.smartcanteen.domain;
import jakarta.persistence.*; import java.time.*; import java.util.*;
@Entity @Table(name="canteen_orders") public class Order { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) public Long id; public String pickupSlot; @Enumerated(EnumType.STRING) public Status status=Status.NEW; public Integer total=0; public String itemSummary; public String customerEmail; public Instant createdAt=Instant.now(); public enum Status{NEW,ON_STOVE,READY,PICKED_UP,CANCELLED} }
