package defpackage;

import android.os.SystemClock;
import defpackage.e47;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ka extends cb1 {
    public final k81 g;
    public final long h;
    public final long i;
    public final long j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final e47<a> o;
    public final n2f p;
    public float q;
    public int r;
    public int s;
    public long t;
    public lg9 u;

    public static final class a {
        public final long a;
        public final long b;

        public a(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return (((int) this.a) * 31) + ((int) this.b);
        }
    }

    public static class b {
    }

    public ka(wpf wpfVar, int[] iArr, k81 k81Var, e47 e47Var) {
        super(wpfVar, iArr);
        this.g = k81Var;
        this.h = 10000000L;
        this.i = 25000000L;
        this.j = 25000000L;
        this.k = 1279;
        this.l = 719;
        this.m = 0.7f;
        this.n = 0.75f;
        this.o = e47.j(e47Var);
        this.p = d82.a;
        this.q = 1.0f;
        this.s = 0;
        this.t = -9223372036854775807L;
    }

    public static void t(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            e47.a aVar = (e47.a) arrayList.get(i);
            if (aVar != null) {
                aVar.c(new a(j, jArr[i]));
            }
        }
    }

    public static long v(List list) {
        if (!list.isEmpty()) {
            lg9 lg9Var = (lg9) h4.l(list);
            long j = lg9Var.g;
            if (j != -9223372036854775807L) {
                long j2 = lg9Var.h;
                if (j2 != -9223372036854775807L) {
                    return j2 - j;
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.p35
    public final int c() {
        return this.r;
    }

    @Override // defpackage.cb1, defpackage.p35
    public final void disable() {
        this.u = null;
    }

    @Override // defpackage.cb1, defpackage.p35
    public final void enable() {
        this.t = -9223372036854775807L;
        this.u = null;
    }

    @Override // defpackage.cb1, defpackage.p35
    public final void h(float f) {
        this.q = f;
    }

    @Override // defpackage.p35
    public final Object i() {
        return null;
    }

    @Override // defpackage.p35
    public final void l(long j, long j2, long j3, List<? extends lg9> list, mg9[] mg9VarArr) {
        long jV;
        this.p.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i = this.r;
        if (i >= mg9VarArr.length || !mg9VarArr[i].next()) {
            int length = mg9VarArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    jV = v(list);
                    break;
                }
                mg9 mg9Var = mg9VarArr[i2];
                if (mg9Var.next()) {
                    jV = mg9Var.b() - mg9Var.a();
                    break;
                }
                i2++;
            }
        } else {
            mg9 mg9Var2 = mg9VarArr[this.r];
            jV = mg9Var2.b() - mg9Var2.a();
        }
        int i3 = this.s;
        if (i3 == 0) {
            this.s = 1;
            this.r = u(jElapsedRealtime, jV);
            return;
        }
        int i4 = this.r;
        int iB = list.isEmpty() ? -1 : b(((lg9) h4.l(list)).d);
        if (iB != -1) {
            i3 = ((lg9) h4.l(list)).e;
            i4 = iB;
        }
        int iU = u(jElapsedRealtime, jV);
        if (iU != i4 && !a(i4, jElapsedRealtime)) {
            androidx.media3.common.a[] aVarArr = this.d;
            androidx.media3.common.a aVar = aVarArr[i4];
            androidx.media3.common.a aVar2 = aVarArr[iU];
            long jMin = this.h;
            if (j3 != -9223372036854775807L) {
                jMin = Math.min((long) ((jV != -9223372036854775807L ? j3 - jV : j3) * this.n), jMin);
            }
            int i5 = aVar2.j;
            int i6 = aVar.j;
            if ((i5 > i6 && j2 < jMin) || (i5 < i6 && j2 >= this.i)) {
                iU = i4;
            }
        }
        if (iU != i4) {
            i3 = 3;
        }
        this.s = i3;
        this.r = iU;
    }

    @Override // defpackage.cb1, defpackage.p35
    public final int o(long j, List<? extends lg9> list) {
        int i;
        int i2;
        this.p.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.t;
        if (j2 != -9223372036854775807L && jElapsedRealtime - j2 < 1000 && (list.isEmpty() || ((lg9) h4.l(list)).equals(this.u))) {
            return list.size();
        }
        this.t = jElapsedRealtime;
        this.u = list.isEmpty() ? null : (lg9) h4.l(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jC = vjg.C(list.get(size - 1).g - j, this.q);
        long j3 = this.j;
        if (jC >= j3) {
            androidx.media3.common.a aVar = this.d[u(jElapsedRealtime, v(list))];
            for (int i3 = 0; i3 < size; i3++) {
                lg9 lg9Var = list.get(i3);
                androidx.media3.common.a aVar2 = lg9Var.d;
                if (vjg.C(lg9Var.g - j, this.q) >= j3 && aVar2.j < aVar.j && (i = aVar2.v) != -1 && i <= this.l && (i2 = aVar2.u) != -1 && i2 <= this.k && i < aVar.v) {
                    return i3;
                }
            }
        }
        return size;
    }

    @Override // defpackage.p35
    public final int r() {
        return this.s;
    }

    public final int u(long j, long j2) {
        long jC = (long) (((long) (this.g.c() * this.m)) / this.q);
        e47<a> e47Var = this.o;
        if (!e47Var.isEmpty()) {
            int i = 1;
            while (i < e47Var.size() - 1 && e47Var.get(i).a < jC) {
                i++;
            }
            a aVar = e47Var.get(i - 1);
            a aVar2 = e47Var.get(i);
            long j3 = aVar.a;
            long j4 = aVar.b;
            jC = ((long) (((jC - j3) / (aVar2.a - j3)) * (aVar2.b - j4))) + j4;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.b; i3++) {
            if (j == Long.MIN_VALUE || !a(i3, j)) {
                if (this.d[i3].j <= jC) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }
}
