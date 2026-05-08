package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class auh implements Executor {
    public static final auh a;
    public static final /* synthetic */ auh[] b;

    static {
        auh auhVar = new auh("INSTANCE", 0);
        a = auhVar;
        b = new auh[]{auhVar};
    }

    public static auh[] values() {
        return (auh[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
