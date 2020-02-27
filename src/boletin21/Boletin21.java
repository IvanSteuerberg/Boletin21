package boletin21;

import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author irodriguezsteuerberg
 */
public class Boletin21 {

    public static void main(String[] args) {
    ArrayList<Libro> listaLibros = new ArrayList();
    File f = new File("libros.txt");
    Metodos obx = new Metodos();
    int opcion;
    do{
    opcion = Integer.parseInt(JOptionPane.showInputDialog("   MENÚ  \n1-->Engadir libro\n2-->Consultar prezo "
    + "\n3-->Amosar"+ "\n4-->Dar de baixa os libros con 0 unidades\n5-->Cambiar prezo \n6-->Saír"));    
    switch(opcion){
        case 1:
        obx.engadirLibro("libros.txt");
        break;
        case 2:
        obx.consultar(f);
        break;
        case 3:
        obx.visualizar(f);
        break;
        case 4:
        obx.darBaixa(listaLibros, f);
        obx.escribirListaActualizada("libros.txt",listaLibros);
        break;
        case 5:
        obx.modificarPrezo(listaLibros);
        obx.escribirListaActualizada("libros.txt", listaLibros);
        break;
        case 6:
        obx.sair();
        
    }
    
    }while (opcion<6);
        
        
        
    }
    
}

    
    

