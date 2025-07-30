public class recursao{
    
    public static void main(String [] args){
        System.out.println("Teste:");
        int teste = exercicio6(3, 5);
        System.out.println(teste);
    }
    
    public static int exercicio1(int num1, int num2){
        if(num1 < 0 || num2 < 0){
            throw new IllegalArgumentException("O valor não pode ser negativo.");
        }
        if(num1 == 0 || num2 == 0){
            return 0;
        }
        int resultado = num1 + exercicio1(num1, num2-1);
        return resultado;
    }

    public static int exercicio2(int num1, int num2){
        if(num1 < 0 || num2 < 0){
            throw new IllegalArgumentException("O valor não pode ser negativo.");
        }
        if(num2 == 0){
            return num1;
        }
        int resultado = exercicio2(num1+1, num2-1);
        
        return resultado;
    }

    public static double exercicio3(double num1){
        if(num1 < 0){
            throw new IllegalArgumentException("O valor não pode ser negativo.");
        }
        if(num1 == 1){
            return 1;
        }
        return 1/num1+exercicio3(num1-1);
    }

    public static String exercicio4(String frase){
        if(frase.length() == 1){
            return frase;
        }
        return frase.charAt(frase.length()-1) + exercicio4(frase.substring(0, frase.length()-1)); 
    }

    public static int exercicio5(int num1){
        if(num1 == 1){
            return 1;
        }
        if(num1 == 2){
            return 2;
        }
        return 2 * exercicio5(num1-1) + 3 * exercicio5(num1-2);
    }

    public static int exercicio6(int m, int n){
        if(m==0){
            return n+1;
        }
        if(n==0){
            return exercicio6(m-1, 1);
        }
        return exercicio6(m-1, exercicio6(m, n-1));
    }

}