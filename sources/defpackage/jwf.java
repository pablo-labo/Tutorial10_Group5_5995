package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class jwf {
    public static final jwf a;
    public static final jwf b;
    public static final jwf c;
    public static final /* synthetic */ jwf[] d;

    static {
        jwf jwfVar = new jwf("FLEXIBLE_LOWER", 0);
        a = jwfVar;
        jwf jwfVar2 = new jwf("FLEXIBLE_UPPER", 1);
        b = jwfVar2;
        jwf jwfVar3 = new jwf("INFLEXIBLE", 2);
        c = jwfVar3;
        d = new jwf[]{jwfVar, jwfVar2, jwfVar3};
    }

    public jwf() {
        throw null;
    }

    public static jwf valueOf(String str) {
        return (jwf) Enum.valueOf(jwf.class, str);
    }

    public static jwf[] values() {
        return (jwf[]) d.clone();
    }
}
