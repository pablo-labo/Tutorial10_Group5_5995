package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class o2e {
    public static final o2e a;
    public static final o2e b;
    public static final /* synthetic */ o2e[] c;

    static {
        o2e o2eVar = new o2e("EditableText", 0);
        a = o2eVar;
        o2e o2eVar2 = new o2e("StaticText", 1);
        b = o2eVar2;
        c = new o2e[]{o2eVar, o2eVar2};
    }

    public o2e() {
        throw null;
    }

    public static o2e valueOf(String str) {
        return (o2e) Enum.valueOf(o2e.class, str);
    }

    public static o2e[] values() {
        return (o2e[]) c.clone();
    }
}
