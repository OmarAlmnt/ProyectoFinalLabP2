
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
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
       File f = new File("usuarios.txt");
       BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f,true), "utf-8")); 
       Scanner sc = new Scanner(f);
       int codigo = 0;
       while(sc.hasNextLine()){
           String linea = sc.nextLine();
           Scanner sl = new Scanner(linea);
           sl.useDelimiter("\\s*;\\s*");

           codigo = Integer.parseInt(sl.next());

       }
       writer.write((codigo+1)+";"+usuario+";"+password+";"+nombres+";"+apellidos+";"+correo+";"+nivelacceso);
       writer.newLine();
  
       writer.close();
    }
    
}
