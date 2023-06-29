/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spotify2;

import javax.swing.JOptionPane;

/**
 *
 * @author 11alp
 */
public class Atributos {
    public String iddelacancion =""; {
    }

    public String getIddelacancion() {
        return iddelacancion;
    }

    public void setIddelacancion() {
    String id= JOptionPane.showInputDialog("Escriba el ID de la cancion: ");
    System.out.println("ID de la cancion:"+id);
        this.iddelacancion = iddelacancion;
    }
    public String titulo = ""; {
    
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo() {
    String titulo= JOptionPane.showInputDialog("Digite el titulo: ");
    System.out.println("Titulo:"+titulo);
        this.titulo = titulo;
    }
    private String autor = "";{   
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor() {
    String autor = JOptionPane.showInputDialog("Digite el autor: ");
    System.out.println("Autor:"+autor);
        this.autor = autor;
    }
    
    public String duracion = "";{
    
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion() {
    String tiempo;
    tiempo = JOptionPane.showInputDialog("Digite la duracion de la cancion: ");
    System.out.println("Duracion:"+tiempo);
        this.duracion = duracion;
    }
    public String AnodeCreacion = "";{
   
    }

    public String getAnodeCreacion() {
        return AnodeCreacion;
    }

    public void setAnodeCreacion() {
     String tiempo;
    tiempo = JOptionPane.showInputDialog("Digite el año de creacion: ");
    System.out.println("Año de Creacion:"+tiempo);
        this.AnodeCreacion = AnodeCreacion;
    }


    

}
