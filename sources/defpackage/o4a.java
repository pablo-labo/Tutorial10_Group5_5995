package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class o4a {
    public static final o4a a;
    public static final /* synthetic */ o4a[] b;

    static {
        o4a o4aVar = new o4a("Default", 0);
        a = o4aVar;
        b = new o4a[]{o4aVar, new o4a("UserInput", 1), new o4a("PreventUserInput", 2)};
    }

    public o4a() {
        throw null;
    }

    public static o4a valueOf(String str) {
        return (o4a) Enum.valueOf(o4a.class, str);
    }

    public static o4a[] values() {
        return (o4a[]) b.clone();
    }
}
