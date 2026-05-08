package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class gf0 extends m0<af0> {
    public static List k(up2 up2Var) {
        if (!(up2Var instanceof rt0)) {
            return up2Var instanceof dw4 ? u63.Z(((dw4) up2Var).c.e()) : zr4.a;
        }
        Iterable iterable = (Iterable) ((rt0) up2Var).a;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            w92.w0(arrayList, k((up2) it.next()));
        }
        return arrayList;
    }

    @Override // defpackage.m0
    public final ArrayList a(Object obj, boolean z) {
        af0 af0Var = (af0) obj;
        af0Var.getClass();
        Map<n8a, up2<?>> mapI = af0Var.i();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<n8a, up2<?>> entry : mapI.entrySet()) {
            w92.w0(arrayList, (!z || wl7.b(entry.getKey(), kc8.b)) ? k(entry.getValue()) : zr4.a);
        }
        return arrayList;
    }

    @Override // defpackage.m0
    public final mq5 d(af0 af0Var) {
        af0 af0Var2 = af0Var;
        af0Var2.getClass();
        return af0Var2.h();
    }

    @Override // defpackage.m0
    public final t52 e(Object obj) {
        af0 af0Var = (af0) obj;
        af0Var.getClass();
        t52 t52VarD = b04.d(af0Var);
        t52VarD.getClass();
        return t52VarD;
    }

    @Override // defpackage.m0
    public final Iterable<af0> f(af0 af0Var) {
        lf0 annotations;
        af0 af0Var2 = af0Var;
        af0Var2.getClass();
        t52 t52VarD = b04.d(af0Var2);
        return (t52VarD == null || (annotations = t52VarD.getAnnotations()) == null) ? zr4.a : annotations;
    }
}
