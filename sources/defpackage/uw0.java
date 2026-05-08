package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class uw0 {
    public static final uw0 a;
    public static final uw0 b;
    public static final uw0 c;
    public static final /* synthetic */ uw0[] d;

    static {
        uw0 uw0Var = new uw0("FILES", 0);
        a = uw0Var;
        uw0 uw0Var2 = new uw0("PHOTOS", 1);
        b = uw0Var2;
        uw0 uw0Var3 = new uw0("CAMERA", 2);
        c = uw0Var3;
        d = new uw0[]{uw0Var, uw0Var2, uw0Var3};
    }

    public uw0() {
        throw null;
    }

    public static uw0 valueOf(String str) {
        return (uw0) Enum.valueOf(uw0.class, str);
    }

    public static uw0[] values() {
        return (uw0[]) d.clone();
    }
}
