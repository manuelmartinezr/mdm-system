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
public class Producto extends Item {
    private String id, idCat, nombre, cortaDesc, largaDesc, imgPath;

    public String getCortaDesc() {
        return cortaDesc;
    }
// setters - Editar un producto/cliente
    public void setCortaDesc(String cortaDesc) {
        this.cortaDesc = cortaDesc;
    }

    public String getLargaDesc() {
        return largaDesc;
    }

    public void setLargaDesc(String largaDesc) {
        this.largaDesc = largaDesc;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }
    
}
