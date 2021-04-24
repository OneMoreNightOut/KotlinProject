package tasks

fun main(){
    // ["eat", "tea", "tan", "ate", "nat", "bat"]
    println(arrayOf("eat", "tea", "tan", "ate", "nat", "bat"))
}

fun groupWords(words: Array<String>): List<List<String>> {
    var result: MutableList<List<String>> = mutableListOf()
    var map = mutableMapOf<String, MutableList<String>>()

    for (word in words){
        val sortedWord = word.toCharArray().sorted().joinToString("")
        if (map.containsKey(sortedWord))
            map[sortedWord]?.add(word)
        else
            map[sortedWord] = mutableListOf(word)
    }

    for ((key,value) in map){
        result.add(value)
    }

    return result



}