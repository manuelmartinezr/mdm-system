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
public class Cliente {
    private String id, idCat, nombre, apellido, edad, cum, genero, estadoCivil,
                    tel, cel, email, nivelEd, rangoIngresos, dir; 
    private boolean contactoEmail, contactoTel, contactoSMS, contactoCorreo;

    public String getIdCat() {
        return idCat;
    }

    public void setIdCat(String idCat) {
        this.idCat = idCat;
    }
    
}
