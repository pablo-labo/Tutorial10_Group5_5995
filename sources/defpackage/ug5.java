package defpackage;

import defpackage.wf1;
import defpackage.wg5;

/* JADX INFO: loaded from: classes.dex */
public final class ug5 extends wf1 {

    public static final class a implements wf1.f {
        public final ah5 a;
        public final int b;
        public final wg5.a c = new wg5.a();

        public a(ah5 ah5Var, int i) {
            this.a = ah5Var;
            this.b = i;
        }

        @Override // wf1.f
        public final wf1.e a(n55 n55Var, long j) {
            long position = n55Var.getPosition();
            long jC = c(n55Var);
            long j2 = n55Var.j();
            n55Var.k(Math.max(6, this.a.c));
            long jC2 = c(n55Var);
            return (jC > j || jC2 <= j) ? jC2 <= j ? new wf1.e(jC2, -2, n55Var.j()) : new wf1.e(jC, -1, position) : new wf1.e(-9223372036854775807L, 0, j2);
        }

        public final long c(n55 n55Var) {
            wg5.a aVar;
            ah5 ah5Var;
            int iL;
            while (true) {
                long j = n55Var.j();
                long length = n55Var.getLength() - 6;
                aVar = this.c;
                ah5Var = this.a;
                if (j >= length) {
                    break;
                }
                long j2 = n55Var.j();
                byte[] bArr = new byte[2];
                int i = 0;
                boolean zA = false;
                n55Var.h(0, bArr, 2);
                int i2 = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
                int i3 = this.b;
                if (i2 != i3) {
                    n55Var.f();
                    n55Var.k((int) (j2 - n55Var.getPosition()));
                } else {
                    g4b g4bVar = new g4b(16);
                    System.arraycopy(bArr, 0, g4bVar.a, 0, 2);
                    byte[] bArr2 = g4bVar.a;
                    while (i < 14 && (iL = n55Var.l(2 + i, bArr2, 14 - i)) != -1) {
                        i += iL;
                    }
                    g4bVar.I(i);
                    n55Var.f();
                    n55Var.k((int) (j2 - n55Var.getPosition()));
                    zA = wg5.a(g4bVar, ah5Var, i3, aVar);
                }
                if (zA) {
                    break;
                }
                n55Var.k(1);
            }
            if (n55Var.j() < n55Var.getLength() - 6) {
                return aVar.a;
            }
            n55Var.k((int) (n55Var.getLength() - n55Var.j()));
            return ah5Var.j;
        }
    }
}
