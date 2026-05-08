package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class vmf {
    public static final vmf a;
    public static final vmf b;
    public static final /* synthetic */ vmf[] c;

    static {
        vmf vmfVar = new vmf("LEADING", 0);
        a = vmfVar;
        vmf vmfVar2 = new vmf("CENTERED", 1);
        b = vmfVar2;
        c = new vmf[]{vmfVar, vmfVar2};
    }

    public vmf() {
        throw null;
    }

    public static vmf valueOf(String str) {
        return (vmf) Enum.valueOf(vmf.class, str);
    }

    public static vmf[] values() {
        return (vmf[]) c.clone();
    }
}
