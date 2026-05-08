package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ssc {
    public static final ssc a;
    public static final ssc b;
    public static final ssc c;
    public static final ssc d;
    public static final ssc e;
    public static final /* synthetic */ ssc[] f;

    static {
        ssc sscVar = new ssc("INACTIVE", 0);
        a = sscVar;
        ssc sscVar2 = new ssc("STARTING", 1);
        b = sscVar2;
        ssc sscVar3 = new ssc("ACTIVE", 2);
        c = sscVar3;
        ssc sscVar4 = new ssc("STOPPING", 3);
        d = sscVar4;
        ssc sscVar5 = new ssc("ERROR", 4);
        e = sscVar5;
        f = new ssc[]{sscVar, sscVar2, sscVar3, sscVar4, sscVar5};
    }

    public ssc() {
        throw null;
    }

    public static ssc valueOf(String str) {
        return (ssc) Enum.valueOf(ssc.class, str);
    }

    public static ssc[] values() {
        return (ssc[]) f.clone();
    }
}
