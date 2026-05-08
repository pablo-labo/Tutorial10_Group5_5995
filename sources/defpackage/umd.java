package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class umd {
    public static final umd a;
    public static final umd b;
    public static final /* synthetic */ umd[] c;

    static {
        umd umdVar = new umd("FILL", 0);
        a = umdVar;
        umd umdVar2 = new umd("FIT", 1);
        b = umdVar2;
        c = new umd[]{umdVar, umdVar2};
    }

    public umd() {
        throw null;
    }

    public static umd valueOf(String str) {
        return (umd) Enum.valueOf(umd.class, str);
    }

    public static umd[] values() {
        return (umd[]) c.clone();
    }
}
