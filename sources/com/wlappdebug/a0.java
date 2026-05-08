package com.wlappdebug;

import defpackage.g4a;
import defpackage.gu5;
import defpackage.j6g;
import defpackage.jhf;
import defpackage.mj8;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 extends mj8 implements gu5<j6g> {
    final /* synthetic */ g4a<jhf> $input$delegate;
    final /* synthetic */ Function1<String, j6g> $onPositiveClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(g4a g4aVar, Function1 function1) {
        super(0);
        this.$onPositiveClick = function1;
        this.$input$delegate = g4aVar;
    }

    @Override // defpackage.gu5
    public final j6g invoke() {
        Function1<String, j6g> function1 = this.$onPositiveClick;
        g4a<jhf> g4aVar = this.$input$delegate;
        int i = DebugProctorActivity.t0;
        function1.invoke(g4aVar.getValue().a.b);
        return j6g.a;
    }
}
