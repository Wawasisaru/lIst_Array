fun main() {

additionNumbers()
names("Saru","staicy","serah")
    println()
}
//
//1. Create one function that is given the below array:
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth elements (1 point
fun additionNumbers() {
    var numbers = arrayOf(32, 17, 4, 213, 78, 43, 90, 3, 31, 73, 11, 158, 62);
    println(numbers[1] + numbers[4])

//(ii) prints out the index of 158 (1 point)
    println(numbers.indexOf(158))

//(iii) prints out the elements in ascending order. (1 point)
    println(numbers.sorted())
}
//2. Given a list of Person objects, each with the attributes, name, age, height, and weight.
//Sort the list in order of descending age (2 points)
class Person(name: String,age: Int,height: Double,weight: Double){
    var details= mutableListOf(Person("Nancy",21,56.5,60.3),
        Person("Saru",20,4.6,56.5),
        Person("Wawasi",22,5.7,58.3))

}
//
//3. Create a function that takes in 3 names and returns a string array
//containing all 3 names. (2 points)
fun names(name1: String,name2: String,name3: String): String{
    var students = (name1+name2+name3)
    return students
}
//
//4. Write a function that takes in a list of Car objects each with a registration and
//mileage attribute and returns the average mileage of all the vehicles in the list. (3 points)
class Car(registration: Int,mileage: Double,){
    var vehicles = mutableListOf(Car(2345,6.5),
        Car(5678,5.4),
        Car(7834,7.9))
    fun mileage(list: List<Car>)
}