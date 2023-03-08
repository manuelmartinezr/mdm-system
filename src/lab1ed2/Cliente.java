/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1ed2;

/**
 *
 * @author manuel
 */
public class Cliente extends Item {
    private String id, idCat, nombre, apellido, edad, cum, genero, estadoCivil,
                    tel, cel, email, nivelEd, rangoIngresos, dir; 
    private boolean contactoEmail, contactoTel, contactoSMS, contactoCorreo;

    public String getApellido() {
        return apellido;
    }
// setters - Editar un producto/cliente
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCum() {
        return cum;
    }

    public void setCum(String cum) {
        this.cum = cum;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNivelEd() {
        return nivelEd;
    }

    public void setNivelEd(String nivelEd) {
        this.nivelEd = nivelEd;
    }

    public String getRangoIngresos() {
        return rangoIngresos;
    }

    public void setRangoIngresos(String rangoIngresos) {
        this.rangoIngresos = rangoIngresos;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public boolean isContactoEmail() {
        return contactoEmail;
    }

    public void setContactoEmail(boolean contactoEmail) {
        this.contactoEmail = contactoEmail;
    }

    public boolean isContactoTel() {
        return contactoTel;
    }

    public void setContactoTel(boolean contactoTel) {
        this.contactoTel = contactoTel;
    }

    public boolean isContactoSMS() {
        return contactoSMS;
    }

    public void setContactoSMS(boolean contactoSMS) {
        this.contactoSMS = contactoSMS;
    }

    public boolean isContactoCorreo() {
        return contactoCorreo;
    }

    public void setContactoCorreo(boolean contactoCorreo) {
        this.contactoCorreo = contactoCorreo;
    }

    
}
