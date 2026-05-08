package defpackage;

import android.app.Application;
import defpackage.m8;

/* JADX INFO: loaded from: classes.dex */
public final class k8 implements Runnable {
    public final /* synthetic */ Application a;
    public final /* synthetic */ m8.a b;

    public k8(Application application, m8.a aVar) {
        this.a = application;
        this.b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.unregisterActivityLifecycleCallbacks(this.b);
    }
}
