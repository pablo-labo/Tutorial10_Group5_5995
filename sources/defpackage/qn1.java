package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes.dex */
public abstract class qn1<T> extends bq2<T> {
    public final pn1 f;

    public qn1(Context context, x2h x2hVar) {
        super(context, x2hVar);
        this.f = new pn1(this);
    }

    @Override // defpackage.bq2
    public final void d() {
        z39.d().a(rn1.a, getClass().getSimpleName().concat(": registering receiver"));
        this.b.registerReceiver(this.f, f());
    }

    @Override // defpackage.bq2
    public final void e() {
        z39.d().a(rn1.a, getClass().getSimpleName().concat(": unregistering receiver"));
        this.b.unregisterReceiver(this.f);
    }

    public abstract IntentFilter f();

    public abstract void g(Intent intent);
}
