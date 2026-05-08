package androidx.media3.exoplayer;

import androidx.media3.common.a;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.l;
import androidx.media3.exoplayer.source.h;
import defpackage.d82;
import defpackage.emf;
import defpackage.ka2;
import defpackage.ng9;
import defpackage.ql0;
import defpackage.rjd;
import defpackage.sdb;
import defpackage.w1d;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements k, l {
    public d82 V;
    public int W;
    public rjd X;
    public androidx.media3.common.a[] Y;
    public long Z;
    public long a0;
    public final int b;
    public boolean c0;
    public w1d d;
    public boolean d0;
    public int e;
    public sdb f;
    public h.b f0;
    public l.a g0;
    public final Object a = new Object();
    public final ql0 c = new ql0();
    public long b0 = Long.MIN_VALUE;
    public emf e0 = emf.a;

    public b(int i) {
        this.b = i;
    }

    @Override // androidx.media3.exoplayer.k
    public final long A() {
        return this.b0;
    }

    @Override // androidx.media3.exoplayer.k
    public final void B(long j) {
        this.c0 = false;
        this.a0 = j;
        this.b0 = j;
        G(j, false);
    }

    @Override // androidx.media3.exoplayer.k
    public ng9 C() {
        return null;
    }

    public final ExoPlaybackException D(Exception exc, androidx.media3.common.a aVar, boolean z, int i) {
        int iA;
        if (aVar == null || this.d0) {
            iA = 4;
        } else {
            this.d0 = true;
            try {
                iA = a(aVar) & 7;
            } catch (ExoPlaybackException unused) {
                iA = 4;
            } finally {
                this.d0 = false;
            }
        }
        return new ExoPlaybackException(1, exc, i, getName(), this.e, aVar, aVar == null ? 4 : iA, this.f0, z);
    }

    public abstract void E();

    public void F(boolean z, boolean z2) {
    }

    public abstract void G(long j, boolean z);

    public void H() {
    }

    public void I() {
    }

    public void J() {
    }

    public void K() {
    }

    public void L(androidx.media3.common.a[] aVarArr, long j, long j2, h.b bVar) {
    }

    public final int M(ql0 ql0Var, DecoderInputBuffer decoderInputBuffer, int i) {
        rjd rjdVar = this.X;
        rjdVar.getClass();
        int iO = rjdVar.o(ql0Var, decoderInputBuffer, i);
        if (iO == -4) {
            if (decoderInputBuffer.h(4)) {
                this.b0 = Long.MIN_VALUE;
                return this.c0 ? -4 : -3;
            }
            long j = decoderInputBuffer.f + this.Z;
            decoderInputBuffer.f = j;
            this.b0 = Math.max(this.b0, j);
            return iO;
        }
        if (iO == -5) {
            androidx.media3.common.a aVar = (androidx.media3.common.a) ql0Var.c;
            aVar.getClass();
            long j2 = aVar.s;
            if (j2 != Long.MAX_VALUE) {
                a.C0036a c0036aA = aVar.a();
                c0036aA.r = j2 + this.Z;
                ql0Var.c = new androidx.media3.common.a(c0036aA);
            }
        }
        return iO;
    }

    @Override // androidx.media3.exoplayer.k
    public boolean c() {
        return j();
    }

    @Override // androidx.media3.exoplayer.k
    public final void disable() {
        ka2.q(this.W == 1);
        this.c.d();
        this.W = 0;
        this.X = null;
        this.Y = null;
        this.c0 = false;
        E();
        this.f0 = null;
    }

    @Override // androidx.media3.exoplayer.k
    public final int getState() {
        return this.W;
    }

    @Override // androidx.media3.exoplayer.k
    public final boolean j() {
        return this.b0 == Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.k
    public final void l() {
        this.c0 = true;
    }

    @Override // androidx.media3.exoplayer.j.b
    public void m(int i, Object obj) {
    }

    @Override // androidx.media3.exoplayer.k
    public final void n() {
        rjd rjdVar = this.X;
        rjdVar.getClass();
        rjdVar.a();
    }

    @Override // androidx.media3.exoplayer.k
    public final boolean o() {
        return this.c0;
    }

    @Override // androidx.media3.exoplayer.k
    public final int p() {
        return this.b;
    }

    @Override // androidx.media3.exoplayer.k
    public final void q(emf emfVar) {
        if (Objects.equals(this.e0, emfVar)) {
            return;
        }
        this.e0 = emfVar;
    }

    @Override // androidx.media3.exoplayer.k
    public final void release() {
        ka2.q(this.W == 0);
        H();
    }

    @Override // androidx.media3.exoplayer.k
    public final void reset() {
        ka2.q(this.W == 0);
        this.c.d();
        I();
    }

    @Override // androidx.media3.exoplayer.k
    public final void s(w1d w1dVar, androidx.media3.common.a[] aVarArr, rjd rjdVar, boolean z, boolean z2, long j, long j2, h.b bVar) {
        ka2.q(this.W == 0);
        this.d = w1dVar;
        this.f0 = bVar;
        this.W = 1;
        F(z, z2);
        t(aVarArr, rjdVar, j, j2, bVar);
        this.c0 = false;
        this.a0 = j;
        this.b0 = j;
        G(j, z);
    }

    @Override // androidx.media3.exoplayer.k
    public final void start() {
        ka2.q(this.W == 1);
        this.W = 2;
        J();
    }

    @Override // androidx.media3.exoplayer.k
    public final void stop() {
        ka2.q(this.W == 2);
        this.W = 1;
        K();
    }

    @Override // androidx.media3.exoplayer.k
    public final void t(androidx.media3.common.a[] aVarArr, rjd rjdVar, long j, long j2, h.b bVar) {
        ka2.q(!this.c0);
        this.X = rjdVar;
        this.f0 = bVar;
        if (this.b0 == Long.MIN_VALUE) {
            this.b0 = j;
        }
        this.Y = aVarArr;
        this.Z = j2;
        L(aVarArr, j, j2, bVar);
    }

    @Override // androidx.media3.exoplayer.k
    public final void u(int i, sdb sdbVar, d82 d82Var) {
        this.e = i;
        this.f = sdbVar;
        this.V = d82Var;
    }

    @Override // androidx.media3.exoplayer.k
    public final b v() {
        return this;
    }

    @Override // androidx.media3.exoplayer.l
    public int y() {
        return 0;
    }

    @Override // androidx.media3.exoplayer.k
    public final rjd z() {
        return this.X;
    }
}
