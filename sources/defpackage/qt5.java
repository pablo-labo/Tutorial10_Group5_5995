package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import com.indeed.android.jobsearch.R;
import com.indeed.android.reactnative.nativemodules.RNCoreNativeModule;
import defpackage.o97;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qt5 implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qt5(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ut5 ut5Var = (ut5) obj4;
                b bVar = (b) obj2;
                ((Integer) obj3).getClass();
                ((qd0) obj).getClass();
                String strB = zwc.b();
                String strA = zwc.a("privacypolicy");
                String strA2 = zwc.a("Cookies");
                boolean zX = bVar.x(ut5Var);
                Object objV = bVar.v();
                b.a.C0020a c0020a = b.a.a;
                if (zX || objV == c0020a) {
                    objV = new nv(ut5Var, 8);
                    bVar.p(objV);
                }
                gu5 gu5Var = (gu5) objV;
                boolean zX2 = bVar.x(ut5Var);
                Object objV2 = bVar.v();
                if (zX2 || objV2 == c0020a) {
                    objV2 = new q2(ut5Var, 11);
                    bVar.p(objV2);
                }
                xof.a(strB, strA, strA2, gu5Var, (Function1) objV2, bVar, 0);
                return j6g.a;
            case 1:
                o97 o97Var = (o97) obj4;
                b bVar2 = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((xo8) obj).getClass();
                if (bVar2.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    String strI = ak2.I(R.string.pending_interviews_header, bVar2);
                    o97.g gVar = o97Var.i;
                    o97.h hVar = o97Var.j;
                    e.a aVar = e.a.b;
                    e eVarJ = f.j(aVar, 16.0f, 16.0f, 0.0f, 0.0f, 12);
                    tjf tjfVar = hVar.f;
                    to5 to5Var = o97Var.f.c;
                    long j = eu6.m;
                    cif.b(strI, eVarJ, j, 0L, null, to5Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVar, bVar2, 0, 0, 65496);
                    cif.b(ak2.I(R.string.pending_interviews_sub_header, bVar2), f.j(aVar, 16.0f, 4.0f, 0.0f, 0.0f, 12), j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, hVar.g, bVar2, 0, 0, 65528);
                } else {
                    bVar2.D();
                }
                return j6g.a;
            default:
                return RNCoreNativeModule.onMainContentScrolled$lambda$2((RNCoreNativeModule) obj4, (xj1) obj, ((Boolean) obj2).booleanValue(), (prd) obj3);
        }
    }
}
