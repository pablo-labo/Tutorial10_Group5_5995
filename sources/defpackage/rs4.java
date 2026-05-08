package defpackage;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class rs4 {
    public Parcel a;

    public final void a(byte b) {
        this.a.writeByte(b);
    }

    public final void b(float f) {
        this.a.writeFloat(f);
    }

    public final void c(long j) {
        long jB = bkf.b(j);
        byte b = 0;
        if (!ckf.a(jB, 0L)) {
            if (ckf.a(jB, 4294967296L)) {
                b = 1;
            } else if (ckf.a(jB, 8589934592L)) {
                b = 2;
            }
        }
        a(b);
        if (ckf.a(bkf.b(j), 0L)) {
            return;
        }
        b(bkf.c(j));
    }
}
