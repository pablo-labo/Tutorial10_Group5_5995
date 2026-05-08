package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class jmd implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ah2 b;
    public final /* synthetic */ Object c;

    public jmd(ah2 ah2Var, omd omdVar) {
        this.b = ah2Var;
        this.c = omdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        ah2 ah2Var = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                b bVar = (b) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ah2Var.q((omd) obj3, bVar, 6);
                } else {
                    bVar.D();
                }
                break;
            default:
                b bVar2 = (b) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    fif.a(((nzf) bVar2.M(rzf.b)).j, bh2.c(1789628237, new ht8((Function2) obj3, ah2Var), bVar2), bVar2, 48);
                } else {
                    bVar2.D();
                }
                break;
        }
        return j6g.a;
    }

    public jmd(Function2 function2, ah2 ah2Var) {
        this.c = function2;
        this.b = ah2Var;
    }
}
