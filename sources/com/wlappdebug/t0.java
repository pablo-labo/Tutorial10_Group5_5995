package com.wlappdebug;

import com.wlappdebug.DebugProctorActivity;
import defpackage.j6g;
import defpackage.ka2;
import defpackage.mj8;
import defpackage.ub5;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class t0 extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ ub5<DebugProctorActivity.e> $filterResult;
    final /* synthetic */ DebugProctorActivity $tmp0_rcvr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(DebugProctorActivity debugProctorActivity, ub5<DebugProctorActivity.e> ub5Var, int i) {
        super(2);
        this.$tmp0_rcvr = debugProctorActivity;
        this.$filterResult = ub5Var;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
        num.intValue();
        DebugProctorActivity.D(this.$tmp0_rcvr, this.$filterResult, bVar, ka2.L(this.$$changed | 1));
        return j6g.a;
    }
}
