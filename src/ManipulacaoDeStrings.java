public class ManipulacaoDeStrings {
    public static void main(String [] args) {

        String original = "abcde FGHIJ ABC abc DEFG     ";

        System.out.println("Original: -"+ original + "-"); // Variarel sem mudança
        System.out.println("lowerCase: -" + original.toLowerCase()+ "-"); // Tudo minúsculo
        System.out.println("upperCase: -" + original.toUpperCase()+ "-"); // Tudo maiúsculo
        System.out.println("trim: -" + original.trim()+ "-"); // Tira espaços
        System.out.println("substring(1 arg): -" + original.substring(6) + "-"); // Recorta a String do inicio até posição do caracter escolhida como argumento
        System.out.println("substring(2 args): -" + original.substring(2, 9) + "-"); // Define um limite específico para o recorte, com dois argumentos
        System.out.println("replace: -" + original.replace('a', 'x') + "-"); // substitui caracteres antigos por outros novos, sempre que ele achar um char 'a' substitui por 'x'. pode ser usado com mais caracteres
        System.out.println("replace: -" + original.replace("abc", "") + "-"); // pode ser usado com mais caracteres
        System.out.println("IndexOf: " + original.indexOf("bc")); // mostra a primeira ocorrencia de algum caracter escolhido, ou seja, mostra a posição que o "bc" tá
        System.out.println("lastIndexOf: " + original.lastIndexOf("bc\n")); // mostra a última ocorrencia do caracter escolhido
        System.out.println("\n");
        String testeSplit = "Potato Tomato Apple";
        System.out.println("testeSplit: "+ testeSplit);
        String[] vect = testeSplit.split(" "); // Split serve para separar um texto em pedaços menores.
        String word1 = vect[0];
        String word2 = vect[1];
        String word3 = vect[2];
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);

    }
}
