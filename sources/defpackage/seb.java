package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class seb {
    public static final seb a;
    public static final seb b;
    public static final seb c;
    public static final seb d;
    public static final /* synthetic */ seb[] e;

    static {
        seb sebVar = new seb("NONE", 0);
        a = sebVar;
        seb sebVar2 = new seb("BOX_NONE", 1);
        b = sebVar2;
        seb sebVar3 = new seb("BOX_ONLY", 2);
        c = sebVar3;
        seb sebVar4 = new seb("AUTO", 3);
        d = sebVar4;
        e = new seb[]{sebVar, sebVar2, sebVar3, sebVar4};
    }

    public seb() {
        throw null;
    }

    public static seb valueOf(String str) {
        return (seb) Enum.valueOf(seb.class, str);
    }

    public static seb[] values() {
        return (seb[]) e.clone();
    }
}
