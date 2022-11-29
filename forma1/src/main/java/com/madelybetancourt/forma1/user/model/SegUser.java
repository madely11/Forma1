package com.madelybetancourt.forma1.user.model;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;


@Data
@NoArgsConstructor
@Entity
@Table(name = "seg_user")
public class SegUser implements Serializable{

    @Id
    @Column(name = "cod_user", nullable = false)
    private Integer codeUser;
    @Column(name = "username", length = 32, nullable = true)
    private String username;
    @Column(name = "name", length = 128, nullable = true)
    private String name;
    @Column(name = "email", length = 128, nullable = true)
    private String email;
    @Column(name = "status", length = 3, nullable = true)
    private String status;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "creation_date", nullable = true)
    private Date creationDate;

    public SegUser (Integer codeUser) {
        this.codeUser = codeUser;
    }
}