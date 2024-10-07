fun main(){

    /* Ejercicio 1
    Simulacion de sistema de turnos en un banco
    */
    
    println(".:: Ejercicio 1::.")
    val bancoQueue = Queue<Int>()
    
    for (i in 1..10){
        bancoQueue.enqueue(i)
    }
    
    println("Turnos de clientes inicial: $bancoQueue")
    
    for (i in 1..8){
        println("Atendiendo al cliente: ${bancoQueue.dequeue()}")
    }
    
    println("Clientes restantes a atender: ${bancoQueue.size()}")
    
    /* Ejercicio 2
    Gestion de tareas en cola
    */
    
    println("\n\n.:: Ejercicio 2 ::.")
    val tareasQueue = Queue<String>()
    
    tareasQueue.enqueue("Limpiar")
    tareasQueue.enqueue("Cocinar")
    tareasQueue.enqueue("Estudiar")
    tareasQueue.enqueue("Jugar")
    tareasQueue.enqueue("Leer")
    
    println("Tareas pendientes: $tareasQueue")
    
    while (!TareasQueue.isEmpty()){
        println (se esta realizando la tarea de: ${tareasQueue.dequeue()})
    }  
}
