package com.madelybetancourt.forma1.space.model;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Data
@NoArgsConstructor
@Entity
@Table(name = "gdc_space")
public class GdcSpaceRecord implements Serializable{

    @Id
    @Column(name = "cod_space_record", nullable = false)
    private Integer codeSpaceRecord;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date", nullable = true)
    private Date date;
    @Column(name = "action",  length = 8, nullable = true)
    private String action;
    @Column(name = "username", length = 32, nullable = true)
    private String username;
    @Column(name = "description", length = 128, nullable = true)
    private String description;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "cod_space", referencedColumnName = "cod_space", insertable = false, updatable = false)
    })
    private Integer codeSpace;

    public GdcSpaceRecord (Integer codeSpace) {
        this.codeSpace = codeSpace;
    }
}
