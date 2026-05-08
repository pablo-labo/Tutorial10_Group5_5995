package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class qk3 {
    public int c;
    public int d;
    public final boolean a = true;
    public final int b = 65536;
    public int e = 0;
    public j20[] f = new j20[100];

    public final synchronized int a() {
        return this.d * this.b;
    }

    public final synchronized void b(int i) {
        boolean z = i < this.c;
        this.c = i;
        if (z) {
            c();
        }
    }

    public final synchronized void c() {
        int iMax = Math.max(0, vjg.f(this.c, this.b) - this.d);
        int i = this.e;
        if (iMax >= i) {
            return;
        }
        Arrays.fill(this.f, iMax, i, (Object) null);
        this.e = iMax;
    }
}
