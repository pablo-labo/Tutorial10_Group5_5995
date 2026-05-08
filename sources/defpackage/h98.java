package defpackage;

import defpackage.zxd;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
public final class h98 implements m55 {
    public o55 b;
    public int c;
    public int d;
    public int e;
    public tz9 g;
    public n55 h;
    public ore i;
    public x0a j;
    public final g4b a = new g4b(2);
    public long f = -1;

    public final void a() {
        o55 o55Var = this.b;
        o55Var.getClass();
        o55Var.m();
        this.b.b(new zxd.b(-9223372036854775807L));
        this.c = 6;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0175  */
    @Override // defpackage.m55
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(defpackage.n55 r26, defpackage.dhb r27) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instruction units count: 454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h98.b(n55, dhb):int");
    }

    @Override // defpackage.m55
    public final boolean c(n55 n55Var) throws EOFException, InterruptedIOException {
        hn3 hn3Var = (hn3) n55Var;
        g4b g4bVar = this.a;
        g4bVar.G(2);
        hn3Var.d(g4bVar.a, 0, 2, false);
        if (g4bVar.D() == 65496) {
            g4bVar.G(2);
            hn3Var.d(g4bVar.a, 0, 2, false);
            int iD = g4bVar.D();
            this.d = iD;
            if (iD == 65504) {
                g4bVar.G(2);
                hn3Var.d(g4bVar.a, 0, 2, false);
                hn3Var.o(g4bVar.D() - 2, false);
                g4bVar.G(2);
                hn3Var.d(g4bVar.a, 0, 2, false);
                this.d = g4bVar.D();
            }
            if (this.d == 65505) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.m55
    public final void d(long j, long j2) {
        if (j == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            x0a x0aVar = this.j;
            x0aVar.getClass();
            x0aVar.d(j, j2);
        }
    }

    @Override // defpackage.m55
    public final void l(o55 o55Var) {
        this.b = o55Var;
    }

    @Override // defpackage.m55
    public final void release() {
        x0a x0aVar = this.j;
        if (x0aVar != null) {
            x0aVar.getClass();
        }
    }
}
