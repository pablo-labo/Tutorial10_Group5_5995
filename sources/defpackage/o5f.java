package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class o5f {
    public static final o5f a;
    public static final /* synthetic */ o5f[] b;

    /* JADX INFO: Fake field, exist only in values array */
    o5f EF0;

    static {
        o5f o5fVar = new o5f("TLSv1_1", 0);
        o5f o5fVar2 = new o5f("TLSv1_2", 1);
        a = o5fVar2;
        b = new o5f[]{o5fVar, o5fVar2};
    }

    public o5f() {
        throw null;
    }

    public static o5f valueOf(String str) {
        return (o5f) Enum.valueOf(o5f.class, str);
    }

    public static o5f[] values() {
        return (o5f[]) b.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return wve.I(name(), "_", ".");
    }
}
