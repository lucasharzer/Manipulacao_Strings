class String{
    constructor(){
        this.variavel = "linguagem de programação";
    }

    pegar_variavel(){
        // Variável
        return this.variavel;
    }

    pegar_tipo(){
        // Tipo da variável
        return typeof this.variavel
    }

    pegar_comprimento(){
        // Comprimento da variável
        return this.variavel.length
    }

    substituir_espacos(){
        // Substituir espaços por "-"
        return this.variavel.replace(/ /g, "-")
    }

    contar_e(){
        // Verificar quantas letras "e"
        return this.variavel.match(/e/g).length
    }

    tudo_minusculo(){
        // Colocar tudo em minúsculo
        return this.variavel.toLowerCase()
    }

    tudo_maiusculo(){
        // Colocar tudo em maiúsculo
        return this.variavel.toUpperCase()
    }

    primeira_letra_maiuscula(){
        // Colocar tudo em maiúsculo
        return this.variavel.charAt(0).toUpperCase() + this.variavel.toLowerCase().slice(1)
    }

    pegar_primeira_posicao(){
        // Pegar a primeira posição da string
        return this.variavel[0]
    }

    pegar_quinta_posicao(){
        // Pegar a quinta posição da string
        return this.variavel[4]
    }

    pegar_ultima_posicao(){
        // Pegar a última posição da string
        return this.variavel.slice(-1)
    }

    pegar_primeira_ate_sexta(){
        // Pegar da primeira até a sexta posição da string
        return this.variavel.slice(0, 6)
    }

    concatenar_palavra_javascript(){
        // Concatenar a variável com a palavra "javascript"
        // return this.variavel + "javascript"
        return `${this.variavel} javascript`
    }

    verificar_a(){
        return this.variavel.includes("a")
    }

    pegar_indice_programacao(){
        // Pegar o índice da palavra programação na variável
        return this.variavel.indexOf("programação")
    }

    converter_para_string(numero){
        // Converter um número em string
        let string = numero.toString();
        let tipo = typeof string;
        return [string, tipo]
    }

    converter_para_numero(string){
        // Converter uma string em número
        // let numero = parseInt(string)
        let numero = parseFloat(string)
        let tipo = typeof numero;
        return [numero, tipo]
    }

    // Chamar função dentro da outra
    // funcao1(){

    // }

    // get funcao2(){
    //     this.funcao1()
    // }

}

module.exports = String;