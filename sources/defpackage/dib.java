package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class dib {
    public static final dib a;
    public static final dib b;
    public static final /* synthetic */ dib[] c;

    static {
        dib dibVar = new dib("EXACT", 0);
        a = dibVar;
        dib dibVar2 = new dib("INEXACT", 1);
        b = dibVar2;
        c = new dib[]{dibVar, dibVar2};
    }

    public dib() {
        throw null;
    }

    public static dib valueOf(String str) {
        return (dib) Enum.valueOf(dib.class, str);
    }

    public static dib[] values() {
        return (dib[]) c.clone();
    }
}
