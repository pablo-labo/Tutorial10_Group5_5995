package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qii implements Executor {
    public static final qii a = new qii();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
