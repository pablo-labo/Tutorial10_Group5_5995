package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class my6 implements Function2<b, Integer, j6g> {
    public final /* synthetic */ wu5<fhd, b, Integer, j6g> a;
    public final /* synthetic */ fv6 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ wu5<fhd, b, Integer, j6g> e;
    public final /* synthetic */ long f;

    public my6(wu5 wu5Var, fv6 fv6Var, String str, String str2, wu5 wu5Var2, long j) {
        this.a = wu5Var;
        this.b = fv6Var;
        this.c = str;
        this.d = str2;
        this.e = wu5Var2;
        this.f = j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2;
        b bVar3 = bVar;
        if ((num.intValue() & 3) == 2 && bVar3.i()) {
            bVar3.D();
        } else {
            wu5<fhd, b, Integer, j6g> wu5Var = this.a;
            ghd ghdVar = ghd.a;
            wu5Var.q(ghdVar, bVar3, 0);
            bVar3.L(520013172);
            String str = this.d;
            if (this.b == null) {
                bVar2 = bVar3;
            } else {
                ev6.b(this.b, null, null, zq6.Sm, this.f, str.concat("_Icon"), bVar3, 3072, 6);
                bVar2 = bVar3;
                j6g j6gVar = j6g.a;
            }
            bVar2.F();
            cif.b(this.c, f.a(e.a.b, str.concat("_Label")), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVar2, 0, 0, 131068);
            this.e.q(ghdVar, bVar2, 0);
        }
        return j6g.a;
    }
}
