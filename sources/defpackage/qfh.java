package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qfh implements Executor {
    public static final qfh a = new qfh();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
