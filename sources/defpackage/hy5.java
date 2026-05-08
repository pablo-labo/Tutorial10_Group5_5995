package defpackage;

import defpackage.lx5;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class hy5 extends mj8 implements Function1<lx5.b, j6g> {
    final /* synthetic */ String $fromScreenName;
    final /* synthetic */ String $screenName;
    final /* synthetic */ boolean $hasDataSrc = false;
    final /* synthetic */ boolean $hasDataDest = false;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hy5(String str, String str2) {
        super(1);
        this.$fromScreenName = str;
        this.$screenName = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(lx5.b bVar) {
        lx5.b bVar2 = bVar;
        bVar2.getClass();
        bVar2.a("fromScreenName", this.$fromScreenName);
        bVar2.a("screenName", this.$screenName);
        bVar2.c("hasDataSrc", Boolean.valueOf(this.$hasDataSrc));
        bVar2.c("hasDataDest", Boolean.valueOf(this.$hasDataDest));
        return j6g.a;
    }
}
