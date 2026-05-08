package defpackage;

import androidx.compose.runtime.b;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class x66 implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gu5 b;

    public /* synthetic */ x66(int i, gu5 gu5Var) {
        this.a = i;
        this.b = gu5Var;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        pb2 pb2Var = (pb2) obj;
        switch (this.a) {
            case 0:
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                pb2Var.getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    n76.b(6, this.b, bVar, null, "Navigate to ScheduleApply onboarding", false);
                } else {
                    bVar.D();
                }
                break;
            default:
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                pb2Var.getClass();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    q9f.e(6, this.b, bVar2, "Open RN Push Debug Screen");
                } else {
                    bVar2.D();
                }
                break;
        }
        return j6g.a;
    }
}
