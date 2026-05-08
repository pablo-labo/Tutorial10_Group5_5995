package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class dyb {
    public static final dyb a;
    public static final dyb b;
    public static final dyb c;
    public static final /* synthetic */ dyb[] d;

    static {
        dyb dybVar = new dyb("PROFILE", 0);
        a = dybVar;
        dyb dybVar2 = new dyb("PREFERENCES", 1);
        b = dybVar2;
        dyb dybVar3 = new dyb("RESUME", 2);
        c = dybVar3;
        d = new dyb[]{dybVar, dybVar2, dybVar3};
    }

    public dyb() {
        throw null;
    }

    public static dyb valueOf(String str) {
        return (dyb) Enum.valueOf(dyb.class, str);
    }

    public static dyb[] values() {
        return (dyb[]) d.clone();
    }
}
