package androidx.media3.exoplayer.offline;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.StreamKey;
import defpackage.ka2;
import defpackage.vjg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class DownloadRequest implements Parcelable {
    public static final Parcelable.Creator<DownloadRequest> CREATOR = new a();
    public final byte[] V;
    public final ByteRange W;
    public final TimeRange X;
    public final String a;
    public final Uri b;
    public final String c;
    public final List<StreamKey> d;
    public final byte[] e;
    public final String f;

    public static final class ByteRange implements Parcelable {
        public static final Parcelable.Creator<ByteRange> CREATOR = new a();
        public final long a;
        public final long b;

        public class a implements Parcelable.Creator<ByteRange> {
            @Override // android.os.Parcelable.Creator
            public final ByteRange createFromParcel(Parcel parcel) {
                return new ByteRange(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final ByteRange[] newArray(int i) {
                return new ByteRange[i];
            }
        }

        public ByteRange(Parcel parcel) {
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            ka2.l(j >= 0);
            ka2.l(j2 >= 0 || j2 == -1);
            this.a = j;
            this.b = j2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ByteRange)) {
                return false;
            }
            ByteRange byteRange = (ByteRange) obj;
            return this.a == byteRange.a && this.b == byteRange.b;
        }

        public final int hashCode() {
            return (((int) this.a) * 961) + ((int) this.b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.a);
            parcel.writeLong(this.b);
        }
    }

    public static final class TimeRange implements Parcelable {
        public static final Parcelable.Creator<TimeRange> CREATOR = new a();
        public final long a;
        public final long b;

        public class a implements Parcelable.Creator<TimeRange> {
            @Override // android.os.Parcelable.Creator
            public final TimeRange createFromParcel(Parcel parcel) {
                return new TimeRange(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final TimeRange[] newArray(int i) {
                return new TimeRange[i];
            }
        }

        public TimeRange(Parcel parcel) {
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            ka2.l(j2 >= 0 || j2 == -9223372036854775807L);
            this.a = j;
            this.b = j2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof TimeRange)) {
                return false;
            }
            TimeRange timeRange = (TimeRange) obj;
            return this.a == timeRange.a && this.b == timeRange.b;
        }

        public final int hashCode() {
            return (((int) this.a) * 961) + ((int) this.b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.a);
            parcel.writeLong(this.b);
        }
    }

    public class a implements Parcelable.Creator<DownloadRequest> {
        @Override // android.os.Parcelable.Creator
        public final DownloadRequest createFromParcel(Parcel parcel) {
            return new DownloadRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final DownloadRequest[] newArray(int i) {
            return new DownloadRequest[i];
        }
    }

    public DownloadRequest(Parcel parcel) {
        String string = parcel.readString();
        String str = vjg.a;
        this.a = string;
        this.b = Uri.parse(parcel.readString());
        this.c = parcel.readString();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add((StreamKey) parcel.readParcelable(StreamKey.class.getClassLoader()));
        }
        this.d = Collections.unmodifiableList(arrayList);
        this.e = parcel.createByteArray();
        this.f = parcel.readString();
        this.V = parcel.createByteArray();
        this.W = (ByteRange) parcel.readParcelable(ByteRange.class.getClassLoader());
        this.X = (TimeRange) parcel.readParcelable(TimeRange.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DownloadRequest)) {
            return false;
        }
        DownloadRequest downloadRequest = (DownloadRequest) obj;
        return this.a.equals(downloadRequest.a) && this.b.equals(downloadRequest.b) && Objects.equals(this.c, downloadRequest.c) && this.d.equals(downloadRequest.d) && Arrays.equals(this.e, downloadRequest.e) && Objects.equals(this.f, downloadRequest.f) && Arrays.equals(this.V, downloadRequest.V) && Objects.equals(this.W, downloadRequest.W) && Objects.equals(this.X, downloadRequest.X);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 961)) * 31;
        String str = this.c;
        int iHashCode2 = (Arrays.hashCode(this.e) + ((this.d.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        String str2 = this.f;
        int iHashCode3 = (Arrays.hashCode(this.V) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31;
        ByteRange byteRange = this.W;
        int iHashCode4 = (iHashCode3 + (byteRange != null ? byteRange.hashCode() : 0)) * 31;
        TimeRange timeRange = this.X;
        return iHashCode4 + (timeRange != null ? timeRange.hashCode() : 0);
    }

    public final String toString() {
        return this.c + ":" + this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b.toString());
        parcel.writeString(this.c);
        List<StreamKey> list = this.d;
        parcel.writeInt(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            parcel.writeParcelable(list.get(i2), 0);
        }
        parcel.writeByteArray(this.e);
        parcel.writeString(this.f);
        parcel.writeByteArray(this.V);
        parcel.writeParcelable(this.W, 0);
        parcel.writeParcelable(this.X, 0);
    }
}
