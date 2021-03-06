package com.akshay.truecallerassignment.usecases

interface CharacterOperationUseCase {

    fun wordCounterRequestOperation(content: String): Int

    fun everyTenthCharacterRequestOperation(content: String): List<Char>

    fun tenthCharacterRequestOperation(content: String): Char

}