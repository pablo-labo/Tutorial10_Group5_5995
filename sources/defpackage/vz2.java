package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.r;
import com.indeed.android.backendservices.common.api.ApiError;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import okhttp3.Request;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vz2 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vz2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                l03.d((rgf) obj3, (b) obj, ka2.L(1));
                break;
            case 1:
                tg2 tg2Var = (tg2) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(1 & iIntValue, (iIntValue & 3) != 2)) {
                    Iterator<T> it = tg2Var.c.iterator();
                    while (it.hasNext()) {
                        le4.b((tg2) it.next(), null, bVar, 0, 2);
                    }
                } else {
                    bVar.D();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((of4) obj3).M(ka2.L(1), (b) obj);
                break;
            case 3:
                bhd bhdVar = (bhd) obj3;
                b bVar2 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    fif.b(o6.f(bhdVar.c, " (", bhdVar.f, ")"), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVar2, 0, 0, 131070);
                } else {
                    bVar2.D();
                }
                break;
            case 4:
                ((zk6) ((mga) obj3).b.getValue()).getClass();
                zk6.b((ApiError) obj, (Request) obj2);
                break;
            case 5:
                ((Integer) obj2).getClass();
                jka.a((gu5) obj3, (b) obj, ka2.L(1));
                break;
            case 6:
                hed hedVar = (hed) obj3;
                b bVar3 = (b) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    g4a g4aVarA = r.a(((d4g) hedVar.V.getValue()).c, bVar3);
                    b4g.p(((c4g) g4aVarA.getValue()).b, ((c4g) g4aVarA.getValue()).c, ((c4g) g4aVarA.getValue()).a, ((c4g) g4aVarA.getValue()).d, false, bVar3, 0, 48);
                } else {
                    bVar3.D();
                }
                break;
            case 7:
                x8f x8fVar = (x8f) obj3;
                String str = (String) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                str.getClass();
                if (zve.U(str)) {
                    str = "CROWTAXO_START";
                }
                rq7 rq7Var = (rq7) cr8.p(rq7.class);
                lr5 lr5VarU = x8fVar.requireActivity().u();
                lr5VarU.getClass();
                rq7Var.a(new er7(str, kc9.W(new Pair("occupationSuid", la8.c("P95X0"))), zBooleanValue), lr5VarU, "tare-debug-screen", "tare-debug-screen", new mc(12));
                break;
            default:
                ((Integer) obj2).getClass();
                v0h.a((ah2) obj3, (b) obj, ka2.L(7));
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ vz2(Object obj, int i, int i2) {
        this.a = i2;
        this.b = obj;
    }
}
