package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class rra {
    public static final rra a;
    public static final rra b;
    public static final /* synthetic */ rra[] c;

    static {
        rra rraVar = new rra("SUCCESS", 0);
        a = rraVar;
        rra rraVar2 = new rra("CANCEL", 1);
        b = rraVar2;
        c = new rra[]{rraVar, rraVar2};
    }

    public rra() {
        throw null;
    }

    public static rra valueOf(String str) {
        return (rra) Enum.valueOf(rra.class, str);
    }

    public static rra[] values() {
        return (rra[]) c.clone();
    }
}
