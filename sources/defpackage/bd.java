package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class bd {
    public static final bd a;
    public static final bd b;
    public static final bd c;
    public static final /* synthetic */ bd[] d;

    static {
        bd bdVar = new bd("TITLE", 0);
        a = bdVar;
        bd bdVar2 = new bd("TIME_PERIOD", 1);
        b = bdVar2;
        bd bdVar3 = new bd("DESCRIPTION", 2);
        c = bdVar3;
        d = new bd[]{bdVar, bdVar2, bdVar3};
    }

    public bd() {
        throw null;
    }

    public static bd valueOf(String str) {
        return (bd) Enum.valueOf(bd.class, str);
    }

    public static bd[] values() {
        return (bd[]) d.clone();
    }
}
