package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import defpackage.o97;

/* JADX INFO: loaded from: classes3.dex */
public final class as6 implements wu5<ml1, b, Integer, j6g> {
    public final /* synthetic */ Integer V;
    public final /* synthetic */ tjf W;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ float d;
    public final /* synthetic */ o97 e;
    public final /* synthetic */ String f;

    public as6(boolean z, long j, long j2, float f, o97 o97Var, String str, Integer num, tjf tjfVar) {
        this.a = z;
        this.b = j;
        this.c = j2;
        this.d = f;
        this.e = o97Var;
        this.f = str;
        this.V = num;
        this.W = tjfVar;
    }

    @Override // defpackage.wu5
    public final j6g q(ml1 ml1Var, b bVar, Integer num) {
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        o97.a aVar = this.e.c;
        ml1Var.getClass();
        if ((iIntValue & 17) == 16 && bVar2.i()) {
            bVar2.D();
        } else if (this.a) {
            long j = this.b;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            long j2 = this.c;
            e eVarB = androidx.compose.foundation.layout.e.b(e.a.b, Float.intBitsToFloat((int) (j2 >> 32)) + fIntBitsToFloat, Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat((int) (j & 4294967295L)));
            float f = this.d;
            e eVarA = g.a(eVarB, f, f);
            long j3 = aVar.c.c;
            fgd fgdVar = ggd.a;
            y7b y7bVar = new y7b(100.0f);
            e eVarA2 = ti1.a(eVarA, 1.0f, j3, new fgd(y7bVar, y7bVar, y7bVar, y7bVar));
            y7b y7bVar2 = new y7b(100.0f);
            e eVarH = ygg.h(eVarA2, new fgd(y7bVar2, y7bVar2, y7bVar2, y7bVar2));
            String str = this.f;
            e eVarA3 = f.a(eVarH, str.concat("_Notification"));
            o97.a.e eVar = aVar.a;
            i81.a(eVarA3, eVar.e, eVar.f, bh2.c(-265433653, new zr6(this.V, str, this.W), bVar2), bVar2, 3072, 0);
        }
        return j6g.a;
    }
}
