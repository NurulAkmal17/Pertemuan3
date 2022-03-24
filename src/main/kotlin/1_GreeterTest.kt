//class member yaitu sebuah atribut dengan nama text dan dua buah method dengan nama greet yang mempunyai satu parameter bertipe String dan with_ret_val yang memiliki satu parameter bertipe String dengan nilai kembali String.
fun main() {
    val greeter = Greeter()
    greeter.greet()
    greeter.text = "Hi"
    greeter.greet("Anton")
    greeter.greet("Budi")
    greeter.text = "Hello programmer"
    println(greeter.with_ret_val("Dono"))
}

//berikan nilai text dengan “Hi” kemudian panggillah method greet dari kelas Greeter dan masukkan nilainya dengan “Anton” dan “Budi”. Baris selanjutnya tambahkan nilai text dengan “Hello programmer” dan panggil fungsi with_ret_val dengan parameter String “Dono”.
class Greeter {
    var text: String = ""
    fun greet() {
        println("Hello object world!")
    }
    fun greet(name: String) {
        println("$text $name")
    }
    fun with_ret_val(name: String): String {
        return "$text $name"
    }
}