package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class w1f {
    public static final w1f a;
    public static final w1f b;
    public static final w1f c;
    public static final /* synthetic */ w1f[] d;

    static {
        w1f w1fVar = new w1f("StartToEnd", 0);
        a = w1fVar;
        w1f w1fVar2 = new w1f("EndToStart", 1);
        b = w1fVar2;
        w1f w1fVar3 = new w1f("Settled", 2);
        c = w1fVar3;
        d = new w1f[]{w1fVar, w1fVar2, w1fVar3};
    }

    public w1f() {
        throw null;
    }

    public static w1f valueOf(String str) {
        return (w1f) Enum.valueOf(w1f.class, str);
    }

    public static w1f[] values() {
        return (w1f[]) d.clone();
    }
}
