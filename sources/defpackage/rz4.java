package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import defpackage.lx5;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rz4 implements Function1 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rz4(long j, String str, String str2) {
        this.c = str;
        this.b = j;
        this.d = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        long j = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                String str = (String) obj2;
                lx5.b bVar = (lx5.b) obj;
                bVar.getClass();
                bVar.a("subTabName", (String) obj3);
                bVar.b("result", Long.valueOf(j));
                bVar.a("elementName", "jobsLoaded");
                if (str != null) {
                    bVar.a("entityData", str);
                }
                break;
            default:
                u2b u2bVar = (u2b) obj3;
                BlurMaskFilter blurMaskFilter = (BlurMaskFilter) obj2;
                gb4 gb4Var = (gb4) obj;
                gb4Var.getClass();
                ww1 ww1VarA = gb4Var.w1().a();
                Paint paintE = u2bVar.e();
                if (!j94.c(4.0f, 0.0f)) {
                    paintE.setMaskFilter(blurMaskFilter);
                }
                paintE.setColor(pnb.P(j));
                float fT1 = gb4Var.t1(0.0f);
                float fT12 = gb4Var.t1(2.0f);
                ww1VarA.t(fT1, fT12, Float.intBitsToFloat((int) (gb4Var.c() >> 32)) + fT1, Float.intBitsToFloat((int) (gb4Var.c() & 4294967295L)) + fT12, u2bVar);
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ rz4(u2b u2bVar, BlurMaskFilter blurMaskFilter, long j) {
        this.c = u2bVar;
        this.d = blurMaskFilter;
        this.b = j;
    }
}
