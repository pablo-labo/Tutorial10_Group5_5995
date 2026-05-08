package com.linecorp.linesdk;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class LineApiError implements Parcelable {
    public static final Parcelable.Creator<LineApiError> CREATOR = new a();
    public static final LineApiError d = new LineApiError(-1, "", b.c);
    public final int a;
    public final String b;
    public final b c;

    public class a implements Parcelable.Creator<LineApiError> {
        @Override // android.os.Parcelable.Creator
        public final LineApiError createFromParcel(Parcel parcel) {
            return new LineApiError(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final LineApiError[] newArray(int i) {
            return new LineApiError[i];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b a;
        public static final b b;
        public static final b c;
        public static final /* synthetic */ b[] d;

        static {
            b bVar = new b("LOGIN_ACTIVITY_NOT_FOUND", 0);
            a = bVar;
            b bVar2 = new b("HTTP_RESPONSE_PARSE_ERROR", 1);
            b = bVar2;
            b bVar3 = new b("NOT_DEFINED", 2);
            c = bVar3;
            d = new b[]{bVar, bVar2, bVar3};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) d.clone();
        }
    }

    public LineApiError(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readString();
        int i = parcel.readInt();
        this.c = i == -1 ? null : b.values()[i];
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LineApiError)) {
            return false;
        }
        LineApiError lineApiError = (LineApiError) obj;
        return this.a == lineApiError.a && Objects.equals(this.b, lineApiError.b) && this.c == lineApiError.c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b, this.c);
    }

    public final String toString() {
        return "LineApiError{httpResponseCode=" + this.a + ", message='" + this.b + "', errorCode='" + this.c + "'}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        b bVar = this.c;
        parcel.writeInt(bVar == null ? -1 : bVar.ordinal());
    }

    public LineApiError(int i, String str, b bVar) {
        this.a = i;
        this.b = str;
        this.c = bVar;
    }

    public LineApiError(Exception exc) {
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        this(-1, stringWriter.toString(), b.c);
    }

    public LineApiError(Exception exc, b bVar) {
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        this(-1, stringWriter.toString(), bVar);
    }

    public LineApiError(String str) {
        this(-1, str, b.c);
    }
}
