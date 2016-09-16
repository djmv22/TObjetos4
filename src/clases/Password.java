/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author DanielDeJesus
 */
public class Password {
    
    private String longitud;
    private String contraseña;
    
    
    public Password(String contraseña, String longitud){
        this.contraseña = contraseña;
        this.longitud = longitud;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }
    
    public String verificarNivelContraseña(){
        Password p;
        String longitud1,contraseña1;
        
        longitud1 = this.longitud;
        contraseña1 = this.contraseña;
        
        if (Integer.parseInt(longitud1)>= 1 && Integer.parseInt(longitud1)<6){
            longitud1 = String.valueOf("La contraseña es debil");
        }
        else if(Integer.parseInt(longitud1)==0){
            longitud1 = String.valueOf("");
        }
        else{
            longitud1 = String.valueOf("La contraseña es fuerte");
        }
        
        return longitud1;
    }
    
}
