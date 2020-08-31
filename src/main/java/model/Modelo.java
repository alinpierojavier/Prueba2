
package model;

public class Modelo {
    private int num1;
    private int num2;
    private int Resultado;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getResultado() {
        return Resultado;
    }

    public void setResultado(int Resultado) {
        this.Resultado = Resultado;
    }
    
    //GENERAMOS UN MÉTODO de multiplicar PARA LA  tipo publico
    //Pero no va recibir ningun parámetro porque vamos tomarlo de las propiedades.
    
    public int multiplicar()
    {
        this.Resultado=this.num1*this.num2;
        return this.Resultado;
    }
}
