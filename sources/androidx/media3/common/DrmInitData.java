package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.akb;
import defpackage.st9;
import defpackage.vjg;
import defpackage.zr1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new a();
    public final SchemeData[] a;
    public int b;
    public final String c;
    public final int d;

    public class a implements Parcelable.Creator<DrmInitData> {
        @Override // android.os.Parcelable.Creator
        public final DrmInitData createFromParcel(Parcel parcel) {
            return new DrmInitData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final DrmInitData[] newArray(int i) {
            return new DrmInitData[i];
        }
    }

    public DrmInitData() {
        throw null;
    }

    public DrmInitData(Parcel parcel) {
        this.c = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR);
        String str = vjg.a;
        this.a = schemeDataArr;
        this.d = schemeDataArr.length;
    }

    public final DrmInitData a(String str) {
        return Objects.equals(this.c, str) ? this : new DrmInitData(str, false, this.a);
    }

    @Override // java.util.Comparator
    public final int compare(SchemeData schemeData, SchemeData schemeData2) {
        SchemeData schemeData3 = schemeData;
        SchemeData schemeData4 = schemeData2;
        UUID uuid = zr1.a;
        return uuid.equals(schemeData3.b) ? uuid.equals(schemeData4.b) ? 0 : 1 : schemeData3.b.compareTo(schemeData4.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && DrmInitData.class == obj.getClass()) {
            DrmInitData drmInitData = (DrmInitData) obj;
            if (Objects.equals(this.c, drmInitData.c) && Arrays.equals(this.a, drmInitData.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.b == 0) {
            String str = this.c;
            this.b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.a);
        }
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeTypedArray(this.a, 0);
    }

    public DrmInitData(String str, ArrayList arrayList) {
        this(str, false, (SchemeData[]) arrayList.toArray(new SchemeData[0]));
    }

    public DrmInitData(String str, boolean z, SchemeData... schemeDataArr) {
        this.c = str;
        schemeDataArr = z ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        this.a = schemeDataArr;
        this.d = schemeDataArr.length;
        Arrays.sort(schemeDataArr, this);
    }

    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new a();
        public int a;
        public final UUID b;
        public final String c;
        public final String d;
        public final byte[] e;

        public class a implements Parcelable.Creator<SchemeData> {
            @Override // android.os.Parcelable.Creator
            public final SchemeData createFromParcel(Parcel parcel) {
                return new SchemeData(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final SchemeData[] newArray(int i) {
                return new SchemeData[i];
            }
        }

        public SchemeData(Parcel parcel) {
            this.b = new UUID(parcel.readLong(), parcel.readLong());
            this.c = parcel.readString();
            String string = parcel.readString();
            String str = vjg.a;
            this.d = string;
            this.e = parcel.createByteArray();
        }

        public final boolean a(UUID uuid) {
            UUID uuid2 = zr1.a;
            UUID uuid3 = this.b;
            return uuid2.equals(uuid3) || uuid.equals(uuid3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            SchemeData schemeData = (SchemeData) obj;
            return Objects.equals(this.c, schemeData.c) && Objects.equals(this.d, schemeData.d) && Objects.equals(this.b, schemeData.b) && Arrays.equals(this.e, schemeData.e);
        }

        public final int hashCode() {
            if (this.a == 0) {
                int iHashCode = this.b.hashCode() * 31;
                String str = this.c;
                this.a = Arrays.hashCode(this.e) + akb.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
            }
            return this.a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            UUID uuid = this.b;
            parcel.writeLong(uuid.getMostSignificantBits());
            parcel.writeLong(uuid.getLeastSignificantBits());
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeByteArray(this.e);
        }

        public SchemeData(UUID uuid, String str, String str2, byte[] bArr) {
            uuid.getClass();
            this.b = uuid;
            this.c = str;
            str2.getClass();
            this.d = st9.p(str2);
            this.e = bArr;
        }
    }
}
