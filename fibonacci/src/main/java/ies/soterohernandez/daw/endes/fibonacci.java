package ies.soterohernandez.daw.endes;

public class fibonacci {
    
    public int tama�o; 
    public String nombre;
    
    public fibonacci(String nombre, int tama�o){
    
        this.nombre = nombre;
        this.tama�o = tama�o;
    
    }
    
    fibonacci(){}
    
    public void mostrarSerie(){
    
        System.out.println(this.nombre+" de tama�o "+this.tama�o+":");
        for (int i = 0; i<tama�o; i++){
            System.out.println(fibonacci(i)+" ");
        }
        System.out.println();
       
    }
    
    int fibonacci(int n){
        
        if (n>1){
            return fibonacci(n-1) + fibonacci(n-2);
        }        
        else if (n ==1){
            return 1;
        }
        else if (n == 0){
            return 0;        
        }
            
        else{
            
            System.out.println("Debes ingresar un tama�o mayor o igual a 1");
            return -1;
        }
    
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
    
        this.nombre = nombre;
    }
    
    public int getTama�o(){
    
        return tama�o;
    }
    
    public void setTama�o(int tama�o){
        
        this.tama�o = tama�o;    
    }
}