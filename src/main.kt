fun main(){

    var c = oddnumbers(5)
    println( Arrayofnames(arrayOf("AShaminis","Ashley","Phionamo")))
    robot(21)
    robot(5)
    multiplication()




}
    fun oddnumbers(i: Int) {
        for (number in 1..100) {
            if ((number % 2) != 0)

                println(number)

        }
    }
 fun Arrayofnames(names:Array<String>):Int{
      var number = 0
      names.forEach { x->
          if(x.length>5){
              number++
          }
      }
     return number
 }

 fun robot(age:Int){
     if(age<=6){
         println("Glass of milk")
     }
   else if(age>6 && age<15){
    println("Fanta Orange")
     }
   else{
    println("cocacola")
}
 }
fun multiplication() {
    for (w in 1..100) {
        if (w % 3 == 0) {
            println("Fizz")
        } else if (w % 5 == 0) {
            println("Buzz")
        }
        if(w%3==0 && w%5==0){
            println("FizzBuzz")

        }
    }
}