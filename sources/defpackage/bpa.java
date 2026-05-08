package defpackage;

import androidx.media3.common.ParserException;
import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public final class bpa {
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f = new int[255];
    public final g4b g = new g4b(255);

    public final boolean a(n55 n55Var, boolean z) throws ParserException, EOFException {
        boolean zD;
        boolean zD2;
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        g4b g4bVar = this.g;
        g4bVar.G(27);
        try {
            zD = n55Var.d(g4bVar.a, 0, 27, z);
        } catch (EOFException e) {
            if (!z) {
                throw e;
            }
            zD = false;
        }
        if (zD && g4bVar.z() == 1332176723) {
            if (g4bVar.x() == 0) {
                this.a = g4bVar.x();
                this.b = g4bVar.m();
                g4bVar.o();
                g4bVar.o();
                g4bVar.o();
                int iX = g4bVar.x();
                this.c = iX;
                this.d = iX + 27;
                g4bVar.G(iX);
                try {
                    zD2 = n55Var.d(g4bVar.a, 0, this.c, z);
                } catch (EOFException e2) {
                    if (!z) {
                        throw e2;
                    }
                    zD2 = false;
                }
                if (zD2) {
                    for (int i = 0; i < this.c; i++) {
                        int iX2 = g4bVar.x();
                        this.f[i] = iX2;
                        this.e += iX2;
                    }
                    return true;
                }
            } else if (!z) {
                throw ParserException.c("unsupported bit stream revision");
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (r10 == (-1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        if (r9.getPosition() >= r10) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        if (r9.m(1) == (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(defpackage.n55 r9, long r10) {
        /*
            r8 = this;
            long r0 = r9.getPosition()
            long r2 = r9.j()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L10
            r0 = r2
            goto L11
        L10:
            r0 = r1
        L11:
            defpackage.ka2.l(r0)
            g4b r8 = r8.g
            r0 = 4
            r8.G(r0)
        L1a:
            r3 = -1
            int r3 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r3 == 0) goto L2b
            long r4 = r9.getPosition()
            r6 = 4
            long r4 = r4 + r6
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 >= 0) goto L4b
        L2b:
            byte[] r4 = r8.a
            boolean r4 = r9.d(r4, r1, r0, r2)     // Catch: java.io.EOFException -> L32
            goto L33
        L32:
            r4 = r1
        L33:
            if (r4 == 0) goto L4b
            r8.J(r1)
            long r3 = r8.z()
            r5 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L47
            r9.f()
            return r2
        L47:
            r9.n(r2)
            goto L1a
        L4b:
            if (r3 == 0) goto L55
            long r4 = r9.getPosition()
            int r8 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r8 >= 0) goto L5d
        L55:
            int r8 = r9.m(r2)
            r0 = -1
            if (r8 == r0) goto L5d
            goto L4b
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpa.b(n55, long):boolean");
    }
}
