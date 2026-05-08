package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class jyf {
    public static final jyf a;
    public static final jyf b;
    public static final /* synthetic */ jyf[] c;

    static {
        jyf jyfVar = new jyf("SUPERTYPE", 0);
        a = jyfVar;
        jyf jyfVar2 = new jyf("COMMON", 1);
        b = jyfVar2;
        c = new jyf[]{jyfVar, jyfVar2};
    }

    public jyf() {
        throw null;
    }

    public static jyf valueOf(String str) {
        return (jyf) Enum.valueOf(jyf.class, str);
    }

    public static jyf[] values() {
        return (jyf[]) c.clone();
    }
}
