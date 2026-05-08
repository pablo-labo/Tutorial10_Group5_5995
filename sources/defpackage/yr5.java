package defpackage;

import android.os.Handler;
import defpackage.kv8;

/* JADX INFO: loaded from: classes.dex */
public final class yr5 implements uv8 {
    public final /* synthetic */ Handler a;
    public final /* synthetic */ xr5 b;

    public yr5(Handler handler, xr5 xr5Var) {
        this.a = handler;
        this.b = xr5Var;
    }

    @Override // defpackage.uv8
    public final void G(zv8 zv8Var, kv8.a aVar) {
        if (aVar == kv8.a.ON_DESTROY) {
            this.a.removeCallbacks(this.b);
            zv8Var.getLifecycle().c(this);
        }
    }
}
