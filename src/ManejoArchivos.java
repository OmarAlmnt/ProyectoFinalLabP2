
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author omaralmnt
 */
public class ManejoArchivos {

    public void CrearArchivoUsuarios(){
        File f = new File("usuarios.txt");
        try{
            boolean creado = f.createNewFile();
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error, el archivo no pudo ser creado. " + e);
        }
    }
    public void RegistrarUsuario(String usuario,String password, String nombres, String apellidos,String correo, int nivelacceso) throws IOException{
       CrearArchivoUsuarios();
       FileWriter fw = new FileWriter(new File("usuarios.txt")); 
       fw.write(usuario+";"+password+";"+nombres+";"+apellidos+";"+correo+";"+nivelacceso);
       fw.close();
    }
    
}
