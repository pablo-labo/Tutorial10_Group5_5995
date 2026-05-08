package defpackage;

import androidx.compose.runtime.b;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class is0 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ nsd f;

    public /* synthetic */ is0(p5f p5fVar, int i, Function1 function1, e13 e13Var, e2b e2bVar) {
        this.c = p5fVar;
        this.b = i;
        this.d = function1;
        this.e = e13Var;
        this.f = e2bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        nsd nsdVar = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ks0.d((List) obj5, (rs0) obj4, (e8a) obj3, (ss8) nsdVar, (b) obj, ka2.L(this.b | 1));
                break;
            default:
                p5f p5fVar = (p5f) obj5;
                Function1 function1 = (Function1) obj4;
                e13 e13Var = (e13) obj3;
                e2b e2bVar = (e2b) nsdVar;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    z5f.e(p5fVar, this.b, function1, e13Var, e2bVar, bVar, 0);
                } else {
                    bVar.D();
                }
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ is0(List list, rs0 rs0Var, e8a e8aVar, ss8 ss8Var, int i) {
        this.c = list;
        this.d = rs0Var;
        this.e = e8aVar;
        this.f = ss8Var;
        this.b = i;
    }
}
