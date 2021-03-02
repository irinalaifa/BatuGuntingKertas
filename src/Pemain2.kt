class Pemain2() : PilihanPemain() {
    //pemain 2
    var pemain2 :String = pilihPilihan()

    //pilihan random untuk pemain 2
    override fun pilihPilihan():String {
        println("2. Masukkan pemain 2: ")
        val pilihanPlayer2=(1..3).random()
        if (pilihanPlayer2==1)
            println("BATU")
        else if (pilihanPlayer2==2)
            println("GUNTING")
        else
            println("KERTAS")

      return super.toString()
    }

}
