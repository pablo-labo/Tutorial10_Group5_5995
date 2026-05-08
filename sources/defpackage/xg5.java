package defpackage;

import defpackage.ah5;
import java.io.EOFException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class xg5 {
    public static js9 a(n55 n55Var, boolean z) {
        ia iaVar = z ? null : fr6.e;
        g4b g4bVar = new g4b(10);
        js9 js9VarJ1 = null;
        int i = 0;
        while (true) {
            try {
                n55Var.h(0, g4bVar.a, 10);
                g4bVar.J(0);
                if (g4bVar.A() != 4801587) {
                    break;
                }
                g4bVar.K(3);
                int iW = g4bVar.w();
                int i2 = iW + 10;
                if (js9VarJ1 == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(g4bVar.a, 0, bArr, 0, 10);
                    n55Var.h(10, bArr, iW);
                    js9VarJ1 = new fr6(iaVar).J1(i2, bArr);
                } else {
                    n55Var.k(iW);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        n55Var.f();
        n55Var.k(i);
        if (js9VarJ1 == null || js9VarJ1.a.length == 0) {
            return null;
        }
        return js9VarJ1;
    }

    public static ah5.a b(g4b g4bVar) {
        g4bVar.K(1);
        int iA = g4bVar.A();
        long j = ((long) g4bVar.b) + ((long) iA);
        int i = iA / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long jR = g4bVar.r();
            if (jR == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = jR;
            jArrCopyOf2[i2] = g4bVar.r();
            g4bVar.K(2);
            i2++;
        }
        g4bVar.K((int) (j - ((long) g4bVar.b)));
        return new ah5.a(jArrCopyOf, jArrCopyOf2);
    }
}
