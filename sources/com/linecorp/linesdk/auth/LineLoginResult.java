package com.linecorp.linesdk.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.linecorp.linesdk.LineApiError;
import com.linecorp.linesdk.LineCredential;
import com.linecorp.linesdk.LineIdToken;
import com.linecorp.linesdk.LineProfile;
import defpackage.xw8;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class LineLoginResult implements Parcelable {
    public static final Parcelable.Creator<LineLoginResult> CREATOR = new a();
    public final LineApiError V;
    public final xw8 a;
    public final String b;
    public final LineProfile c;
    public final LineIdToken d;
    public final Boolean e;
    public final LineCredential f;

    public class a implements Parcelable.Creator<LineLoginResult> {
        @Override // android.os.Parcelable.Creator
        public final LineLoginResult createFromParcel(Parcel parcel) {
            return new LineLoginResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final LineLoginResult[] newArray(int i) {
            return new LineLoginResult[i];
        }
    }

    public static final class b {
        public String b;
        public LineProfile c;
        public LineIdToken d;
        public Boolean e;
        public LineCredential f;
        public xw8 a = xw8.a;
        public LineApiError g = LineApiError.d;
    }

    public LineLoginResult(Parcel parcel) {
        String string = parcel.readString();
        this.a = (xw8) (string != null ? Enum.valueOf(xw8.class, string) : null);
        this.b = parcel.readString();
        this.c = (LineProfile) parcel.readParcelable(LineProfile.class.getClassLoader());
        this.d = (LineIdToken) parcel.readParcelable(LineIdToken.class.getClassLoader());
        this.e = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
        this.f = (LineCredential) parcel.readParcelable(LineCredential.class.getClassLoader());
        this.V = (LineApiError) parcel.readParcelable(LineApiError.class.getClassLoader());
    }

    public static LineLoginResult a(xw8 xw8Var, LineApiError lineApiError) {
        b bVar = new b();
        bVar.a = xw8Var;
        bVar.g = lineApiError;
        return new LineLoginResult(bVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LineLoginResult)) {
            return false;
        }
        LineLoginResult lineLoginResult = (LineLoginResult) obj;
        if (this.a != lineLoginResult.a || !Objects.equals(this.b, lineLoginResult.b) || !Objects.equals(this.c, lineLoginResult.c) || !Objects.equals(this.d, lineLoginResult.d)) {
            return false;
        }
        Boolean bool = this.e;
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        Boolean bool2 = lineLoginResult.e;
        if (bool2 == null) {
            bool2 = Boolean.FALSE;
        }
        return bool.equals(bool2) && Objects.equals(this.f, lineLoginResult.f) && this.V.equals(lineLoginResult.V);
    }

    public final int hashCode() {
        Boolean bool = this.e;
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        LineCredential lineCredential = this.f;
        LineApiError lineApiError = this.V;
        return Objects.hash(this.a, this.b, this.c, this.d, bool, lineCredential, lineApiError);
    }

    public final String toString() {
        return "LineLoginResult{responseCode=" + this.a + ", nonce='" + this.b + "', lineProfile=" + this.c + ", lineIdToken=" + this.d + ", friendshipStatusChanged=" + this.e + ", lineCredential=" + this.f + ", errorData=" + this.V + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        xw8 xw8Var = this.a;
        parcel.writeString(xw8Var != null ? xw8Var.name() : null);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeValue(this.e);
        parcel.writeParcelable(this.f, i);
        parcel.writeParcelable(this.V, i);
    }

    public LineLoginResult(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.f = bVar.f;
        this.V = bVar.g;
    }
}
