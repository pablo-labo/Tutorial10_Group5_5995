package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class llb {
    public static final llb a;
    public static final /* synthetic */ llb[] b;

    /* JADX INFO: Fake field, exist only in values array */
    llb EF0;

    static {
        llb llbVar = new llb("SRGB", 0);
        llb llbVar2 = new llb("DISPLAY_P3", 1);
        a = llbVar2;
        b = new llb[]{llbVar, llbVar2};
    }

    public llb() {
        throw null;
    }

    public static llb valueOf(String str) {
        return (llb) Enum.valueOf(llb.class, str);
    }

    public static llb[] values() {
        return (llb[]) b.clone();
    }
}
