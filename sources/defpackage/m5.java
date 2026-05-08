package defpackage;

import defpackage.vuf;
import defpackage.zxd;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
public final class m5 implements m55 {
    public final n5 a = new n5(null, 0, "audio/ac4");
    public final g4b b = new g4b(16384);
    public boolean c;

    @Override // defpackage.m55
    public final int b(n55 n55Var, dhb dhbVar) {
        g4b g4bVar = this.b;
        int i = n55Var.read(g4bVar.a, 0, 16384);
        if (i == -1) {
            return -1;
        }
        g4bVar.J(0);
        g4bVar.I(i);
        boolean z = this.c;
        n5 n5Var = this.a;
        if (!z) {
            n5Var.n = 0L;
            this.c = true;
        }
        n5Var.a(g4bVar);
        return 0;
    }

    @Override // defpackage.m55
    public final boolean c(n55 n55Var) throws EOFException, InterruptedIOException {
        hn3 hn3Var;
        int i;
        g4b g4bVar = new g4b(10);
        int i2 = 0;
        while (true) {
            hn3Var = (hn3) n55Var;
            hn3Var.d(g4bVar.a, 0, 10, false);
            g4bVar.J(0);
            if (g4bVar.A() != 4801587) {
                break;
            }
            g4bVar.K(3);
            int iW = g4bVar.w();
            i2 += iW + 10;
            hn3Var.o(iW, false);
        }
        hn3Var.f = 0;
        hn3Var.o(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            hn3Var.d(g4bVar.a, 0, 7, false);
            g4bVar.J(0);
            int iD = g4bVar.D();
            if (iD == 44096 || iD == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = g4bVar.a;
                if (bArr.length < 7) {
                    i = -1;
                } else {
                    int i6 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i6 == 65535) {
                        i6 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i5 = 4;
                    }
                    if (iD == 44097) {
                        i5 += 2;
                    }
                    i = i6 + i5;
                }
                if (i == -1) {
                    break;
                }
                hn3Var.o(i - 7, false);
            } else {
                hn3Var.f = 0;
                i4++;
                if (i4 - i2 >= 8192) {
                    break;
                }
                hn3Var.o(i4, false);
                i3 = 0;
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
