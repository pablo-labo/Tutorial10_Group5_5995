package defpackage;

import androidx.compose.runtime.b;
import com.indeed.android.jobsearch.R;
import defpackage.i6b;
import defpackage.p37;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z9 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o97 b;

    public /* synthetic */ z9(o97 o97Var, int i) {
        this.a = i;
        this.b = o97Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        o97 o97Var = this.b;
        switch (i) {
            case 0:
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p37 p37VarB = vc7.a;
                    if (p37VarB == null) {
                        p37.a aVar = new p37.a("Filled.Info", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i2 = gmg.a;
                        kne kneVar = new kne(da2.b);
                        y5b y5bVar = new y5b();
                        y5bVar.f(12.0f, 2.0f);
                        i6b.c cVar = new i6b.c(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                        ArrayList<i6b> arrayList = y5bVar.a;
                        arrayList.add(cVar);
                        y5bVar.g(4.48f, 10.0f, 10.0f, 10.0f);
                        y5bVar.g(10.0f, -4.48f, 10.0f, -10.0f);
                        arrayList.add(new i6b.h(17.52f, 2.0f, 12.0f, 2.0f));
                        y5bVar.a();
                        y5bVar.f(13.0f, 17.0f);
                        y5bVar.c(-2.0f);
                        arrayList.add(new i6b.r(-6.0f));
                        y5bVar.c(2.0f);
                        arrayList.add(new i6b.r(6.0f));
                        y5bVar.a();
                        y5bVar.f(13.0f, 9.0f);
                        y5bVar.c(-2.0f);
                        y5bVar.d(11.0f, 7.0f);
                        y5bVar.c(2.0f);
                        arrayList.add(new i6b.r(2.0f));
                        y5bVar.a();
                        p37.a.a(aVar, arrayList, kneVar);
                        p37VarB = aVar.b();
                        vc7.a = p37VarB;
                    }
                    vq6.a(p37VarB, ak2.I(R.string.ad_transparency_info, bVar), null, o97Var.c.a.b, bVar, 0, 4);
                } else {
                    bVar.D();
                }
                break;
            case 1:
                b bVar2 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ev6.b(fv6.W1, null, null, null, o97Var.c.a.c, null, bVar2, 6, 46);
                } else {
                    bVar2.D();
                }
                break;
            default:
                b bVar3 = (b) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ev6.b(fv6.C8, null, null, null, o97Var.c.a.b, null, bVar3, 6, 46);
                } else {
                    bVar3.D();
                }
                break;
        }
        return j6g.a;
    }
}
