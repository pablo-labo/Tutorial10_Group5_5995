package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class je0 {
    public static final je0 a;
    public static final je0 b;
    public static final je0 c;
    public static final je0 d;
    public static final /* synthetic */ je0[] e;

    static {
        je0 je0Var = new je0("FUNCTION", 0);
        a = je0Var;
        je0 je0Var2 = new je0("PROPERTY", 1);
        b = je0Var2;
        je0 je0Var3 = new je0("PROPERTY_GETTER", 2);
        c = je0Var3;
        je0 je0Var4 = new je0("PROPERTY_SETTER", 3);
        d = je0Var4;
        e = new je0[]{je0Var, je0Var2, je0Var3, je0Var4};
    }

    public je0() {
        throw null;
    }

    public static je0 valueOf(String str) {
        return (je0) Enum.valueOf(je0.class, str);
    }

    public static je0[] values() {
        return (je0[]) e.clone();
    }
}
