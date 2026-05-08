package defpackage;

import defpackage.lx5;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class py5 extends mj8 implements Function1<lx5.b, j6g> {
    final /* synthetic */ Function1<lx5.b, j6g> $extraParams;
    final /* synthetic */ boolean $granted;
    final /* synthetic */ String $permissionName = "WRITE_EXTERNAL_STORAGE";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public py5(boolean z, Function1 function1) {
        super(1);
        this.$granted = z;
        this.$extraParams = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(lx5.b bVar) {
        lx5.b bVar2 = bVar;
        bVar2.getClass();
        bVar2.a("permissionName", this.$permissionName);
        bVar2.c("granted", Boolean.valueOf(this.$granted));
        this.$extraParams.invoke(bVar2);
        return j6g.a;
    }
}
