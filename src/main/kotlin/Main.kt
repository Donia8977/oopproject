fun main(){

    val car1=Tesla(" tesla model x","red",260 )
    val car2=BMW("bmw x6","black",180)
    println("car model: ${car1.model}\n the car color is:${car1.color}\n the car speed is: ${car1.speed}\n the car fuel type is:${car1.get_fuel_type()} ")
    println("the car model: ${car2.model}\n the car color is:${car2.color}\n the car speed is :${car2.speed}\n the fuel type of the car is ${car2.get_fuel_type()}   ")
}
abstract class Car(var model:String,var color:String,var speed:Int){
    open fun get_fuel_type(){}
}
class BMW (model: String, color: String, speed: Int) :Car(model, color, speed){

    override fun get_fuel_type(){

        println(" the fuel type is gasloine 95")
    }

}
class Tesla(model: String, color: String, speed: Int) :Car(model, color, speed){
    override fun get_fuel_type() {
        println("there is no fuel type because this is an electric car ")
    }

}