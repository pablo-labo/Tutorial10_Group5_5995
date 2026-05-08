package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class xe3 {
    public static final xe3 a;
    public static final xe3 b;
    public static final xe3 c;
    public static final xe3 d;
    public static final xe3 e;
    public static final /* synthetic */ xe3[] f;

    static {
        xe3 xe3Var = new xe3("LOCAL", 0);
        a = xe3Var;
        xe3 xe3Var2 = new xe3("REMOTE", 1);
        b = xe3Var2;
        xe3 xe3Var3 = new xe3("DATA_DISK_CACHE", 2);
        c = xe3Var3;
        xe3 xe3Var4 = new xe3("RESOURCE_DISK_CACHE", 3);
        d = xe3Var4;
        xe3 xe3Var5 = new xe3("MEMORY_CACHE", 4);
        e = xe3Var5;
        f = new xe3[]{xe3Var, xe3Var2, xe3Var3, xe3Var4, xe3Var5};
    }

    public xe3() {
        throw null;
    }

    public static xe3 valueOf(String str) {
        return (xe3) Enum.valueOf(xe3.class, str);
    }

    public static xe3[] values() {
        return (xe3[]) f.clone();
    }
}
