package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class s3b {
    public static final s3b a;
    public static final s3b b;
    public static final s3b c;
    public static final /* synthetic */ s3b[] d;

    static {
        s3b s3bVar = new s3b("ALL", 0);
        a = s3bVar;
        s3b s3bVar2 = new s3b("ONLY_NON_SYNTHESIZED", 1);
        b = s3bVar2;
        s3b s3bVar3 = new s3b("NONE", 2);
        c = s3bVar3;
        d = new s3b[]{s3bVar, s3bVar2, s3bVar3};
    }

    public s3b() {
        throw null;
    }

    public static s3b valueOf(String str) {
        return (s3b) Enum.valueOf(s3b.class, str);
    }

    public static s3b[] values() {
        return (s3b[]) d.clone();
    }
}
