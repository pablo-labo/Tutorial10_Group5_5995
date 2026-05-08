package androidx.media3.exoplayer.source;

import androidx.media3.common.a;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.source.ClippingMediaSource;
import androidx.media3.exoplayer.source.g;
import defpackage.ayd;
import defpackage.p35;
import defpackage.ql0;
import defpackage.rjd;
import defpackage.st9;
import defpackage.vjg;
import defpackage.xpf;

/* JADX INFO: loaded from: classes.dex */
public final class b implements g, g.a {
    public ClippingMediaSource.IllegalClippingException V;
    public final g a;
    public g.a b;
    public a[] c = new a[0];
    public long d;
    public long e;
    public long f;

    public final class a implements rjd {
        public final rjd a;
        public boolean b;

        public a(rjd rjdVar) {
            this.a = rjdVar;
        }

        @Override // defpackage.rjd
        public final void a() {
            this.a.a();
        }

        @Override // defpackage.rjd
        public final boolean b() {
            return !b.this.g() && this.a.b();
        }

        @Override // defpackage.rjd
        public final int m(long j) {
            if (b.this.g()) {
                return -3;
            }
            return this.a.m(j);
        }

        @Override // defpackage.rjd
        public final int o(ql0 ql0Var, DecoderInputBuffer decoderInputBuffer, int i) {
            b bVar = b.this;
            if (bVar.g()) {
                return -3;
            }
            if (this.b) {
                decoderInputBuffer.a = 4;
                return -4;
            }
            long jS = bVar.s();
            int iO = this.a.o(ql0Var, decoderInputBuffer, i);
            if (iO != -5) {
                long j = bVar.f;
                if (j == Long.MIN_VALUE || ((iO != -4 || decoderInputBuffer.f < j) && !(iO == -3 && jS == Long.MIN_VALUE && !decoderInputBuffer.e))) {
                    return iO;
                }
                decoderInputBuffer.n();
                decoderInputBuffer.a = 4;
                this.b = true;
                return -4;
            }
            androidx.media3.common.a aVar = (androidx.media3.common.a) ql0Var.c;
            aVar.getClass();
            int i2 = aVar.J;
            int i3 = aVar.I;
            if (i3 == 0 && i2 == 0) {
                return -5;
            }
            if (bVar.e != 0) {
                i3 = 0;
            }
            if (bVar.f != Long.MIN_VALUE) {
                i2 = 0;
            }
            a.C0036a c0036aA = aVar.a();
            c0036aA.H = i3;
            c0036aA.I = i2;
            ql0Var.c = new androidx.media3.common.a(c0036aA);
            return -5;
        }
    }

    public b(g gVar, boolean z, long j, long j2) {
        this.a = gVar;
        this.d = z ? j : -9223372036854775807L;
        this.e = j;
        this.f = j2;
    }

    @Override // androidx.media3.exoplayer.source.g.a
    public final void a(g gVar) {
        if (this.V != null) {
            return;
        }
        g.a aVar = this.b;
        aVar.getClass();
        aVar.a(this);
    }

    @Override // androidx.media3.exoplayer.source.p.a
    public final void b(p pVar) {
        g.a aVar = this.b;
        aVar.getClass();
        aVar.b(this);
    }

    @Override // androidx.media3.exoplayer.source.g
    public final long c(long j, ayd aydVar) {
        long j2 = this.e;
        if (j == j2) {
            return j2;
        }
        long j3 = vjg.j(aydVar.a, 0L, j - j2);
        long j4 = aydVar.b;
        long j5 = this.f;
        long j6 = vjg.j(j4, 0L, j5 == Long.MIN_VALUE ? Long.MAX_VALUE : j5 - j);
        if (j3 != aydVar.a || j6 != aydVar.b) {
            aydVar = new ayd(j3, j6);
        }
        return this.a.c(j, aydVar);
    }

    @Override // androidx.media3.exoplayer.source.p
    public final boolean d() {
        return this.a.d();
    }

    @Override // androidx.media3.exoplayer.source.p
    public final boolean e(androidx.media3.exoplayer.g gVar) {
        return this.a.e(gVar);
    }

    @Override // androidx.media3.exoplayer.source.g
    public final long f(p35[] p35VarArr, boolean[] zArr, rjd[] rjdVarArr, boolean[] zArr2, long j) {
        long j2;
        this.c = new a[rjdVarArr.length];
        rjd[] rjdVarArr2 = new rjd[rjdVarArr.length];
        for (int i = 0; i < rjdVarArr.length; i++) {
            a[] aVarArr = this.c;
            a aVar = (a) rjdVarArr[i];
            aVarArr[i] = aVar;
            rjdVarArr2[i] = aVar != null ? aVar.a : null;
        }
        long jF = this.a.f(p35VarArr, zArr, rjdVarArr2, zArr2, j);
        long j3 = this.f;
        long jMax = Math.max(jF, j);
        if (j3 != Long.MIN_VALUE) {
            jMax = Math.min(jMax, j3);
        }
        if (g()) {
            if (jF >= j) {
                if (jF != 0) {
                    for (p35 p35Var : p35VarArr) {
                        if (p35Var != null) {
                            androidx.media3.common.a aVarQ = p35Var.q();
                            if (!st9.a(aVarQ.n, aVarQ.k)) {
                            }
                        }
                    }
                }
                j2 = -9223372036854775807L;
            }
            j2 = jMax;
            break;
        } else {
            j2 = -9223372036854775807L;
        }
        this.d = j2;
        for (int i2 = 0; i2 < rjdVarArr.length; i2++) {
            rjd rjdVar = rjdVarArr2[i2];
            a[] aVarArr2 = this.c;
            if (rjdVar == null) {
                aVarArr2[i2] = null;
            } else {
                a aVar2 = aVarArr2[i2];
                if (aVar2 == null || aVar2.a != rjdVar) {
                    aVarArr2[i2] = new a(rjdVar);
                }
            }
            rjdVarArr[i2] = aVarArr2[i2];
        }
        return jMax;
    }

    public final boolean g() {
        return this.d != -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.p
    public final long h() {
        long jH = this.a.h();
        if (jH != Long.MIN_VALUE) {
            long j = this.f;
            if (j == Long.MIN_VALUE || jH < j) {
                return jH;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.source.g
    public final long i(long j) {
        this.d = -9223372036854775807L;
        for (a aVar : this.c) {
            if (aVar != null) {
                aVar.b = false;
            }
        }
        long jI = this.a.i(j);
        long j2 = this.e;
        long j3 = this.f;
        long jMax = Math.max(jI, j2);
        return j3 != Long.MIN_VALUE ? Math.min(jMax, j3) : jMax;
    }

    @Override // androidx.media3.exoplayer.source.g
    public final long j() {
        if (g()) {
            long j = this.d;
            this.d = -9223372036854775807L;
            long j2 = j();
            return j2 != -9223372036854775807L ? j2 : j;
        }
        long j3 = this.a.j();
        if (j3 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j4 = this.e;
        long j5 = this.f;
        long jMax = Math.max(j3, j4);
        return j5 != Long.MIN_VALUE ? Math.min(jMax, j5) : jMax;
    }

    @Override // androidx.media3.exoplayer.source.g
    public final void l() throws ClippingMediaSource.IllegalClippingException {
        ClippingMediaSource.IllegalClippingException illegalClippingException = this.V;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        this.a.l();
    }

    @Override // androidx.media3.exoplayer.source.g
    public final void p(g.a aVar, long j) {
        this.b = aVar;
        this.a.p(this, j);
    }

    @Override // androidx.media3.exoplayer.source.g
    public final xpf q() {
        return this.a.q();
    }

    @Override // androidx.media3.exoplayer.source.p
    public final long s() {
        long jS = this.a.s();
        if (jS != Long.MIN_VALUE) {
            long j = this.f;
            if (j == Long.MIN_VALUE || jS < j) {
                return jS;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.source.g
    public final void t(long j, boolean z) {
        this.a.t(j, z);
    }

    @Override // androidx.media3.exoplayer.source.p
    public final void u(long j) {
        this.a.u(j);
    }
}
