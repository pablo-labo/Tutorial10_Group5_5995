package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jobsearch.bottomnav.IanMainFragment;
import defpackage.o97;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class op6 implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ op6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        int i2 = 7;
        b.a.C0020a c0020a = b.a.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                IanMainFragment ianMainFragment = (IanMainFragment) obj4;
                b bVar = (b) obj2;
                ((Integer) obj3).getClass();
                ((qd0) obj).getClass();
                j6g j6gVar = j6g.a;
                boolean zX = bVar.x(ianMainFragment);
                Object objV = bVar.v();
                if (zX || objV == c0020a) {
                    objV = new aq6(ianMainFragment, null);
                    bVar.p(objV);
                }
                to4.d(bVar, j6gVar, (Function2) objV);
                boolean zX2 = bVar.x(ianMainFragment);
                Object objV2 = bVar.v();
                if (zX2 || objV2 == c0020a) {
                    objV2 = new oe(ianMainFragment, i2);
                    bVar.p(objV2);
                }
                gu5 gu5Var = (gu5) objV2;
                boolean zX3 = bVar.x(ianMainFragment);
                Object objV3 = bVar.v();
                if (zX3 || objV3 == c0020a) {
                    objV3 = new zh(ianMainFragment, 10);
                    bVar.p(objV3);
                }
                gu5 gu5Var2 = (gu5) objV3;
                boolean zX4 = bVar.x(ianMainFragment);
                Object objV4 = bVar.v();
                if (zX4 || objV4 == c0020a) {
                    objV4 = new nj(ianMainFragment, 13);
                    bVar.p(objV4);
                }
                tsc.a(gu5Var, gu5Var2, (gu5) objV4, bVar, 0);
                break;
            case 1:
                o97 o97Var = (o97) obj4;
                b bVar2 = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((xo8) obj).getClass();
                if (bVar2.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    String strI = ak2.I(R.string.scheduled_interviews_will_appear_here, bVar2);
                    o97.g gVar = o97Var.i;
                    cif.b(strI, f.j(e.a.b, 16.0f, 16.0f, 0.0f, 20.0f, 4), eu6.m, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o97Var.j.f, bVar2, 0, 0, 65528);
                } else {
                    bVar2.D();
                }
                break;
            default:
                gu5 gu5Var3 = (gu5) obj4;
                b bVar3 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar3.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    boolean zK = bVar3.K(gu5Var3);
                    Object objV5 = bVar3.v();
                    if (zK || objV5 == c0020a) {
                        objV5 = new eh(7, gu5Var3);
                        bVar3.p(objV5);
                    }
                    rq6.b((gu5) objV5, null, false, null, null, nj2.a, bVar3, 196608, 30);
                } else {
                    bVar3.D();
                }
                break;
        }
        return j6g.a;
    }
}
