package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class xy6 implements Function2<b, Integer, j6g> {
    public final /* synthetic */ o97 V;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ d3a b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;

    public xy6(boolean z, d3a d3aVar, long j, long j2, long j3, long j4, o97 o97Var) {
        this.a = z;
        this.b = d3aVar;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.V = o97Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        if ((num.intValue() & 3) == 2 && bVar2.i()) {
            bVar2.D();
        } else {
            zdf zdfVarE = owa.e(0L, 0L, 0L, 0L, this.c, this.d, this.e, this.f, 0L, 0L, bVar2, 2147452927);
            o97 o97Var = this.V;
            owa.a.b(true, this.a, this.b, zdfVarE, ggd.a(o97Var.h.b), o97Var.a >= 7 ? 3.0f : 2.0f, 1.0f, bVar2, 14155776, 0);
        }
        return j6g.a;
    }
}
