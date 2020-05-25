package br.com.nexaas.nexaascart.features.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DataResponse (
	val name : String
//	@SerializedName("name") val name : String,
//	@SerializedName("quantity") val quantity : Int,
//	@SerializedName("stock") val stock : Int,
//	@SerializedName("image_url") val image_url : String,
//	@SerializedName("price") val price : Int,
//	@SerializedName("tax") val tax : Int,
//	@SerializedName("shipping") val shipping : Int,
//	@SerializedName("description") val description : String
): Parcelable