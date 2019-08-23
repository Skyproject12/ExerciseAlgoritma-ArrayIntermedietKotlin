import java.util.*
import kotlin.collections.HashMap

fun main (args : Array<String>)  {
        bilanganSeringmuncul()
}
fun bilanganSeringmuncul ()  {
    var scan = Scanner(System.`in`)
    println("banyak bilangan")
    var banyakbilangan = scan.nextInt()
    var seringmuncul = IntArray(10)  ;
    for(t in 1..banyakbilangan){
        println("masukkan bilangan ke $t")
            seringmuncul[t] = scan.nextInt()
    }
    var a = 0
    for(i in 1..banyakbilangan){
        a  = a+ seringmuncul[i]
    }
    println("rata rata"+(a/banyakbilangan))
    makeMiddle(seringmuncul)
}

fun makeMiddle (nums : IntArray) : IntArray {
    var a = IntArray(10)
    if(nums.size %2==0){
        a [0] = nums[(nums.size/2)]
        a[1] = nums[nums.size/2]
    }
    else{
        a[0]= nums.size/2

    }
    println("nilai tengah"+a)
    return a
}