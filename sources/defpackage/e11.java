package defpackage;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class e11 implements kna<amf> {
    public static final e11 a = new e11();
    public static final x85 b;
    public static final x85 c;

    static {
        gw0 gw0Var = new gw0(1);
        HashMap map = new HashMap();
        map.put(z5c.class, gw0Var);
        b = new x85("startMs", Collections.unmodifiableMap(new HashMap(map)));
        gw0 gw0Var2 = new gw0(2);
        HashMap map2 = new HashMap();
        map2.put(z5c.class, gw0Var2);
        c = new x85("endMs", Collections.unmodifiableMap(new HashMap(map2)));
    }

    @Override // defpackage.ys4
    public final void a(Object obj, lna lnaVar) {
        amf amfVar = (amf) obj;
        lna lnaVar2 = lnaVar;
        lnaVar2.i(b, amfVar.a);
        lnaVar2.i(c, amfVar.b);
    }
}
