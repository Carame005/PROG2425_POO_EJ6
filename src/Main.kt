data class Cliente(var nombre : String, var domicilio : String)



data class Compra( var cliente : String, var dia : Int, var monto : Double)



data class Domicilio(var calle : String, var numero : Int){
    fun dirCompleta() : String{
        return "El domicilio, su calle es $calle y su numero es el $numero"
    }
}

class RepositorioCompras(){

    fun agregarCompra(compra : Compra) : List<Compra>{
        var listaCompra = mutableListOf<Compra>()
        listaCompra.add(compra)

        return listaCompra
    }

    fun retornarDomicilio(domicilio: List<List<String>>): Set<String> {
        val domiciliosRetornados = mutableSetOf<String>()

        for (compra in domicilio) {
            if (compra.size > 3) {
                domiciliosRetornados.add(compra[3])
            }
        }
        return domiciliosRetornados
    }

}



fun main() {

}