package com.example.mybatis;

import lombok.Data;
import java.io.Serializable;

@Data
public class UserEntity implements Serializable {
    private Long id;
    private String username;
    private String password;
}
