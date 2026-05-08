package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class p10 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p10(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [T, java.lang.Object, java.lang.String] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                b bVar = (b) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    fif.a(((nzf) bVar.M(rzf.b)).g, (Function2) obj3, bVar, 0);
                } else {
                    bVar.D();
                }
                break;
            default:
                ?? r5 = (String) obj;
                ((Boolean) obj2).getClass();
                r5.getClass();
                ((luc) obj3).element = r5;
                break;
        }
        return j6g.a;
    }
}
