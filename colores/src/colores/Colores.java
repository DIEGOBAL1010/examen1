/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colores;

/**
 *
 * @author User
 */
public class Colores {
    public static void main(String[] args) {
        Colores color=new Colores();
        
        primarios Pri=new primarios("Rojo","Azul","Amarillo");
        Pri.mostrarPrimarios();
        secundarios Secu=new secundarios("naranja","morado","verde");
        
        favoritos Fav=new favoritos("cyan","morado","verde");
        
    }
    
}
