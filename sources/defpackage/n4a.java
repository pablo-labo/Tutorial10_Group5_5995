package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class n4a {
    public static final n4a a;
    public static final n4a b;
    public static final /* synthetic */ n4a[] c;

    static {
        n4a n4aVar = new n4a("Default", 0);
        a = n4aVar;
        n4a n4aVar2 = new n4a("UserInput", 1);
        b = n4aVar2;
        c = new n4a[]{n4aVar, n4aVar2, new n4a("PreventUserInput", 2)};
    }

    public n4a() {
        throw null;
    }

    public static n4a valueOf(String str) {
        return (n4a) Enum.valueOf(n4a.class, str);
    }

    public static n4a[] values() {
        return (n4a[]) c.clone();
    }
}
