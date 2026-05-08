package defpackage;

import defpackage.yh6;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class zh6 extends mj8 implements Function2<yh6.a, yh6.a, j6g> {
    final /* synthetic */ zz8 $loadType;
    final /* synthetic */ qsg $viewportHint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zh6(zz8 zz8Var, qsg qsgVar) {
        super(2);
        this.$loadType = zz8Var;
        this.$viewportHint = qsgVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(yh6.a aVar, yh6.a aVar2) {
        yh6.a aVar3 = aVar;
        yh6.a aVar4 = aVar2;
        aVar3.getClass();
        aVar4.getClass();
        zz8 zz8Var = this.$loadType;
        qsg qsgVar = this.$viewportHint;
        if (zz8Var == zz8.b) {
            aVar3.a = qsgVar;
            if (qsgVar != null) {
                aVar3.b.b(qsgVar);
            }
        } else {
            aVar4.a = qsgVar;
            if (qsgVar != null) {
                aVar4.b.b(qsgVar);
            }
        }
        return j6g.a;
    }
}
