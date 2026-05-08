package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class hjf {
    public static final hjf a;
    public static final /* synthetic */ hjf[] b;

    static {
        hjf hjfVar = new hjf("sharp", 0);
        a = hjfVar;
        b = new hjf[]{hjfVar, new hjf("smooth", 1)};
    }

    public hjf() {
        throw null;
    }

    public static hjf valueOf(String str) {
        return (hjf) Enum.valueOf(hjf.class, str);
    }

    public static hjf[] values() {
        return (hjf[]) b.clone();
    }
}
