package defpackage;

import defpackage.e1a;
import defpackage.vuf;

/* JADX INFO: loaded from: classes.dex */
public final class d1a implements jp4 {
    public String e;
    public zpf f;
    public boolean i;
    public int k;
    public int l;
    public int n;
    public int o;
    public int s;
    public boolean u;
    public int d = 0;
    public final g4b a = new g4b(new byte[15], 2);
    public final f4b b = new f4b();
    public final g4b c = new g4b();
    public final e1a.a p = new e1a.a();
    public int q = -2147483647;
    public int r = -1;
    public long t = -1;
    public boolean j = true;
    public boolean m = true;
    public double g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x041b  */
    @Override // defpackage.jp4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.g4b r24) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instruction units count: 1372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d1a.a(g4b):void");
    }

    @Override // defpackage.jp4
    public final void c() {
        this.d = 0;
        this.l = 0;
        this.a.G(2);
        this.n = 0;
        this.o = 0;
        this.q = -2147483647;
        this.r = -1;
        this.s = 0;
        this.t = -1L;
        this.u = false;
        this.i = false;
        this.m = true;
        this.j = true;
        this.g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
    }

    @Override // defpackage.jp4
    public final void d(boolean z) {
    }

    @Override // defpackage.jp4
    public final void e(o55 o55Var, vuf.c cVar) {
        cVar.a();
        cVar.b();
        this.e = cVar.e;
        cVar.b();
        this.f = o55Var.o(cVar.d, 1);
    }

    @Override // defpackage.jp4
    public final void f(int i, long j) {
        this.k = i;
        if (!this.j && (this.o != 0 || !this.m)) {
            this.i = true;
        }
        if (j != -9223372036854775807L) {
            if (this.i) {
                this.h = j;
            } else {
                this.g = j;
            }
        }
    }
}
