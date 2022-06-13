package com.example.pmed.Response

import com.google.gson.annotations.SerializedName

data class RegisterResponse(

	@field:SerializedName("data")
	val data: DataRegister,

	@field:SerializedName("message")
	val message: String,

	@field:SerializedName("status")
	val status: String
)

data class DataRegister(

	@field:SerializedName("userId")
	val userId: String,

	@field:SerializedName("token")
	val token: String
)
