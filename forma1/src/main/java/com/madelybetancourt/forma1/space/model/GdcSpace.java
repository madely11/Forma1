package com.madelybetancourt.forma1.space.model;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Data
@NoArgsConstructor
@Entity
@Table(name = "gdc_space")
public class GdcSpace implements Serializable{
    @Id
    @Column(name = "cod_space", nullable = false)
    private Integer codeSpace;
    @Column(name = "name",  length = 128, nullable = false)
    private String name;
    @Column(name = "description", length = 500, nullable = true)
    private String decription;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "creation_date", nullable = true)
    private Date creationDate;
    @Column(name = "visibility", length = 3, nullable = true)
    private String visibility;

    public GdcSpace (Integer codeSpace) {
        this.codeSpace = codeSpace;
    }
}
