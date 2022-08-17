/*4- Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos.
*/
fun main() {
    var calmo = 0
    var outrosCalmo = 0
    var jovemCalmo = 0
    var femNervo = 0
    var veioNervo = 0
    var mascAgre = 0
    while (true) {
        print("Digite sua idade (0 para sair): ")
        var idade = readln().toInt()
        if (idade == 0) {
            break
        }
        print("Qual seu sexo? (1-feminino / 2-masculino / 3-Outros) :")
        var sexo = readln().toInt()
        print("Digite: 1 - se é calma; 2 - se é nervosa; 3 - se é agressiva: ")
        var resp = readln().toInt()
        if (resp == 1) {
            calmo++
            if (sexo == 3) {
                outrosCalmo++
            }
            if (idade < 18) {
                jovemCalmo++
            }
        } else if (resp == 2) {
            if (sexo == 1) {
                femNervo++
            }
            if (idade > 40) {
                veioNervo++
            }
        } else if (resp == 3) {
            if (sexo == 2) {
                mascAgre++
            }
        }
    }
    println()
    println("Pessoas Calmas: $calmo")
    println("$outrosCalmo dos calmos responderam outros em sexo")
    println("$jovemCalmo dos calmos tem menos de 18 anos")
    println("$femNervo mulheres responderam que são nervosas")
    println("$veioNervo dos que são nervosos tem mais de 40 anos")
    println("$mascAgre homens responderam que são agressivos")
}