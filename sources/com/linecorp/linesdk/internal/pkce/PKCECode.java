package com.linecorp.linesdk.internal.pkce;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import defpackage.l5;
import defpackage.l6;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes3.dex */
public class PKCECode implements Parcelable {
    public static final Parcelable.Creator<PKCECode> CREATOR = new a();
    public final String a;
    public final String b;

    public class a implements Parcelable.Creator<PKCECode> {
        @Override // android.os.Parcelable.Creator
        public final PKCECode createFromParcel(Parcel parcel) {
            return new PKCECode(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PKCECode[] newArray(int i) {
            return new PKCECode[i];
        }
    }

    public PKCECode(Parcel parcel) {
        String string = parcel.readString();
        this.a = string;
        this.b = a(string);
    }

    public static String a(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes());
            return Base64.encodeToString(messageDigest.digest(), 11);
        } catch (NoSuchAlgorithmException e) {
            l5.r(e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PKCECode)) {
            return false;
        }
        PKCECode pKCECode = (PKCECode) obj;
        if (this.a.equals(pKCECode.a)) {
            return this.b.equals(pKCECode.b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PKCECode{verifier='");
        sb.append(this.a);
        sb.append("', challenge='");
        return l6.i(sb, this.b, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }

    public PKCECode(String str) {
        this.a = str;
        this.b = a(str);
    }
}
