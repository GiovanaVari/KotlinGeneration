import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach

internal class ClienteTest {

    val cliente = Cliente(
        "Zé",
        "r.vsd",
        "213124122"
    )

    @BeforeEach
    fun addItem() {
    cliente.addItem("Blusa")
    cliente.addItem("Camiseta")
    cliente.addItem("Chinelo")
    cliente.addItem("Meia")
    cliente.addItem("Cueca")
    }

    @Test
    fun removerItem() {
        cliente.removerItem("Cueca")

        assertEquals(4, cliente.listaItem.size)
        assertTrue(cliente.listaItem.contains("Blusa"))
    }

    @Test
    fun TesteAddItemDoBefore(){
        assertEquals(5, cliente.listaItem.size)
        assertFalse(cliente.listaItem.contains("Calça"))
    }
}