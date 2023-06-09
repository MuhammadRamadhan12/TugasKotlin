package id.infinitelearning.KotlinSubmission.exercise4


fun divideNumbers(a: Int, b: Int): Int {
    return a / b
}

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    try {
        val result = divideNumbers(10, 0)
        println("Hasil pembagian: $result")
    } catch (e: ArithmeticException) {
        println("Terjadi kesalahan aritmatika: ${e.message}")
    }



}