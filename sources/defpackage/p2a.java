package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class p2a {
    public static final p2a a;
    public static final p2a b;
    public static final /* synthetic */ p2a[] c;

    static {
        p2a p2aVar = new p2a("READ_ONLY", 0);
        a = p2aVar;
        p2a p2aVar2 = new p2a("MUTABLE", 1);
        b = p2aVar2;
        c = new p2a[]{p2aVar, p2aVar2};
    }

    public p2a() {
        throw null;
    }

    public static p2a valueOf(String str) {
        return (p2a) Enum.valueOf(p2a.class, str);
    }

    public static p2a[] values() {
        return (p2a[]) c.clone();
    }
}
