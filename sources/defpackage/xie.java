package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class xie {
    public static final xie a;
    public static final xie b;
    public static final xie c;
    public static final /* synthetic */ xie[] d;

    /* JADX INFO: Fake field, exist only in values array */
    xie EF0;

    static {
        xie xieVar = new xie("CIRCLE", 0);
        xie xieVar2 = new xie("TEXT", 1);
        a = xieVar2;
        xie xieVar3 = new xie("SQUARE", 2);
        b = xieVar3;
        xie xieVar4 = new xie("HEADING", 3);
        c = xieVar4;
        d = new xie[]{xieVar, xieVar2, xieVar3, xieVar4};
    }

    public xie() {
        throw null;
    }

    public static xie valueOf(String str) {
        return (xie) Enum.valueOf(xie.class, str);
    }

    public static xie[] values() {
        return (xie[]) d.clone();
    }
}
