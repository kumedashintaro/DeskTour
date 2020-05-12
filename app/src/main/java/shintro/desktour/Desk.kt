package shintro.desktour

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
class Desk(val uid: String, val comment: String, val profileImageUrl: String , val deskuid: String): Parcelable {
    constructor() : this("", "","", "")

}