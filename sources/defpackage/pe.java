package defpackage;

import android.os.Handler;
import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import com.indeed.android.profile.screens.sheets.profilesubtab.links.a;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pe implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pe(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = 2;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((re) obj3).M(ka2.L(1), (b) obj);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((a) obj3).M(ka2.L(1), (b) obj);
                break;
            case 2:
                fnf fnfVar = (fnf) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zmf.a(fnfVar, "InboxScreen", bVar, 48);
                } else {
                    bVar.D();
                }
                break;
            case 3:
                nj7 nj7Var = (nj7) obj3;
                Handler handler = nj7Var.b;
                if (((Long) obj).longValue() <= 0) {
                    handler.removeCallbacksAndMessages(null);
                    nj7Var.d = false;
                } else {
                    if (nj7Var.d) {
                        handler.removeCallbacksAndMessages(null);
                    } else {
                        oj7 oj7Var = nj7Var.a.get();
                        if (oj7Var != null) {
                            oj7Var.a();
                        }
                    }
                    nj7Var.d = true;
                    nj7Var.b();
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                ak7.a((String) obj3, (b) obj, ka2.L(7));
                break;
            case 5:
                ((udf) obj3).d(((ooa) obj2).a);
                break;
            case 6:
                i5a i5aVar = (i5a) obj3;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                prd prdVar = (prd) obj2;
                prdVar.getClass();
                ((c6f) i5aVar.a.getValue()).l(i5aVar.getB()).a(zBooleanValue, prdVar);
                break;
            case 7:
                gu5 gu5Var = (gu5) obj3;
                b bVar2 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    qi0.a(pnb.c, f.a(e.a.b, "ProfileHomeTopNav"), null, bh2.c(88323528, new ln4(i2, gu5Var), bVar2), 0.0f, null, null, bVar2, 3126, 244);
                } else {
                    bVar2.D();
                }
                break;
            case 8:
                ((Integer) obj2).getClass();
                q9f.f((ah2) obj3, (b) obj, ka2.L(7));
                break;
            default:
                ((Integer) obj2).getClass();
                ((pif) obj3).a(ka2.L(1), (b) obj);
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ pe(Object obj, int i, int i2) {
        this.a = i2;
        this.b = obj;
    }
}
