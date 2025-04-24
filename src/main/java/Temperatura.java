public class Temperatura {
    //ATRIBUTO PRIVADO PARA ARMAZENAR TEMP - CELSIUS
    private double tempCelsius;
    
    //CONSTRUTOR - CRIA UM OBJETO COM TEMP INCIAL
    public Temperatura(double tempInicialCelsius){
        this.tempCelsius = tempInicialCelsius;
    }
        
        //GETTER - PARA LER A TEMPERATURA
        public double getTemperaturaCelsius(){
            return tempCelsius;
    }   
        
        //SETTER - PARA VOCÊ MUDAR A TEMP
        public void setTemperaturaCelsius(double mudarTempCelsius){
        this.tempCelsius = mudarTempCelsius;
        }
        
        //MÉTODO PARA CONVERTER CELSIUS PARA FAHRENHEIT
        public double converteFahrenheit(){
            return (tempCelsius*9/5)+32;
        }
        
        //MÉTODO PARA CONVENSER CELSIUS PARA KELVIN
        public double converteKelvin(){
            return tempCelsius+273.15;
        }
    
}

    
