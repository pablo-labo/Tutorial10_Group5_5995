package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z2e implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ z2e(p5f p5fVar, int i, Function1 function1, e13 e13Var, e2b e2bVar) {
        this.d = p5fVar;
        this.b = i;
        this.c = function1;
        this.e = e13Var;
        this.f = e2bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = ka2.L(this.b | 1);
                g3e.b((e) obj5, (p2e) obj4, this.c, (ah2) obj3, (b) obj, iL);
                break;
            default:
                p5f p5fVar = (p5f) obj5;
                e13 e13Var = (e13) obj4;
                e2b e2bVar = (e2b) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    z5f.e(p5fVar, this.b, this.c, e13Var, e2bVar, bVar, 0);
                } else {
                    bVar.D();
                }
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ z2e(e eVar, p2e p2eVar, Function1 function1, ah2 ah2Var, int i) {
        this.d = eVar;
        this.e = p2eVar;
        this.c = function1;
        this.f = ah2Var;
        this.b = i;
    }
}
