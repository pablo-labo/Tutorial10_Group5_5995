package defpackage;

import androidx.media3.common.a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zxe implements m55 {
    public final dye a;
    public final androidx.media3.common.a b;
    public final ArrayList c;
    public zpf f;
    public int g;
    public int h;
    public long[] i;
    public long j;
    public byte[] e = vjg.b;
    public final g4b d = new g4b();

    public static class a implements Comparable<a> {
        public final long a;
        public final byte[] b;

        public a(long j, byte[] bArr) {
            this.a = j;
            this.b = bArr;
        }

        @Override // java.lang.Comparable
        public final int compareTo(a aVar) {
            return Long.compare(this.a, aVar.a);
        }
    }

    public zxe(dye dyeVar, androidx.media3.common.a aVar) {
        androidx.media3.common.a aVar2;
        this.a = dyeVar;
        if (aVar != null) {
            a.C0036a c0036aA = aVar.a();
            c0036aA.m = st9.p("application/x-media3-cues");
            c0036aA.j = aVar.n;
            c0036aA.K = dyeVar.c();
            aVar2 = new androidx.media3.common.a(c0036aA);
        } else {
            aVar2 = null;
        }
        this.b = aVar2;
        this.c = new ArrayList();
        this.h = 0;
        this.i = vjg.c;
        this.j = -9223372036854775807L;
    }

    public final void a(a aVar) {
        ka2.r(this.f);
        byte[] bArr = aVar.b;
        int length = bArr.length;
        g4b g4bVar = this.d;
        g4bVar.getClass();
        g4bVar.H(bArr.length, bArr);
        this.f.f(length, g4bVar);
        this.f.a(aVar.a, 1, length, 0, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x007e A[EXC_TOP_SPLITTER, PHI: r22
  0x007e: PHI (r22v4 int) = (r22v5 int), (r22v6 int) binds: [B:32:0x007c, B:29:0x0077] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    @Override // defpackage.m55
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(defpackage.n55 r21, defpackage.dhb r22) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zxe.b(n55, dhb):int");
    }

    @Override // defpackage.m55
    public final boolean c(n55 n55Var) {
        return true;
    }

    @Override // defpackage.m55
    public final void d(long j, long j2) {
        int i = this.h;
        ka2.q((i == 0 || i == 5) ? false : true);
        this.j = j2;
        if (this.h == 2) {
            this.h = 1;
        }
        if (this.h == 4) {
            this.h = 3;
        }
    }

    @Override // defpackage.m55
    public final void l(o55 o55Var) {
        ka2.q(this.h == 0);
        zpf zpfVarO = o55Var.o(0, 3);
        this.f = zpfVarO;
        androidx.media3.common.a aVar = this.b;
        if (aVar != null) {
            zpfVarO.d(aVar);
            o55Var.m();
            o55Var.b(new ia7(-9223372036854775807L, new long[]{0}, new long[]{0}));
        }
        this.h = 1;
    }

    @Override // defpackage.m55
    public final void release() {
        if (this.h == 5) {
            return;
        }
        this.a.reset();
        this.h = 5;
    }
}
