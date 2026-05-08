package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public final class hra {
    public float c;
    public float d;
    public int a = Integer.MIN_VALUE;
    public int b = Integer.MIN_VALUE;
    public long e = -11;

    public final boolean a(int i, int i2) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j = this.e;
        boolean z = (jUptimeMillis - j <= 10 && this.a == i && this.b == i2) ? false : true;
        if (jUptimeMillis - j != 0) {
            this.c = (i - this.a) / (jUptimeMillis - j);
            this.d = (i2 - this.b) / (jUptimeMillis - j);
        }
        this.e = jUptimeMillis;
        this.a = i;
        this.b = i2;
        return z;
    }
}
