package stringArray

class ReverseWord {
    companion object{
        fun main() {
            val str = "Java is a use for reverse testing"

            val strArray=str.split(" ")
            val reverseWord=""
            for (i in strArray.size-1 .. 0){
                reverseWord.plus(strArray[i]+" ")

            }
            print(reverseWord)
            print("test")

        }
    }

}