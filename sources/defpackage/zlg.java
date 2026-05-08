package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class zlg {
    public static final zlg a;
    public static final zlg b;
    public static final /* synthetic */ zlg[] c;

    static {
        zlg zlgVar = new zlg("DEFAULT", 0);
        a = zlgVar;
        zlg zlgVar2 = new zlg("CURRENT_LOCATION", 1);
        b = zlgVar2;
        c = new zlg[]{zlgVar, zlgVar2};
    }

    public zlg() {
        throw null;
    }

    public static zlg valueOf(String str) {
        return (zlg) Enum.valueOf(zlg.class, str);
    }

    public static zlg[] values() {
        return (zlg[]) c.clone();
    }
}
