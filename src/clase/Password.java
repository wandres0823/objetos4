/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

/**
 *
 * @author walbonis1
 */
public class Password {
    private int longitud;
    private String contrasena;
    public Password(int longitud,String contrasena ){
    this.longitud=longitud;
    this.contrasena=contrasena;
    
}

    public int getLongitud() {
        return longitud;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    public String fuerte(){
        String fuerte;
        
        if (this.longitud>=6) {
         fuerte="La contraseña suya  es fuerte";
        }else{
            fuerte="la contraseña esta debil";
        }
        
        return fuerte;
    }
    public Password cambiar_contraseña(){
        int longi;
        String clave;
        Password nueva_contrasena;
        
         longi = this.longitud;
        clave = this.contrasena;
        
        nueva_contrasena = new Password(longi,clave);
        return nueva_contrasena;
    }
     public Password ver(){
        Password pass;
       String clave;
       int longitu;
       clave=this.contrasena;
       longitu=this.longitud;
       pass=new Password(longitu,clave);
       return pass;
    }
}
