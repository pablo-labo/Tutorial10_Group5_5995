package defpackage;

import androidx.media3.common.a;
import defpackage.c1a;
import defpackage.vuf;

/* JADX INFO: loaded from: classes.dex */
public final class b1a implements jp4 {
    public final g4b a;
    public final c1a.a b;
    public final String c;
    public final int d;
    public final String e;
    public zpf f;
    public String g;
    public int h = 0;
    public int i;
    public boolean j;
    public boolean k;
    public long l;
    public int m;
    public long n;

    public b1a(String str, int i, String str2) {
        g4b g4bVar = new g4b(4);
        this.a = g4bVar;
        g4bVar.a[0] = -1;
        this.b = new c1a.a();
        this.n = -9223372036854775807L;
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    @Override // defpackage.jp4
    public final void a(g4b g4bVar) {
        ka2.r(this.f);
        while (g4bVar.a() > 0) {
            int i = this.h;
            g4b g4bVar2 = this.a;
            if (i == 0) {
                byte[] bArr = g4bVar.a;
                int i2 = g4bVar.b;
                int i3 = g4bVar.c;
                while (true) {
                    if (i2 >= i3) {
                        g4bVar.J(i3);
                        break;
                    }
                    byte b = bArr[i2];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.k && (b & 224) == 224;
                    this.k = z;
                    if (z2) {
                        g4bVar.J(i2 + 1);
                        this.k = false;
                        g4bVar2.a[1] = bArr[i2];
                        this.i = 2;
                        this.h = 1;
                        break;
                    }
                    i2++;
                }
            } else if (i == 1) {
                int iMin = Math.min(g4bVar.a(), 4 - this.i);
                g4bVar.h(this.i, g4bVar2.a, iMin);
                int i4 = this.i + iMin;
                this.i = i4;
                if (i4 >= 4) {
                    g4bVar2.J(0);
                    int iJ = g4bVar2.j();
                    c1a.a aVar = this.b;
                    if (aVar.a(iJ)) {
                        this.m = aVar.c;
                        if (!this.j) {
                            this.l = (((long) aVar.g) * 1000000) / ((long) aVar.d);
                            a.C0036a c0036a = new a.C0036a();
                            c0036a.a = this.g;
                            c0036a.l = st9.p(this.e);
                            c0036a.m = st9.p(aVar.b);
                            c0036a.n = 4096;
                            c0036a.E = aVar.e;
                            c0036a.F = aVar.d;
                            c0036a.d = this.c;
                            c0036a.f = this.d;
                            this.f.d(new a(c0036a));
                            this.j = true;
                        }
                        g4bVar2.J(0);
                        this.f.f(4, g4bVar2);
                        this.h = 2;
                    } else {
                        this.i = 0;
                        this.h = 1;
                    }
                }
            } else {
                if (i != 2) {
                    bg.h();
                    return;
                }
                int iMin2 = Math.min(g4bVar.a(), this.m - this.i);
                this.f.f(iMin2, g4bVar);
                int i5 = this.i + iMin2;
                this.i = i5;
                if (i5 >= this.m) {
                    ka2.q(this.n != -9223372036854775807L);
                    this.f.a(this.n, 1, this.m, 0, null);
                    this.n += this.l;
                    this.i = 0;
                    this.h = 0;
                }
            }
        }
    }

    @Override // defpackage.jp4
    public final void c() {
        this.h = 0;
        this.i = 0;
        this.k = false;
        this.n = -9223372036854775807L;
    }

    @Override // defpackage.jp4
    public final void d(boolean z) {
    }

    @Override // defpackage.jp4
    public final void e(o55 o55Var, vuf.c cVar) {
        cVar.a();
        cVar.b();
        this.g = cVar.e;
        cVar.b();
        this.f = o55Var.o(cVar.d, 1);
    }

    @Override // defpackage.jp4
    public final void f(int i, long j) {
        this.n = j;
    }
}
