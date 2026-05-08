package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ke {
    public static final ke a;
    public static final ke b;
    public static final ke c;
    public static final /* synthetic */ ke[] d;

    static {
        ke keVar = new ke("TITLE", 0);
        a = keVar;
        ke keVar2 = new ke("DATE_AWARDED", 1);
        b = keVar2;
        ke keVar3 = new ke("DESCRIPTION", 2);
        c = keVar3;
        d = new ke[]{keVar, keVar2, keVar3};
    }

    public ke() {
        throw null;
    }

    public static ke valueOf(String str) {
        return (ke) Enum.valueOf(ke.class, str);
    }

    public static ke[] values() {
        return (ke[]) d.clone();
    }
}
