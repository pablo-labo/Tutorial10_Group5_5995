package defpackage;

import defpackage.vuf;
import defpackage.zxd;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
public final class sz implements m55 {
    public final g4b c;
    public final f4b d;
    public o55 e;
    public long f;
    public boolean h;
    public boolean i;
    public final tz a = new tz(0, null, "audio/mp4a-latm", true);
    public final g4b b = new g4b(2048);
    public long g = -1;

    public sz(int i) {
        g4b g4bVar = new g4b(10);
        this.c = g4bVar;
        byte[] bArr = g4bVar.a;
        this.d = new f4b(bArr, bArr.length);
    }

    @Override // defpackage.m55
    public final int b(n55 n55Var, dhb dhbVar) {
        ka2.r(this.e);
        n55Var.getLength();
        g4b g4bVar = this.b;
        int i = n55Var.read(g4bVar.a, 0, 2048);
        boolean z = i == -1;
        if (!this.i) {
            this.e.b(new zxd.b(-9223372036854775807L));
            this.i = true;
        }
        if (z) {
            return -1;
        }
        g4bVar.J(0);
        g4bVar.I(i);
        boolean z2 = this.h;
        tz tzVar = this.a;
        if (!z2) {
            tzVar.u = this.f;
            this.h = true;
        }
        tzVar.a(g4bVar);
        return 0;
    }

    @Override // defpackage.m55
    public final boolean c(n55 n55Var) throws EOFException, InterruptedIOException {
        g4b g4bVar;
        int i = 0;
        while (true) {
            g4bVar = this.c;
            n55Var.h(0, g4bVar.a, 10);
            g4bVar.J(0);
            if (g4bVar.A() != 4801587) {
                break;
            }
            g4bVar.K(3);
            int iW = g4bVar.w();
            i += iW + 10;
            n55Var.k(iW);
        }
        n55Var.f();
        n55Var.k(i);
        if (this.g == -1) {
            this.g = i;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = i;
        do {
            hn3 hn3Var = (hn3) n55Var;
            hn3Var.d(g4bVar.a, 0, 2, false);
            g4bVar.J(0);
            if ((g4bVar.D() & 65526) == 65520) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                hn3Var.d(g4bVar.a, 0, 4, false);
                f4b f4bVar = this.d;
                f4bVar.m(14);
                int iG = f4bVar.g(13);
                if (iG <= 6) {
                    i4++;
                    hn3Var.f = 0;
                    hn3Var.o(i4, false);
                } else {
                    hn3Var.o(iG - 6, false);
                    i3 += iG;
                }
            } else {
                i4++;
                hn3Var.f = 0;
                hn3Var.o(i4, false);
            }
            i2 = 0;
            i3 = 0;
        } while (i4 - i < 8192);
        return false;
    }

    @Override // defpackage.m55
    public final void d(long j, long j2) {
        this.h = false;
        this.a.c();
        this.f = j2;
    }

    @Override // defpackage.m55
    public final void l(o55 o55Var) {
        this.e = o55Var;
        this.a.e(o55Var, new vuf.c(0, 1));
        o55Var.m();
    }

    @Override // defpackage.m55
    public final void release() {
    }
}
