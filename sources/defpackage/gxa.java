package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class gxa {
    public static final gxa a;
    public static final gxa b;
    public static final gxa c;
    public static final gxa d;
    public static final gxa e;
    public static final /* synthetic */ gxa[] f;

    static {
        gxa gxaVar = new gxa("FSDV", 0);
        a = gxaVar;
        gxa gxaVar2 = new gxa("VIEW_JOB", 1);
        b = gxaVar2;
        gxa gxaVar3 = new gxa("STORYBOOK", 2);
        c = gxaVar3;
        gxa gxaVar4 = new gxa("PATHFINDER", 3);
        d = gxaVar4;
        gxa gxaVar5 = new gxa("INTERVIEW_PREP_HISTORY", 4);
        e = gxaVar5;
        f = new gxa[]{gxaVar, gxaVar2, gxaVar3, gxaVar4, gxaVar5};
    }

    public gxa() {
        throw null;
    }

    public static gxa valueOf(String str) {
        return (gxa) Enum.valueOf(gxa.class, str);
    }

    public static gxa[] values() {
        return (gxa[]) f.clone();
    }
}
