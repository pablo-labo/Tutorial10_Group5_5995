package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class tmd {
    public static final tmd a;
    public static final /* synthetic */ tmd[] b;

    /* JADX INFO: Fake field, exist only in values array */
    tmd EF0;

    static {
        tmd tmdVar = new tmd("FILL", 0);
        tmd tmdVar2 = new tmd("FIT", 1);
        a = tmdVar2;
        b = new tmd[]{tmdVar, tmdVar2};
    }

    public tmd() {
        throw null;
    }

    public static tmd valueOf(String str) {
        return (tmd) Enum.valueOf(tmd.class, str);
    }

    public static tmd[] values() {
        return (tmd[]) b.clone();
    }
}
