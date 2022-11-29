package com.madelybetancourt.forma1.user.model;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.madelybetancourt.forma1.space.model.GdcSpace;


@Data
@NoArgsConstructor
@Entity
@Table(name = "seg_user_space")
public class SegUserSpace implements Serializable{

    @EmbeddedId
    private SegUserSpacePK pk;

    @Column(name = "role", length = 3, nullable = true)
    private String role;
    @Column(name = "status", length = 3, nullable = true)
    private String status;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "cod_user", referencedColumnName = "cod_user", insertable = false, updatable = false)
    })
    private SegUser user;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "cod_space", referencedColumnName = "cod_space", insertable = false, updatable = false)
    })
    private GdcSpace space;

    public SegUserSpace (SegUserSpacePK pk) {
        this.pk = pk;
    }
}
