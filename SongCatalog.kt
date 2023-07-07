fun main() {    
    val brunoSong = Song("Duaa", "Arjit Singh", 2022, 1000000)
    brunoSong.printDesc()
    println(brunoSong.isPopular)
}

class Song(
    val title: String, 
    val artist: String, 
    val yearPublished: Int, 
    val playCount: Int
){
    val isPopular: Boolean
        get() = playCount >= 1000

    fun printDesc() {
        println("$title, performed by $artist, was released in $yearPublished.")
    }   
}
