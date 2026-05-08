package com.linecorp.linesdk;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.akb;
import defpackage.l6;
import defpackage.pi3;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class LineIdToken implements Parcelable {
    public static final Parcelable.Creator<LineIdToken> CREATOR = new a();
    public final Date V;
    public final String W;
    public final List<String> X;
    public final String Y;
    public final String Z;
    public final String a;
    public final String a0;
    public final String b;
    public final String b0;
    public final String c;
    public final String c0;
    public final String d;
    public final String d0;
    public final Date e;
    public final Address e0;
    public final Date f;
    public final String f0;
    public final String g0;
    public final String h0;
    public final String i0;
    public final String j0;

    public class a implements Parcelable.Creator<LineIdToken> {
        @Override // android.os.Parcelable.Creator
        public final LineIdToken createFromParcel(Parcel parcel) {
            return new LineIdToken(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final LineIdToken[] newArray(int i) {
            return new LineIdToken[i];
        }
    }

    public static final class b {
        public String a;
        public String b;
        public String c;
        public String d;
        public Date e;
        public Date f;
        public Date g;
        public String h;
        public List<String> i;
        public String j;
        public String k;
        public String l;
        public String m;
        public String n;
        public String o;
        public Address p;
        public String q;
        public String r;
        public String s;
        public String t;
        public String u;
    }

    public LineIdToken(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = pi3.j(parcel);
        this.f = pi3.j(parcel);
        this.V = pi3.j(parcel);
        this.W = parcel.readString();
        this.X = parcel.createStringArrayList();
        this.Y = parcel.readString();
        this.Z = parcel.readString();
        this.a0 = parcel.readString();
        this.b0 = parcel.readString();
        this.c0 = parcel.readString();
        this.d0 = parcel.readString();
        this.e0 = (Address) parcel.readParcelable(Address.class.getClassLoader());
        this.f0 = parcel.readString();
        this.g0 = parcel.readString();
        this.h0 = parcel.readString();
        this.i0 = parcel.readString();
        this.j0 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            LineIdToken lineIdToken = (LineIdToken) obj;
            if (!this.a.equals(lineIdToken.a) || !this.b.equals(lineIdToken.b) || !this.c.equals(lineIdToken.c) || !this.d.equals(lineIdToken.d) || !this.e.equals(lineIdToken.e) || !this.f.equals(lineIdToken.f)) {
                return false;
            }
            Date date = lineIdToken.V;
            Date date2 = this.V;
            if (date2 == null ? date != null : !date2.equals(date)) {
                return false;
            }
            String str = lineIdToken.W;
            String str2 = this.W;
            if (str2 == null ? str != null : !str2.equals(str)) {
                return false;
            }
            List<String> list = lineIdToken.X;
            List<String> list2 = this.X;
            if (list2 == null ? list != null : !list2.equals(list)) {
                return false;
            }
            String str3 = lineIdToken.Y;
            String str4 = this.Y;
            if (str4 == null ? str3 != null : !str4.equals(str3)) {
                return false;
            }
            String str5 = lineIdToken.Z;
            String str6 = this.Z;
            if (str6 == null ? str5 != null : !str6.equals(str5)) {
                return false;
            }
            String str7 = lineIdToken.a0;
            String str8 = this.a0;
            if (str8 == null ? str7 != null : !str8.equals(str7)) {
                return false;
            }
            String str9 = lineIdToken.b0;
            String str10 = this.b0;
            if (str10 == null ? str9 != null : !str10.equals(str9)) {
                return false;
            }
            String str11 = lineIdToken.c0;
            String str12 = this.c0;
            if (str12 == null ? str11 != null : !str12.equals(str11)) {
                return false;
            }
            String str13 = lineIdToken.d0;
            String str14 = this.d0;
            if (str14 == null ? str13 != null : !str14.equals(str13)) {
                return false;
            }
            Address address = lineIdToken.e0;
            Address address2 = this.e0;
            if (address2 == null ? address != null : !address2.equals(address)) {
                return false;
            }
            String str15 = lineIdToken.f0;
            String str16 = this.f0;
            if (str16 == null ? str15 != null : !str16.equals(str15)) {
                return false;
            }
            String str17 = lineIdToken.g0;
            String str18 = this.g0;
            if (str18 == null ? str17 != null : !str18.equals(str17)) {
                return false;
            }
            String str19 = lineIdToken.h0;
            String str20 = this.h0;
            if (str20 == null ? str19 != null : !str20.equals(str19)) {
                return false;
            }
            String str21 = lineIdToken.i0;
            String str22 = this.i0;
            if (str22 == null ? str21 != null : !str22.equals(str21)) {
                return false;
            }
            String str23 = lineIdToken.j0;
            String str24 = this.j0;
            if (str24 != null) {
                return str24.equals(str23);
            }
            if (str23 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + ((this.e.hashCode() + akb.d(akb.d(akb.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31)) * 31;
        Date date = this.V;
        int iHashCode2 = (iHashCode + (date != null ? date.hashCode() : 0)) * 31;
        String str = this.W;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        List<String> list = this.X;
        int iHashCode4 = (iHashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.Y;
        int iHashCode5 = (iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.Z;
        int iHashCode6 = (iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.a0;
        int iHashCode7 = (iHashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.b0;
        int iHashCode8 = (iHashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.c0;
        int iHashCode9 = (iHashCode8 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.d0;
        int iHashCode10 = (iHashCode9 + (str7 != null ? str7.hashCode() : 0)) * 31;
        Address address = this.e0;
        int iHashCode11 = (iHashCode10 + (address != null ? address.hashCode() : 0)) * 31;
        String str8 = this.f0;
        int iHashCode12 = (iHashCode11 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.g0;
        int iHashCode13 = (iHashCode12 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.h0;
        int iHashCode14 = (iHashCode13 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.i0;
        int iHashCode15 = (iHashCode14 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.j0;
        return iHashCode15 + (str12 != null ? str12.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineIdToken{rawString='");
        sb.append(this.a);
        sb.append("', issuer='");
        sb.append(this.b);
        sb.append("', subject='");
        sb.append(this.c);
        sb.append("', audience='");
        sb.append(this.d);
        sb.append("', expiresAt=");
        sb.append(this.e);
        sb.append(", issuedAt=");
        sb.append(this.f);
        sb.append(", authTime=");
        sb.append(this.V);
        sb.append(", nonce='");
        sb.append(this.W);
        sb.append("', amr=");
        sb.append(this.X);
        sb.append(", name='");
        sb.append(this.Y);
        sb.append("', picture='");
        sb.append(this.Z);
        sb.append("', phoneNumber='");
        sb.append(this.a0);
        sb.append("', email='");
        sb.append(this.b0);
        sb.append("', gender='");
        sb.append(this.c0);
        sb.append("', birthdate='");
        sb.append(this.d0);
        sb.append("', address=");
        sb.append(this.e0);
        sb.append(", givenName='");
        sb.append(this.f0);
        sb.append("', givenNamePronunciation='");
        sb.append(this.g0);
        sb.append("', middleName='");
        sb.append(this.h0);
        sb.append("', familyName='");
        sb.append(this.i0);
        sb.append("', familyNamePronunciation='");
        return l6.i(sb, this.j0, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        Date date = this.e;
        parcel.writeLong(date != null ? date.getTime() : -1L);
        Date date2 = this.f;
        parcel.writeLong(date2 != null ? date2.getTime() : -1L);
        Date date3 = this.V;
        parcel.writeLong(date3 != null ? date3.getTime() : -1L);
        parcel.writeString(this.W);
        parcel.writeStringList(this.X);
        parcel.writeString(this.Y);
        parcel.writeString(this.Z);
        parcel.writeString(this.a0);
        parcel.writeString(this.b0);
        parcel.writeString(this.c0);
        parcel.writeString(this.d0);
        parcel.writeParcelable(this.e0, i);
        parcel.writeString(this.f0);
        parcel.writeString(this.g0);
        parcel.writeString(this.h0);
        parcel.writeString(this.i0);
        parcel.writeString(this.j0);
    }

    public static class Address implements Parcelable {
        public static final Parcelable.Creator<Address> CREATOR = new a();
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        public class a implements Parcelable.Creator<Address> {
            @Override // android.os.Parcelable.Creator
            public final Address createFromParcel(Parcel parcel) {
                return new Address(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final Address[] newArray(int i) {
                return new Address[i];
            }
        }

        public static final class b {
            public String a;
            public String b;
            public String c;
            public String d;
            public String e;
        }

        public Address(Parcel parcel) {
            this.a = parcel.readString();
            this.b = parcel.readString();
            this.c = parcel.readString();
            this.d = parcel.readString();
            this.e = parcel.readString();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                Address address = (Address) obj;
                String str = address.a;
                String str2 = this.a;
                if (str2 == null ? str != null : !str2.equals(str)) {
                    return false;
                }
                String str3 = address.b;
                String str4 = this.b;
                if (str4 == null ? str3 != null : !str4.equals(str3)) {
                    return false;
                }
                String str5 = address.c;
                String str6 = this.c;
                if (str6 == null ? str5 != null : !str6.equals(str5)) {
                    return false;
                }
                String str7 = address.d;
                String str8 = this.d;
                if (str8 == null ? str7 != null : !str8.equals(str7)) {
                    return false;
                }
                String str9 = address.e;
                String str10 = this.e;
                if (str10 != null) {
                    return str10.equals(str9);
                }
                if (str9 == null) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            String str = this.a;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.c;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.d;
            int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.e;
            return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Address{streetAddress='");
            sb.append(this.a);
            sb.append("', locality='");
            sb.append(this.b);
            sb.append("', region='");
            sb.append(this.c);
            sb.append("', postalCode='");
            sb.append(this.d);
            sb.append("', country='");
            return l6.i(sb, this.e, "'}");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
        }

        public Address(b bVar) {
            this.a = bVar.a;
            this.b = bVar.b;
            this.c = bVar.c;
            this.d = bVar.d;
            this.e = bVar.e;
        }
    }

    public LineIdToken(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.f = bVar.f;
        this.V = bVar.g;
        this.W = bVar.h;
        this.X = bVar.i;
        this.Y = bVar.j;
        this.Z = bVar.k;
        this.a0 = bVar.l;
        this.b0 = bVar.m;
        this.c0 = bVar.n;
        this.d0 = bVar.o;
        this.e0 = bVar.p;
        this.f0 = bVar.q;
        this.g0 = bVar.r;
        this.h0 = bVar.s;
        this.i0 = bVar.t;
        this.j0 = bVar.u;
    }
}
