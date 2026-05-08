package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class vh {
    public static final /* synthetic */ vh[] V;
    public static final vh a;
    public static final vh b;
    public static final vh c;
    public static final vh d;
    public static final vh e;
    public static final vh f;

    static {
        vh vhVar = new vh("TITLE", 0);
        a = vhVar;
        vh vhVar2 = new vh("LOCATION", 1);
        b = vhVar2;
        vh vhVar3 = new vh("TIME_PERIOD", 2);
        c = vhVar3;
        vh vhVar4 = new vh("ENDORSEMENTS", 3);
        d = vhVar4;
        vh vhVar5 = new vh("LICENSE_TYPE_SELECTOR", 4);
        e = vhVar5;
        vh vhVar6 = new vh("STATE_SELECTOR", 5);
        f = vhVar6;
        V = new vh[]{vhVar, vhVar2, vhVar3, vhVar4, vhVar5, vhVar6};
    }

    public vh() {
        throw null;
    }

    public static vh valueOf(String str) {
        return (vh) Enum.valueOf(vh.class, str);
    }

    public static vh[] values() {
        return (vh[]) V.clone();
    }
}
