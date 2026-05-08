package com.wlappdebug;

import com.wlappdebug.DebugFlagsActivity;
import defpackage.hn8;
import defpackage.j6g;
import defpackage.mj8;
import defpackage.ub5;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class y extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
    final /* synthetic */ ub5<DebugFlagsActivity.a> $filterResult;
    final /* synthetic */ DebugFlagsActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(ub5<DebugFlagsActivity.a> ub5Var, DebugFlagsActivity debugFlagsActivity) {
        super(2);
        this.$filterResult = ub5Var;
        this.this$0 = debugFlagsActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
        androidx.compose.runtime.b bVar2 = bVar;
        if ((num.intValue() & 11) == 2 && bVar2.i()) {
            bVar2.D();
        } else {
            hn8.a(null, null, null, null, null, null, false, new x(this.$filterResult, this.this$0), bVar2, 0);
        }
        return j6g.a;
    }
}
