class Calculator {
    fun tambah(a: Double, b: Double): Double {
        return a + b
    }

    fun kurang(a: Double, b: Double): Double {
        return a - b
    }

    fun kali(a: Double, b: Double): Double {
        return a * b
    }

    fun bagi(a: Double, b: Double): Any {
        return if (b != 0.0) {
            a / b
        } else {
            "Tidak dapat membagi dengan nol"
        }
    }
}
