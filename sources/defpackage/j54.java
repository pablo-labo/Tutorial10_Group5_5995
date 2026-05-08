package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class j54 implements Executor {
    public static final j54 a;
    public static final /* synthetic */ j54[] b;

    static {
        j54 j54Var = new j54("INSTANCE", 0);
        a = j54Var;
        b = new j54[]{j54Var};
    }

    public j54() {
        throw null;
    }

    public static j54 valueOf(String str) {
        return (j54) Enum.valueOf(j54.class, str);
    }

    public static j54[] values() {
        return (j54[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
