package defpackage;

import android.graphics.Rect;
import defpackage.hu8;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class c80 extends hu8 {
    public ex7 b;
    public mu8 c;
    public nde d;

    @Override // defpackage.scb
    public final void a() {
        hu8.a aVar = this.a;
        if (aVar == null) {
            return;
        }
        this.b = aVar.C(new b80(null, this, aVar, null));
    }

    @Override // defpackage.scb
    public final void b(jhf jhfVar, roa roaVar, mif mifVar, if0 if0Var, qtc qtcVar, qtc qtcVar2) {
        mu8 mu8Var = this.c;
        if (mu8Var != null) {
            fu8 fu8Var = mu8Var.m;
            synchronized (fu8Var.c) {
                try {
                    fu8Var.j = jhfVar;
                    fu8Var.l = roaVar;
                    fu8Var.k = mifVar;
                    fu8Var.m = qtcVar;
                    fu8Var.n = qtcVar2;
                    if (fu8Var.e || fu8Var.d) {
                        fu8Var.a();
                    }
                    j6g j6gVar = j6g.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.scb
    public final void c() throws Throwable {
        ex7 ex7Var = this.b;
        if (ex7Var != null) {
            ex7Var.h(null);
        }
        this.b = null;
        c4a<j6g> c4aVarK = k();
        if (c4aVarK != null) {
            ((nde) c4aVarK).i();
        }
    }

    @Override // defpackage.scb
    public final void d(jhf jhfVar, jhf jhfVar2) {
        mu8 mu8Var = this.c;
        if (mu8Var != null) {
            boolean z = (kjf.b(mu8Var.h.b, jhfVar2.b) && wl7.b(mu8Var.h.c, jhfVar2.c)) ? false : true;
            mu8Var.h = jhfVar2;
            int size = mu8Var.j.size();
            for (int i = 0; i < size; i++) {
                ktc ktcVar = (ktc) ((WeakReference) mu8Var.j.get(i)).get();
                if (ktcVar != null) {
                    ktcVar.g = jhfVar2;
                }
            }
            fu8 fu8Var = mu8Var.m;
            synchronized (fu8Var.c) {
                fu8Var.j = null;
                fu8Var.l = null;
                fu8Var.k = null;
                fu8Var.m = null;
                fu8Var.n = null;
                j6g j6gVar = j6g.a;
            }
            if (wl7.b(jhfVar, jhfVar2)) {
                if (z) {
                    ye7 ye7Var = mu8Var.b;
                    int iF = kjf.f(jhfVar2.b);
                    int iE = kjf.e(jhfVar2.b);
                    kjf kjfVar = mu8Var.h.c;
                    int iF2 = kjfVar != null ? kjf.f(kjfVar.a) : -1;
                    kjf kjfVar2 = mu8Var.h.c;
                    ye7Var.c(iF, iE, iF2, kjfVar2 != null ? kjf.e(kjfVar2.a) : -1);
                    return;
                }
                return;
            }
            if (jhfVar != null && (!wl7.b(jhfVar.a.b, jhfVar2.a.b) || (kjf.b(jhfVar.b, jhfVar2.b) && !wl7.b(jhfVar.c, jhfVar2.c)))) {
                ye7 ye7Var2 = mu8Var.b;
                ye7Var2.b().restartInput(ye7Var2.a);
                return;
            }
            int size2 = mu8Var.j.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ktc ktcVar2 = (ktc) ((WeakReference) mu8Var.j.get(i2)).get();
                if (ktcVar2 != null) {
                    jhf jhfVar3 = mu8Var.h;
                    ye7 ye7Var3 = mu8Var.b;
                    if (ktcVar2.k) {
                        ktcVar2.g = jhfVar3;
                        if (ktcVar2.i) {
                            ye7Var3.b().updateExtractedText(ye7Var3.a, ktcVar2.h, ewa.i(jhfVar3));
                        }
                        kjf kjfVar3 = jhfVar3.c;
                        long j = jhfVar3.b;
                        int iF3 = kjfVar3 != null ? kjf.f(kjfVar3.a) : -1;
                        kjf kjfVar4 = jhfVar3.c;
                        ye7Var3.c(kjf.f(j), kjf.e(j), iF3, kjfVar4 != null ? kjf.e(kjfVar4.a) : -1);
                    }
                }
            }
        }
    }

    @Override // defpackage.scb
    public final void f(qtc qtcVar) {
        Rect rect;
        mu8 mu8Var = this.c;
        if (mu8Var != null) {
            mu8Var.l = new Rect(gf9.b(qtcVar.a), gf9.b(qtcVar.b), gf9.b(qtcVar.c), gf9.b(qtcVar.d));
            if (!mu8Var.j.isEmpty() || (rect = mu8Var.l) == null) {
                return;
            }
            mu8Var.a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    @Override // defpackage.scb
    public final void g(jhf jhfVar, t37 t37Var, t2d t2dVar, or orVar) {
        a80 a80Var = new a80(jhfVar, this, t37Var, t2dVar, orVar, 0);
        hu8.a aVar = this.a;
        if (aVar == null) {
            return;
        }
        this.b = aVar.C(new b80(a80Var, this, aVar, null));
    }

    @Override // defpackage.hu8
    public final void i() {
        c4a<j6g> c4aVarK = k();
        if (c4aVarK != null) {
            ((nde) c4aVarK).b(j6g.a);
        }
    }

    public final c4a<j6g> k() {
        nde ndeVar = this.d;
        if (ndeVar != null) {
            return ndeVar;
        }
        if (!owe.a) {
            return null;
        }
        nde ndeVarD = wg2.d(1, 0, eo1.c, 2);
        this.d = ndeVarD;
        return ndeVarD;
    }
}
