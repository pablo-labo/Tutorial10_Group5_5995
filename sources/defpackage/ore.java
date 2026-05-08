package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ore implements n55 {
    public final n55 a;
    public final long b;

    public ore(n55 n55Var, long j) {
        this.a = n55Var;
        ka2.l(n55Var.getPosition() >= j);
        this.b = j;
    }

    @Override // defpackage.n55
    public final boolean c(int i, boolean z) {
        return this.a.c(i, true);
    }

    @Override // defpackage.n55
    public final boolean d(byte[] bArr, int i, int i2, boolean z) {
        return this.a.d(bArr, i, i2, z);
    }

    @Override // defpackage.n55
    public final void f() {
        this.a.f();
    }

    @Override // defpackage.n55
    public final boolean g(byte[] bArr, int i, int i2, boolean z) {
        return this.a.g(bArr, 0, i2, z);
    }

    @Override // defpackage.n55
    public final long getLength() {
        return this.a.getLength() - this.b;
    }

    @Override // defpackage.n55
    public final long getPosition() {
        return this.a.getPosition() - this.b;
    }

    @Override // defpackage.n55
    public final void h(int i, byte[] bArr, int i2) {
        this.a.h(i, bArr, i2);
    }

    @Override // defpackage.n55
    public final long j() {
        return this.a.j() - this.b;
    }

    @Override // defpackage.n55
    public final void k(int i) {
        this.a.k(i);
    }

    @Override // defpackage.n55
    public final int l(int i, byte[] bArr, int i2) {
        return this.a.l(i, bArr, i2);
    }

    @Override // defpackage.n55
    public final int m(int i) {
        return this.a.m(i);
    }

    @Override // defpackage.n55
    public final void n(int i) {
        this.a.n(i);
    }

    @Override // defpackage.te3
    public final int read(byte[] bArr, int i, int i2) {
        return this.a.read(bArr, i, i2);
    }

    @Override // defpackage.n55
    public final void readFully(byte[] bArr, int i, int i2) {
        this.a.readFully(bArr, i, i2);
    }
}
