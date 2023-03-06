package com.example.pagination.PaginationImplementation.dto;

import com.example.pagination.PaginationImplementation.entity.User;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {

    Long id;

    private String name;

    private String username;

    private String address;

    private Integer age;

    private Date dateOfBirth;

    public UserDTO toDto(User user){
        UserDTO userDTO = UserDTO.builder()
        .name(user.getName())
                .username(user.getUsername())
                        .address(user.getAddress())
                                .age(user.getAge())
                                        .dateOfBirth(user.getDateOfBirth()).
                build();
        return userDTO;
    };

    public User toEntity(UserDTO userDTO){
        User user = User.builder()
                .name(userDTO.getName())
                .username(userDTO.getUsername())
                .address(userDTO.getAddress())
                .age(userDTO.getAge())
                .dateOfBirth(userDTO.getDateOfBirth()).
                build();
        return user;
    }


}
