package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class wy8 implements Function2<b, Integer, j6g> {
    public final /* synthetic */ float a;
    public final /* synthetic */ tjf b;
    public final /* synthetic */ fx8 c;
    public final /* synthetic */ Function2<b, Integer, j6g> d;

    /* JADX WARN: Multi-variable type inference failed */
    public wy8(float f, tjf tjfVar, fx8 fx8Var, Function2<? super b, ? super Integer, j6g> function2) {
        this.a = f;
        this.b = tjfVar;
        this.c = fx8Var;
        this.d = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
            rm2.a(ls2.a.a(Float.valueOf(this.a)), bh2.c(-925826178, new vy8(this.b, this.c, this.d), bVar2), bVar2, 56);
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
