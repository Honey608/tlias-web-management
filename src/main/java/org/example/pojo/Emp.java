package org.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp {
    private Integer id;
    private String username;
    private Integer password;
    private short gender;
    private String image;
    private short job;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
