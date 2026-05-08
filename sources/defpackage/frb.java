package defpackage;

import androidx.compose.runtime.b;
import com.indeed.android.jobsearch.bottomnav.IanMainFragment;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class frb implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ frb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                gu5 gu5Var = (gu5) obj4;
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    irb.d(gu5Var, bVar, 0);
                } else {
                    bVar.D();
                }
                break;
            case 1:
                gu5 gu5Var2 = (gu5) obj4;
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((xo8) obj).getClass();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    yyg.a(gu5Var2, bVar2, 0);
                } else {
                    bVar2.D();
                }
                break;
            default:
                IanMainFragment ianMainFragment = (IanMainFragment) obj4;
                b bVar3 = (b) obj2;
                ((Integer) obj3).getClass();
                ((qd0) obj).getClass();
                nhb nhbVarG = ianMainFragment.K().g();
                boolean zX = bVar3.x(ianMainFragment);
                Object objV = bVar3.v();
                int i2 = 9;
                b.a.C0020a c0020a = b.a.a;
                if (zX || objV == c0020a) {
                    objV = new dd(ianMainFragment, 9);
                    bVar3.p(objV);
                }
                gu5 gu5Var3 = (gu5) objV;
                boolean zX2 = bVar3.x(ianMainFragment);
                Object objV2 = bVar3.v();
                if (zX2 || objV2 == c0020a) {
                    objV2 = new qq(ianMainFragment, 12);
                    bVar3.p(objV2);
                }
                gu5 gu5Var4 = (gu5) objV2;
                boolean zX3 = bVar3.x(ianMainFragment);
                Object objV3 = bVar3.v();
                if (zX3 || objV3 == c0020a) {
                    objV3 = new z0(ianMainFragment, i2);
                    bVar3.p(objV3);
                }
                gu5 gu5Var5 = (gu5) objV3;
                boolean zX4 = bVar3.x(ianMainFragment);
                Object objV4 = bVar3.v();
                if (zX4 || objV4 == c0020a) {
                    objV4 = new a1(ianMainFragment, 12);
                    bVar3.p(objV4);
                }
                ihb.a(nhbVarG, gu5Var3, gu5Var4, gu5Var5, null, (gu5) objV4, bVar3, 24576);
                break;
        }
        return j6g.a;
    }
}
