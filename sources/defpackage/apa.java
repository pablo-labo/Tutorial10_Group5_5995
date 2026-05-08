package defpackage;

import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public final class apa {
    public final bpa a = new bpa();
    public final g4b b = new g4b(new byte[65025], 0);
    public int c = -1;
    public int d;
    public boolean e;

    public final int a(int i) {
        int i2;
        int i3 = 0;
        this.d = 0;
        do {
            int i4 = this.d;
            int i5 = i + i4;
            bpa bpaVar = this.a;
            if (i5 >= bpaVar.c) {
                break;
            }
            int[] iArr = bpaVar.f;
            this.d = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public final boolean b(n55 n55Var) {
        int i;
        ka2.q(n55Var != null);
        boolean z = this.e;
        g4b g4bVar = this.b;
        if (z) {
            this.e = false;
            g4bVar.G(0);
        }
        while (!this.e) {
            int i2 = this.c;
            bpa bpaVar = this.a;
            if (i2 < 0) {
                if (bpaVar.b(n55Var, -1L) && bpaVar.a(n55Var, true)) {
                    int iA = bpaVar.d;
                    if ((bpaVar.a & 1) == 1 && g4bVar.c == 0) {
                        iA += a(0);
                        i = this.d;
                    } else {
                        i = 0;
                    }
                    try {
                        n55Var.n(iA);
                        this.c = i;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int iA2 = a(this.c);
            int i3 = this.c + this.d;
            if (iA2 > 0) {
                g4bVar.c(g4bVar.c + iA2);
                try {
                    n55Var.readFully(g4bVar.a, g4bVar.c, iA2);
                    g4bVar.I(g4bVar.c + iA2);
                    this.e = bpaVar.f[i3 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i3 == bpaVar.c) {
                i3 = -1;
            }
            this.c = i3;
        }
        return true;
    }
}
