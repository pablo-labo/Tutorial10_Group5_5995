package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class kd0 {
    public static final a a;
    public static final kd0 b;
    public static final kd0 c;
    public static final kd0 d;
    public static final kd0 e;
    public static final /* synthetic */ kd0[] f;

    public static final class a {
    }

    static {
        kd0 kd0Var = new kd0("OPACITY", 0);
        b = kd0Var;
        kd0 kd0Var2 = new kd0("SCALE_X", 1);
        c = kd0Var2;
        kd0 kd0Var3 = new kd0("SCALE_Y", 2);
        d = kd0Var3;
        kd0 kd0Var4 = new kd0("SCALE_XY", 3);
        e = kd0Var4;
        f = new kd0[]{kd0Var, kd0Var2, kd0Var3, kd0Var4};
        a = new a();
    }

    public kd0() {
        throw null;
    }

    public static kd0 valueOf(String str) {
        return (kd0) Enum.valueOf(kd0.class, str);
    }

    public static kd0[] values() {
        return (kd0[]) f.clone();
    }
}
