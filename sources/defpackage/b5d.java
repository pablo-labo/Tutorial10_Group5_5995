package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class b5d {
    public static final b5d a;
    public static final b5d b;
    public static final /* synthetic */ b5d[] c;

    static {
        b5d b5dVar = new b5d("Ltr", 0);
        a = b5dVar;
        b5d b5dVar2 = new b5d("Rtl", 1);
        b = b5dVar2;
        c = new b5d[]{b5dVar, b5dVar2};
    }

    public b5d() {
        throw null;
    }

    public static b5d valueOf(String str) {
        return (b5d) Enum.valueOf(b5d.class, str);
    }

    public static b5d[] values() {
        return (b5d[]) c.clone();
    }
}
