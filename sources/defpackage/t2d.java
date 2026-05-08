package defpackage;

import defpackage.h63;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class t2d implements Function1 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ vu5 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ t2d(j04 j04Var, pq pqVar, luc lucVar) {
        this.b = j04Var;
        this.c = pqVar;
        this.d = lucVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.d;
        vu5 vu5Var = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                s2d s2dVar = (s2d) obj2;
                gu5 gu5Var = (gu5) vu5Var;
                h63 h63Var = (h63) obj;
                ((gu5) obj3).invoke();
                fx4 fx4VarE = s2dVar.E();
                ((gme) fx4VarE.b).setValue(dx4.a(fx4VarE.g(), false, null, false, 111));
                if (wl7.b(h63Var, h63.b.a)) {
                    gu5Var.invoke();
                } else if (h63Var instanceof h63.c) {
                    s2dVar.requireContext().startActivity(((h63.c) h63Var).a);
                } else if (!wl7.b(h63Var, h63.a.a)) {
                    l.g();
                    return null;
                }
                return j6g.a;
            default:
                Function1 function1 = (Function1) vu5Var;
                whf whfVar = (whf) ((luc) obj2).element;
                jhf jhfVarA = ((j04) obj3).a((List) obj);
                if (whfVar != null) {
                    whfVar.a(null, jhfVarA);
                }
                function1.invoke(jhfVarA);
                return j6g.a;
        }
    }

    public /* synthetic */ t2d(gu5 gu5Var, s2d s2dVar, gu5 gu5Var2) {
        this.b = gu5Var;
        this.d = s2dVar;
        this.c = gu5Var2;
    }
}
