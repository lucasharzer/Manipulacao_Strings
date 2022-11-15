class String:
    def __init__(self):
        self.variavel = "linguagem de programação"
    
    def pegar_variavel(self):
        # Variável
        return self.variavel
    
    def pegar_tipo(self):
        # Tipo da variável
        return type(self.variavel)

    def pegar_comprimento(self):
        # Comprimento da variável
        return len(self.variavel)

    def substituir_espacos(self):
        # Substituir espaços por "-"
        return self.variavel.replace(" ", "-")
    
    def contar_e(self):
        # Verificar quantas letras "e"
        return self.variavel.count("e")
    
    def tudo_minusculo(self):
        # Colocar tudo em minúsculo
        return self.variavel.lower()
    
    def tudo_maiusculo(self):
        # Colocar tudo em maiúsculo
        return self.variavel.upper()

    def primeira_letra_maiuscula(self):
        # Colocar somente a primeira letra em maiúsculo
        return self.variavel.capitalize()

    def pegar_primeira_posicao(self):
        # Pegar a primeira posição da string
        return self.variavel[0]
    
    def pegar_quinta_posicao(self):
        # Pegar a quinta posição da string
        return self.variavel[4]

    def pegar_ultima_posicao(self):
        # Pegar a última posição da string
        return self.variavel[-1]

    def pegar_primeira_ate_sexta(self):
        # Pegar da primeira até a sexta posição da string
        return self.variavel[:6]
    
    def concatenar_palavra_python(self):
        # Concatenar a variável com a palavra "python"
        # return self.variavel + "python"
        return f"{self.variavel} python"
    
    def verificar_a(self):
        # Verificar se "a" está contido na variável
        if "a" in self.variavel:
            return True
        else:
            return False

    def pegar_indice_programacao(self):
        # Pegar o índice da palavra programação na variável
        # return self.variavel.index("programação")
        return self.variavel.find("programação")
    
    def converter_para_string(self, numero):
        # Converter um número em string
        string = str(numero)
        tipo = type(string)
        return string, tipo

    def converter_para_numero(self, string):
        # Converter uma string em número
        # numero = int(string)
        numero = float(string)
        tipo = type(numero)
        return numero, tipo
    
    # Chamar função dentro de outra:
    # def funcao1(self):
    #     pass

    # def funcao2(self):
    #     self.funcao1()
