package defpackage;

import androidx.compose.runtime.b;
import com.facebook.react.bridge.Promise;
import com.indeed.android.rnprofile.RNProfileFormsModule;
import defpackage.jd6;
import defpackage.vs0;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nn8 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nn8(int i, int i2, vu5 vu5Var, Object obj) {
        this.a = i2;
        this.b = obj;
        this.c = vu5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                jd6.a aVar = (jd6.a) obj4;
                vs0.e eVar = (vs0.e) obj3;
                iy3 iy3Var = (iy3) obj;
                iq2 iq2Var = (iq2) obj2;
                if (iq2.h(iq2Var.a) == Integer.MAX_VALUE) {
                    de7.a("LazyVerticalGrid's width should be bound by parent.");
                }
                int iH = iq2.h(iq2Var.a);
                int[] iArrY1 = z92.y1(aVar.a(iH, iy3Var.x0(eVar.a())));
                int[] iArr = new int[iArrY1.length];
                eVar.b(iy3Var, iH, iArrY1, vl8.a, iArr);
                return new gg1(iArrY1, iArr);
            case 1:
                e8a e8aVar = (e8a) obj4;
                Map map = (Map) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ym7.d(e8aVar, v7a.c(map, j7f.b, bVar), bVar, 0);
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 2:
                ((Integer) obj2).getClass();
                yqb.a((String) obj4, (ah2) obj3, (b) obj, ka2.L(49));
                return j6g.a;
            case 3:
                return RNProfileFormsModule.presentNativeResumeOtherSectionForm$lambda$28$lambda$15((Promise) obj4, (RNProfileFormsModule) obj3, (ps7) obj, (es7) obj2);
            default:
                ((Integer) obj2).getClass();
                hic.a((o18) obj4, (Function1) obj3, (b) obj, ka2.L(1));
                return j6g.a;
        }
    }

    public /* synthetic */ nn8(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
