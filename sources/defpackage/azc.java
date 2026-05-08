package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class azc {
    public static final azc a;
    public static final /* synthetic */ azc[] b;

    /* JADX INFO: Fake field, exist only in values array */
    azc EF0;

    static {
        azc azcVar = new azc("EXPERIMENTAL", 0);
        azc azcVar2 = new azc("CANARY", 1);
        azc azcVar3 = new azc("STABLE", 2);
        a = azcVar3;
        b = new azc[]{azcVar, azcVar2, azcVar3};
    }

    public azc() {
        throw null;
    }

    public static azc valueOf(String str) {
        return (azc) Enum.valueOf(azc.class, str);
    }

    public static azc[] values() {
        return (azc[]) b.clone();
    }
}
