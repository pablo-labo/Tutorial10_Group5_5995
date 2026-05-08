package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class pjb {
    public static final pjb V;
    public static final pjb W;
    public static final pjb X;
    public static final /* synthetic */ pjb[] Y;
    public static final pjb a;
    public static final pjb b;
    public static final pjb c;
    public static final pjb d;
    public static final pjb e;
    public static final pjb f;

    static {
        pjb pjbVar = new pjb("JOB_TITLE", 0);
        a = pjbVar;
        pjb pjbVar2 = new pjb("JOB_TYPE", 1);
        b = pjbVar2;
        pjb pjbVar3 = new pjb("WORK_SCHEDULE", 2);
        c = pjbVar3;
        pjb pjbVar4 = new pjb("MINIMUM_PAY", 3);
        d = pjbVar4;
        pjb pjbVar5 = new pjb("RELOCATION", 4);
        e = pjbVar5;
        pjb pjbVar6 = new pjb("REMOTE_WORK", 5);
        f = pjbVar6;
        pjb pjbVar7 = new pjb("WORK_AREAS", 6);
        V = pjbVar7;
        pjb pjbVar8 = new pjb("WORK_WELLBEING", 7);
        W = pjbVar8;
        pjb pjbVar9 = new pjb("COMMUTE_TIME", 8);
        X = pjbVar9;
        Y = new pjb[]{pjbVar, pjbVar2, pjbVar3, pjbVar4, pjbVar5, pjbVar6, pjbVar7, pjbVar8, pjbVar9};
    }

    public pjb() {
        throw null;
    }

    public static pjb valueOf(String str) {
        return (pjb) Enum.valueOf(pjb.class, str);
    }

    public static pjb[] values() {
        return (pjb[]) Y.clone();
    }
}
