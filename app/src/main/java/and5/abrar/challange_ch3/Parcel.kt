package and5.abrar.challange_ch3

import android.os.Parcelable

data class Parcel(val nama:String?, val alamat:String?, val typeusia:String?, val usia:String?,val kerja:String?):Parcelable {
    constructor(parcel: android.os.Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: android.os.Parcel, flags: Int) {
        parcel.writeString(nama)
        parcel.writeString(alamat)
        parcel.writeString(typeusia)
        parcel.writeString(usia)
        parcel.writeString(kerja)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Parcel> {
        override fun createFromParcel(parcel: android.os.Parcel): Parcel {
            return Parcel(parcel)
        }

        override fun newArray(size: Int): Array<Parcel?> {
            return arrayOfNulls(size)
        }
    }
}
