package com.akshay.truecallerassignment.repository

import io.reactivex.Observable

interface MainRepository {

    fun getContent(): Observable<String>

    fun wordCounterRequest(): Observable<Int>

    fun tenthCharRequest(): Observable<Char>

    fun tenthCharArrayRequest(): Observable<List<Char>>
}