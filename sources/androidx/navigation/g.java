package androidx.navigation;

import androidx.navigation.p;
import defpackage.a7e;
import defpackage.bi3;
import defpackage.j6g;
import defpackage.mj8;
import defpackage.oy5;
import defpackage.qgb;
import defpackage.r6;
import defpackage.r6e;
import defpackage.v6e;
import defpackage.wb0;
import defpackage.wl7;
import defpackage.yy5;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class g extends mj8 implements Function1<q, j6g> {
    final /* synthetic */ k $node;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, e eVar) {
        super(1);
        this.$node = kVar;
        this.this$0 = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(q qVar) {
        q qVar2 = qVar;
        qVar2.getClass();
        oy5 oy5Var = oy5.c;
        oy5Var.getClass();
        wb0 wb0Var = new wb0();
        oy5Var.invoke(wb0Var);
        p.a aVar = qVar2.a;
        aVar.a = wb0Var.a;
        aVar.b = wb0Var.b;
        k kVar = this.$node;
        if (kVar instanceof l) {
            int i = k.Z;
            r6e r6eVarO = v6e.O(kVar, j.a);
            e eVar = this.this$0;
            Iterator it = r6eVarO.iterator();
            while (true) {
                if (it.hasNext()) {
                    k kVar2 = (k) it.next();
                    k kVarI = eVar.i();
                    if (wl7.b(kVar2, kVarI != null ? kVarI.b : null)) {
                        break;
                    }
                } else {
                    int i2 = l.e0;
                    l lVar = this.this$0.c;
                    if (lVar == null) {
                        r6.g("You must call setGraph() before calling getGraph()");
                        return null;
                    }
                    int i3 = ((k) a7e.U(v6e.O(lVar, yy5.c))).W;
                    bi3 bi3Var = bi3.d;
                    bi3Var.getClass();
                    qVar2.d = i3;
                    qgb qgbVar = new qgb();
                    bi3Var.invoke(qgbVar);
                    qVar2.e = qgbVar.a;
                }
            }
        }
        return j6g.a;
    }
}
