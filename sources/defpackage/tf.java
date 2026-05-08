package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class tf {
    public static final tf a;
    public static final tf b;
    public static final tf c;
    public static final /* synthetic */ tf[] d;

    static {
        tf tfVar = new tf("TITLE", 0);
        a = tfVar;
        tf tfVar2 = new tf("TIME_PERIOD", 1);
        b = tfVar2;
        tf tfVar3 = new tf("DESCRIPTION", 2);
        c = tfVar3;
        d = new tf[]{tfVar, tfVar2, tfVar3};
    }

    public tf() {
        throw null;
    }

    public static tf valueOf(String str) {
        return (tf) Enum.valueOf(tf.class, str);
    }

    public static tf[] values() {
        return (tf[]) d.clone();
    }
}
