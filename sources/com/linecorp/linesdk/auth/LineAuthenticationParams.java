package com.linecorp.linesdk.auth;

import android.os.Parcel;
import android.os.Parcelable;
import app.rive.runtime.kotlin.fonts.Fonts;
import defpackage.tpd;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class LineAuthenticationParams implements Parcelable {
    public static final Parcelable.Creator<LineAuthenticationParams> CREATOR = new a();
    public final List<tpd> a;
    public final String b;
    public final b c;
    public final Locale d;
    public final String e;
    public final d f;

    public class a implements Parcelable.Creator<LineAuthenticationParams> {
        @Override // android.os.Parcelable.Creator
        public final LineAuthenticationParams createFromParcel(Parcel parcel) {
            return new LineAuthenticationParams(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final LineAuthenticationParams[] newArray(int i) {
            return new LineAuthenticationParams[i];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final /* synthetic */ b[] a = {new b(Fonts.Font.STYLE_NORMAL, 0), new b("aggressive", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        b EF5;

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) a.clone();
        }
    }

    public static final class c {
        public List<tpd> a;
        public String b;
        public b c;
        public Locale d;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {
        public static final d a;
        public static final /* synthetic */ d[] b;

        /* JADX INFO: Fake field, exist only in values array */
        d EF0;

        static {
            d dVar = new d("email", 0);
            d dVar2 = new d("qrCode", 1);
            a = dVar2;
            b = new d[]{dVar, dVar2};
        }

        public d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) b.clone();
        }
    }

    public LineAuthenticationParams(Parcel parcel) {
        this.a = tpd.b(parcel.createStringArrayList());
        this.b = parcel.readString();
        String string = parcel.readString();
        this.c = (b) (string != null ? Enum.valueOf(b.class, string) : null);
        this.d = (Locale) parcel.readSerializable();
        this.e = parcel.readString();
        String string2 = parcel.readString();
        this.f = (d) (string2 != null ? Enum.valueOf(d.class, string2) : null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(tpd.a(this.a));
        parcel.writeString(this.b);
        b bVar = this.c;
        parcel.writeString(bVar != null ? bVar.name() : null);
        parcel.writeSerializable(this.d);
        parcel.writeString(this.e);
        d dVar = this.f;
        parcel.writeString(dVar != null ? dVar.name() : null);
    }

    public LineAuthenticationParams(c cVar) {
        this.a = cVar.a;
        this.b = cVar.b;
        this.c = cVar.c;
        this.d = cVar.d;
        this.e = null;
        this.f = null;
    }
}
