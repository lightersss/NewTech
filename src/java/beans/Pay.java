/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

/**
 *
 * @author Lighters
 */
public class Pay {
    String billnum;
    String pincode;

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
    String credict_num;
    String credict_typeString;

    public String getBillnum() {
        return billnum;
    }

    public void setBillnum(String billnum) {
        this.billnum = billnum;
    }

   

    public String getCredict_num() {
        return credict_num;
    }

    public void setCredict_num(String credict_num) {
        this.credict_num = credict_num;
    }

    public String getCredict_typeString() {
        return credict_typeString;
    }

    public void setCredict_typeString(String credict_typeString) {
        this.credict_typeString = credict_typeString;
    }
}
