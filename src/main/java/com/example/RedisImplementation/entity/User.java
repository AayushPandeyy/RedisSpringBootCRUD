package com.example.pagination.PaginationImplementation.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@RedisHash("User")
@Table(name = "users")
public class User {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String name;

    private String username;

    private String address;

    private Integer age;

    private Date dateOfBirth;
}
