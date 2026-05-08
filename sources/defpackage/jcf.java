package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class jcf {
    public static final jcf a;
    public static final jcf b;
    public static final /* synthetic */ jcf[] c;

    static {
        jcf jcfVar = new jcf("DEFAULT", 0);
        a = jcfVar;
        jcf jcfVar2 = new jcf("EXPANDED", 1);
        b = jcfVar2;
        c = new jcf[]{jcfVar, jcfVar2};
    }

    public jcf() {
        throw null;
    }

    public static jcf valueOf(String str) {
        return (jcf) Enum.valueOf(jcf.class, str);
    }

    public static jcf[] values() {
        return (jcf[]) c.clone();
    }
}
