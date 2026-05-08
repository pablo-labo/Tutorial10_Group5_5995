package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class wde {
    public static final wde a;
    public static final wde b;
    public static final wde c;
    public static final /* synthetic */ wde[] d;

    static {
        wde wdeVar = new wde("START", 0);
        a = wdeVar;
        wde wdeVar2 = new wde("STOP", 1);
        b = wdeVar2;
        wde wdeVar3 = new wde("STOP_AND_RESET_REPLAY_CACHE", 2);
        c = wdeVar3;
        d = new wde[]{wdeVar, wdeVar2, wdeVar3};
    }

    public wde() {
        throw null;
    }

    public static wde valueOf(String str) {
        return (wde) Enum.valueOf(wde.class, str);
    }

    public static wde[] values() {
        return (wde[]) d.clone();
    }
}
