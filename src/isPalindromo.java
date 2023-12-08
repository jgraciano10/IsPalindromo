public class isPalindromo {


    public static void revisarPalabraPalindromo(String palabraARevisar){
        String palabraOriginal = palabraARevisar.toLowerCase();
        String[] palabraSeparada = palabraARevisar.toLowerCase().split("");
        String palabraAlreves = "";

        for (int i = palabraSeparada.length-1; i>=0; i--){
            palabraAlreves+=palabraSeparada[i].toLowerCase();
        }
        if(palabraOriginal.equals(palabraAlreves)){
            System.out.println("Es palindromo");
        }else{
            System.out.println("No es palindromo");
        }
    }
}
