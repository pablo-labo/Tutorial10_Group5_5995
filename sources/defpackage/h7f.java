package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class h7f {
    public static final h7f a;
    public static final h7f b;
    public static final h7f c;
    public static final /* synthetic */ h7f[] d;

    static {
        h7f h7fVar = new h7f("Tabs", 0);
        a = h7fVar;
        h7f h7fVar2 = new h7f("Divider", 1);
        b = h7fVar2;
        h7f h7fVar3 = new h7f("Indicator", 2);
        c = h7fVar3;
        d = new h7f[]{h7fVar, h7fVar2, h7fVar3};
    }

    public h7f() {
        throw null;
    }

    public static h7f valueOf(String str) {
        return (h7f) Enum.valueOf(h7f.class, str);
    }

    public static h7f[] values() {
        return (h7f[]) d.clone();
    }
}
