package boletin21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author irodriguezsteuerberg
 */
public class Metodos {
PrintWriter esc = null;
FileWriter fich;
Scanner sc;

public Libro pedirDatos(){
Libro lib = new Libro(JOptionPane.showInputDialog("Introduce o titulo"),JOptionPane.showInputDialog("Introduce o autor"),
Float.parseFloat(JOptionPane.showInputDialog("Introduce o prezo")),
Integer.parseInt(JOptionPane.showInputDialog("Introduce o numero de unidades")));
return lib;
}

public void amosar(ArrayList<Libro> lista){
      System.out.println("Amosar :");
      Iterator it= lista.iterator();
      while(it.hasNext()){
      System.out.println(it.next());
       }
       
}

public void engadirLibro(String nomeFich){
 try {
Libro libro=pedirDatos();     
     
fich = new FileWriter(nomeFich,true);
esc = new PrintWriter(fich);    
esc.println(libro.toString());    
    } catch (IOException ex) {
        System.out.println("erro escribirNumeros "+ex.toString());
    }
    finally{
    esc.close();
    }   
    
}
public String pedirConsulta(){
String titulo = JOptionPane.showInputDialog("Introduce o titulo");
return titulo;
}

public void consultar(File fich){
 try {
    String titulo = pedirConsulta();
    sc = new Scanner(fich).useDelimiter(",\\s*"); //separa con comas
    while(sc.hasNext()){
        if (titulo.equals(sc.next())){
            String autor=sc.next();//saltar el autor
            float prezo = Float.parseFloat(sc.next());
            System.out.println("Prezo: "+prezo);    
        }
        else if (sc.hasNext())
        sc.nextLine();
    }  
    } catch (FileNotFoundException ex) {
        System.out.println("Erro ler palabra "+ex.toString());
    }
finally{
sc.close();
}
}

public void visualizar(File fich){
 try {
     System.out.println("O ficheiro conten: ");
      sc = new Scanner(fich);
        while(sc.hasNextLine()){
        System.out.println(sc.nextLine());    
      }
}catch (FileNotFoundException ex) {
        System.out.println("Erro ler liñas "+ex.toString());    
}
finally{
sc.close();
}
}


public void darBaixa(ArrayList<Libro> lista,File fich){
    try {    
    sc = new Scanner(fich).useDelimiter(",\\s*");
    while(sc.hasNextLine()){
    String titulo=sc.next();
    String autor=sc.next();
    float prezo=Float.parseFloat(sc.next());
    int unidades=Integer.parseInt(sc.next());
    sc.nextLine();
    Libro lib = new Libro(titulo,autor,prezo,unidades);
    lista.add(lib);
    }
      
    int contador=0;
    for (int j = 0; j < lista.size(); j++) {
    if(lista.get(j).unidades==0)
    contador++;    
    }
    
    for (int k = 0; k < contador; k++) {
        for (int i = 0; i <lista.size(); i++) {
        if (lista.get(i).unidades==0){
        lista.remove(lista.get(i));
        System.out.println("Libro dado de baixa.");
        }
        }    
    }
    

}catch (FileNotFoundException ex) {
        System.out.println("Erro ler liñas "+ex.toString());    
}
finally{
sc.close();
    
       }
}

public void escribirListaActualizada(String nomeFich,ArrayList<Libro> lista){
    try {
      
        fich = new FileWriter(nomeFich);
        esc = new PrintWriter(fich);
        for (int i = 0; i <lista.size(); i++) {
        esc.println(lista.get(i));
        }
    } catch (IOException ex) {
    System.out.println("Erro escribir Obxectos "+ex.toString());
    }
    finally{
    esc.close();
    }
}

public void modificarPrezo(ArrayList<Libro> lista){
String titulo=pedirConsulta();    
float prezoNovo=Float.parseFloat(JOptionPane.showInputDialog("Introduce o prezo novo"));
for (int i = 0; i <lista.size(); i++) {
        Libro lib=lista.get(i);
String titulo1 = lib.getTitulo();
if(titulo.equals(titulo1)){
lib.setPrezo(prezoNovo);
}
}

}

public void sair(){
    System.exit(0);
}

}


    
