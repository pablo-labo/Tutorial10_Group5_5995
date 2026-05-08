package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class bqb {
    public static final bqb V;
    public static final bqb W;
    public static final /* synthetic */ bqb[] X;
    public static final bqb a;
    public static final bqb b;
    public static final bqb c;
    public static final bqb d;
    public static final bqb e;
    public static final bqb f;

    static {
        bqb bqbVar = new bqb("AdditionalInformation", 0);
        a = bqbVar;
        bqb bqbVar2 = new bqb("Awards", 1);
        b = bqbVar2;
        bqb bqbVar3 = new bqb("Groups", 2);
        c = bqbVar3;
        bqb bqbVar4 = new bqb("Languages", 3);
        d = bqbVar4;
        bqb bqbVar5 = new bqb("Links", 4);
        e = bqbVar5;
        bqb bqbVar6 = new bqb("MilitaryService", 5);
        f = bqbVar6;
        bqb bqbVar7 = new bqb("Patents", 6);
        V = bqbVar7;
        bqb bqbVar8 = new bqb("Publications", 7);
        W = bqbVar8;
        X = new bqb[]{bqbVar, bqbVar2, bqbVar3, bqbVar4, bqbVar5, bqbVar6, bqbVar7, bqbVar8, new bqb("Summary", 8)};
    }

    public bqb() {
        throw null;
    }

    public static bqb valueOf(String str) {
        return (bqb) Enum.valueOf(bqb.class, str);
    }

    public static bqb[] values() {
        return (bqb[]) X.clone();
    }
}
