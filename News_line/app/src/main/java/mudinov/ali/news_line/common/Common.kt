package mudinov.ali.news_line.common

import mudinov.ali.news_line.retrofit.RetrofitClient
import mudinov.ali.news_line.retrofit.RetrofitServices

object Common {
    private val BASE_URL = "https://www.simplifiedcoding.net/demos/"
    val retrofitService: RetrofitServices
        get() = RetrofitClient.getClient(BASE_URL).create(RetrofitServices::class.java)
}