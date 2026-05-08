package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class kre {
    public static final kre a;
    public static final kre b;
    public static final /* synthetic */ kre[] c;

    static {
        kre kreVar = new kre("USER_PERSONAS", 0);
        a = kreVar;
        kre kreVar2 = new kre("JOBS", 1);
        b = kreVar2;
        c = new kre[]{kreVar, kreVar2};
    }

    public kre() {
        throw null;
    }

    public static kre valueOf(String str) {
        return (kre) Enum.valueOf(kre.class, str);
    }

    public static kre[] values() {
        return (kre[]) c.clone();
    }
}
