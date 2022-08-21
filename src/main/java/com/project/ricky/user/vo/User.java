package com.project.ricky.user.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idx;

    @NotBlank
    @Column(unique = true)
    private String userEmail;

    @NotBlank
    @Column(nullable = false)
    private String userPassword;

    @NotBlank
    @Column(nullable = false)
    private String userName;

    @NotBlank
    @Column(nullable = false)
    private String userPhone;

    @NotBlank
    @Column(nullable = false)
    private String role;

    @Column(nullable = true)
    private int loginCnt;

    @Column(nullable = false, length = 1)
    @NotBlank
    private String userYn;

}