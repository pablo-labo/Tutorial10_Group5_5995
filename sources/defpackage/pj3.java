package defpackage;

import android.os.Parcel;
import android.util.Base64;

/* JADX INFO: loaded from: classes.dex */
public final class pj3 {
    public final Parcel a;

    public pj3(String str) {
        Parcel parcelObtain = Parcel.obtain();
        this.a = parcelObtain;
        byte[] bArrDecode = Base64.decode(str, 0);
        parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
        parcelObtain.setDataPosition(0);
    }

    public final long a() {
        int i = da2.j;
        long j = this.a.readLong();
        long j2 = 63 & j;
        return j2 < 16 ? j : (j & (-64)) | (j2 + 1);
    }

    public final long b() {
        Parcel parcel = this.a;
        byte b = parcel.readByte();
        long j = b == 1 ? 4294967296L : b == 2 ? 8589934592L : 0L;
        return ckf.a(j, 0L) ? bkf.c : hh2.y(j, parcel.readFloat());
    }
}
