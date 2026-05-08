package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class pie {
    public static final pie a;
    public static final pie b;
    public static final /* synthetic */ pie[] c;

    static {
        pie pieVar = new pie("Wrap", 0);
        a = pieVar;
        pie pieVar2 = new pie("Expand", 1);
        b = pieVar2;
        c = new pie[]{pieVar, pieVar2};
    }

    public pie() {
        throw null;
    }

    public static pie valueOf(String str) {
        return (pie) Enum.valueOf(pie.class, str);
    }

    public static pie[] values() {
        return (pie[]) c.clone();
    }
}
