package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class xqg {
    public static final xqg a;
    public static final xqg b;
    public static final /* synthetic */ xqg[] c;

    static {
        xqg xqgVar = new xqg("SIMPLE", 0);
        a = xqgVar;
        xqg xqgVar2 = new xqg("GROUP", 1);
        b = xqgVar2;
        c = new xqg[]{xqgVar, xqgVar2};
    }

    public xqg() {
        throw null;
    }

    public static xqg valueOf(String str) {
        return (xqg) Enum.valueOf(xqg.class, str);
    }

    public static xqg[] values() {
        return (xqg[]) c.clone();
    }
}
