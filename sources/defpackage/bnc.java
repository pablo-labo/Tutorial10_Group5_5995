package defpackage;

import android.annotation.SuppressLint;
import app.rive.runtime.kotlin.RiveViewLifecycleObserver;

/* JADX INFO: loaded from: classes3.dex */
public final class bnc extends RiveViewLifecycleObserver {
    public bnc() {
        throw null;
    }

    @Override // app.rive.runtime.kotlin.RiveViewLifecycleObserver, defpackage.qo3
    @SuppressLint({"MissingSuperCall"})
    public final void onDestroy(zv8 zv8Var) {
        zv8Var.getClass();
        zv8Var.getLifecycle().c(this);
    }
}
