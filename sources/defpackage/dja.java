package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class dja {
    public static final dja a;
    public static final dja b;
    public static final /* synthetic */ dja[] c;

    static {
        dja djaVar = new dja("Width", 0);
        a = djaVar;
        dja djaVar2 = new dja("Height", 1);
        b = djaVar2;
        c = new dja[]{djaVar, djaVar2};
    }

    public dja() {
        throw null;
    }

    public static dja valueOf(String str) {
        return (dja) Enum.valueOf(dja.class, str);
    }

    public static dja[] values() {
        return (dja[]) c.clone();
    }
}
