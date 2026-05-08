package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class nl2 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;

    public nl2(ah2 ah2Var) {
        this.b = ah2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                b bVar = (b) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    throw null;
                }
                bVar.D();
                return j6g.a;
            default:
                b bVar2 = (b) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && bVar2.i()) {
                    bVar2.D();
                } else {
                    ((ah2) this.b).invoke(bVar2, 0);
                }
                return j6g.a;
        }
    }

    public nl2(o0a o0aVar, Object obj) {
        this.b = obj;
    }
}
