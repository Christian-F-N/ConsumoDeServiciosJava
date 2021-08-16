/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author HP
 */
public class Detalle {
   String est_val,
id_act_per,
id_val_per;

    public Detalle() {
    }

    public Detalle(String est_val, String id_act_per, String id_val_per) {
        this.est_val = est_val;
        this.id_act_per = id_act_per;
        this.id_val_per = id_val_per;
    }

    public String getEst_val() {
        return est_val;
    }

    public void setEst_val(String est_val) {
        this.est_val = est_val;
    }

    public String getId_act_per() {
        return id_act_per;
    }

    public void setId_act_per(String id_act_per) {
        this.id_act_per = id_act_per;
    }

    public String getId_val_per() {
        return id_val_per;
    }

    public void setId_val_per(String id_val_per) {
        this.id_val_per = id_val_per;
    }
    

}
