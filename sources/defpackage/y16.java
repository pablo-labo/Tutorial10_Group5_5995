package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.q16;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class y16 implements ga<q16.g> {
    public static final y16 a = new y16();
    public static final List<String> b = u63.a0("resumeId", "pdfResumeFile", "originalUploadedFile");

    @Override // defpackage.ga
    public final q16.g a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        Object objA2;
        mb8Var.getClass();
        lb3Var.getClass();
        String str = null;
        q16.f fVar = null;
        q16.e eVar = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            if (iD1 != 0) {
                mb8.a aVar = mb8.a.Y;
                if (iD1 == 1) {
                    x16 x16Var = x16.a;
                    ha.g gVar = ha.a;
                    ena enaVar = new ena(x16Var, false);
                    if (mb8Var.peek() == aVar) {
                        mb8Var.I();
                        objA2 = null;
                    } else {
                        objA2 = enaVar.a(mb8Var, lb3Var);
                    }
                    fVar = (q16.f) objA2;
                } else {
                    if (iD1 != 2) {
                        break;
                    }
                    w16 w16Var = w16.a;
                    ha.g gVar2 = ha.a;
                    ena enaVar2 = new ena(w16Var, false);
                    if (mb8Var.peek() == aVar) {
                        mb8Var.I();
                        objA = null;
                    } else {
                        objA = enaVar2.a(mb8Var, lb3Var);
                    }
                    eVar = (q16.e) objA;
                }
            } else {
                str = (String) ha.a.a(mb8Var, lb3Var);
            }
        }
        if (str != null) {
            return new q16.g(str, fVar, eVar);
        }
        mh2.q(mb8Var, "resumeId");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, q16.g gVar) {
        q16.g gVar2 = gVar;
        hc8Var.getClass();
        lb3Var.getClass();
        gVar2.getClass();
        hc8Var.u0("resumeId");
        ha.a.b(hc8Var, lb3Var, gVar2.a);
        hc8Var.u0("pdfResumeFile");
        ena enaVar = new ena(x16.a, false);
        q16.f fVar = gVar2.b;
        if (fVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, fVar);
        }
        hc8Var.u0("originalUploadedFile");
        ena enaVar2 = new ena(w16.a, false);
        q16.e eVar = gVar2.c;
        if (eVar == null) {
            hc8Var.H1();
        } else {
            enaVar2.b(hc8Var, lb3Var, eVar);
        }
    }
}
