
package circunferencia;

public class Radio {
    
    private double radio;
    
    
    public Radio(){   
    }
    
    public Radio (double radio){
        this.radio = radio;
    }
    //metodos get y set
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    //metodos varios
    public double getLongitud(){
        return 2 * Math.PI * radio;
    }
    public double getArea(){
        return Math.PI * Math.pow(getRadio(), 2);
    }
    public double getVolumen(){
        return 4 * Math.PI*Math.pow(radio,3) / 3;
    }
}
