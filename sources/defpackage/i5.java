package defpackage;

import defpackage.vuf;
import defpackage.zxd;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
public final class i5 implements m55 {
    public final j5 a = new j5("audio/ac3");
    public final g4b b = new g4b(2786);
    public boolean c;

    @Override // defpackage.m55
    public final int b(n55 n55Var, dhb dhbVar) {
        g4b g4bVar = this.b;
        int i = n55Var.read(g4bVar.a, 0, 2786);
        if (i == -1) {
            return -1;
        }
        g4bVar.J(0);
        g4bVar.I(i);
        boolean z = this.c;
        j5 j5Var = this.a;
        if (!z) {
            j5Var.n = 0L;
            this.c = true;
        }
        j5Var.a(g4bVar);
        return 0;
    }

    @Override // defpackage.m55
    public final boolean c(n55 n55Var) throws EOFException, InterruptedIOException {
        hn3 hn3Var;
        int iA;
        g4b g4bVar = new g4b(10);
        int i = 0;
        while (true) {
            hn3Var = (hn3) n55Var;
            hn3Var.d(g4bVar.a, 0, 10, false);
            g4bVar.J(0);
            if (g4bVar.A() != 4801587) {
                break;
            }
            g4bVar.K(3);
            int iW = g4bVar.w();
            i += iW + 10;
            hn3Var.o(iW, false);
        }
        hn3Var.f = 0;
        hn3Var.o(i, false);
        int i2 = 0;
        int i3 = i;
        while (true) {
            hn3Var.d(g4bVar.a, 0, 6, false);
            g4bVar.J(0);
            if (g4bVar.D() != 2935) {
                hn3Var.f = 0;
                i3++;
                if (i3 - i >= 8192) {
                    break;
                }
                hn3Var.o(i3, false);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                byte[] bArr = g4bVar.a;
                if (bArr.length < 6) {
                    iA = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    iA = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b = bArr[4];
                    iA = k5.a((b & 192) >> 6, b & 63);
                }
                if (iA == -1) {
                    break;
                }
                hn3Var.o(iA - 6, false);
            }
        }
        return false;
    }

    @Override // defpackage.m55
    public final void d(long j, long j2) {
        this.c = false;
        this.a.c();
    }

    @Override // defpackage.m55
    public final void l(o55 o55Var) {
        this.a.e(o55Var, new vuf.c(0, 1));
        o55Var.m();
        o55Var.b(new zxd.b(-9223372036854775807L));
    }

    @Override // defpackage.m55
    public final void release() {
    }
}
