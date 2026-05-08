package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import com.indeed.android.jobsearch.bottomnav.IanMainFragment;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hj3 implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hj3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        b.a.C0020a c0020a = b.a.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                gu5 gu5Var = (gu5) obj4;
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    fv6 fv6Var = fv6.W1;
                    boolean zK = bVar.K(gu5Var);
                    Object objV = bVar.v();
                    if (zK || objV == c0020a) {
                        objV = new oy(2, gu5Var);
                        bVar.p(objV);
                    }
                    ev6.b(fv6Var, androidx.compose.foundation.b.d(e.a.b, false, null, null, (gu5) objV, 15), null, null, 0L, null, bVar, 6, 60);
                } else {
                    bVar.D();
                }
                break;
            default:
                IanMainFragment ianMainFragment = (IanMainFragment) obj4;
                b bVar2 = (b) obj2;
                ((Integer) obj3).getClass();
                ((qd0) obj).getClass();
                af6 af6Var = (af6) r.a(ianMainFragment.H().f, bVar2).getValue();
                boolean zX = bVar2.x(ianMainFragment);
                Object objV2 = bVar2.v();
                if (zX || objV2 == c0020a) {
                    objV2 = new qa(ianMainFragment, 12);
                    bVar2.p(objV2);
                }
                gu5 gu5Var2 = (gu5) objV2;
                boolean zX2 = bVar2.x(ianMainFragment);
                Object objV3 = bVar2.v();
                if (zX2 || objV3 == c0020a) {
                    objV3 = new wm1(ianMainFragment, 8);
                    bVar2.p(objV3);
                }
                gu5 gu5Var3 = (gu5) objV3;
                boolean zX3 = bVar2.x(ianMainFragment);
                Object objV4 = bVar2.v();
                if (zX3 || objV4 == c0020a) {
                    objV4 = new cq0(ianMainFragment, 7);
                    bVar2.p(objV4);
                }
                gu5 gu5Var4 = (gu5) objV4;
                boolean zBooleanValue = ((Boolean) ((gme) ianMainFragment.H().a0).getValue()).booleanValue();
                boolean zX4 = bVar2.x(ianMainFragment);
                Object objV5 = bVar2.v();
                if (zX4 || objV5 == c0020a) {
                    objV5 = new o91(ianMainFragment, 8);
                    bVar2.p(objV5);
                }
                ze6.a(af6Var, gu5Var2, gu5Var3, gu5Var4, zBooleanValue, (gu5) objV5, bh2.c(359758124, new lr(ianMainFragment, 4), bVar2), bVar2, 1572864);
                break;
        }
        return j6g.a;
    }
}
