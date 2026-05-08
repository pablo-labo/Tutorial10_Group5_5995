package defpackage;

import androidx.media3.common.a;
import defpackage.o5;
import defpackage.vuf;

/* JADX INFO: loaded from: classes.dex */
public final class n5 implements jp4 {
    public final f4b a;
    public final g4b b;
    public final String c;
    public final int d;
    public final String e;
    public String f;
    public zpf g;
    public int h;
    public int i;
    public boolean j;
    public long k;
    public a l;
    public int m;
    public long n;

    public n5(String str, int i, String str2) {
        f4b f4bVar = new f4b(new byte[16], 16);
        this.a = f4bVar;
        this.b = new g4b((byte[]) f4bVar.d);
        this.h = 0;
        this.i = 0;
        this.j = false;
        this.n = -9223372036854775807L;
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    @Override // defpackage.jp4
    public final void a(g4b g4bVar) {
        ka2.r(this.g);
        while (g4bVar.a() > 0) {
            int i = this.h;
            g4b g4bVar2 = this.b;
            if (i == 0) {
                while (g4bVar.a() > 0) {
                    if (this.j) {
                        int iX = g4bVar.x();
                        this.j = iX == 172;
                        if (iX == 64 || iX == 65) {
                            boolean z = iX == 65;
                            this.h = 1;
                            byte[] bArr = g4bVar2.a;
                            bArr[0] = -84;
                            bArr[1] = (byte) (z ? 65 : 64);
                            this.i = 2;
                        }
                    } else {
                        this.j = g4bVar.x() == 172;
                    }
                }
            } else if (i == 1) {
                byte[] bArr2 = g4bVar2.a;
                int iMin = Math.min(g4bVar.a(), 16 - this.i);
                g4bVar.h(this.i, bArr2, iMin);
                int i2 = this.i + iMin;
                this.i = i2;
                if (i2 == 16) {
                    f4b f4bVar = this.a;
                    f4bVar.m(0);
                    o5.b bVarB = o5.b(f4bVar);
                    int i3 = bVarB.a;
                    a aVar = this.l;
                    if (aVar == null || 2 != aVar.F || i3 != aVar.G || !"audio/ac4".equals(aVar.n)) {
                        a.C0036a c0036a = new a.C0036a();
                        c0036a.a = this.f;
                        c0036a.l = st9.p(this.e);
                        c0036a.m = st9.p("audio/ac4");
                        c0036a.E = 2;
                        c0036a.F = i3;
                        c0036a.d = this.c;
                        c0036a.f = this.d;
                        a aVar2 = new a(c0036a);
                        this.l = aVar2;
                        this.g.d(aVar2);
                    }
                    this.m = bVarB.b;
                    this.k = (((long) bVarB.c) * 1000000) / ((long) this.l.G);
                    g4bVar2.J(0);
                    this.g.f(16, g4bVar2);
                    this.h = 2;
                }
            } else if (i == 2) {
                int iMin2 = Math.min(g4bVar.a(), this.m - this.i);
                this.g.f(iMin2, g4bVar);
                int i4 = this.i + iMin2;
                this.i = i4;
                if (i4 == this.m) {
                    ka2.q(this.n != -9223372036854775807L);
                    this.g.a(this.n, 1, this.m, 0, null);
                    this.n += this.k;
                    this.h = 0;
                }
            }
        }
    }

    @Override // defpackage.jp4
    public final void c() {
        this.h = 0;
        this.i = 0;
        this.j = false;
        this.n = -9223372036854775807L;
    }

    @Override // defpackage.jp4
    public final void d(boolean z) {
    }

    @Override // defpackage.jp4
    public final void e(o55 o55Var, vuf.c cVar) {
        cVar.a();
        cVar.b();
        this.f = cVar.e;
        cVar.b();
        this.g = o55Var.o(cVar.d, 1);
    }

    @Override // defpackage.jp4
    public final void f(int i, long j) {
        this.n = j;
    }
}
