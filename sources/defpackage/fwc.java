package defpackage;

import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class fwc {
    public static final iwc a;
    public static final yd8[] b;

    static {
        iwc iwcVar = null;
        try {
            iwcVar = (iwc) jwc.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (iwcVar == null) {
            iwcVar = new iwc();
        }
        a = iwcVar;
        b = new yd8[0];
    }

    public static yd8 a(Class cls) {
        return a.b(cls);
    }

    public static zf8 b(Class cls) {
        iwc iwcVar = a;
        return iwcVar.k(iwcVar.b(cls), Collections.EMPTY_LIST, true);
    }

    public static zf8 c(Class cls, gg8 gg8Var, gg8 gg8Var2) {
        iwc iwcVar = a;
        return iwcVar.k(iwcVar.b(cls), Arrays.asList(gg8Var, gg8Var2), true);
    }

    public static zf8 d(Class cls) {
        iwc iwcVar = a;
        return iwcVar.k(iwcVar.b(cls), Collections.EMPTY_LIST, false);
    }

    public static zf8 e(Class cls, gg8 gg8Var) {
        iwc iwcVar = a;
        return iwcVar.k(iwcVar.b(cls), Collections.singletonList(gg8Var), false);
    }
}
