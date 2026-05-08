package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class xv6 implements Function2<b, Integer, j6g> {
    public final /* synthetic */ Float a;
    public final /* synthetic */ e b;
    public final /* synthetic */ float c;
    public final /* synthetic */ String d;
    public final /* synthetic */ e e;
    public final /* synthetic */ long f;

    public xv6(Float f, e eVar, float f2, String str, e eVar2, long j) {
        this.a = f;
        this.b = eVar;
        this.c = f2;
        this.d = str;
        this.e = eVar2;
        this.f = j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        if ((num.intValue() & 3) == 2 && bVar2.i()) {
            bVar2.D();
        } else {
            e eVar = this.e;
            String str = this.d;
            float f = this.c;
            e eVar2 = this.b;
            Float f2 = this.a;
            if (f2 != null) {
                bVar2.L(1160864366);
                float fB = nic.B(f2.floatValue(), 0.0f, 1.0f);
                e eVarO = f.a(g.f(g.h(eVar2, f), 1.0f), str.concat("_DeterminateProgressIndicator")).o(eVar);
                z2c.c(fB, 1, 3072, 0, this.f, da2.h, bVar2, eVarO);
                bVar2.F();
            } else {
                bVar2.L(1161407300);
                e eVarO2 = f.a(g.f(g.h(eVar2, f), 1.0f), str.concat("_IndeterminateProgressIndicator")).o(eVar);
                z2c.d(0.0f, 1, 384, 16, this.f, da2.h, bVar2, eVarO2);
                bVar2.F();
            }
        }
        return j6g.a;
    }
}
