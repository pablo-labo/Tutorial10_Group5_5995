package com.linecorp.linesdk.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.linecorp.linesdk.internal.pkce.PKCECode;

/* JADX INFO: loaded from: classes3.dex */
class LineAuthenticationStatus implements Parcelable {
    public static final Parcelable.Creator<LineAuthenticationStatus> CREATOR = new a();
    public PKCECode a;
    public String b;
    public String c;
    public String d;
    public b e = b.a;

    public class a implements Parcelable.Creator<LineAuthenticationStatus> {
        @Override // android.os.Parcelable.Creator
        public final LineAuthenticationStatus createFromParcel(Parcel parcel) {
            LineAuthenticationStatus lineAuthenticationStatus = new LineAuthenticationStatus();
            lineAuthenticationStatus.e = b.a;
            lineAuthenticationStatus.a = (PKCECode) parcel.readParcelable(PKCECode.class.getClassLoader());
            lineAuthenticationStatus.b = parcel.readString();
            lineAuthenticationStatus.e = b.values()[parcel.readByte()];
            lineAuthenticationStatus.c = parcel.readString();
            lineAuthenticationStatus.d = parcel.readString();
            return lineAuthenticationStatus;
        }

        @Override // android.os.Parcelable.Creator
        public final LineAuthenticationStatus[] newArray(int i) {
            return new LineAuthenticationStatus[i];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        public static final /* synthetic */ b[] e;

        static {
            b bVar = new b("INIT", 0);
            a = bVar;
            b bVar2 = new b("STARTED", 1);
            b = bVar2;
            b bVar3 = new b("INTENT_RECEIVED", 2);
            c = bVar3;
            b bVar4 = new b("INTENT_HANDLED", 3);
            d = bVar4;
            e = new b[]{bVar, bVar2, bVar3, bVar4};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) e.clone();
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        parcel.writeByte((byte) this.e.ordinal());
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
