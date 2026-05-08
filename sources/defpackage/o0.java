package defpackage;

import android.view.KeyEvent;
import defpackage.y52;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class o0 implements Function1 {
    public final /* synthetic */ int a;
    public final Object b;

    public o0(t52 t52Var, ajc ajcVar, mge mgeVar, lw7 lw7Var) {
        this.a = 3;
        this.b = t52Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                oi8 oi8Var = (oi8) obj;
                oi8Var.getClass();
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                HashMap map3 = new HashMap();
                oi8Var.b(new r0((s0) obj2, map, oi8Var, map2));
                return new mf0(map, map2, map3);
            case 1:
                ((List) obj2).get(((Number) obj).intValue());
                return null;
            case 2:
                KeyEvent keyEvent = ((ng8) obj).a;
                keyEvent.getClass();
                if (pg8.A(keyEvent) == 2 || lg8.a(ak2.a(keyEvent.getKeyCode()), lg8.i)) {
                    z = true;
                    ((fm5) obj2).c(1);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                bj8 bj8Var = (bj8) obj;
                bj8Var.getClass();
                a62 a62VarF = b04.f((t52) obj2);
                if (a62VarF != null) {
                    bj8Var.w0(a62VarF);
                }
                return null;
            default:
                int iIntValue = ((Number) obj).intValue();
                h04 h04Var = ((gxf) obj2).a;
                a62 a62VarA = q8a.a(h04Var.b, iIntValue);
                boolean z2 = a62VarA.c;
                g04 g04Var = h04Var.a;
                if (!z2) {
                    return rc5.b(g04Var.b, a62VarA);
                }
                y52 y52Var = g04Var.t;
                Set<a62> set = y52.c;
                y52Var.getClass();
                return (t52) y52Var.b.invoke(new y52.a(a62VarA, null));
        }
    }

    public /* synthetic */ o0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
