//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    name("Linet")
    modulous(35,23)
    addition(6,7,13,10)
    sentence("I enjoy reading articles adventuring around nature")

}
fun name(word:String) {
    var name="Hello $word "
    println(name)
}
fun modulous(num1:Int, num2:Int):Int{
    var modulous= num1%num2
    println(modulous)
    return modulous
}
fun addition(num4:Int, num5:Int, num6:Int, num7:Int) :Int{
    var sum = num4+num5+num6+num7
    println(sum)
    return sum

}
fun sentence(string: String) {
    println(string)
}
