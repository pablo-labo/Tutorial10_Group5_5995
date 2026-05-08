package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.rx7;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class vx7 implements ga<rx7.d> {
    public static final vx7 a = new vx7();
    public static final List<String> b = u63.a0("dossier", "ugcStats");

    @Override // defpackage.ga
    public final rx7.d a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        Object objA2;
        mb8Var.getClass();
        lb3Var.getClass();
        rx7.c cVar = null;
        rx7.k kVar = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            mb8.a aVar = mb8.a.Y;
            if (iD1 == 0) {
                ux7 ux7Var = ux7.a;
                ha.g gVar = ha.a;
                ena enaVar = new ena(ux7Var, false);
                if (mb8Var.peek() == aVar) {
                    mb8Var.I();
                    objA2 = null;
                } else {
                    objA2 = enaVar.a(mb8Var, lb3Var);
                }
                cVar = (rx7.c) objA2;
            } else {
                if (iD1 != 1) {
                    return new rx7.d(cVar, kVar);
                }
                dy7 dy7Var = dy7.a;
                ha.g gVar2 = ha.a;
                ena enaVar2 = new ena(dy7Var, false);
                if (mb8Var.peek() == aVar) {
                    mb8Var.I();
                    objA = null;
                } else {
                    objA = enaVar2.a(mb8Var, lb3Var);
                }
                kVar = (rx7.k) objA;
            }
        }
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, rx7.d dVar) {
        rx7.d dVar2 = dVar;
        hc8Var.getClass();
        lb3Var.getClass();
        dVar2.getClass();
        hc8Var.u0("dossier");
        ux7 ux7Var = ux7.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(ux7Var, false);
        rx7.c cVar = dVar2.a;
        if (cVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, cVar);
        }
        hc8Var.u0("ugcStats");
        ena enaVar2 = new ena(dy7.a, false);
        rx7.k kVar = dVar2.b;
        if (kVar == null) {
            hc8Var.H1();
        } else {
            enaVar2.b(hc8Var, lb3Var, kVar);
        }
    }
}
