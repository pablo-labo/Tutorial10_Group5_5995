package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class nw {
    public static final nw a;
    public static final nw b;
    public static final nw c;
    public static final nw d;
    public static final /* synthetic */ nw[] e;

    static {
        nw nwVar = new nw("TITLE", 0);
        a = nwVar;
        nw nwVar2 = new nw("URL", 1);
        b = nwVar2;
        nw nwVar3 = new nw("DATE_PUBLISHED", 2);
        c = nwVar3;
        nw nwVar4 = new nw("DESCRIPTION", 3);
        d = nwVar4;
        e = new nw[]{nwVar, nwVar2, nwVar3, nwVar4};
    }

    public nw() {
        throw null;
    }

    public static nw valueOf(String str) {
        return (nw) Enum.valueOf(nw.class, str);
    }

    public static nw[] values() {
        return (nw[]) e.clone();
    }
}
