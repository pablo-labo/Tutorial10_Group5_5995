package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class i54 implements Executor {
    public static final i54 a = new i54();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
