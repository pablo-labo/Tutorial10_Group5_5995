package defpackage;

import defpackage.kv8;

/* JADX INFO: loaded from: classes.dex */
public final class x96 extends kv8 {
    public static final x96 b = new x96();
    public static final w96 c = new w96();

    @Override // defpackage.kv8
    public final void a(yv8 yv8Var) {
        if (!(yv8Var instanceof qo3)) {
            p6.g(yv8Var, " must implement androidx.lifecycle.DefaultLifecycleObserver.");
            return;
        }
        qo3 qo3Var = (qo3) yv8Var;
        w96 w96Var = c;
        qo3Var.onCreate(w96Var);
        qo3Var.onStart(w96Var);
        qo3Var.onResume(w96Var);
    }

    @Override // defpackage.kv8
    public final kv8.b b() {
        return kv8.b.e;
    }

    @Override // defpackage.kv8
    public final void c(yv8 yv8Var) {
    }

    public final String toString() {
        return "coil.request.GlobalLifecycle";
    }
}
