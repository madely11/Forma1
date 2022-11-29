package com.madelybetancourt.forma1.user.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class SegUserSpacePK implements Serializable {

    @Column(name = "cod_user", nullable = false)
    private Integer codeUser;
    
    @Column(name = "cod_space", nullable = false)
    private Integer codeSpace;
}
