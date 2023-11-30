import java.util.LinkedList
import java.util.Vector
import kotlin.collections.ArrayList

/*
forEach, map, mapNotNull
mapIndexed, filter, predicates return a boolean that matches the predicate
filterNot discard elements with no matching
partition return a pair of list for true and false
filter not null
filter instance
take, drop,
for primitive types use average, sum, for String use numerical values from predicates .sumOf{it.length}
maxOrNull, minOrNull, count(){it>5}, joinToString(separator = "-", prefix = "pi://", limit = 5){"[$it]"}
*/

internal interface A {
    fun isEmpty()
}

internal class MyObject : A {
    override fun isEmpty() {
        println("interface is empty")
    }
}
internal class OtherObject : A {
    override fun isEmpty() {
        println("interface is empty")
    }
}
fun main(){
    val some: ArrayList<Int> = arrayListOf(1,4,2)
    var c: Collection<Int> = some
    val myIte = c.iterator()
    while (myIte.hasNext()){
        println(myIte.next())
    }


    val l: List<Int> = listOf(5, 7)
    println(l)
    c = l
    val mt: MutableList<Int> = arrayListOf(0, 2)
    println(mt)
    c = mt
    val linked: LinkedList<Int> = LinkedList<Int>()
    linked.add(10)
    linked.add(20)
    linked.addFirst(0)
    println(linked)
    c = linked
    val vector: Vector<Int> = Vector<Int>()
    vector.add(100)
    vector.add(200)
    vector.insertElementAt(150, 0)
    println(vector)
    c = vector
}

