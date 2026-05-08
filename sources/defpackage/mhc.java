package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class mhc {
    public static final mhc a;
    public static final mhc b;
    public static final /* synthetic */ mhc[] c;

    static {
        mhc mhcVar = new mhc("SPINNER", 0);
        a = mhcVar;
        mhc mhcVar2 = new mhc("DEFAULT", 1);
        b = mhcVar2;
        c = new mhc[]{mhcVar, mhcVar2};
    }

    public mhc() {
        throw null;
    }

    public static mhc valueOf(String str) {
        return (mhc) Enum.valueOf(mhc.class, str);
    }

    public static mhc[] values() {
        return (mhc[]) c.clone();
    }
}
