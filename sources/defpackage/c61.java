package defpackage;

import defpackage.zxd;

/* JADX INFO: loaded from: classes.dex */
public final class c61 implements m55 {
    public final g4b a;
    public final b b;
    public final boolean c;
    public final qq3 d;
    public int e;
    public o55 f;
    public d61 g;
    public long h;
    public o42[] i;
    public long j;
    public o42 k;
    public int l;
    public long m;
    public long n;
    public int o;
    public boolean p;

    public class a implements zxd {
        public final long a;

        public a(long j) {
            this.a = j;
        }

        @Override // defpackage.zxd
        public final zxd.a e(long j) {
            c61 c61Var = c61.this;
            zxd.a aVarB = c61Var.i[0].b(j);
            int i = 1;
            while (true) {
                o42[] o42VarArr = c61Var.i;
                if (i >= o42VarArr.length) {
                    return aVarB;
                }
                zxd.a aVarB2 = o42VarArr[i].b(j);
                if (aVarB2.a.b < aVarB.a.b) {
                    aVarB = aVarB2;
                }
                i++;
            }
        }

        @Override // defpackage.zxd
        public final boolean h() {
            return true;
        }

        @Override // defpackage.zxd
        public final long k() {
            return this.a;
        }
    }

    public static class b {
        public int a;
        public int b;
        public int c;
    }

    public c61(int i, qq3 qq3Var) {
        this.d = qq3Var;
        this.c = (i & 1) == 0;
        this.a = new g4b(12);
        this.b = new b();
        this.f = new r03(16);
        this.i = new o42[0];
        this.m = -1L;
        this.n = -1L;
        this.l = -1;
        this.h = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010f  */
    @Override // defpackage.m55
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(defpackage.n55 r24, defpackage.dhb r25) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instruction units count: 1130
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c61.b(n55, dhb):int");
    }

    @Override // defpackage.m55
    public final boolean c(n55 n55Var) {
        g4b g4bVar = this.a;
        n55Var.h(0, g4bVar.a, 12);
        g4bVar.J(0);
        if (g4bVar.l() == 1179011410) {
            g4bVar.K(4);
            if (g4bVar.l() == 541677121) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.m55
    public final void d(long j, long j2) {
        this.j = -1L;
        this.k = null;
        for (o42 o42Var : this.i) {
            if (o42Var.k == 0) {
                o42Var.i = 0;
            } else {
                o42Var.i = o42Var.n[vjg.e(o42Var.m, j, true)];
            }
        }
        if (j != 0) {
            this.e = 6;
        } else if (this.i.length == 0) {
            this.e = 0;
        } else {
            this.e = 3;
        }
    }

    @Override // defpackage.m55
    public final void l(o55 o55Var) {
        this.e = 0;
        if (this.c) {
            o55Var = new eye(o55Var, this.d);
        }
        this.f = o55Var;
        this.j = -1L;
    }

    @Override // defpackage.m55
    public final void release() {
    }
}
