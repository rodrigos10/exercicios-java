package exemplos.Carro;

import java.util.Scanner;

public class Carro {

    int velocidadeatual;

    void acelerar() {
        velocidadeatual += 5;

    }

    void frear() {
        if (velocidadeatual >= 5) {
            velocidadeatual -= 5;
        } else {
            velocidadeatual = 0;
        }
    }
       public String toString(){
        return  "Velocidade atual é " + velocidadeatual + "Km/h.";

  }
}






