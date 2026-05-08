package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class j7f {
    public static final j7f a;
    public static final j7f b;
    public static final j7f c;
    public static final j7f d;
    public static final j7f e;
    public static final /* synthetic */ j7f[] f;

    static {
        j7f j7fVar = new j7f("SAVED", 0);
        a = j7fVar;
        j7f j7fVar2 = new j7f("INVITATIONS", 1);
        b = j7fVar2;
        j7f j7fVar3 = new j7f("APPLIED", 2);
        c = j7fVar3;
        j7f j7fVar4 = new j7f("INTERVIEWING", 3);
        d = j7fVar4;
        j7f j7fVar5 = new j7f("ARCHIVED", 4);
        e = j7fVar5;
        f = new j7f[]{j7fVar, j7fVar2, j7fVar3, j7fVar4, j7fVar5};
    }

    public j7f() {
        throw null;
    }

    public static j7f valueOf(String str) {
        return (j7f) Enum.valueOf(j7f.class, str);
    }

    public static j7f[] values() {
        return (j7f[]) f.clone();
    }
}
