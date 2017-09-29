/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1_201602491;

/**
 *
 * @author W7-JUEGOS
 */
public class Usuario {
    int[] id;
    public String[] nombre;
    public String[] apellido;
    String[] user;
    int[] rol;
    String[] contraseña;
    int contador;
    
    public Usuario(){
        id = new int[100];
        nombre = new String[100];
        apellido = new String[100];
        user = new String[100];
        rol = new int[100];
        contraseña = new String[100];
        contador = 0;
    }
    
    //crea un nuevo registro de usuario
    public void nuevoUsuario(int id,String nombre,String apellido,String user,int rol,String contraseña){
        this.id[contador]=id;
        this.nombre[contador]=nombre;
        this.apellido[contador]=apellido;
        this.user[contador]=user;
        this.rol[contador]=rol;
        this.contraseña[contador]=contraseña;
        contador++;
    }
    
    //retorna verdadero si existe el usuario y la contraseña o falso si no
    public Boolean verificar(String usuario, String contraseña){
        for(int i=0; i<contador;i++){
            if(this.user[i].equals(usuario)&& this.contraseña[i].equals(contraseña)){
                return true;
            }
        }
        return false;
    }
    //Devuelve el rol del usuario ingresado con su contraseña
    public int getRol(String usuario, String contraseña){
        for(int i=0; i<contador; i++){
            if(this.user[i].equals(usuario)&& this.contraseña[i].equals(contraseña)){
                return rol[i];
            }
        }
        return 2;
    }
    //Devuelve el rol del usuario ingresado con su contraseña
    public int getID(String usuario, String contraseña){
        for(int i=0; i<contador; i++){
            if(this.user[i].equals(usuario)&& this.contraseña[i].equals(contraseña)){
                return i;
            }
        }
        return -1;
    }
    //Obtiene el nombre y apellido del usuario para mostrarlo en el frame de opciones.
    public String getDatos(String usuario, String nombre, String apellido){
        int pos=0;
        for(int i=0; i<contador; i++){
            if(this.user[i].equals(usuario)){
                this.user[i]=usuario;
                this.nombre[i]=nombre;
                this.apellido[i]=apellido;
                break;
            }
        }return usuario;
    }
}
