package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class li1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ li1(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object, whf] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        boolean zI0 = true;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                Set set = (Set) obj5;
                Set set2 = (Set) obj4;
                List list = (List) obj3;
                String str = (String) obj2;
                b71 b71Var = (b71) obj;
                b71Var.getClass();
                if (b71Var instanceof c71) {
                    if (set != null ? set.contains(null) : false) {
                        zI0 = false;
                    }
                } else if (b71Var instanceof z61) {
                    list.getClass();
                    if (set2 != null) {
                        zI0 = set2.contains(new zr3(list, null));
                    }
                } else {
                    if (!(b71Var instanceof a71)) {
                        l.g();
                        return null;
                    }
                    zI0 = z92.I0(((a71) b71Var).a, str);
                }
                return Boolean.valueOf(zI0);
            case 1:
                lu8 lu8Var = (lu8) obj5;
                rhf rhfVar = (rhf) obj4;
                jhf jhfVar = (jhf) obj3;
                t37 t37Var = (t37) obj2;
                if (lu8Var.b()) {
                    j04 j04Var = lu8Var.d;
                    pq pqVar = lu8Var.v;
                    or orVar = lu8Var.w;
                    luc lucVar = new luc();
                    t2d t2dVar = new t2d(j04Var, pqVar, lucVar);
                    scb scbVar = rhfVar.a;
                    scbVar.g(jhfVar, t37Var, t2dVar, orVar);
                    ?? whfVar = new whf(rhfVar, scbVar);
                    rhfVar.b.set((whf) whfVar);
                    lucVar.element = whfVar;
                    lu8Var.e = whfVar;
                }
                return new qf(1);
            default:
                iuc iucVar = (iuc) obj5;
                ln3 ln3Var = (ln3) obj2;
                xd0 xd0Var = (xd0) obj;
                float fFloatValue = ((Number) ((gme) xd0Var.e).getValue()).floatValue() - iucVar.element;
                float fE = ((xrd) obj4).e(fFloatValue);
                iucVar.element = ((Number) ((gme) xd0Var.e).getValue()).floatValue();
                ((iuc) obj3).element = ((Number) xd0Var.a.b().invoke(xd0Var.f)).floatValue();
                if (Math.abs(fFloatValue - fE) > 0.5f) {
                    xd0Var.a();
                }
                ln3Var.getClass();
                return j6g.a;
        }
    }
}
