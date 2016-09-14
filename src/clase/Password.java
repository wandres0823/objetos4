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
    private String contraseniaa;
    public Password(int longitud,String contrasenia ){
        this.longitud=longitud;
        this.contraseniaa=contrasenia;
    
}

    public int getLongitud() {
        return longitud;
    }

    public String getContrasena() {
        return contraseniaa;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public void setContrasena(String contrasena) {
        this.contraseniaa = contrasena;
    }
    
    public String fuerte(){
        String fuerte;
        
        if (this.longitud>=10) {
         fuerte="La contraseña suya  es fuerte y segura";
        }else if (this.longitud>=8){
            fuerte="la contraseña es fuerte ";
        }else if (this.longitud>=5){
            fuerte="la contraseña es debil ";
        }else{
            fuerte="la contraseña es muy debil y no es segura";
        }
        
        return fuerte;
    }
    public Password cambiar_contraseña(){
        int longi;
        String clave;
        Password nueva_contrasena;
        
         longi = this.longitud;
        clave = this.contraseniaa;
        
        nueva_contrasena = new Password(longi,clave);
        return nueva_contrasena;
    }
     public Password ver(){
        Password pass;
       String clave;
       int longitu;
       clave=this.contraseniaa;
       longitu=this.longitud;
       pass=new Password(longitu,clave);
       return pass;
    }
}
