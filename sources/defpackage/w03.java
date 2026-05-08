package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import defpackage.v03;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w03 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w03(luc lucVar, boolean z) {
        this.c = lucVar;
        this.b = z;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [T, v03] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        iz2 iz2Var;
        int i = this.a;
        boolean z = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                luc lucVar = (luc) obj3;
                v03 v03Var = (v03) obj;
                v03.a aVar = (v03.a) obj2;
                if (!(aVar instanceof iz2)) {
                    return v03Var.d1(aVar);
                }
                if (((v03) lucVar.element).h1(aVar.getKey()) != null) {
                    lucVar.element = ((v03) lucVar.element).P(aVar.getKey());
                    return v03Var.d1(((iz2) aVar).r0());
                }
                if (z) {
                    ((iz2) aVar).f0();
                    iz2Var = null;
                } else {
                    iz2Var = (iz2) aVar;
                }
                return v03Var.d1(iz2Var);
            default:
                ((Integer) obj2).getClass();
                gxc.j((e) obj3, z, (b) obj, ka2.L(1));
                return j6g.a;
        }
    }

    public /* synthetic */ w03(e eVar, boolean z, int i) {
        this.c = eVar;
        this.b = z;
    }
}
