package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class e8b {
    public static final e8b a;
    public static final e8b b;
    public static final /* synthetic */ e8b[] c;

    static {
        e8b e8bVar = new e8b("READ", 0);
        a = e8bVar;
        e8b e8bVar2 = new e8b("WRITE", 1);
        b = e8bVar2;
        c = new e8b[]{e8bVar, e8bVar2};
    }

    public e8b() {
        throw null;
    }

    public static e8b valueOf(String str) {
        return (e8b) Enum.valueOf(e8b.class, str);
    }

    public static e8b[] values() {
        return (e8b[]) c.clone();
    }
}
