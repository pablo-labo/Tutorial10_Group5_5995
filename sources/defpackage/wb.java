package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class wb {
    public static final wb a;
    public static final wb b;
    public static final wb c;
    public static final wb d;
    public static final /* synthetic */ wb[] e;

    static {
        wb wbVar = new wb("TITLE", 0);
        a = wbVar;
        wb wbVar2 = new wb("LOCATION", 1);
        b = wbVar2;
        wb wbVar3 = new wb("TIME_PERIOD", 2);
        c = wbVar3;
        wb wbVar4 = new wb("STATE_SELECTOR", 3);
        d = wbVar4;
        e = new wb[]{wbVar, wbVar2, wbVar3, wbVar4};
    }

    public wb() {
        throw null;
    }

    public static wb valueOf(String str) {
        return (wb) Enum.valueOf(wb.class, str);
    }

    public static wb[] values() {
        return (wb[]) e.clone();
    }
}
