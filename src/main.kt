fun main() {
    //objek dari kelas AturanMain
    val aturanMain=AturanMain(hasilMainnyaa)
    //method untuk menampilkan tampilan sebelum dan hasil permainan
    aturanMain.tampilan()
    aturanMain.hasil()


}

val hasilMainnyaa=object : HasilPermainan {
    override fun hasilMainnya(output: String) {
        println(output)
    }
}
