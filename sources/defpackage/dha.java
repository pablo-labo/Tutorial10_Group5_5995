package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class dha {
    public static final /* synthetic */ dha[] V;
    public static final dha a;
    public static final dha b;
    public static final dha c;
    public static final dha d;
    public static final dha e;
    public static final dha f;

    static {
        dha dhaVar = new dha("NOT_REQUIRED", 0);
        a = dhaVar;
        dha dhaVar2 = new dha("CONNECTED", 1);
        b = dhaVar2;
        dha dhaVar3 = new dha("UNMETERED", 2);
        c = dhaVar3;
        dha dhaVar4 = new dha("NOT_ROAMING", 3);
        d = dhaVar4;
        dha dhaVar5 = new dha("METERED", 4);
        e = dhaVar5;
        dha dhaVar6 = new dha("TEMPORARILY_UNMETERED", 5);
        f = dhaVar6;
        V = new dha[]{dhaVar, dhaVar2, dhaVar3, dhaVar4, dhaVar5, dhaVar6};
    }

    public dha() {
        throw null;
    }

    public static dha valueOf(String str) {
        return (dha) Enum.valueOf(dha.class, str);
    }

    public static dha[] values() {
        return (dha[]) V.clone();
    }
}
