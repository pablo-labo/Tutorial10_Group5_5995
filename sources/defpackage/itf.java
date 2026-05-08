package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class itf {
    public static final itf a;
    public static final itf b;
    public static final itf c;
    public static final /* synthetic */ itf[] d;

    static {
        itf itfVar = new itf("ContinueTraversal", 0);
        a = itfVar;
        itf itfVar2 = new itf("SkipSubtreeAndContinueTraversal", 1);
        b = itfVar2;
        itf itfVar3 = new itf("CancelTraversal", 2);
        c = itfVar3;
        d = new itf[]{itfVar, itfVar2, itfVar3};
    }

    public itf() {
        throw null;
    }

    public static itf valueOf(String str) {
        return (itf) Enum.valueOf(itf.class, str);
    }

    public static itf[] values() {
        return (itf[]) d.clone();
    }
}
