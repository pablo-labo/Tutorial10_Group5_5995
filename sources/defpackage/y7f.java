package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class y7f {
    public static final y7f a;
    public static final y7f b;
    public static final /* synthetic */ y7f[] c;

    static {
        y7f y7fVar = new y7f("LIGHT", 0);
        a = y7fVar;
        y7f y7fVar2 = new y7f("SOLID", 1);
        b = y7fVar2;
        c = new y7f[]{y7fVar, y7fVar2};
    }

    public y7f() {
        throw null;
    }

    public static y7f valueOf(String str) {
        return (y7f) Enum.valueOf(y7f.class, str);
    }

    public static y7f[] values() {
        return (y7f[]) c.clone();
    }
}
