package com.example.ai37c

fun main() {
    // Create a dictionary using mapOf()
    val dictionary = mapOf(
        "apple" to "A sweet fruit that grows on trees.",
        "book" to "A set of pages with written or printed content bound together.",
        "computer" to "An electronic device used for storing and processing data.",
        "kotlin" to "A modern programming language used to develop Android apps.",
        "teacher" to "A person who helps students gain knowledge."
    )

    // Ask user to enter a word
    print("Enter a word: ")
    val word = readLine()?.lowercase()

    // Search and display meaning
    if (word != null && dictionary.containsKey(word)) {
        println("Meaning: ${dictionary[word]}")
    } else {
        println("Sorry, meaning not found in dictionary.")
    }
}



