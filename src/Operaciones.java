
public class Operaciones {
    
    private double valor, resultado;
    private int divisa, divisafinal;
   
    

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getDivisa() {
        return divisa;
    }

    public void setDivisa(int divisa) {
        this.divisa = divisa;
    }

    public int getDivisafinal() {
        return divisafinal;
    }

    public void setDivisafinal(int divisafinal) {
        this.divisafinal = divisafinal;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

  
    
    
    //constructor

    public Operaciones() {
        
           
    
    }
    
    
    //Operaciones
    
    public double convertir(){
        
       
        
        if (divisa ==0 && divisafinal ==1) {//dolares a euro a la fecha 13/3/2023
            resultado = valor * 0.93;
            
            
        }else if(divisa == 0 && divisafinal ==0){
            resultado = valor;
        
        }else if (divisa ==0 && divisafinal ==2) {//dolares a pesosdominicano a la fecha 13/3/2023
            resultado = valor * 54.98;       
            
        }else if (divisa ==1 && divisafinal ==0) {//euro a dolares a la fecha 13/3/2023
            resultado = valor * 58.92;
            
        }else if(divisa == 1 && divisafinal ==1){
            resultado = valor;
        
        }else if (divisa ==1 && divisafinal ==2) {//euro a pesosdomincano a la fecha 13/3/2023
            resultado = valor * 54.98;       
            
        }else if(divisa == 2 && divisafinal ==0){//PesosDominicano a dolares
            resultado = valor * 0.018;
        
        }else if(divisa == 2 && divisafinal ==1){//PesosDominicano a euro
            resultado = valor * 0.017;
        
        }else if(divisa == 2 && divisafinal ==2){
            resultado = valor;
        
        }
        
        return resultado;
    
    }
    
}
