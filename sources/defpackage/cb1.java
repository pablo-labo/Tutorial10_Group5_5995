package defpackage;

import android.os.SystemClock;
import androidx.media3.common.a;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class cb1 implements p35 {
    public final wpf a;
    public final int b;
    public final int[] c;
    public final a[] d;
    public final long[] e;
    public int f;

    public cb1(wpf wpfVar, int[] iArr) {
        a[] aVarArr;
        int i = 0;
        ka2.q(iArr.length > 0);
        wpfVar.getClass();
        this.a = wpfVar;
        int length = iArr.length;
        this.b = length;
        this.d = new a[length];
        int i2 = 0;
        while (true) {
            int length2 = iArr.length;
            aVarArr = this.d;
            if (i2 >= length2) {
                break;
            }
            aVarArr[i2] = wpfVar.d[iArr[i2]];
            i2++;
        }
        Arrays.sort(aVarArr, new bb1(0));
        this.c = new int[this.b];
        while (true) {
            int i3 = this.b;
            if (i >= i3) {
                this.e = new long[i3];
                return;
            } else {
                this.c[i] = wpfVar.b(this.d[i]);
                i++;
            }
        }
    }

    @Override // defpackage.p35
    public final boolean a(int i, long j) {
        return this.e[i] > j;
    }

    @Override // defpackage.bqf
    public final int b(a aVar) {
        for (int i = 0; i < this.b; i++) {
            if (this.d[i] == aVar) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.p35
    public void disable() {
    }

    @Override // defpackage.bqf
    public final a e(int i) {
        return this.d[i];
    }

    @Override // defpackage.p35
    public void enable() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cb1 cb1Var = (cb1) obj;
            if (this.a.equals(cb1Var.a) && Arrays.equals(this.c, cb1Var.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bqf
    public final int f(int i) {
        return this.c[i];
    }

    @Override // defpackage.p35
    public final boolean g(int i, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zA = a(i, jElapsedRealtime);
        int i2 = 0;
        while (i2 < this.b && !zA) {
            zA = (i2 == i || a(i2, jElapsedRealtime)) ? false : true;
            i2++;
        }
        if (!zA) {
            return false;
        }
        long[] jArr = this.e;
        long j2 = jArr[i];
        String str = vjg.a;
        long j3 = jElapsedRealtime + j;
        if (((j ^ j3) & (jElapsedRealtime ^ j3)) < 0) {
            j3 = Long.MAX_VALUE;
        }
        jArr[i] = Math.max(j2, j3);
        return true;
    }

    @Override // defpackage.p35
    public void h(float f) {
    }

    public final int hashCode() {
        if (this.f == 0) {
            this.f = Arrays.hashCode(this.c) + (System.identityHashCode(this.a) * 31);
        }
        return this.f;
    }

    @Override // defpackage.bqf
    public final int k(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.bqf
    public final int length() {
        return this.c.length;
    }

    @Override // defpackage.bqf
    public final wpf m() {
        return this.a;
    }

    @Override // defpackage.p35
    public final void n(boolean z) {
    }

    @Override // defpackage.p35
    public int o(long j, List<? extends lg9> list) {
        return list.size();
    }

    @Override // defpackage.p35
    public final int p() {
        return this.c[c()];
    }

    @Override // defpackage.p35
    public final a q() {
        return this.d[c()];
    }
}
