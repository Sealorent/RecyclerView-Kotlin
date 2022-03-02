package com.example.githublist

import android.os.Parcel
import android.os.Parcelable

data class UserGit(

   var name: String?,
   var Company: String?,
   var location: String?,
   var photo: Int,
   var followers: String?,
   var following: String?,
   var repository: String?,


): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readInt(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(Company)
        parcel.writeString(location)
        parcel.writeInt(photo)
        parcel.writeString(followers)
        parcel.writeString(following)
        parcel.writeString(repository)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<UserGit> {
        override fun createFromParcel(parcel: Parcel): UserGit {
            return UserGit(parcel)
        }

        override fun newArray(size: Int): Array<UserGit?> {
            return arrayOfNulls(size)
        }
    }
}
