package defpackage;

import defpackage.st0;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x extends w implements Iterable {
    public Vector a;

    @Override // defpackage.w
    public final boolean b(w wVar) {
        if (!(wVar instanceof x)) {
            return false;
        }
        x xVar = (x) wVar;
        if (this.a.size() != xVar.a.size()) {
            return false;
        }
        Enumeration enumerationElements = this.a.elements();
        Enumeration enumerationElements2 = xVar.a.elements();
        while (enumerationElements.hasMoreElements()) {
            q qVar = (q) enumerationElements.nextElement();
            q qVar2 = (q) enumerationElements2.nextElement();
            w wVarA = qVar.a();
            w wVarA2 = qVar2.a();
            if (wVarA != wVarA2 && !wVarA.equals(wVarA2)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.w
    public final w e() {
        zc3 zc3Var = new zc3();
        zc3Var.a = new Vector();
        zc3Var.b = -1;
        zc3Var.a = this.a;
        return zc3Var;
    }

    @Override // defpackage.w, defpackage.t
    public final int hashCode() {
        Enumeration enumerationElements = this.a.elements();
        int size = this.a.size();
        while (enumerationElements.hasMoreElements()) {
            size = (size * 17) ^ ((q) enumerationElements.nextElement()).hashCode();
        }
        return size;
    }

    @Override // java.lang.Iterable
    public final Iterator<q> iterator() {
        q[] qVarArr = new q[this.a.size()];
        for (int i = 0; i != this.a.size(); i++) {
            qVarArr[i] = (q) this.a.elementAt(i);
        }
        return new st0.a(qVarArr);
    }

    public final String toString() {
        return this.a.toString();
    }
}
