package defpackage;

import defpackage.lx5;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class rx5 extends mj8 implements Function1<lx5.b, j6g> {
    final /* synthetic */ String $provider = "google";
    final /* synthetic */ boolean $success;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rx5(boolean z) {
        super(1);
        this.$success = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(lx5.b bVar) {
        lx5.b bVar2 = bVar;
        bVar2.getClass();
        bVar2.a("provider", this.$provider);
        bVar2.c("success", Boolean.valueOf(this.$success));
        return j6g.a;
    }
}
