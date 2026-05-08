package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class pf6 extends qf6 {
    public final Handler c;
    public final String d;
    public final boolean e;
    public final pf6 f;

    public pf6(Handler handler, String str, boolean z) {
        this.c = handler;
        this.d = str;
        this.e = z;
        this.f = z ? this : new pf6(handler, str, true);
    }

    @Override // defpackage.y03
    public final boolean A1(v03 v03Var) {
        return (this.e && wl7.b(Looper.myLooper(), this.c.getLooper())) ? false : true;
    }

    @Override // defpackage.k89
    public final k89 J1() {
        return this.f;
    }

    public final void L1(v03 v03Var, Runnable runnable) {
        u63.o(v03Var, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        eq3 eq3Var = a74.a;
        no3.c.v1(v03Var, runnable);
    }

    @Override // defpackage.qf6, defpackage.js3
    public final o74 R0(long j, final lmf lmfVar, v03 v03Var) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.c.postDelayed(lmfVar, j)) {
            return new o74() { // from class: of6
                @Override // defpackage.o74
                public final void dispose() {
                    this.a.c.removeCallbacks(lmfVar);
                }
            };
        }
        L1(v03Var, lmfVar);
        return jja.a;
    }

    @Override // defpackage.js3
    public final void b0(long j, qw1 qw1Var) {
        tm1 tm1Var = new tm1(2, qw1Var, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.c.postDelayed(tm1Var, j)) {
            qw1Var.t(new df(4, this, tm1Var));
        } else {
            L1(qw1Var.e, tm1Var);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pf6)) {
            return false;
        }
        pf6 pf6Var = (pf6) obj;
        return pf6Var.c == this.c && pf6Var.e == this.e;
    }

    public final int hashCode() {
        return (this.e ? 1231 : 1237) ^ System.identityHashCode(this.c);
    }

    @Override // defpackage.k89, defpackage.y03
    public final String toString() {
        k89 k89VarJ1;
        String string;
        eq3 eq3Var = a74.a;
        k89 k89Var = m89.a;
        if (this == k89Var) {
            string = "Dispatchers.Main";
        } else {
            try {
                k89VarJ1 = k89Var.J1();
            } catch (UnsupportedOperationException unused) {
                k89VarJ1 = null;
            }
            string = this == k89VarJ1 ? "Dispatchers.Main.immediate" : null;
        }
        if (string == null) {
            string = this.d;
            if (string == null) {
                string = this.c.toString();
            }
            if (this.e) {
                return t40.k(string, ".immediate");
            }
        }
        return string;
    }

    @Override // defpackage.y03
    public final void v1(v03 v03Var, Runnable runnable) {
        if (this.c.post(runnable)) {
            return;
        }
        L1(v03Var, runnable);
    }

    public pf6(Handler handler) {
        this(handler, null, false);
    }
}
