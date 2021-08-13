package appConversorMonedas;

public class Operaciones {

    private double recibe, resultado;
    private int divisaUno, divisaDos;

    public double getRecibe() {
        return recibe;
    }

    public void setRecibe(double recibe) {
        this.recibe = recibe;
    }

    public int getDivisaUno() {
        return divisaUno;
    }

    public void setDivisaUno(int divisaUno) {
        this.divisaUno = divisaUno;
    }

    public int getDivisaDos() {
        return divisaDos;
    }

    public void setDivisaDos(int divisaDos) {
        this.divisaDos = divisaDos;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public Operaciones() {
    }

    public double converPesoADivisa() {

        if (divisaUno == 0 && divisaDos == 0) { //de pesos a dolares
            resultado = recibe * 0.0002538;
        } else if (divisaUno == 0 && divisaDos == 1) { //de pesos a Euros
            resultado = recibe * 0.000216136;
        } else if (divisaUno == 0 && divisaDos == 2) { //de pesos a libra
            resultado = recibe * 0.0001838;
        } else if (divisaUno == 0 && divisaDos == 3) { //de pesos a dolar canadiense
            resultado = recibe * 0.0003178;
        } else if (divisaUno == 0 && divisaDos == 4) { //de pesos a pesos
            resultado = recibe;
        }

        return resultado;
    }
    
    public double converDivisaAPeso() {

        if (divisaUno == 1 && divisaDos == 4) { //de dolar a pesos  
            resultado = recibe * 3859;
        } else if (divisaUno == 2 && divisaDos == 4) { //de Euros a pesos  
            resultado = recibe * 4625;
        } else if (divisaUno == 3 && divisaDos == 4) { //de libra a pesos
            resultado = recibe * 5443;
        } else if (divisaUno == 4 && divisaDos == 4) { //de dolar canadiense a pesos
            resultado = recibe * 3148;
        } else if (divisaUno == 0 && divisaDos == 4) { //de pesos a pesos
            resultado = recibe;
        }

        return resultado;

    }
    
    public double converUsdADivisa(){
        
        if (divisaUno == 1 && divisaDos == 1){ //de dolar a euro
            resultado= recibe * 0.85;        
        }
        else if(divisaUno == 1 && divisaDos == 4){ //de dolar a pesos
            resultado= recibe * 3859;        
        }
        else if(divisaUno == 1 && divisaDos == 2){ //de dolar a libra
            resultado= recibe * 0.72; 
        }
        else if(divisaUno == 1 && divisaDos == 3){ // de dolar a dolar canadiense
            resultado= recibe * 1.25; 
        }
        else if(divisaUno == 1 && divisaDos == 0){// de dolar a dolar
            resultado= recibe;
        }
        
        return resultado;
    }
    
    public double converDivisaAUsd(){
        
        if (divisaUno == 1 && divisaDos == 0){ //de dolar a dolar
             resultado= recibe;     
        }
        else if(divisaUno == 2 && divisaDos == 0){ //de euro a dolar
            resultado= recibe * 1.17;        
        }
        else if(divisaUno == 3 && divisaDos == 0){ //de libra a dolar
            resultado= recibe * 1.38; 
        }
        else if(divisaUno == 4 && divisaDos == 0){ // de dolar canadiense a dolar
            resultado= recibe * 0.80; 
        }
        else if(divisaUno == 0 && divisaDos == 0){ //
            resultado= recibe * 3859;  
        }
        
        return resultado;
        
    }
    
    public double converEurADivisa(){
        
        if (divisaUno == 2 && divisaDos == 1){ //de euro a euro
            resultado= recibe;       
        }
        else if(divisaUno == 2 && divisaDos == 4){ //de euro a pesos
            resultado= recibe * 4530;        
        }
        else if(divisaUno == 2 && divisaDos == 2){ //de euro a libra
            resultado= recibe * 0.85; 
        }
        else if(divisaUno == 2 && divisaDos == 3){ // de euro a dolar canadiense
            resultado= recibe * 1.47; 
        }
        else if(divisaUno == 2 && divisaDos == 0){// de euro a dolar
            resultado= recibe * 1.17;
        }
        
        return resultado;
    }
    
    public double converDivisaAEur(){
        
        if (divisaUno == 1 && divisaDos == 1){ //de dolar a euro
            resultado= recibe * 0.85;   
        }
        else if(divisaUno == 2 && divisaDos == 1){ //de euro a euro
            resultado= recibe;      
        }
        else if(divisaUno == 3 && divisaDos == 1){ //de libra a euro
            resultado= recibe * 1.18; 
        }
        else if(divisaUno == 4 && divisaDos == 1){ // de dolar canadiense a euro
            resultado= recibe * 0.68; 
        }
        else if(divisaUno == 0 && divisaDos == 1){ //de pesos a euro
            resultado= recibe * 0.00022;  
        }
        
        return resultado;
    }
    
    public double converLibADivisa(){
        
        if (divisaUno == 3 && divisaDos == 1){ //de libra a euro
            resultado= recibe * 1.18; 
        }
        else if(divisaUno == 3 && divisaDos == 4){ //de libra a pesos
            resultado= recibe * 5329.28;        
        }
        else if(divisaUno == 3 && divisaDos == 2){ //de libra a libra
            resultado= recibe;
        }
        else if(divisaUno == 3 && divisaDos == 3){ // de libra a dolar canadiense
            resultado= recibe * 1.73; 
        }
        else if(divisaUno == 3 && divisaDos == 0){// de libra a dolar
            resultado= recibe * 1.38;
        }
        
        return resultado;
    }
    
    public double converDivisaALib(){
        
        if (divisaUno == 1 && divisaDos == 2){ //de dolar a libra
            resultado= recibe * 0.72;   
        }
        else if(divisaUno == 2 && divisaDos == 2){ //de euro a libra
            resultado= recibe * 0.85;       
        }
        else if(divisaUno == 3 && divisaDos == 2){ //de libra a libra
            resultado= recibe;
        }
        else if(divisaUno == 4 && divisaDos == 2){ // de dolar canadiense a libra
            resultado= recibe * 0.58; 
        }
        else if(divisaUno == 0 && divisaDos == 2){ //de pesos a libra
            resultado= recibe * 0.00018;  
        }
        
        return resultado;
    }
    
    public double converDCADivisa(){
        
        if (divisaUno == 4 && divisaDos == 1){ //de dolar canadiense a euro
            resultado= recibe * 0.68; 
        }
        else if(divisaUno == 4 && divisaDos == 4){ //de dolar canadiense a pesos
            resultado= recibe * 3082;        
        }
        else if(divisaUno == 4 && divisaDos == 2){ //de dolar canadiense a libra
            resultado= recibe * 0.58; 
        }
        else if(divisaUno == 4 && divisaDos == 3){ // de dolar canadiense a dolar canadiense
            resultado= recibe;
        }
        else if(divisaUno == 4 && divisaDos == 0){// de dolar canadiense a dolar
            resultado= recibe * 0.80;
        }
        
        return resultado;
    }
    
    public double converDivisaADC(){
        
        if (divisaUno == 1 && divisaDos == 3){ //de dolar a dolar canadiense
            resultado= recibe * 1.25;   
        }
        else if(divisaUno == 2 && divisaDos == 3){ //de euro a dolar canadiense
            resultado= recibe * 1.47;       
        }
        else if(divisaUno == 3 && divisaDos == 3){ //de libra a dolar canadiense
            resultado= recibe * 1.73;
        }
        else if(divisaUno == 4 && divisaDos == 3){ // de dolar canadiense a dolar canadiense
            resultado= recibe; 
        }
        else if(divisaUno == 0 && divisaDos == 3){ //de pesos a dolar canadiense
            resultado= recibe * 0.00032;  
        }
        
        return resultado;
    }
    

}
