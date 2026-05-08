package defpackage;

import android.util.Log;
import defpackage.wr3;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class u33 implements s33 {
    public static final a c = new a();
    public final wr3<s33> a;
    public final AtomicReference<s33> b = new AtomicReference<>(null);

    public static final class a implements baa {
    }

    public u33(wr3<s33> wr3Var) {
        this.a = wr3Var;
        ((mva) wr3Var).a(new dz1(this, 1));
    }

    @Override // defpackage.s33
    public final baa a(String str) {
        s33 s33Var = this.b.get();
        return s33Var == null ? c : s33Var.a(str);
    }

    @Override // defpackage.s33
    public final boolean b() {
        s33 s33Var = this.b.get();
        return s33Var != null && s33Var.b();
    }

    @Override // defpackage.s33
    public final void c(final String str, final long j, final q31 q31Var) {
        String strL = l5.l("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strL, null);
        }
        ((mva) this.a).a(new wr3.a() { // from class: t33
            @Override // wr3.a
            public final void j(j6c j6cVar) {
                ((s33) j6cVar.get()).c(str, j, q31Var);
            }
        });
    }

    @Override // defpackage.s33
    public final boolean d(String str) {
        s33 s33Var = this.b.get();
        return s33Var != null && s33Var.d(str);
    }
}
