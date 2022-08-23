import java.util.IdentityHashMap

class Aviao(
    var iden: Int = 0,
    val numAs: Int,
    val comp: String,
    val dest: String,
    val part: Boolean
) {
    fun tipo() {
        if (iden % 2 == 0) {
            println("Voo intenacional!")
        } else println("Voo nacional!")
    }

    fun particular() {
        if (part) {
            println("Voo particular!")
        } else {
            println("Voo publico!")
        }
    }
}
