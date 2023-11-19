package com.red.red.entidad;

import java.util.Date;

import org.hibernate.annotations.GenericGenerator;

import com.red.red.enumeration.RolCategory;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Publication {
    
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private String content;
    private String idUser;
    
    @Temporal(TemporalType.DATE)
    private Date datePubli;

    @OneToOne
    private ImgPubli imgPubli;

    @Enumerated(EnumType.STRING)
    private RolCategory rolCategory;

    public Publication() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getFechaPubli() {
        return datePubli;
    }

    public void setFechaPubli(Date datePubli) {
        this.datePubli = datePubli;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public RolCategory getRolCategory() {
        return rolCategory;
    }

    public void setRolCategory(RolCategory rolCategory) {
        this.rolCategory = rolCategory;
    }

    public ImgPubli getImgPubli() {
        return imgPubli;
    }

    public void setImgPubli(ImgPubli imgPubli) {
        this.imgPubli = imgPubli;
    }
    
}
