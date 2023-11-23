package com.example.execptions;

import javax.swing.*;

public class ExceptionCustomizada_2 {
    public static void main(String[] args){
        int[] numerador = {4, 5, 8, 10};
        int[] denominador = {2, 4, 0, 2, 8};

        for (int i = 0; i < denominador.length; i++) {
            try {
                if(numerador[i] %2 != 0)
                    throw new DivisaoNaoExataException("Divisão não exata!", numerador[i], denominador[i]);

                int resultado = numerador[i] / denominador[i];
                System.out.println(resultado);
            } catch (DivisaoNaoExataException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            } catch (ArithmeticException e ){
                JOptionPane.showMessageDialog(null,"Impossivel dividir por zero" +e.getMessage());
            }catch ( ArrayIndexOutOfBoundsException ex){
                JOptionPane.showMessageDialog(null, "Nãoo tem número para dividir!" + ex.getMessage());
            }

        }

        System.out.println("O programa continua...");
    }
}
