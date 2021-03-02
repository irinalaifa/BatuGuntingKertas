class Pemain1() :PilihanPemain() {
    //pemain 1
    var pemain1 :String = pilihPilihan()

    //pilihan pemain 1 menggunakan input dari user
    override fun pilihPilihan() :String  {

        do {
            println("1.Masukkan pemain 1 : ")
            val pilihanPlayer1=readLine()?.toUpperCase()
            if (pilihanPlayer1=="BATU"||pilihanPlayer1=="GUNTING"||pilihanPlayer1=="KERTAS"){
                println("$pilihanPlayer1")
                break
            }
            else if(pilihanPlayer1!="BATU"||pilihanPlayer1!="GUNTING"||pilihanPlayer1!="KERTAS"){
                println("Input yang kamu masukkan salah!")
            }
        }
        while(pilihanPlayer1!="BATU"||pilihanPlayer1!="GUNTING"||pilihanPlayer1!="KERTAS")


        return super.toString()


    }



}