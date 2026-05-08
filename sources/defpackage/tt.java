package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class tt {
    public static final tt a;
    public static final tt b;
    public static final tt c;
    public static final tt d;
    public static final tt e;
    public static final /* synthetic */ tt[] f;

    static {
        tt ttVar = new tt("TITLE", 0);
        a = ttVar;
        tt ttVar2 = new tt("LOCATION", 1);
        b = ttVar2;
        tt ttVar3 = new tt("TIME_PERIOD", 2);
        c = ttVar3;
        tt ttVar4 = new tt("LICENSE_TYPE_SELECTOR", 3);
        d = ttVar4;
        tt ttVar5 = new tt("STATE_SELECTOR", 4);
        e = ttVar5;
        f = new tt[]{ttVar, ttVar2, ttVar3, ttVar4, ttVar5};
    }

    public tt() {
        throw null;
    }

    public static tt valueOf(String str) {
        return (tt) Enum.valueOf(tt.class, str);
    }

    public static tt[] values() {
        return (tt[]) f.clone();
    }
}
