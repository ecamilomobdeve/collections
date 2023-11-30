package iterators

import classes.Point
import java.util.LinkedList

/*
Allows to access the elements sequentially for operations such as, queries, modification
 */
object Iterator {
    /*
    Given a list of Points(x, y) objects, delete of the list those points in which X coordinate
    are out of the range [2..12]
     */
    fun usingIterator(){
        val someCollection: Collection<Int> = listOf(1,2,3)
        val someList: List<Int> = listOf(1,2,3,2)
        val someEmptyList: List<Int> = emptyList<Int>()
        val someArrayList: ArrayList<Int> = arrayListOf(1,2,3)
        someArrayList.add(4)
        val someSet: Set<Int> = setOf(1,2,3,3,3)
        val someEmptySet: Set<Int> = emptySet()
        val someLinkedList: LinkedList<String> = LinkedList()


        val l: List<Point?> = listOf(Point(1,2))
        val points: ArrayList<Point?> = arrayListOf()
        val listPoints: List<Point> = listOf()
        val x = points.toMutableList()
        for (i in 0..5){
            points.add(Point(kotlin.random.Random.nextInt(0,20),4))
        }
        points.forEach {
            print("(x:${it?.getX()} y:${it?.getY()}), ")
        }
        println()
        val pointsIterator: MutableIterator<Point?> = points.iterator()
        while (pointsIterator.hasNext()){
            val point = pointsIterator.next()
            if (point?.getX() !in 2..12){
                println("removing: ${point?.getX()} ")
                pointsIterator.remove()
            }
        }
        points.forEach {
            print("(x:${it?.getX()} y:${it?.getY()}), ")
        }
    }
}