package course;

public class program02 {
    
        public static void main(String[] args) {
            
            String original = "abcde FGHIJ ABC abc DEFG      ";

            String s01 = original.toLowerCase();
            // transformar para minúsculo
            String s02 = original.toUpperCase();
            // transformar para maiúsculo
            String s03 = original.trim();
            // remover espaços
            String s04 = original.substring(2);
            // recortar começo
            String s05 = original.substring(2, 9);
            // recortar começo, fim
            String s06 = original.replace('a', 'x');
            // substituir 'a' por 'x'
            String s07 = original.replace("abc", "xy");
            // substituir 'abc' por 'xy'
            int i = original.indexOf("bc");
            // retorna o índice da primeira ocorrência de 'bc' no original
            int j = original.lastIndexOf("bc");
            // retorna o índice da última ocorrência de 'bc' no original


            String s = "potato apple lemon";

            String[] vect = s.split(" ");
            // separa a string por espaços

            System.out.println("Original: - " + original + "-");
            System.out.println("toLowerCase: - " + s01 + " -");
            System.out.println("toUpperCase: - " + s02 + " -");
            System.out.println("trim: - " + s03 + "-");
            System.out.println("substring(2): - " + s04 + " -");
            System.out.println("substring(2,9): - " + s05 + " -");
            System.out.println("replace('a', 'x'): - " + s06 + " -");
            System.out.println("replace('abc', 'xy'): - " + s07 + " -");
            System.out.println("indexOf('bc'): - " + i + " -");
            System.out.println("lastIndexOf('bc'): - " + j + " -");


            System.out.println(vect[0]);
            System.out.println(vect[1]);
            System.out.println(vect[2]);
        }
}
