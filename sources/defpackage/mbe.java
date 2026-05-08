package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class mbe {
    public static final mbe a;
    public static final mbe b;
    public static final mbe c;
    public static final /* synthetic */ mbe[] d;

    static {
        mbe mbeVar = new mbe("USE_CACHE", 0);
        a = mbeVar;
        mbe mbeVar2 = new mbe("SKIP_CACHE_LOOKUP", 1);
        b = mbeVar2;
        mbe mbeVar3 = new mbe("IGNORE_CACHE_EXPIRATION", 2);
        c = mbeVar3;
        d = new mbe[]{mbeVar, mbeVar2, mbeVar3};
    }

    public mbe() {
        throw null;
    }

    public static mbe valueOf(String str) {
        return (mbe) Enum.valueOf(mbe.class, str);
    }

    public static mbe[] values() {
        return (mbe[]) d.clone();
    }
}
