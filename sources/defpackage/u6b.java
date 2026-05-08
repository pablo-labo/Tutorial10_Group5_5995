package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class u6b {
    public static final u6b V;
    public static final /* synthetic */ u6b[] W;
    public static final u6b a;
    public static final u6b b;
    public static final u6b c;
    public static final u6b d;
    public static final u6b e;
    public static final u6b f;

    static {
        u6b u6bVar = new u6b("Invalid", 0);
        a = u6bVar;
        u6b u6bVar2 = new u6b("Cancelled", 1);
        b = u6bVar2;
        u6b u6bVar3 = new u6b("InitialPending", 2);
        c = u6bVar3;
        u6b u6bVar4 = new u6b("RecomposePending", 3);
        d = u6bVar4;
        u6b u6bVar5 = new u6b("Recomposing", 4);
        e = u6bVar5;
        u6b u6bVar6 = new u6b("ApplyPending", 5);
        f = u6bVar6;
        u6b u6bVar7 = new u6b("Applied", 6);
        V = u6bVar7;
        W = new u6b[]{u6bVar, u6bVar2, u6bVar3, u6bVar4, u6bVar5, u6bVar6, u6bVar7};
    }

    public u6b() {
        throw null;
    }

    public static u6b valueOf(String str) {
        return (u6b) Enum.valueOf(u6b.class, str);
    }

    public static u6b[] values() {
        return (u6b[]) W.clone();
    }
}
