package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class gv {
    public static final gv a;
    public static final gv b;
    public static final gv c;
    public static final gv d;
    public static final gv e;
    public static final /* synthetic */ gv[] f;

    static {
        gv gvVar = new gv("TITLE", 0);
        a = gvVar;
        gv gvVar2 = new gv("PATENT_NUMBER", 1);
        b = gvVar2;
        gv gvVar3 = new gv("URL", 2);
        c = gvVar3;
        gv gvVar4 = new gv("DATE_AWARDED", 3);
        d = gvVar4;
        gv gvVar5 = new gv("DESCRIPTION", 4);
        e = gvVar5;
        f = new gv[]{gvVar, gvVar2, gvVar3, gvVar4, gvVar5};
    }

    public gv() {
        throw null;
    }

    public static gv valueOf(String str) {
        return (gv) Enum.valueOf(gv.class, str);
    }

    public static gv[] values() {
        return (gv[]) f.clone();
    }
}
