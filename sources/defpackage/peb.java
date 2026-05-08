package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class peb {
    public static final peb a;
    public static final peb b;
    public static final peb c;
    public static final /* synthetic */ peb[] d;

    static {
        peb pebVar = new peb("Initial", 0);
        a = pebVar;
        peb pebVar2 = new peb("Main", 1);
        b = pebVar2;
        peb pebVar3 = new peb("Final", 2);
        c = pebVar3;
        d = new peb[]{pebVar, pebVar2, pebVar3};
    }

    public peb() {
        throw null;
    }

    public static peb valueOf(String str) {
        return (peb) Enum.valueOf(peb.class, str);
    }

    public static peb[] values() {
        return (peb[]) d.clone();
    }
}
