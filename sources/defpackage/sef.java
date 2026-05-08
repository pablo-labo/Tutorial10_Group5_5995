package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class sef implements Function2<b, Integer, j6g> {
    public final /* synthetic */ float a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Function2<b, Integer, j6g> c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ long e;

    /* JADX WARN: Multi-variable type inference failed */
    public sef(float f, long j, Function2<? super b, ? super Integer, j6g> function2, boolean z, long j2) {
        this.a = f;
        this.b = j;
        this.c = function2;
        this.d = z;
        this.e = j2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
            jte jteVar = rzf.b;
            tjf tjfVarR = web.r(((nzf) bVar2.M(jteVar)).g, ((nzf) bVar2.M(jteVar)).l, this.a);
            if (this.d) {
                tjfVarR = tjf.a(tjfVarR, this.e, 0L, null, null, null, 0L, 0, 0L, null, null, 0, 16777214);
            }
            nff.b(this.b, tjfVarR, this.c, bVar2, 384, 0);
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
