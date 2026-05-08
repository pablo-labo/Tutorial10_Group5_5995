package com.wlappdebug;

import com.wlappdebug.DebugProctorActivity;
import defpackage.hn8;
import defpackage.j6g;
import defpackage.mj8;
import defpackage.ub5;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class s0 extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
    final /* synthetic */ ub5<DebugProctorActivity.e> $filterResult;
    final /* synthetic */ DebugProctorActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(ub5<DebugProctorActivity.e> ub5Var, DebugProctorActivity debugProctorActivity) {
        super(2);
        this.$filterResult = ub5Var;
        this.this$0 = debugProctorActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
        androidx.compose.runtime.b bVar2 = bVar;
        if ((num.intValue() & 11) == 2 && bVar2.i()) {
            bVar2.D();
        } else {
            hn8.a(null, null, null, null, null, null, false, new r0(this.$filterResult, this.this$0), bVar2, 0);
        }
        return j6g.a;
    }
}
