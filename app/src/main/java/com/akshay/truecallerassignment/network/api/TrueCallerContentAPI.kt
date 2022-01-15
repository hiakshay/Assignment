package com.akshay.truecallerassignment.network.api

import io.reactivex.Observable
import retrofit2.http.GET


interface TrueCallerContentAPI {

    @GET("/2018/01/22/life-as-an-android-engineer")
    fun getTrueCallerContent(): Observable<String>

}