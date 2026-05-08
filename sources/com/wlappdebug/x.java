package com.wlappdebug;

import com.wlappdebug.DebugFlagsActivity;
import defpackage.ah2;
import defpackage.j6g;
import defpackage.ls8;
import defpackage.mj8;
import defpackage.nh3;
import defpackage.oh3;
import defpackage.ph3;
import defpackage.qh3;
import defpackage.ub5;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class x extends mj8 implements Function1<ls8, j6g> {
    final /* synthetic */ ub5<DebugFlagsActivity.a> $filterResult;
    final /* synthetic */ DebugFlagsActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(ub5<DebugFlagsActivity.a> ub5Var, DebugFlagsActivity debugFlagsActivity) {
        super(1);
        this.$filterResult = ub5Var;
        this.this$0 = debugFlagsActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(ls8 ls8Var) {
        ls8 ls8Var2 = ls8Var;
        ls8Var2.getClass();
        ub5<DebugFlagsActivity.a> ub5Var = this.$filterResult;
        List<DebugFlagsActivity.a> list = ub5Var.b;
        DebugFlagsActivity debugFlagsActivity = this.this$0;
        nh3 nh3Var = nh3.b;
        int size = list.size();
        w wVar = w.a;
        ls8Var2.c(size, wVar != null ? new oh3(list, wVar) : null, new ph3(list, nh3Var), new ah2(-632812321, new qh3(list, debugFlagsActivity, ub5Var), true));
        return j6g.a;
    }
}
