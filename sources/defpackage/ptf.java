package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ptf {
    public static final ptf a;
    public static final ptf b;
    public static final ptf c;
    public static final /* synthetic */ ptf[] d;

    static {
        ptf ptfVar = new ptf("YES", 0);
        a = ptfVar;
        ptf ptfVar2 = new ptf("NO", 1);
        b = ptfVar2;
        ptf ptfVar3 = new ptf("UNSET", 2);
        c = ptfVar3;
        d = new ptf[]{ptfVar, ptfVar2, ptfVar3};
    }

    public ptf() {
        throw null;
    }

    public static ptf valueOf(String str) {
        return (ptf) Enum.valueOf(ptf.class, str);
    }

    public static ptf[] values() {
        return (ptf[]) d.clone();
    }
}
