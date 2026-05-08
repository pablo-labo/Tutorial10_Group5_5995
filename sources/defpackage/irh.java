package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
public final class irh extends lki {
    public final p24 b;

    public irh(p24 p24Var) {
        super("com.google.android.gms.location.ILocationCallback");
        this.b = p24Var;
    }

    public final void e() {
        iz8 iz8Var = (iz8) this.b.c;
        iz8Var.a.getClass();
        if (iz8Var.b == null) {
            return;
        }
        ((TaskCompletionSource) this.b.b).trySetResult(null);
    }
}
