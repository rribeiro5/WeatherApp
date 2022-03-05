package pt.ipp.isep.weatherapp.data.model.weatherinfo


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ContactAuthor(
    @Json(name = "auth_note")
    val authNote: String,
    @Json(name = "email")
    val email: String
)