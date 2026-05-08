package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class s2h {
    public static final /* synthetic */ s2h[] V;
    public static final s2h a;
    public static final s2h b;
    public static final s2h c;
    public static final s2h d;
    public static final s2h e;
    public static final s2h f;

    static {
        s2h s2hVar = new s2h("ENQUEUED", 0);
        a = s2hVar;
        s2h s2hVar2 = new s2h("RUNNING", 1);
        b = s2hVar2;
        s2h s2hVar3 = new s2h("SUCCEEDED", 2);
        c = s2hVar3;
        s2h s2hVar4 = new s2h("FAILED", 3);
        d = s2hVar4;
        s2h s2hVar5 = new s2h("BLOCKED", 4);
        e = s2hVar5;
        s2h s2hVar6 = new s2h("CANCELLED", 5);
        f = s2hVar6;
        V = new s2h[]{s2hVar, s2hVar2, s2hVar3, s2hVar4, s2hVar5, s2hVar6};
    }

    public s2h() {
        throw null;
    }

    public static s2h valueOf(String str) {
        return (s2h) Enum.valueOf(s2h.class, str);
    }

    public static s2h[] values() {
        return (s2h[]) V.clone();
    }

    public final boolean a() {
        return this == c || this == d || this == f;
    }
}
