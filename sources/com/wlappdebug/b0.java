package com.wlappdebug;

import defpackage.gu5;
import defpackage.j6g;
import defpackage.mj8;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 extends mj8 implements gu5<j6g> {
    final /* synthetic */ gu5<j6g> $onDismiss;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(gu5<j6g> gu5Var) {
        super(0);
        this.$onDismiss = gu5Var;
    }

    @Override // defpackage.gu5
    public final j6g invoke() {
        this.$onDismiss.invoke();
        return j6g.a;
    }
}
