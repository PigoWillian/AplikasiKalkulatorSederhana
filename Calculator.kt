fun main() {
    val calculator = Calculator()
    val scanner = Scanner(System.`in`)

    var hitung = true
    while (hitung) {
        println("Masukan angka pertama:")
        val num1 = scanner.nextDouble()
        println("Masukan angka kedua:")
        val num2 = scanner.nextDouble()

        println("pilih operation (+, -, *, /):")
        val operation = scanner.next()

        val result = when (operation) {
            "+" -> calculator.tambah(num1, num2)
            "-" -> calculator.kurang(num1, num2)
            "*" -> calculator.kali(num1, num2)
            "/" -> calculator.bagi(num1, num2)
            else -> throw IllegalArgumentException("operasi salah")
        }

        println("Result: $result")

        println("Ingin lanjut? (ya/tidak)")
        val choice = scanner.next()
        hitung = choice.equals("ya")
    }
