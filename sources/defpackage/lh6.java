package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
public final class lh6 implements m55 {
    public final g4b a = new g4b(4);
    public final rhe b = new rhe(-1, -1, "image/heif");

    @Override // defpackage.m55
    public final int b(n55 n55Var, dhb dhbVar) {
        return this.b.b(n55Var, dhbVar);
    }

    @Override // defpackage.m55
    public final boolean c(n55 n55Var) throws EOFException, InterruptedIOException {
        hn3 hn3Var = (hn3) n55Var;
        hn3Var.o(4, false);
        g4b g4bVar = this.a;
        g4bVar.G(4);
        hn3Var.d(g4bVar.a, 0, 4, false);
        if (g4bVar.z() == 1718909296) {
            g4bVar.G(4);
            hn3Var.d(g4bVar.a, 0, 4, false);
            if (g4bVar.z() == 1751476579) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.m55
    public final void d(long j, long j2) {
        this.b.d(j, j2);
    }

    @Override // defpackage.m55
    public final void l(o55 o55Var) {
        this.b.l(o55Var);
    }

    @Override // defpackage.m55
    public final void release() {
    }
}
