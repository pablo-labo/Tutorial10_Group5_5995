package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class cjd {
    public static final cjd a;
    public static final cjd b;
    public static final cjd c;
    public static final /* synthetic */ cjd[] d;

    static {
        cjd cjdVar = new cjd("OFF", 0);
        a = cjdVar;
        cjd cjdVar2 = new cjd("ADDITIVE", 1);
        b = cjdVar2;
        cjd cjdVar3 = new cjd("MAXIMUM", 2);
        c = cjdVar3;
        d = new cjd[]{cjdVar, cjdVar2, cjdVar3};
    }

    public cjd() {
        throw null;
    }

    public static cjd valueOf(String str) {
        return (cjd) Enum.valueOf(cjd.class, str);
    }

    public static cjd[] values() {
        return (cjd[]) d.clone();
    }
}
