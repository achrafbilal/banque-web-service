package ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

import java.util.Date;

@XmlRootElement(name = "compte")
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {
    private int code;
    private double salaire;
    @XmlTransient
    private Date createdAt;

    public Compte() {
    }

    public Compte(int code, double salaire, Date createdAt) {
        this.code = code;
        this.salaire = salaire;
        this.createdAt = createdAt;
    }

    public int getCode() {
        return code;
    }

    public Compte setCode(int code) {
        this.code = code;
        return this;
    }

    public double getSalaire() {
        return salaire;
    }

    public Compte setSalaire(double salaire) {
        this.salaire = salaire;
        return this;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Compte setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "code=" + code +
                ", salaire=" + salaire +
                ", createdAt=" + createdAt +
                '}';
    }
}
