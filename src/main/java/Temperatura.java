public class Temperatura {

    //ATRIBUTOS PRIVADOS
    private double graus;

    //CONSTRUTOR
    public Temperatura(double grausT) {
        this.graus = grausT;
    }

    //GETTER
    public double getGraus() {
        return graus;
    }
    //SETTER

    public void setGraus(double novoGraUs) {
        this.graus = novoGraUs;
    }
}

CELSIUS 
public class Celsius extends Temperatura {

    //CONSTRUTOR
    public Celsius(double grausT) {
        super(grausT);
    }

    //METODO PARA CONVERTER DE C PRA K
    public double converterCpraK() {
        return getGraus() + 273.15;
    }

    //METODO PARA CONVERTER DE °C PRA °F  
    public double converterCpraF() {
        return (getGraus() * 9 / 5) + 32;
    }

}
FAHRENHEIT 

public class Fahrenheit extends Temperatura {

    //CONSTRUTOR
    public Fahrenheit(double grausT) {
        super(grausT);
    }

    //MÉTODO PARA CONVERTER DE °F PARA °C
    public double converterFpraC() {
        return (getGraus() - 32) * 5 / 9;
    }

    // MÉTODO PARA CONVERTER DE °F PARA K
    public double converterFpraK() {
        return getGraus() + 273.15;
    }
}
KELVIN 

public class Kelvin extends Temperatura {

    //CONSTRUTOR
    public Kelvin(double grausT) {
        super(grausT);
    }

    //MÉTODO PARA CONVERTER DE K PARA °F
    public double converterKpraF() {
        return ((getGraus() - 273.15) * 9 / 5) + 32;
    }

    // MÉTODO PARA CONVERTER DE K PARA °C
    public double converterKpraC() {
        return getGraus() - 273.15;
    }
}
