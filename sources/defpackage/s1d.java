package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class s1d {
    public static final s1d a;
    public static final /* synthetic */ s1d[] b;

    static {
        s1d s1dVar = new s1d("AUTOMATIC", 0);
        a = s1dVar;
        b = new s1d[]{s1dVar, new s1d("HARDWARE", 1), new s1d("SOFTWARE", 2)};
    }

    public s1d() {
        throw null;
    }

    public static s1d valueOf(String str) {
        return (s1d) Enum.valueOf(s1d.class, str);
    }

    public static s1d[] values() {
        return (s1d[]) b.clone();
    }
}
