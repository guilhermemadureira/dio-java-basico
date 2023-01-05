package edu.guilherme.segundasemana;
/**
 * MinhaClasse
 */
public class MinhaClasse {
    public static void main(String[] args) {
        
        String nomeCompleto = nomeCompleto("Guilherme","Madureira");
        System.out.println(nomeCompleto);
    }
    
    public static String nomeCompleto(String primeiroNOme, String segundoNome) {
        return "Result of the metod " + primeiroNOme.concat(" ").concat(segundoNome);
    }
}