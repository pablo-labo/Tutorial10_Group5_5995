package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class nx {
    public static final nx a;
    public static final nx b;
    public static final nx c;
    public static final /* synthetic */ nx[] d;

    static {
        nx nxVar = new nx("SKILL_NAME", 0);
        a = nxVar;
        nx nxVar2 = new nx("EXPERIENCE", 1);
        b = nxVar2;
        nx nxVar3 = new nx("CROWTAXO_CHILD_QUESTION", 2);
        c = nxVar3;
        d = new nx[]{nxVar, nxVar2, nxVar3};
    }

    public nx() {
        throw null;
    }

    public static nx valueOf(String str) {
        return (nx) Enum.valueOf(nx.class, str);
    }

    public static nx[] values() {
        return (nx[]) d.clone();
    }
}
