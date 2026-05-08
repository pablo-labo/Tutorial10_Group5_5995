package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class iwa {
    public static final iwa a;
    public static final iwa b;
    public static final /* synthetic */ iwa[] c;

    static {
        iwa iwaVar = new iwa("RUN_AS_NON_EXPEDITED_WORK_REQUEST", 0);
        a = iwaVar;
        iwa iwaVar2 = new iwa("DROP_WORK_REQUEST", 1);
        b = iwaVar2;
        c = new iwa[]{iwaVar, iwaVar2};
    }

    public iwa() {
        throw null;
    }

    public static iwa valueOf(String str) {
        return (iwa) Enum.valueOf(iwa.class, str);
    }

    public static iwa[] values() {
        return (iwa[]) c.clone();
    }
}
