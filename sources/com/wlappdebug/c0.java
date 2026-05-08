package com.wlappdebug;

import defpackage.g4a;
import defpackage.j6g;
import defpackage.jhf;
import defpackage.mj8;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 extends mj8 implements Function1<jhf, j6g> {
    final /* synthetic */ g4a<jhf> $input$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(g4a<jhf> g4aVar) {
        super(1);
        this.$input$delegate = g4aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(jhf jhfVar) {
        jhf jhfVar2 = jhfVar;
        jhfVar2.getClass();
        g4a<jhf> g4aVar = this.$input$delegate;
        int i = DebugProctorActivity.t0;
        g4aVar.setValue(jhfVar2);
        return j6g.a;
    }
}
