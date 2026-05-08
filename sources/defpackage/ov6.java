package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class ov6 implements Function2<b, Integer, j6g> {
    public final /* synthetic */ o97 a;

    public ov6(o97 o97Var) {
        this.a = o97Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        if ((num.intValue() & 3) == 2 && bVar2.i()) {
            bVar2.D();
        } else {
            o97 o97Var = this.a;
            cif.b("XXX-XXX-XXXX", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjf.a(o97Var.j.f, o97Var.c.a.b, 0L, null, null, null, 0L, 0, 0L, null, null, 0, 16777214), bVar2, 0, 0, 65534);
        }
        return j6g.a;
    }
}
