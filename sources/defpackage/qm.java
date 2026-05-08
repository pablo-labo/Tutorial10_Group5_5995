package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.om;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class qm implements ga<om.a> {
    public static final qm a = new qm();
    public static final List<String> b = u63.a0("jobSeekerProfileResume", "originalResumeFile", "pdfResumeFile", "nameEmailPhoneRedactedPdfResumeFile", "emailPhoneRedactedPdfResumeFile");

    @Override // defpackage.ga
    public final om.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        Object objA2;
        Object objA3;
        Object objA4;
        Object objA5;
        mb8Var.getClass();
        lb3Var.getClass();
        om.d dVar = null;
        om.f fVar = null;
        om.g gVar = null;
        om.e eVar = null;
        om.c cVar = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            mb8.a aVar = mb8.a.Y;
            if (iD1 == 0) {
                tm tmVar = tm.a;
                ha.g gVar2 = ha.a;
                ena enaVar = new ena(tmVar, false);
                if (mb8Var.peek() == aVar) {
                    mb8Var.I();
                    objA5 = null;
                } else {
                    objA5 = enaVar.a(mb8Var, lb3Var);
                }
                dVar = (om.d) objA5;
            } else if (iD1 == 1) {
                vm vmVar = vm.a;
                ha.g gVar3 = ha.a;
                ena enaVar2 = new ena(vmVar, false);
                if (mb8Var.peek() == aVar) {
                    mb8Var.I();
                    objA4 = null;
                } else {
                    objA4 = enaVar2.a(mb8Var, lb3Var);
                }
                fVar = (om.f) objA4;
            } else if (iD1 == 2) {
                wm wmVar = wm.a;
                ha.g gVar4 = ha.a;
                ena enaVar3 = new ena(wmVar, false);
                if (mb8Var.peek() == aVar) {
                    mb8Var.I();
                    objA3 = null;
                } else {
                    objA3 = enaVar3.a(mb8Var, lb3Var);
                }
                gVar = (om.g) objA3;
            } else if (iD1 == 3) {
                um umVar = um.a;
                ha.g gVar5 = ha.a;
                ena enaVar4 = new ena(umVar, false);
                if (mb8Var.peek() == aVar) {
                    mb8Var.I();
                    objA2 = null;
                } else {
                    objA2 = enaVar4.a(mb8Var, lb3Var);
                }
                eVar = (om.e) objA2;
            } else {
                if (iD1 != 4) {
                    return new om.a(dVar, fVar, gVar, eVar, cVar);
                }
                sm smVar = sm.a;
                ha.g gVar6 = ha.a;
                ena enaVar5 = new ena(smVar, false);
                if (mb8Var.peek() == aVar) {
                    mb8Var.I();
                    objA = null;
                } else {
                    objA = enaVar5.a(mb8Var, lb3Var);
                }
                cVar = (om.c) objA;
            }
        }
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, om.a aVar) {
        om.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("jobSeekerProfileResume");
        tm tmVar = tm.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(tmVar, false);
        om.d dVar = aVar2.a;
        if (dVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, dVar);
        }
        hc8Var.u0("originalResumeFile");
        ena enaVar2 = new ena(vm.a, false);
        om.f fVar = aVar2.b;
        if (fVar == null) {
            hc8Var.H1();
        } else {
            enaVar2.b(hc8Var, lb3Var, fVar);
        }
        hc8Var.u0("pdfResumeFile");
        ena enaVar3 = new ena(wm.a, false);
        om.g gVar2 = aVar2.c;
        if (gVar2 == null) {
            hc8Var.H1();
        } else {
            enaVar3.b(hc8Var, lb3Var, gVar2);
        }
        hc8Var.u0("nameEmailPhoneRedactedPdfResumeFile");
        ena enaVar4 = new ena(um.a, false);
        om.e eVar = aVar2.d;
        if (eVar == null) {
            hc8Var.H1();
        } else {
            enaVar4.b(hc8Var, lb3Var, eVar);
        }
        hc8Var.u0("emailPhoneRedactedPdfResumeFile");
        ena enaVar5 = new ena(sm.a, false);
        om.c cVar = aVar2.e;
        if (cVar == null) {
            hc8Var.H1();
        } else {
            enaVar5.b(hc8Var, lb3Var, cVar);
        }
    }
}
