package defpackage;

import androidx.work.impl.foreground.SystemForegroundService;

/* JADX INFO: loaded from: classes.dex */
public final class s2f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SystemForegroundService b;

    public s2f(SystemForegroundService systemForegroundService, int i) {
        this.b = systemForegroundService;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.e.cancel(this.a);
    }
}
