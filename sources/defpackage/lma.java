package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class lma {
    public static final lma a;
    public static final lma b;
    public static final lma c;
    public static final /* synthetic */ lma[] d;

    static {
        lma lmaVar = new lma("FORCE_FLEXIBILITY", 0);
        a = lmaVar;
        lma lmaVar2 = new lma("NULLABLE", 1);
        b = lmaVar2;
        lma lmaVar3 = new lma("NOT_NULL", 2);
        c = lmaVar3;
        d = new lma[]{lmaVar, lmaVar2, lmaVar3};
    }

    public lma() {
        throw null;
    }

    public static lma valueOf(String str) {
        return (lma) Enum.valueOf(lma.class, str);
    }

    public static lma[] values() {
        return (lma[]) d.clone();
    }
}
