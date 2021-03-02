class AturanMain(private val hasilMainBGK: HasilPermainan) :PilihanPemain() {

    //list pilihan untuk bermain
    private val pilihan=listOf("BATU", "GUNTING", "KERTAS")
    override fun pilihPilihan() : String {
        return pilihPilihan()
    }

    //tampilan sebelum bermain
    fun tampilan (){
        println("==========================")
        println("GAME SUIT TERMINAL VERSION")
        println("==========================")
    }

    //tampilan hasil permainan
    fun hasil() {
        val p1=Pemain1().pemain1
        val p2=Pemain2().pemain2
        hasilMainBGK.hasilMainnya("Hasil : ")
        if (p1 == pilihan[0] && p2 == pilihan[1] || p1 == pilihan[1] && p2 == pilihan[2] || p1 == pilihan[2] && p2 == pilihan[0]) {
            hasilMainBGK.hasilMainnya("Pemain 1 MENANG!")
        } else if (p1 == pilihan[0] && p2 == pilihan[2] || p1 == pilihan[1] && p2 == pilihan[0] || p1 == pilihan[2] && p2 == pilihan[1]) {
            hasilMainBGK.hasilMainnya("Pemain 2 MENANG!")
        } else {
            hasilMainBGK.hasilMainnya("DRAW!")
        }
    }

}
