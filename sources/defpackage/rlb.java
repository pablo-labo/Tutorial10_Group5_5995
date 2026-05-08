package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rlb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ luc b;

    public /* synthetic */ rlb(luc lucVar, int i) {
        this.a = i;
        this.b = lucVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [T, java.lang.Object, mif] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        T tD0;
        int i = this.a;
        luc lucVar = this.b;
        switch (i) {
            case 0:
                jtf jtfVar = (jtf) obj;
                jtfVar.getClass();
                mr8 mr8Var = ((ktf) jtfVar).d0;
                List list = (List) lucVar.element;
                if (list != null) {
                    list.add(mr8Var);
                    tD0 = list;
                } else {
                    tD0 = u63.d0(mr8Var);
                }
                lucVar.element = tD0;
                return itf.b;
            default:
                ?? r2 = (mif) obj;
                r2.getClass();
                lucVar.element = r2;
                return j6g.a;
        }
    }
}
