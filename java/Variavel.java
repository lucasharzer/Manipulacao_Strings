public class Variavel {
    String variavel;

    void pegar_variavel() {
        // Variável
        System.out.println("- Variável: " + this.variavel);
    }

    void pegar_tipo() {
        // Tipo da variável
        System.out.println("- Tipo: " + this.variavel.getClass().getSimpleName());
    }

    void pegar_comprimento() {
        // Comprimento da variável
        System.out.println("- Comprimento: " + this.variavel.length());
    }

    void substituir_espacos() {
        // Substituir espaços por "-"
        System.out.println("- Substituição: " + this.variavel.replace(" ", "-"));
    }

    void contar_e() {
        // Verificar quantas letras "e"
        int contagem = 0;
        char caractere;
        for (int i = 0; i < this.variavel.length(); i++) {
            caractere = this.variavel.charAt(i);
            if (caractere == 'e') {
                contagem++;
            }
        }

        System.out.println("- Contar letras 'e': " + contagem);
    }

    void tudo_minusculo() {
        // Colocar tudo em minúsculo
        System.out.println("- Minúsculo: " + this.variavel.toLowerCase());
    }

    void tudo_maiuculo() {
        // Colocar tudo em maiúsculo
        System.out.println("- Maiúsculo: " + this.variavel.toUpperCase());
    }

    void primeira_letra_maiuscula() {
        // Colocar somente a primeira letra em maiúsculo
        System.out.println("- Colocar primeira letra em maiúsculo: " + this.variavel.substring(0,1).toUpperCase() + this.variavel.substring(1).toLowerCase());
    }

    void pegar_primeira_posicao() {
        // Pegar a primeira posição da string
        // System.out.println("- Primeira posição: " + this.variavel.substring(0,1));
        System.out.println("- Primeira posição: " + this.variavel.charAt(0));
    }

    void pegar_quinta_posicao() {
        // Pegar a quinta posição da string
        // System.out.println("- Quinta posição: " + this.variavel.substring(4,5));
        System.out.println("- Quinta posição: " + this.variavel.charAt(4));
    }

    void pegar_ultima_posicao() {
        // Pegar a última posição da string
        // System.out.println("- Última posição: " + this.variavel.substring(this.variavel.length()-1));
        System.out.println("- Última posição: " + this.variavel.charAt(this.variavel.length()-1));
    }

    void pegar_primeira_ate_sexta() {
        // Pegar da primeira até a sexta posição da string
        System.out.println("- Primeira até a sexta posição: " + this.variavel.substring(0, 6));
    }

    void concatenar_palavra_java() {
        // Concatenar a variável com a palavra "java"
        // System.out.println("- Concatenação com 'java': " + this.variavel + " " + "java");
        System.out.println("- Concatenação com 'java': " + this.variavel.concat(" ").concat("java"));
    }

    void verificar_a() {
        // Verificar se "a" está contido na variável
        System.out.println("- Verificar se tem 'a': " + this.variavel.contains("a"));
    }

    void pegar_indice_programacao() {
        // Pegar o índice da palavra programação na variável
        System.out.println("- Pegar o índice de 'programação': " + this.variavel.indexOf("programação"));
    }

    void converter_para_string(float numero) {
        // Converter uma string em número
        String string = String.valueOf(numero);
        System.out.println("- Converter 5 em string: " + string + ", " + string.getClass().getSimpleName());
    }

    void converter_para_numero(String string) {
        // Converter uma string em número
        float numero = Integer.parseInt(string);
        System.out.println("- Converter '5' em número: " + numero + ", " + ((Object)numero).getClass().getSimpleName());
    }

}