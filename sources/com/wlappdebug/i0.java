package com.wlappdebug;

import com.wlappdebug.DebugProctorActivity;
import defpackage.g4a;
import defpackage.j6g;
import defpackage.mj8;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 extends mj8 implements Function1<Boolean, j6g> {
    final /* synthetic */ DebugProctorActivity.e $editor;
    final /* synthetic */ g4a<Integer> $overrideValue$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(DebugProctorActivity.e eVar, g4a<Integer> g4aVar) {
        super(1);
        this.$editor = eVar;
        this.$overrideValue$delegate = g4aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(Boolean bool) {
        if (!bool.booleanValue()) {
            g4a<Integer> g4aVar = this.$overrideValue$delegate;
            int i = DebugProctorActivity.t0;
            g4aVar.setValue(null);
            this.$editor.b = null;
        }
        return j6g.a;
    }
}
