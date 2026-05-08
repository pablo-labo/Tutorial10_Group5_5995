package defpackage;

import androidx.compose.foundation.layout.c;
import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ql1 implements Function2 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ ql1(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        boolean z = false;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                b bVar = (b) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ((ah2) obj4).q((c) obj3, bVar, 0);
                } else {
                    bVar.D();
                }
                return j6g.a;
            default:
                fv1 fv1Var = (fv1) obj3;
                aj3 aj3Var = (aj3) obj2;
                if (wl7.b((aj3) obj, (fv1) obj4) && wl7.b(aj3Var, fv1Var)) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
