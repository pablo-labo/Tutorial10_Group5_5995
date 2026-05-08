package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class q69 {
    public static final q69 a;
    public static final /* synthetic */ q69[] b;

    static {
        q69 q69Var = new q69("Immediately", 0);
        a = q69Var;
        b = new q69[]{q69Var, new q69("OnIterationFinish", 1)};
    }

    public q69() {
        throw null;
    }

    public static q69 valueOf(String str) {
        return (q69) Enum.valueOf(q69.class, str);
    }

    public static q69[] values() {
        return (q69[]) b.clone();
    }
}
