package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class vm8 {
    public static final vm8 a;
    public static final /* synthetic */ vm8[] b;

    static {
        vm8 vm8Var = new vm8("Horizontal", 0);
        a = vm8Var;
        b = new vm8[]{vm8Var, new vm8("Vertical", 1)};
    }

    public vm8() {
        throw null;
    }

    public static vm8 valueOf(String str) {
        return (vm8) Enum.valueOf(vm8.class, str);
    }

    public static vm8[] values() {
        return (vm8[]) b.clone();
    }
}
