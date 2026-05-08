package defpackage;

import defpackage.iwf;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class o3 {
    public static boolean a(iwf iwfVar, fdd fddVar, iwf.a aVar) {
        iwfVar.getClass();
        fddVar.getClass();
        aVar.getClass();
        fyf fyfVar = iwfVar.c;
        if ((fyfVar.h(fddVar) && !fyfVar.n0(fddVar)) || fyfVar.r(fddVar)) {
            return true;
        }
        iwfVar.b();
        ArrayDeque<fdd> arrayDeque = iwfVar.g;
        arrayDeque.getClass();
        mke mkeVar = iwfVar.h;
        mkeVar.getClass();
        arrayDeque.push(fddVar);
        while (!arrayDeque.isEmpty()) {
            fdd fddVarPop = arrayDeque.pop();
            fddVarPop.getClass();
            if (mkeVar.add(fddVarPop)) {
                iwf.a aVar2 = fyfVar.n0(fddVarPop) ? iwf.a.c.a : aVar;
                if (wl7.b(aVar2, iwf.a.c.a)) {
                    aVar2 = null;
                }
                if (aVar2 == null) {
                    continue;
                } else {
                    Iterator<zi8> it = fyfVar.T(fyfVar.V(fddVarPop)).iterator();
                    while (it.hasNext()) {
                        fdd fddVarA = aVar2.a(iwfVar, it.next());
                        if ((fyfVar.h(fddVarA) && !fyfVar.n0(fddVarA)) || fyfVar.r(fddVarA)) {
                            iwfVar.a();
                            return true;
                        }
                        arrayDeque.add(fddVarA);
                    }
                }
            }
        }
        iwfVar.a();
        return false;
    }

    public static boolean b(iwf iwfVar, fdd fddVar, lwf lwfVar) {
        fyf fyfVar = iwfVar.c;
        if (fyfVar.g(fddVar)) {
            return true;
        }
        if (fyfVar.n0(fddVar)) {
            return false;
        }
        if (iwfVar.b && fyfVar.t(fddVar)) {
            return true;
        }
        return fyfVar.d0(fyfVar.V(fddVar), lwfVar);
    }
}
