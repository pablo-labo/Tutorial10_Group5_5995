package defpackage;

import androidx.media3.common.ParserException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class l20 implements m55 {
    public static final int[] q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] r = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    public static final byte[] s;
    public static final byte[] t;
    public final u54 b;
    public boolean c;
    public long d;
    public int e;
    public int f;
    public int h;
    public long i;
    public o55 j;
    public zpf k;
    public zpf l;
    public zxd m;
    public boolean n;
    public long o;
    public boolean p;
    public final byte[] a = new byte[1];
    public int g = -1;

    static {
        String str = vjg.a;
        Charset charset = StandardCharsets.UTF_8;
        s = "#!AMR\n".getBytes(charset);
        t = "#!AMR-WB\n".getBytes(charset);
    }

    public l20() {
        u54 u54Var = new u54();
        this.b = u54Var;
        this.l = u54Var;
    }

    public final int a(n55 n55Var) throws ParserException {
        boolean z;
        n55Var.f();
        byte[] bArr = this.a;
        n55Var.h(0, bArr, 1);
        byte b = bArr[0];
        if ((b & 131) > 0) {
            throw ParserException.a(null, "Invalid padding bits for frame header " + ((int) b));
        }
        int i = (b >> 3) & 15;
        if (i >= 0 && i <= 15 && (((z = this.c) && (i < 10 || i > 13)) || (!z && (i < 12 || i > 14)))) {
            return z ? r[i] : q[i];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.c ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw ParserException.a(null, sb.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00eb A[PHI: r4
  0x00eb: PHI (r4v1 n55) = (r4v0 n55), (r4v5 n55) binds: [B:53:0x00e9, B:56:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fa  */
    @Override // defpackage.m55
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(defpackage.n55 r18, defpackage.dhb r19) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l20.b(n55, dhb):int");
    }

    @Override // defpackage.m55
    public final boolean c(n55 n55Var) {
        return e(n55Var);
    }

    @Override // defpackage.m55
    public final void d(long j, long j2) {
        this.d = 0L;
        this.e = 0;
        this.f = 0;
        this.o = j2;
        zxd zxdVar = this.m;
        if (!(zxdVar instanceof ia7)) {
            if (j == 0 || !(zxdVar instanceof pp2)) {
                this.i = 0L;
                return;
            } else {
                pp2 pp2Var = (pp2) zxdVar;
                this.i = (Math.max(0L, j - pp2Var.b) * 8000000) / ((long) pp2Var.e);
                return;
            }
        }
        ia7 ia7Var = (ia7) zxdVar;
        a59 a59Var = ia7Var.b;
        long jC = a59Var.a == 0 ? -9223372036854775807L : a59Var.c(vjg.b(ia7Var.a, j));
        this.i = jC;
        if (Math.abs(this.o - jC) < 20000) {
            return;
        }
        this.n = true;
        this.l = this.b;
    }

    public final boolean e(n55 n55Var) {
        n55Var.f();
        byte[] bArr = s;
        byte[] bArr2 = new byte[bArr.length];
        n55Var.h(0, bArr2, bArr.length);
        if (Arrays.equals(bArr2, bArr)) {
            this.c = false;
            n55Var.n(bArr.length);
            return true;
        }
        n55Var.f();
        byte[] bArr3 = t;
        byte[] bArr4 = new byte[bArr3.length];
        n55Var.h(0, bArr4, bArr3.length);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.c = true;
        n55Var.n(bArr3.length);
        return true;
    }

    @Override // defpackage.m55
    public final void l(o55 o55Var) {
        this.j = o55Var;
        zpf zpfVarO = o55Var.o(0, 1);
        this.k = zpfVarO;
        this.l = zpfVarO;
        o55Var.m();
    }

    @Override // defpackage.m55
    public final void release() {
    }
}
