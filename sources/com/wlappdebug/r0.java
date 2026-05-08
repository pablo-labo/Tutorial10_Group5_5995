package com.wlappdebug;

import com.wlappdebug.DebugProctorActivity;
import defpackage.ah2;
import defpackage.bi3;
import defpackage.ci3;
import defpackage.di3;
import defpackage.ei3;
import defpackage.j6g;
import defpackage.ls8;
import defpackage.mj8;
import defpackage.ub5;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class r0 extends mj8 implements Function1<ls8, j6g> {
    final /* synthetic */ ub5<DebugProctorActivity.e> $filterResult;
    final /* synthetic */ DebugProctorActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(ub5<DebugProctorActivity.e> ub5Var, DebugProctorActivity debugProctorActivity) {
        super(1);
        this.$filterResult = ub5Var;
        this.this$0 = debugProctorActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(ls8 ls8Var) {
        ls8 ls8Var2 = ls8Var;
        ls8Var2.getClass();
        ub5<DebugProctorActivity.e> ub5Var = this.$filterResult;
        List<DebugProctorActivity.e> list = ub5Var.b;
        DebugProctorActivity debugProctorActivity = this.this$0;
        bi3 bi3Var = bi3.b;
        int size = list.size();
        q0 q0Var = q0.a;
        ls8Var2.c(size, q0Var != null ? new ci3(list, q0Var) : null, new di3(list, bi3Var), new ah2(-632812321, new ei3(list, debugProctorActivity, ub5Var), true));
        return j6g.a;
    }
}
