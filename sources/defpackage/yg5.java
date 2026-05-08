package defpackage;

import androidx.media3.common.a;
import defpackage.ah5;
import defpackage.nue;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes.dex */
public final class yg5 extends nue {
    public ah5 n;
    public a o;

    public static final class a implements cpa {
        public ah5 a;
        public ah5.a b;
        public long c;
        public long d;

        @Override // defpackage.cpa
        public final long a(n55 n55Var) {
            long j = this.d;
            if (j < 0) {
                return -1L;
            }
            long j2 = -(j + 2);
            this.d = -1L;
            return j2;
        }

        @Override // defpackage.cpa
        public final zxd b() {
            ka2.q(this.c != -1);
            return new zg5(this.a, this.c);
        }

        @Override // defpackage.cpa
        public final void c(long j) {
            long[] jArr = this.b.a;
            this.d = jArr[vjg.e(jArr, j, true)];
        }
    }

    @Override // defpackage.nue
    public final long b(g4b g4bVar) {
        byte[] bArr = g4bVar.a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i = (bArr[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            g4bVar.K(4);
            g4bVar.E();
        }
        int iB = wg5.b(i, g4bVar);
        g4bVar.J(0);
        return iB;
    }

    @Override // defpackage.nue
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean c(g4b g4bVar, long j, nue.a aVar) {
        byte[] bArr = g4bVar.a;
        ah5 ah5Var = this.n;
        if (ah5Var == null) {
            ah5 ah5Var2 = new ah5(bArr, 17);
            this.n = ah5Var2;
            a.C0036a c0036aA = ah5Var2.c(Arrays.copyOfRange(bArr, 9, g4bVar.c), null).a();
            c0036aA.l = st9.p("audio/ogg");
            aVar.a = new androidx.media3.common.a(c0036aA);
            return true;
        }
        byte b = bArr[0];
        if ((b & 127) != 3) {
            if (b != -1) {
                return true;
            }
            a aVar2 = this.o;
            if (aVar2 != null) {
                aVar2.c = j;
                aVar.b = aVar2;
            }
            aVar.a.getClass();
            return false;
        }
        ah5.a aVarB = xg5.b(g4bVar);
        ah5 ah5Var3 = new ah5(ah5Var.a, ah5Var.b, ah5Var.c, ah5Var.d, ah5Var.e, ah5Var.g, ah5Var.h, ah5Var.j, aVarB, ah5Var.l);
        this.n = ah5Var3;
        a aVar3 = new a();
        aVar3.a = ah5Var3;
        aVar3.b = aVarB;
        aVar3.c = -1L;
        aVar3.d = -1L;
        this.o = aVar3;
        return true;
    }

    @Override // defpackage.nue
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = null;
            this.o = null;
        }
    }
}
