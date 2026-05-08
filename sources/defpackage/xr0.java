package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xr0 implements Executor {
    public final /* synthetic */ int a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                yr0.J1().d.e.execute(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
