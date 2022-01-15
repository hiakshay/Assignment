package com.akshay.truecallerassignment.repository

import com.akshay.truecallerassignment.network.api.TrueCallerContentAPI
import com.akshay.truecallerassignment.usecases.CharacterOperationUseCase
import io.reactivex.Observable
import javax.inject.Inject

class MainRepositoryImpl @Inject constructor(
    private val trueCallerContentAPI: TrueCallerContentAPI,
    private val characterOperationUseCase: CharacterOperationUseCase
) : MainRepository {

    override fun getContent(): Observable<String> {
        return trueCallerContentAPI.getTrueCallerContent()
    }

    override fun wordCounterRequest(): Observable<Int> {
        return getContent().map {
            characterOperationUseCase.wordCounterRequestOperation(it)
        }
    }

    override fun tenthCharRequest(): Observable<Char> {
        return getContent().map {
            characterOperationUseCase.tenthCharacterRequestOperation(it)
        }
    }

    override fun tenthCharArrayRequest(): Observable<List<Char>> {
        return getContent().map {
            characterOperationUseCase.everyTenthCharacterRequestOperation(it)
        }
    }
}