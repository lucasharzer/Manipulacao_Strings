from manipulation import String


funcao = String()
print(f"\nManipulação de Strings\n- Variável: {funcao.pegar_variavel()}\n- Tipo: {funcao.pegar_tipo()}\n- Comprimento: {funcao.pegar_comprimento()}\n- Substituição: {funcao.substituir_espacos()}\n- Contar letras 'e': {funcao.contar_e()}\n- Minúsculo: {funcao.tudo_minusculo()}\n- Maiúsculo: {funcao.tudo_maiusculo()}\n- Colocar primeira letra em maiúsculo: {funcao.primeira_letra_maiuscula()}\n- Primeira posição: {funcao.pegar_primeira_posicao()}\n- Quinta posição: {funcao.pegar_quinta_posicao()}\n- Última posição: {funcao.pegar_ultima_posicao()}\n- Primeira até a sexta posição: {funcao.pegar_primeira_ate_sexta()}\n- Concatenação com 'python': {funcao.concatenar_palavra_python()}\n- Verificar se tem 'a': {funcao.verificar_a()}\n- Pegar o índice de 'programação': {funcao.pegar_indice_programacao()}\n- Converter 5 em string: {funcao.converter_para_string(5)}\n- Converter '5' em número: {funcao.converter_para_numero('5')}")
