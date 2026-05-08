package defpackage;

import defpackage.ha;
import defpackage.mb8;
import defpackage.wc7;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class cd7 implements ga<wc7.e> {
    public static final cd7 a = new cd7();
    public static final List<String> b = u63.a0("currentUser", "getGlobalUnreadEventCount", "getUnreadConversationCount");

    @Override // defpackage.ga
    public final wc7.e a(mb8 mb8Var, lb3 lb3Var) {
        Object objA;
        Object objA2;
        Object objA3;
        mb8Var.getClass();
        lb3Var.getClass();
        wc7.d dVar = null;
        wc7.g gVar = null;
        wc7.h hVar = null;
        while (true) {
            int iD1 = mb8Var.D1(b);
            mb8.a aVar = mb8.a.Y;
            if (iD1 == 0) {
                bd7 bd7Var = bd7.a;
                ha.g gVar2 = ha.a;
                ena enaVar = new ena(bd7Var, false);
                if (mb8Var.peek() == aVar) {
                    mb8Var.I();
                    objA3 = null;
                } else {
                    objA3 = enaVar.a(mb8Var, lb3Var);
                }
                dVar = (wc7.d) objA3;
            } else if (iD1 == 1) {
                ed7 ed7Var = ed7.a;
                ha.g gVar3 = ha.a;
                ena enaVar2 = new ena(ed7Var, false);
                if (mb8Var.peek() == aVar) {
                    mb8Var.I();
                    objA2 = null;
                } else {
                    objA2 = enaVar2.a(mb8Var, lb3Var);
                }
                gVar = (wc7.g) objA2;
            } else {
                if (iD1 != 2) {
                    return new wc7.e(dVar, gVar, hVar);
                }
                fd7 fd7Var = fd7.a;
                ha.g gVar4 = ha.a;
                ena enaVar3 = new ena(fd7Var, false);
                if (mb8Var.peek() == aVar) {
                    mb8Var.I();
                    objA = null;
                } else {
                    objA = enaVar3.a(mb8Var, lb3Var);
                }
                hVar = (wc7.h) objA;
            }
        }
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, wc7.e eVar) {
        wc7.e eVar2 = eVar;
        hc8Var.getClass();
        lb3Var.getClass();
        eVar2.getClass();
        hc8Var.u0("currentUser");
        bd7 bd7Var = bd7.a;
        ha.g gVar = ha.a;
        ena enaVar = new ena(bd7Var, false);
        wc7.d dVar = eVar2.a;
        if (dVar == null) {
            hc8Var.H1();
        } else {
            enaVar.b(hc8Var, lb3Var, dVar);
        }
        hc8Var.u0("getGlobalUnreadEventCount");
        ena enaVar2 = new ena(ed7.a, false);
        wc7.g gVar2 = eVar2.b;
        if (gVar2 == null) {
            hc8Var.H1();
        } else {
            enaVar2.b(hc8Var, lb3Var, gVar2);
        }
        hc8Var.u0("getUnreadConversationCount");
        ena enaVar3 = new ena(fd7.a, false);
        wc7.h hVar = eVar2.c;
        if (hVar == null) {
            hc8Var.H1();
        } else {
            enaVar3.b(hc8Var, lb3Var, hVar);
        }
    }
}
