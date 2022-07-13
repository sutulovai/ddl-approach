package com.example.hibernate.entity;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "id", columnDefinition = "uuid")
    @GeneratedValue
    private UUID id;

    @Column(name = "user_name", length = 64, nullable = false)
    private String userName;

    @Column(name = "email", length = 128, nullable = true)
    private String email;

    @Column(name = "receive_notifications", nullable = false, columnDefinition = "boolean default true")
    private Boolean receiveNotifications;

}
