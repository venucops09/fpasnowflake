package com.example.fpasnowflake.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="FPA")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class FpaFileEntity {

    @Id
    @Generated
    private int fpaid;

    @Column
    private String firstname;

    @Column
    private String lastname;

    @Column
    private int age;

}
