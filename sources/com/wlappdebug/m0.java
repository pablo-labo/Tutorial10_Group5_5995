package com.wlappdebug;

import com.wlappdebug.DebugProctorActivity;
import defpackage.g4a;
import defpackage.gu5;
import defpackage.j6g;
import defpackage.mj8;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 extends mj8 implements gu5<j6g> {
    final /* synthetic */ DebugProctorActivity.e $editor;
    final /* synthetic */ g4a<Integer> $overrideValue$delegate;
    final /* synthetic */ int $radioValue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(int i, DebugProctorActivity.e eVar, g4a<Integer> g4aVar) {
        super(0);
        this.$radioValue = i;
        this.$editor = eVar;
        this.$overrideValue$delegate = g4aVar;
    }

    @Override // defpackage.gu5
    public final j6g invoke() {
        g4a<Integer> g4aVar = this.$overrideValue$delegate;
        Integer numValueOf = Integer.valueOf(this.$radioValue);
        int i = DebugProctorActivity.t0;
        g4aVar.setValue(numValueOf);
        this.$editor.b = Integer.valueOf(this.$radioValue);
        return j6g.a;
    }
}
