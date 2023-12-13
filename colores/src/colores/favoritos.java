/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colores;

/**
 *
 * @author User
 */
public class favoritos extends Colores {
    private String f1,f2,f3;
    public favoritos(String f1,String f2,String f3){
        this.f1=f1;
        this.f2=f2;
        this.f3=f3;
    }
    public String getF1(){return f1;}
    public String getF2(){return f2;}
    public String getF3(){return f3;}
    public void setF1(String f1){this.f1=f1;}
    public void setF2(String f2){this.f2=f2;}
    public void setF3(String f3){this.f3=f3;}
}
