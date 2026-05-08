package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class fjd {
    public static final fjd a;
    public static final fjd b;
    public static final /* synthetic */ fjd[] c;

    static {
        fjd fjdVar = new fjd("PADDING", 0);
        a = fjdVar;
        fjd fjdVar2 = new fjd("MARGIN", 1);
        b = fjdVar2;
        c = new fjd[]{fjdVar, fjdVar2};
    }

    public fjd() {
        throw null;
    }

    public static fjd valueOf(String str) {
        return (fjd) Enum.valueOf(fjd.class, str);
    }

    public static fjd[] values() {
        return (fjd[]) c.clone();
    }
}
