package com.linecorp.linesdk;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.l6;

/* JADX INFO: loaded from: classes3.dex */
public class LineFriendProfile extends LineProfile {
    public static final Parcelable.Creator<LineFriendProfile> CREATOR = new a();
    public final String e;

    public class a implements Parcelable.Creator<LineFriendProfile> {
        @Override // android.os.Parcelable.Creator
        public final LineFriendProfile createFromParcel(Parcel parcel) {
            return new LineFriendProfile(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final LineFriendProfile[] newArray(int i) {
            return new LineFriendProfile[i];
        }
    }

    public LineFriendProfile(Parcel parcel) {
        super(parcel);
        this.e = parcel.readString();
    }

    @Override // com.linecorp.linesdk.LineProfile
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LineFriendProfile) || !super.equals(obj)) {
            return false;
        }
        String str = ((LineFriendProfile) obj).e;
        String str2 = this.e;
        return str2 != null ? str2.equals(str) : str == null;
    }

    @Override // com.linecorp.linesdk.LineProfile
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.e;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // com.linecorp.linesdk.LineProfile
    public final String toString() {
        StringBuilder sb = new StringBuilder("LineFriendProfile{userId='");
        sb.append(this.a);
        sb.append("', displayName='");
        sb.append(this.b);
        sb.append("', pictureUrl=");
        sb.append(this.c);
        sb.append(", statusMessage='");
        sb.append(this.d);
        sb.append("', overriddenDisplayName='");
        return l6.i(sb, this.e, "'}");
    }

    @Override // com.linecorp.linesdk.LineProfile, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.e);
    }

    public LineFriendProfile(String str, String str2, Uri uri, String str3, String str4) {
        super(uri, str, str2, str3);
        this.e = str4;
    }
}
