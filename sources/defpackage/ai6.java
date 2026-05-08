package defpackage;

import defpackage.yh6;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ai6 extends mj8 implements Function2<yh6.a, yh6.a, j6g> {
    final /* synthetic */ qsg $viewportHint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai6(qsg qsgVar) {
        super(2);
        this.$viewportHint = qsgVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(yh6.a aVar, yh6.a aVar2) {
        yh6.a aVar3 = aVar;
        yh6.a aVar4 = aVar2;
        aVar3.getClass();
        aVar4.getClass();
        if (pnb.N(this.$viewportHint, aVar3.a, zz8.b)) {
            qsg qsgVar = this.$viewportHint;
            aVar3.a = qsgVar;
            if (qsgVar != null) {
                aVar3.b.b(qsgVar);
            }
        }
        if (pnb.N(this.$viewportHint, aVar4.a, zz8.c)) {
            qsg qsgVar2 = this.$viewportHint;
            aVar4.a = qsgVar2;
            if (qsgVar2 != null) {
                aVar4.b.b(qsgVar2);
            }
        }
        return j6g.a;
    }
}
