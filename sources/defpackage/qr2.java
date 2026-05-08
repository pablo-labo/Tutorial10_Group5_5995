package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class qr2 {
    public static final qr2 a;
    public static final qr2 b;
    public static final qr2 c;
    public static final /* synthetic */ qr2[] d;

    static {
        qr2 qr2Var = new qr2("NONE", 0);
        a = qr2Var;
        qr2 qr2Var2 = new qr2("INVALID_PHONE_NUMBER", 1);
        b = qr2Var2;
        qr2 qr2Var3 = new qr2("FAILED_API_CALL", 2);
        c = qr2Var3;
        d = new qr2[]{qr2Var, qr2Var2, qr2Var3};
    }

    public qr2() {
        throw null;
    }

    public static qr2 valueOf(String str) {
        return (qr2) Enum.valueOf(qr2.class, str);
    }

    public static qr2[] values() {
        return (qr2[]) d.clone();
    }
}
