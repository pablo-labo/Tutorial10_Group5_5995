package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class b2d {
    public static final b2d a;
    public static final /* synthetic */ b2d[] b;

    static {
        b2d b2dVar = new b2d("Restart", 0);
        a = b2dVar;
        b = new b2d[]{b2dVar, new b2d("Reverse", 1)};
    }

    public b2d() {
        throw null;
    }

    public static b2d valueOf(String str) {
        return (b2d) Enum.valueOf(b2d.class, str);
    }

    public static b2d[] values() {
        return (b2d[]) b.clone();
    }
}
