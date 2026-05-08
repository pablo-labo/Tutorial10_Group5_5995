package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes.dex */
public final class pad implements cd6 {
    public float V;
    public long W;
    public long X;
    public float Y;
    public float Z;
    public int a;
    public long a0;
    public float b;
    public dce b0;
    public float c;
    public boolean c0;
    public float d;
    public long d0;
    public float e;
    public iy3 e0;
    public float f;
    public vl8 f0;
    public int g0;
    public jwa h0;

    @Override // defpackage.cd6
    public final void S0() {
    }

    @Override // defpackage.cd6
    public final void b(float f) {
        if (this.d == f) {
            return;
        }
        this.a |= 4;
        this.d = f;
    }

    @Override // defpackage.cd6
    public final long c() {
        return this.d0;
    }

    @Override // defpackage.cd6
    public final void e(float f) {
        if (this.f == f) {
            return;
        }
        this.a |= 16;
        this.f = f;
    }

    @Override // defpackage.cd6
    public final void f(int i) {
        if (this.g0 == i) {
            return;
        }
        this.a |= 524288;
        this.g0 = i;
    }

    @Override // defpackage.iy3
    public final float getDensity() {
        return this.e0.getDensity();
    }

    @Override // defpackage.cd6
    public final void h() {
    }

    @Override // defpackage.cd6
    public final void i() {
    }

    @Override // defpackage.cd6
    public final void j(long j) {
        if (da2.c(this.W, j)) {
            return;
        }
        this.a |= 64;
        this.W = j;
    }

    @Override // defpackage.cd6
    public final void l() {
    }

    @Override // defpackage.cd6
    public final void m(float f) {
        if (this.b == f) {
            return;
        }
        this.a |= 1;
        this.b = f;
    }

    @Override // defpackage.cd6
    public final void n(boolean z) {
        if (this.c0 != z) {
            this.a |= 16384;
            this.c0 = z;
        }
    }

    @Override // defpackage.cd6
    public final void o(long j) {
        if (da2.c(this.X, j)) {
            return;
        }
        this.a |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        this.X = j;
    }

    @Override // defpackage.iy3
    public final float p1() {
        return this.e0.p1();
    }

    @Override // defpackage.cd6
    public final void q(float f) {
        if (this.Z == f) {
            return;
        }
        this.a |= 2048;
        this.Z = f;
    }

    @Override // defpackage.cd6
    public final void r1(dce dceVar) {
        if (wl7.b(this.b0, dceVar)) {
            return;
        }
        this.a |= 8192;
        this.b0 = dceVar;
    }

    @Override // defpackage.cd6
    public final void s(float f) {
        if (this.V == f) {
            return;
        }
        this.a |= 32;
        this.V = f;
    }

    @Override // defpackage.cd6
    public final void t(float f) {
        if (this.Y == f) {
            return;
        }
        this.a |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        this.Y = f;
    }

    @Override // defpackage.cd6
    public final void t0() {
    }

    @Override // defpackage.cd6
    public final void u(float f) {
        if (this.c == f) {
            return;
        }
        this.a |= 2;
        this.c = f;
    }

    @Override // defpackage.cd6
    public final void x(float f) {
        if (this.e == f) {
            return;
        }
        this.a |= 8;
        this.e = f;
    }

    @Override // defpackage.cd6
    public final void y0(long j) {
        if (mrf.a(this.a0, j)) {
            return;
        }
        this.a |= 4096;
        this.a0 = j;
    }
}
