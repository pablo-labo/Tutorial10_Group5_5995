package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class vy6 implements Function2<b, Integer, j6g> {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ zrd c;
    public final /* synthetic */ o97 d;

    public vy6(String str, String str2, zrd zrdVar, o97 o97Var) {
        this.a = str;
        this.b = str2;
        this.c = zrdVar;
        this.d = o97Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        if ((num.intValue() & 3) == 2 && bVar2.i()) {
            bVar2.D();
        } else if (this.a != null) {
            e eVarM = pnb.M(f.a(e.a.b, this.b.concat("_Placeholder")).o(new LayoutWeightElement(1.0f, true)), this.c, false);
            o97 o97Var = this.d;
            cif.b(this.a, eVarM, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, tjf.a(o97Var.j.f, o97Var.c.a.b, 0L, null, null, null, 0L, 0, 0L, null, null, 0, 16777214), bVar2, 0, 3072, 57340);
        }
        return j6g.a;
    }
}
