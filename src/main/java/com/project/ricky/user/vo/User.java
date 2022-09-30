package com.project.ricky.user.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Set;

@Data
@Entity
@Builder
//@DynamicInsert
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TB_USER")
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

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

//    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinColumn(foreignKey = @ForeignKey(name = "userId"))
//    private Set<Authority> authorities;

    @Column(nullable = true)
    @ColumnDefault(value = "0")
    private int loginFailCnt;

    @NotBlank
    @Column(nullable = false, length = 1)
    private String userYn;

    @Column(nullable = false, length = 1)
    @ColumnDefault(value = "N")
    private String lockedYn;

    @CreatedDate
    private LocalDateTime regDate;

    @LastModifiedDate
    private LocalDateTime modDate;

    @CreatedDate
    private LocalDateTime loginDate;

    @ColumnDefault(value = "Y")
    private String useYn;

    @ColumnDefault(value = "ROLE_USER")
    private String role;

}
