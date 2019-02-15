//Lab calculadora Roberto Figueroa y Michael Chan

import Utilities.AbstractPile;
import Utilities.FactoryPile;
import Utilities.Stack;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Main {



    public static void main(String[] args){
        FactoryPile<Integer> factory = new FactoryPile();
        Calculator calculator = new MyCalculator();                             //Instanciar clases
        Scanner scan = new Scanner(System.in);
        Stack<Integer> myPile = null;
        System.out.println("");
        System.out.println("Como desea implementar la stack: ");
        System.out.println("1.ArrayList\n2.Vector\n3.Lista");
        int op = scan.nextInt();
        switch (op){
            //se implementa
            case 1: myPile = factory.buildStack("AL"); break;
            case 3: myPile = factory.buildStack("LI"); break;
            case 4: myPile = factory.buildStack(""); break;
            default: System.out.println("Opcion no valida");
        }


            try{
                Scanner input = new Scanner(System.in);                             //Leer el archivo txt
                System.out.println("Ingrese el path del archivo: ");
                String path = input.next();
                System.out.println(path);
                File file = new File(path);
                BufferedReader br = new BufferedReader(new FileReader(file));
                String st = br.readLine();

                while(true){
                    String[] readLine = st.split(" ");
                    int result = 0;
                    for(int i=0;i<readLine.length;i++){
                        try{
                            myPile.push(Integer.parseInt(readLine[i]));             //Si es int lo ingresa al stack
                            System.out.println(Integer.parseInt((readLine[i])));
                        }
                        catch (Exception e){                                        //Si es un signo lo opera
                            int a = myPile.pop();
                            int b = myPile.pop();
                            try{
                                System.out.println(readLine[i]);
                                result = calculator.calculate(a,b,readLine[i]);
                                myPile.push(result);
                                System.out.println("->" + result);
                            }
                            catch (ArithmeticException d){
                                System.out.println("Encontrada division entre cero!");
                            }
                        }
                    }
                    System.out.println("Operacion: " + st);                         //Da los resultados
                    System.out.println("Resultado: " + result);
                    break;
                }
            }

            catch(Exception f){
                System.out.println(f);                                              //En caso no encuentra el archivo
                System.out.println("Archivo no encontrado!");
            }



    }
}