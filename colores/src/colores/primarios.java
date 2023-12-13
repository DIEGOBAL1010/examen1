/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colores;

/**
 *
 * @author User
 */
public class primarios extends Colores{
    private String p1,p2,p3;
    public primarios(String p1,String p2,String p3){
        this.p1=p1;
        this.p2=p2;
        this.p3=p3;
    }
    public String getP1(){return p1;}
    public String getP2(){return p2;}
    public String getP3(){return p3;}
    public void setP1(String p1){this.p1=p1;}
    public void setP2(String p2){this.p2=p2;}
    public void setP3(String p3){this.p3=p3;}
    
    public void mostrarPrimarios(){
        System.out.println(p1 + " " + p2+" " + p3);
    }
}
