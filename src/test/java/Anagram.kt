import Ana.RANDOM
import android.provider.UserDictionary
import kotlin.random.Random

class Anagram {
    val Random = Random()
    val Words = listOf("Vein", "dog", "pin", "pan")


    fun shuffleWord(word: String?): String? {
        if (word != null && "" != word) {
            val a = this.word.toCharArray()
            for (i in a.indices) {
                val j = word.nextInt(a.size)
                val tmp = a[i]
                a[i] = a[j]
                a[j] = tmp
            }
            return String(a)


        }
        return word

    }



}