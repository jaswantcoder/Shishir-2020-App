package nitmeghalaya.shishir2020.network

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by Devansh on 8/3/20
 */

interface FacebookPageApiService {

    @GET("feed")
    fun getPageFeed(@Query("access_token") accessToken: String): Call<String>
}