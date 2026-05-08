package defpackage;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

/* JADX INFO: loaded from: classes3.dex */
public final class zc3 extends x {
    public int b;

    public zc3(r rVar) {
        Vector vector = (Vector) rVar.a;
        this.a = new Vector();
        for (int i = 0; i != vector.size(); i++) {
            this.a.addElement((q) vector.elementAt(i));
        }
        this.b = -1;
    }

    @Override // defpackage.w
    public final void c(v vVar) throws IOException {
        yc3 yc3VarF = vVar.f();
        int iF = f();
        vVar.g(48);
        vVar.h(iF);
        Enumeration enumerationElements = this.a.elements();
        while (enumerationElements.hasMoreElements()) {
            yc3VarF.l((q) enumerationElements.nextElement());
        }
    }

    @Override // defpackage.w
    public final int d() {
        int iF = f();
        return oue.a(iF) + 1 + iF;
    }

    public final int f() {
        if (this.b < 0) {
            Enumeration enumerationElements = this.a.elements();
            int iD = 0;
            while (enumerationElements.hasMoreElements()) {
                iD += ((q) enumerationElements.nextElement()).a().e().d();
            }
            this.b = iD;
        }
        return this.b;
    }
}
