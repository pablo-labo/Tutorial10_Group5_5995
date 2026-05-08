package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class vme {
    public static t8e a;
    public static final HashMap b;

    static {
        new vme();
        b = new HashMap();
    }

    public static final synchronized oqf a(String str) {
        str.getClass();
        t8e t8eVar = (t8e) b.get(str);
        if (t8eVar == null) {
            return null;
        }
        oqf oqfVar = t8eVar.e;
        if (oqfVar == null) {
            oqfVar = new oqf(t8eVar);
            t8eVar.e = oqfVar;
        }
        return oqfVar;
    }
}
