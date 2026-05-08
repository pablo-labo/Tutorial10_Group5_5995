package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class eib {
    public static final eib a;
    public static final /* synthetic */ eib[] b;

    /* JADX INFO: Fake field, exist only in values array */
    eib EF0;

    static {
        eib eibVar = new eib("EXACT", 0);
        eib eibVar2 = new eib("INEXACT", 1);
        eib eibVar3 = new eib("AUTOMATIC", 2);
        a = eibVar3;
        b = new eib[]{eibVar, eibVar2, eibVar3};
    }

    public eib() {
        throw null;
    }

    public static eib valueOf(String str) {
        return (eib) Enum.valueOf(eib.class, str);
    }

    public static eib[] values() {
        return (eib[]) b.clone();
    }
}
