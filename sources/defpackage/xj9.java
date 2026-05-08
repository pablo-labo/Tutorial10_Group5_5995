package defpackage;

import android.util.Pair;
import androidx.media3.exoplayer.i;
import androidx.media3.exoplayer.l;
import androidx.media3.exoplayer.source.b;
import androidx.media3.exoplayer.source.g;
import androidx.media3.exoplayer.source.h;

/* JADX INFO: loaded from: classes.dex */
public final class xj9 {
    public final g a;
    public final Object b;
    public final rjd[] c;
    public boolean d;
    public boolean e;
    public boolean f;
    public yj9 g;
    public boolean h;
    public final boolean[] i;
    public final l[] j;
    public final fqf k;
    public final i l;
    public xj9 m;
    public xpf n;
    public gqf o;
    public long p;

    public xj9(l[] lVarArr, long j, fqf fqfVar, qk3 qk3Var, i iVar, yj9 yj9Var, gqf gqfVar) {
        this.j = lVarArr;
        this.p = j;
        this.k = fqfVar;
        this.l = iVar;
        h.b bVar = yj9Var.a;
        this.b = bVar.a;
        this.g = yj9Var;
        this.n = xpf.d;
        this.o = gqfVar;
        this.c = new rjd[lVarArr.length];
        this.i = new boolean[lVarArr.length];
        long j2 = yj9Var.b;
        long j3 = yj9Var.d;
        boolean z = yj9Var.f;
        iVar.getClass();
        Object obj = bVar.a;
        int i = o1.g;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        h.b bVarA = bVar.a(pair.second);
        i.c cVar = (i.c) iVar.d.get(obj2);
        cVar.getClass();
        iVar.g.add(cVar);
        i.b bVar2 = iVar.f.get(cVar);
        if (bVar2 != null) {
            bVar2.a.i(bVar2.b);
        }
        cVar.c.add(bVarA);
        g gVarF = cVar.a.o(bVarA, qk3Var, j2);
        iVar.c.put(gVarF, cVar);
        iVar.c();
        this.a = j3 != -9223372036854775807L ? new b(gVarF, !z, 0L, j3) : gVarF;
    }

    public final long a(gqf gqfVar, long j, boolean z, boolean[] zArr) {
        l[] lVarArr;
        rjd[] rjdVarArr;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= gqfVar.a) {
                break;
            }
            if (z || !gqfVar.b(this.o, i)) {
                z2 = false;
            }
            this.i[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            lVarArr = this.j;
            int length = lVarArr.length;
            rjdVarArr = this.c;
            if (i2 >= length) {
                break;
            }
            if (((androidx.media3.exoplayer.b) lVarArr[i2]).b == -2) {
                rjdVarArr[i2] = null;
            }
            i2++;
        }
        b();
        this.o = gqfVar;
        c();
        long jF = this.a.f((p35[]) gqfVar.c, this.i, this.c, zArr, j);
        for (int i3 = 0; i3 < lVarArr.length; i3++) {
            if (((androidx.media3.exoplayer.b) lVarArr[i3]).b == -2 && this.o.c(i3)) {
                rjdVarArr[i3] = new fs4();
            }
        }
        this.f = false;
        for (int i4 = 0; i4 < rjdVarArr.length; i4++) {
            if (rjdVarArr[i4] != null) {
                ka2.q(gqfVar.c(i4));
                if (((androidx.media3.exoplayer.b) lVarArr[i4]).b != -2) {
                    this.f = true;
                }
            } else {
                ka2.q(((p35[]) gqfVar.c)[i4] == null);
            }
        }
        return jF;
    }

    public final void b() {
        if (this.m != null) {
            return;
        }
        int i = 0;
        while (true) {
            gqf gqfVar = this.o;
            if (i >= gqfVar.a) {
                return;
            }
            boolean zC = gqfVar.c(i);
            p35 p35Var = ((p35[]) this.o.c)[i];
            if (zC && p35Var != null) {
                p35Var.disable();
            }
            i++;
        }
    }

    public final void c() {
        if (this.m != null) {
            return;
        }
        int i = 0;
        while (true) {
            gqf gqfVar = this.o;
            if (i >= gqfVar.a) {
                return;
            }
            boolean zC = gqfVar.c(i);
            p35 p35Var = ((p35[]) this.o.c)[i];
            if (zC && p35Var != null) {
                p35Var.enable();
            }
            i++;
        }
    }

    public final long d() {
        if (!this.e) {
            return this.g.b;
        }
        long jS = this.f ? this.a.s() : Long.MIN_VALUE;
        return jS == Long.MIN_VALUE ? this.g.e : jS;
    }

    public final long e() {
        return this.g.b + this.p;
    }

    public final void f(float f, emf emfVar, boolean z) {
        this.e = true;
        this.n = this.a.q();
        gqf gqfVarJ = j(f, emfVar, z);
        yj9 yj9Var = this.g;
        long jMax = yj9Var.b;
        long j = yj9Var.e;
        if (j != -9223372036854775807L && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jA = a(gqfVarJ, jMax, false, new boolean[this.j.length]);
        long j2 = this.p;
        yj9 yj9Var2 = this.g;
        this.p = (yj9Var2.b - jA) + j2;
        this.g = yj9Var2.b(jA);
    }

    public final boolean g() {
        if (this.e) {
            return !this.f || this.a.s() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean h() {
        if (this.e) {
            return g() || d() - this.g.b >= -9223372036854775807L;
        }
        return false;
    }

    public final void i() {
        b();
        g gVar = this.a;
        try {
            boolean z = gVar instanceof b;
            i iVar = this.l;
            if (z) {
                iVar.f(((b) gVar).a);
            } else {
                iVar.f(gVar);
            }
        } catch (RuntimeException e) {
            zkd.x("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final gqf j(float f, emf emfVar, boolean z) {
        p35[] p35VarArr;
        xpf xpfVar = this.n;
        h.b bVar = this.g.a;
        fqf fqfVar = this.k;
        l[] lVarArr = this.j;
        gqf gqfVarE = fqfVar.e(lVarArr, xpfVar, bVar, emfVar);
        int i = 0;
        while (true) {
            int i2 = gqfVarE.a;
            p35VarArr = (p35[]) gqfVarE.c;
            if (i >= i2) {
                break;
            }
            if (gqfVarE.c(i)) {
                if (p35VarArr[i] == null && ((androidx.media3.exoplayer.b) lVarArr[i]).b != -2) {
                    z = false;
                }
                ka2.q(z);
            } else {
                ka2.q(p35VarArr[i] == null);
            }
            i++;
        }
        for (p35 p35Var : p35VarArr) {
            if (p35Var != null) {
                p35Var.h(f);
                p35Var.n(z);
            }
        }
        return gqfVarE;
    }

    public final void k() {
        g gVar = this.a;
        if (gVar instanceof b) {
            long j = this.g.d;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            b bVar = (b) gVar;
            bVar.e = 0L;
            bVar.f = j;
        }
    }
}
