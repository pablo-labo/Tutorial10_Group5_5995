package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class sb2 {
    public static final sb2 a;
    public static final sb2 b;
    public static final sb2 c;
    public static final /* synthetic */ sb2[] d;

    static {
        sb2 sb2Var = new sb2("INITIAL", 0);
        a = sb2Var;
        sb2 sb2Var2 = new sb2("RECEIVER", 1);
        b = sb2Var2;
        sb2 sb2Var3 = new sb2("OTHER", 2);
        c = sb2Var3;
        d = new sb2[]{sb2Var, sb2Var2, sb2Var3};
    }

    public sb2() {
        throw null;
    }

    public static sb2 valueOf(String str) {
        return (sb2) Enum.valueOf(sb2.class, str);
    }

    public static sb2[] values() {
        return (sb2[]) d.clone();
    }
}
