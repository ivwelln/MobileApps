package example.myapp.decor

data class Decoration(val rocks: String) {
}
enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF);
}
class Choice {
    companion object {
        var name: String = "lyric"
        fun showDescription(name:String) = println("My favorite $name")
    }
}
class MyClass {
    companion object {
        const val CONSTANT3 = "constant in companion"
    }
}
fun makeDecorations() {
    val decoration1 = Decoration("granite")
    println(decoration1)

    val decoration2 = Decoration("slate")
    println(decoration2)

    val decoration3 = Decoration("slate")
    println(decoration3)

    println (decoration1.equals(decoration2))
    println (decoration3.equals(decoration2))
}
fun main()
{
    makeDecorations()
    println(Choice.name)
    Choice.showDescription("pick")
    Choice.showDescription("selection")
}