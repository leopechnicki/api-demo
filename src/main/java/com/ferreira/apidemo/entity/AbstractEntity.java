package com.ferreira.apidemo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
public abstract class AbstractEntity implements Serializable {

    private static final long serialVersionUID = 5669111215084835149L;

    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false, unique = true)
    private Long id;

    @Getter
    @Column(name = "create_date", nullable = false)
    @JsonIgnore
    private Date createDate = new Date();

    @Getter
    @Setter
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "update_date")
    @JsonIgnore
    private Date updateDate = new Date();

}
