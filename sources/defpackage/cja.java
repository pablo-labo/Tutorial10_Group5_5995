package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class cja {
    public static final cja a;
    public static final cja b;
    public static final /* synthetic */ cja[] c;

    static {
        cja cjaVar = new cja("Min", 0);
        a = cjaVar;
        cja cjaVar2 = new cja("Max", 1);
        b = cjaVar2;
        c = new cja[]{cjaVar, cjaVar2};
    }

    public cja() {
        throw null;
    }

    public static cja valueOf(String str) {
        return (cja) Enum.valueOf(cja.class, str);
    }

    public static cja[] values() {
        return (cja[]) c.clone();
    }
}
