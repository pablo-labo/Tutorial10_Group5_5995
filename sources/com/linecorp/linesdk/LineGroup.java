package com.linecorp.linesdk;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.akb;

/* JADX INFO: loaded from: classes3.dex */
public class LineGroup implements Parcelable {
    public static final Parcelable.Creator<LineGroup> CREATOR = new a();
    public final String a;
    public final String b;
    public final Uri c;

    public class a implements Parcelable.Creator<LineGroup> {
        @Override // android.os.Parcelable.Creator
        public final LineGroup createFromParcel(Parcel parcel) {
            return new LineGroup(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final LineGroup[] newArray(int i) {
            return new LineGroup[i];
        }
    }

    public LineGroup(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LineGroup lineGroup = (LineGroup) obj;
        if (!this.a.equals(lineGroup.a) || !this.b.equals(lineGroup.b)) {
            return false;
        }
        Uri uri = lineGroup.c;
        Uri uri2 = this.c;
        return uri2 == null ? uri == null : uri2.equals(uri);
    }

    public final int hashCode() {
        int iD = akb.d(this.a.hashCode() * 31, 31, this.b);
        Uri uri = this.c;
        return iD + (uri != null ? uri.hashCode() : 0);
    }

    public final String toString() {
        return "LineProfile{groupName='" + this.b + "', groupId='" + this.a + "', pictureUrl='" + this.c + "'}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
    }

    public LineGroup(String str, String str2, Uri uri) {
        this.a = str;
        this.b = str2;
        this.c = uri;
    }
}
