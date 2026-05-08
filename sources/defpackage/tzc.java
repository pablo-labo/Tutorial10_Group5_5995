package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class tzc {
    public static final tzc a;
    public static final tzc b;
    public static final tzc c;
    public static final /* synthetic */ tzc[] d;

    static {
        tzc tzcVar = new tzc("NOT_WILLING_TO_RELOCATE", 0);
        a = tzcVar;
        tzc tzcVar2 = new tzc("WILLING_TO_RELOCATE_ANYWHERE", 1);
        b = tzcVar2;
        tzc tzcVar3 = new tzc("WILLING_TO_RELOCATE_TO_SPECIFIC_LOCATIONS", 2);
        c = tzcVar3;
        d = new tzc[]{tzcVar, tzcVar2, tzcVar3};
    }

    public tzc() {
        throw null;
    }

    public static tzc valueOf(String str) {
        return (tzc) Enum.valueOf(tzc.class, str);
    }

    public static tzc[] values() {
        return (tzc[]) d.clone();
    }
}
