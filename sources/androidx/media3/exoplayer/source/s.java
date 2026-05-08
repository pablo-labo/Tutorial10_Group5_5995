package androidx.media3.exoplayer.source;

import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.g;
import androidx.media3.exoplayer.source.g;
import defpackage.ayd;
import defpackage.p35;
import defpackage.ql0;
import defpackage.rjd;
import defpackage.xpf;

/* JADX INFO: loaded from: classes.dex */
public final class s implements g, g.a {
    public final g a;
    public final long b;
    public g.a c;

    public static final class a implements rjd {
        public final rjd a;
        public final long b;

        public a(rjd rjdVar, long j) {
            this.a = rjdVar;
            this.b = j;
        }

        @Override // defpackage.rjd
        public final void a() {
            this.a.a();
        }

        @Override // defpackage.rjd
        public final boolean b() {
            return this.a.b();
        }

        @Override // defpackage.rjd
        public final int m(long j) {
            return this.a.m(j - this.b);
        }

        @Override // defpackage.rjd
        public final int o(ql0 ql0Var, DecoderInputBuffer decoderInputBuffer, int i) {
            int iO = this.a.o(ql0Var, decoderInputBuffer, i);
            if (iO == -4) {
                decoderInputBuffer.f += this.b;
            }
            return iO;
        }
    }

    public s(g gVar, long j) {
        this.a = gVar;
        this.b = j;
    }

    @Override // androidx.media3.exoplayer.source.g.a
    public final void a(g gVar) {
        g.a aVar = this.c;
        aVar.getClass();
        aVar.a(this);
    }

    @Override // androidx.media3.exoplayer.source.p.a
    public final void b(p pVar) {
        g.a aVar = this.c;
        aVar.getClass();
        aVar.b(this);
    }

    @Override // androidx.media3.exoplayer.source.g
    public final long c(long j, ayd aydVar) {
        long j2 = this.b;
        return this.a.c(j - j2, aydVar) + j2;
    }

    @Override // androidx.media3.exoplayer.source.p
    public final boolean d() {
        return this.a.d();
    }

    @Override // androidx.media3.exoplayer.source.p
    public final boolean e(androidx.media3.exoplayer.g gVar) {
        g.a aVar = new g.a();
        long j = gVar.a;
        aVar.b = gVar.b;
        aVar.c = gVar.c;
        aVar.a = j - this.b;
        return this.a.e(new androidx.media3.exoplayer.g(aVar));
    }

    @Override // androidx.media3.exoplayer.source.g
    public final long f(p35[] p35VarArr, boolean[] zArr, rjd[] rjdVarArr, boolean[] zArr2, long j) {
        rjd[] rjdVarArr2 = new rjd[rjdVarArr.length];
        int i = 0;
        while (true) {
            rjd rjdVar = null;
            if (i >= rjdVarArr.length) {
                break;
            }
            a aVar = (a) rjdVarArr[i];
            if (aVar != null) {
                rjdVar = aVar.a;
            }
            rjdVarArr2[i] = rjdVar;
            i++;
        }
        g gVar = this.a;
        long j2 = this.b;
        long jF = gVar.f(p35VarArr, zArr, rjdVarArr2, zArr2, j - j2);
        for (int i2 = 0; i2 < rjdVarArr.length; i2++) {
            rjd rjdVar2 = rjdVarArr2[i2];
            if (rjdVar2 == null) {
                rjdVarArr[i2] = null;
            } else {
                rjd rjdVar3 = rjdVarArr[i2];
                if (rjdVar3 == null || ((a) rjdVar3).a != rjdVar2) {
                    rjdVarArr[i2] = new a(rjdVar2, j2);
                }
            }
        }
        return jF + j2;
    }

    @Override // androidx.media3.exoplayer.source.p
    public final long h() {
        long jH = this.a.h();
        if (jH == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jH + this.b;
    }

    @Override // androidx.media3.exoplayer.source.g
    public final long i(long j) {
        long j2 = this.b;
        return this.a.i(j - j2) + j2;
    }

    @Override // androidx.media3.exoplayer.source.g
    public final long j() {
        long j = this.a.j();
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j + this.b;
    }

    @Override // androidx.media3.exoplayer.source.g
    public final void l() {
        this.a.l();
    }

    @Override // androidx.media3.exoplayer.source.g
    public final void p(g.a aVar, long j) {
        this.c = aVar;
        this.a.p(this, j - this.b);
    }

    @Override // androidx.media3.exoplayer.source.g
    public final xpf q() {
        return this.a.q();
    }

    @Override // androidx.media3.exoplayer.source.p
    public final long s() {
        long jS = this.a.s();
        if (jS == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jS + this.b;
    }

    @Override // androidx.media3.exoplayer.source.g
    public final void t(long j, boolean z) {
        this.a.t(j - this.b, z);
    }

    @Override // androidx.media3.exoplayer.source.p
    public final void u(long j) {
        this.a.u(j - this.b);
    }
}
