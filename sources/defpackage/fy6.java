package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fy6 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ gu5 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Serializable f;

    public /* synthetic */ fy6(gu5 gu5Var, Function1 function1, ArrayList arrayList, ArrayList arrayList2, boolean z) {
        this.b = gu5Var;
        this.d = function1;
        this.e = arrayList;
        this.f = arrayList2;
        this.c = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Serializable serializable = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ky6.b((dy6) obj4, (e) obj3, this.c, (String) serializable, this.b, (b) obj, ka2.L(1));
                break;
            default:
                Function1 function1 = (Function1) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                ArrayList arrayList2 = (ArrayList) serializable;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    qxb.e(this.b, function1, arrayList, arrayList2, this.c, bVar, 0);
                } else {
                    bVar.D();
                }
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ fy6(dy6 dy6Var, e eVar, boolean z, String str, gu5 gu5Var, int i) {
        this.d = dy6Var;
        this.e = eVar;
        this.c = z;
        this.f = str;
        this.b = gu5Var;
    }
}
