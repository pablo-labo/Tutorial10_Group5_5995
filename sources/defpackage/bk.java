package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.zj;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class bk implements ga<zj.a> {
    public static final bk a = new bk();
    public static final List<String> b = u63.Z("preference");

    @Override // defpackage.ga
    public final zj.a a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        mb8Var.getClass();
        lb3Var.getClass();
        zj.d dVar = null;
        while (mb8Var.D1(b) == 0) {
            ek ekVar = ek.a;
            ha.g gVar = ha.a;
            ena enaVar = new ena(ekVar, false);
            if (mb8Var.peek() == mb8.a.Y) {
                mb8Var.I();
                objA = null;
            } else {
                objA = enaVar.a(mb8Var, lb3Var);
            }
            dVar = (zj.d) objA;
        }
        return new zj.a(dVar);
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, zj.a aVar) {
        zj.a aVar2 = aVar;
        hc8Var.getClass();
        lb3Var.getClass();
        aVar2.getClass();
        hc8Var.u0("preference");
        ek ekVar = ek.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(ekVar, false);
        zj.d dVar = aVar2.a;
        if (dVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, dVar);
        }
    }
}
