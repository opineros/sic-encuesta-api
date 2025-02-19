package sic.gov.sic_encuesta.domain;

import java.util.Date;

public class Survay {
    private int id;
    private String name;
    private String lastName;
    private Date registrationDate;
    private String email;
    private PcBrand pcBrand;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public PcBrand getPcBrand() {
        return pcBrand;
    }

    public void setPcBrand(PcBrand pcBrand) {
        this.pcBrand = pcBrand;
    }
}
