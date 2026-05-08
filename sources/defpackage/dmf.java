package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class dmf<V> {
    public long[] a = new long[10];
    public V[] b = (V[]) new Object[10];
    public int c;
    public int d;

    public final synchronized void a(Object obj, long j) {
        if (this.d > 0) {
            if (j <= this.a[((this.c + r0) - 1) % this.b.length]) {
                b();
            }
        }
        c();
        int i = this.c;
        int i2 = this.d;
        Object[] objArr = (V[]) this.b;
        int length = (i + i2) % objArr.length;
        this.a[length] = j;
        objArr[length] = obj;
        this.d = i2 + 1;
    }

    public final synchronized void b() {
        this.c = 0;
        this.d = 0;
        Arrays.fill(this.b, (Object) null);
    }

    public final void c() {
        int length = this.b.length;
        if (this.d < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        V[] vArr = (V[]) new Object[i];
        int i2 = this.c;
        int i3 = length - i2;
        System.arraycopy(this.a, i2, jArr, 0, i3);
        System.arraycopy(this.b, this.c, vArr, 0, i3);
        int i4 = this.c;
        if (i4 > 0) {
            System.arraycopy(this.a, 0, jArr, i3, i4);
            System.arraycopy(this.b, 0, vArr, i3, this.c);
        }
        this.a = jArr;
        this.b = vArr;
        this.c = 0;
    }

    public final V d(long j, boolean z) {
        V vG = null;
        long j2 = Long.MAX_VALUE;
        while (this.d > 0) {
            long j3 = j - this.a[this.c];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            vG = g();
            j2 = j3;
        }
        return vG;
    }

    public final synchronized V e() {
        return this.d == 0 ? null : g();
    }

    public final synchronized V f(long j) {
        return d(j, true);
    }

    public final V g() {
        ka2.q(this.d > 0);
        V[] vArr = this.b;
        int i = this.c;
        V v = vArr[i];
        vArr[i] = null;
        this.c = (i + 1) % vArr.length;
        this.d--;
        return v;
    }

    public final synchronized int h() {
        return this.d;
    }
}
