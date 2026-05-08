package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class h54 implements Executor {
    public static final h54 a;
    public static final /* synthetic */ h54[] b;

    static {
        h54 h54Var = new h54("INSTANCE", 0);
        a = h54Var;
        b = new h54[]{h54Var};
    }

    public h54() {
        throw null;
    }

    public static h54 valueOf(String str) {
        return (h54) Enum.valueOf(h54.class, str);
    }

    public static h54[] values() {
        return (h54[]) b.clone();
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
