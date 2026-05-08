package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.p5a;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class y5a implements ga<p5a.h> {
    public static final y5a a = new y5a();
    public static final List<String> b = u63.a0("job", "invite", "conversation");

    @Override // defpackage.ga
    public final p5a.h a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        Object objA2;
        mb8Var.getClass();
        lb3Var.getClass();
        p5a.i iVar = null;
        p5a.g gVar = null;
        p5a.b bVar = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            mb8.a aVar = mb8.a.Y;
            if (iD1 == 0) {
                z5a z5aVar = z5a.a;
                ha.g gVar2 = ha.a;
                ena enaVar = new ena(z5aVar, false);
                if (mb8Var.peek() == aVar) {
                    mb8Var.I();
                    objA2 = null;
                } else {
                    objA2 = enaVar.a(mb8Var, lb3Var);
                }
                iVar = (p5a.i) objA2;
            } else if (iD1 == 1) {
                x5a x5aVar = x5a.a;
                ha.g gVar3 = ha.a;
                gVar = (p5a.g) new ena(x5aVar, false).a(mb8Var, lb3Var);
            } else {
                if (iD1 != 2) {
                    break;
                }
                s5a s5aVar = s5a.a;
                ha.g gVar4 = ha.a;
                ena enaVar2 = new ena(s5aVar, false);
                if (mb8Var.peek() == aVar) {
                    mb8Var.I();
                    objA = null;
                } else {
                    objA = enaVar2.a(mb8Var, lb3Var);
                }
                bVar = (p5a.b) objA;
            }
        }
        if (gVar != null) {
            return new p5a.h(iVar, gVar, bVar);
        }
        mh2.q(mb8Var, "invite");
        throw null;
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, p5a.h hVar) {
        p5a.h hVar2 = hVar;
        hc8Var.getClass();
        lb3Var.getClass();
        hVar2.getClass();
        hc8Var.u0("job");
        z5a z5aVar = z5a.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(z5aVar, false);
        p5a.i iVar = hVar2.a;
        if (iVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, iVar);
        }
        hc8Var.u0("invite");
        x5a x5aVar = x5a.a;
        p5a.g gVar2 = hVar2.b;
        hc8Var.j();
        x5aVar.b(hc8Var, lb3Var, gVar2);
        hc8Var.t();
        hc8Var.u0("conversation");
        ena enaVar2 = new ena(s5a.a, false);
        p5a.b bVar = hVar2.c;
        if (bVar == null) {
            hc8Var.H1();
        } else {
            enaVar2.b(hc8Var, lb3Var, bVar);
        }
    }
}
