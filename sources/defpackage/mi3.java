package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mi3 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ gu5 b;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    gt6.m("Update", this.b, e.a.b, vt6.Sm, false, null, null, bVar, 3462, 496);
                } else {
                    bVar.D();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                w6d.b(this.b, (b) obj, ka2.L(7));
                break;
        }
        return j6g.a;
    }
}
