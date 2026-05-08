package defpackage;

import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class npf {
    public static final /* synthetic */ npf[] V;
    public static final npf a;
    public static final npf b;
    public static final npf c;
    public static final npf d;
    public static final npf e;
    public static final npf f;
    private String displayName;

    static {
        npf npfVar = new npf("DATADOG", 0);
        a = npfVar;
        npf npfVar2 = new npf("B3SINGLE", 1);
        b = npfVar2;
        npf npfVar3 = new npf("B3MULTI", 2);
        c = npfVar3;
        npf npfVar4 = new npf("HAYSTACK", 3);
        d = npfVar4;
        npf npfVar5 = new npf("XRAY", 4);
        e = npfVar5;
        npf npfVar6 = new npf("TRACECONTEXT", 5);
        f = npfVar6;
        V = new npf[]{npfVar, npfVar2, npfVar3, npfVar4, npfVar5, npfVar6, new npf("NONE", 6)};
    }

    public npf() {
        throw null;
    }

    public static npf a(String str) {
        String strReplace = str.toUpperCase(Locale.US).replace(' ', '_');
        strReplace.getClass();
        return !strReplace.equals("B3_SINGLE_HEADER") ? !strReplace.equals("B3") ? valueOf(strReplace) : c : b;
    }

    public static npf valueOf(String str) {
        return (npf) Enum.valueOf(npf.class, str);
    }

    public static npf[] values() {
        return (npf[]) V.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        String str = this.displayName;
        if (str != null) {
            return str;
        }
        String strReplace = name().toLowerCase(Locale.ROOT).replace('_', ' ');
        this.displayName = strReplace;
        return strReplace;
    }
}
