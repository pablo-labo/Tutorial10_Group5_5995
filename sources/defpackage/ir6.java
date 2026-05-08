package defpackage;

import androidx.media3.common.a;
import defpackage.vuf;

/* JADX INFO: loaded from: classes.dex */
public final class ir6 implements jp4 {
    public zpf b;
    public boolean c;
    public int e;
    public int f;
    public final g4b a = new g4b(10);
    public long d = -9223372036854775807L;

    @Override // defpackage.jp4
    public final void a(g4b g4bVar) {
        ka2.r(this.b);
        if (this.c) {
            int iA = g4bVar.a();
            int i = this.f;
            if (i < 10) {
                int iMin = Math.min(iA, 10 - i);
                byte[] bArr = g4bVar.a;
                int i2 = g4bVar.b;
                g4b g4bVar2 = this.a;
                System.arraycopy(bArr, i2, g4bVar2.a, this.f, iMin);
                if (this.f + iMin == 10) {
                    g4bVar2.J(0);
                    if (73 != g4bVar2.x() || 68 != g4bVar2.x() || 51 != g4bVar2.x()) {
                        zkd.T("Id3Reader", "Discarding invalid ID3 tag");
                        this.c = false;
                        return;
                    } else {
                        g4bVar2.K(3);
                        this.e = g4bVar2.w() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iA, this.e - this.f);
            this.b.f(iMin2, g4bVar);
            this.f += iMin2;
        }
    }

    @Override // defpackage.jp4
    public final void c() {
        this.c = false;
        this.d = -9223372036854775807L;
    }

    @Override // defpackage.jp4
    public final void d(boolean z) {
        int i;
        ka2.r(this.b);
        if (this.c && (i = this.e) != 0 && this.f == i) {
            ka2.q(this.d != -9223372036854775807L);
            this.b.a(this.d, 1, this.e, 0, null);
            this.c = false;
        }
    }

    @Override // defpackage.jp4
    public final void e(o55 o55Var, vuf.c cVar) {
        cVar.a();
        cVar.b();
        zpf zpfVarO = o55Var.o(cVar.d, 5);
        this.b = zpfVarO;
        a.C0036a c0036a = new a.C0036a();
        cVar.b();
        c0036a.a = cVar.e;
        c0036a.l = st9.p("video/mp2t");
        c0036a.m = st9.p("application/id3");
        t40.n(c0036a, zpfVarO);
    }

    @Override // defpackage.jp4
    public final void f(int i, long j) {
        if ((i & 4) == 0) {
            return;
        }
        this.c = true;
        this.d = j;
        this.e = 0;
        this.f = 0;
    }
}
