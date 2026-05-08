package defpackage;

import defpackage.vuf;

/* JADX INFO: loaded from: classes.dex */
public final class w9b implements vuf {
    public final jp4 a;
    public final f4b b = new f4b(new byte[10], 10);
    public int c = 0;
    public int d;
    public qmf e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;
    public long l;

    public w9b(jp4 jp4Var) {
        this.a = jp4Var;
    }

    @Override // defpackage.vuf
    public final void a(int i, g4b g4bVar) {
        ka2.r(this.e);
        int i2 = i & 1;
        int i3 = -1;
        int i4 = 2;
        jp4 jp4Var = this.a;
        if (i2 != 0) {
            int i5 = this.c;
            if (i5 != 0 && i5 != 1) {
                if (i5 == 2) {
                    zkd.T("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i5 != 3) {
                        bg.h();
                        return;
                    }
                    if (this.j != -1) {
                        zkd.T("PesReader", "Unexpected start indicator: expected " + this.j + " more bytes");
                    }
                    jp4Var.d(g4bVar.c == 0);
                }
            }
            this.c = 1;
            this.d = 0;
        }
        int i6 = i;
        while (g4bVar.a() > 0) {
            int i7 = this.c;
            if (i7 != 0) {
                f4b f4bVar = this.b;
                if (i7 != 1) {
                    if (i7 == i4) {
                        if (d(g4bVar, (byte[]) f4bVar.d, Math.min(10, this.i)) && d(g4bVar, null, this.i)) {
                            f4bVar.m(0);
                            this.l = -9223372036854775807L;
                            if (this.f) {
                                f4bVar.o(4);
                                long jG = ((long) f4bVar.g(3)) << 30;
                                f4bVar.o(1);
                                long jG2 = ((long) (f4bVar.g(15) << 15)) | jG;
                                f4bVar.o(1);
                                long jG3 = jG2 | ((long) f4bVar.g(15));
                                f4bVar.o(1);
                                if (!this.h && this.g) {
                                    f4bVar.o(4);
                                    long jG4 = ((long) f4bVar.g(3)) << 30;
                                    f4bVar.o(1);
                                    long jG5 = jG4 | ((long) (f4bVar.g(15) << 15));
                                    f4bVar.o(1);
                                    long jG6 = jG5 | ((long) f4bVar.g(15));
                                    f4bVar.o(1);
                                    this.e.b(jG6);
                                    this.h = true;
                                }
                                this.l = this.e.b(jG3);
                            }
                            i6 |= this.k ? 4 : 0;
                            jp4Var.f(i6, this.l);
                            this.c = 3;
                            this.d = 0;
                        }
                    } else {
                        if (i7 != 3) {
                            bg.h();
                            return;
                        }
                        int iA = g4bVar.a();
                        int i8 = this.j;
                        int i9 = i8 == i3 ? 0 : iA - i8;
                        if (i9 > 0) {
                            iA -= i9;
                            g4bVar.I(g4bVar.b + iA);
                        }
                        jp4Var.a(g4bVar);
                        int i10 = this.j;
                        if (i10 != i3) {
                            int i11 = i10 - iA;
                            this.j = i11;
                            if (i11 == 0) {
                                jp4Var.d(false);
                                this.c = 1;
                                this.d = 0;
                            }
                        }
                    }
                } else if (d(g4bVar, (byte[]) f4bVar.d, 9)) {
                    this.c = e() ? 2 : 0;
                    this.d = 0;
                }
            } else {
                g4bVar.K(g4bVar.a());
            }
            i3 = -1;
            i4 = 2;
        }
    }

    @Override // defpackage.vuf
    public final void b(qmf qmfVar, o55 o55Var, vuf.c cVar) {
        this.e = qmfVar;
        this.a.e(o55Var, cVar);
    }

    @Override // defpackage.vuf
    public final void c() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.c();
    }

    public final boolean d(g4b g4bVar, byte[] bArr, int i) {
        int iMin = Math.min(g4bVar.a(), i - this.d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            g4bVar.K(iMin);
        } else {
            g4bVar.h(this.d, bArr, iMin);
        }
        int i2 = this.d + iMin;
        this.d = i2;
        return i2 == i;
    }

    public final boolean e() {
        f4b f4bVar = this.b;
        f4bVar.m(0);
        int iG = f4bVar.g(24);
        if (iG != 1) {
            g7.j(iG, "Unexpected start code prefix: ", "PesReader");
            this.j = -1;
            return false;
        }
        f4bVar.o(8);
        int iG2 = f4bVar.g(16);
        f4bVar.o(5);
        this.k = f4bVar.f();
        f4bVar.o(2);
        this.f = f4bVar.f();
        this.g = f4bVar.f();
        f4bVar.o(6);
        int iG3 = f4bVar.g(8);
        this.i = iG3;
        if (iG2 == 0) {
            this.j = -1;
            return true;
        }
        int i = (iG2 - 3) - iG3;
        this.j = i;
        if (i < 0) {
            zkd.T("PesReader", "Found negative packet payload size: " + this.j);
            this.j = -1;
        }
        return true;
    }
}
