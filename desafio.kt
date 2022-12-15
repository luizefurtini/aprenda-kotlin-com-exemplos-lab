// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { easy, medium, hard }

class Usuario

data class ConteudoEducacional(var nome: String, val duracao: Int = 180, var area: String )

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

fun main() {
    TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}
