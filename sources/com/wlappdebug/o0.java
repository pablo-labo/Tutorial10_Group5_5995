package com.wlappdebug;

import com.wlappdebug.DebugProctorActivity;
import defpackage.g4a;
import defpackage.j6g;
import defpackage.mj8;
import defpackage.vve;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class o0 extends mj8 implements Function1<String, j6g> {
    final /* synthetic */ g4a<Boolean> $customBucketDialogShown$delegate;
    final /* synthetic */ DebugProctorActivity.e $editor;
    final /* synthetic */ g4a<Integer> $overrideValue$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(DebugProctorActivity.e eVar, g4a<Boolean> g4aVar, g4a<Integer> g4aVar2) {
        super(1);
        this.$editor = eVar;
        this.$customBucketDialogShown$delegate = g4aVar;
        this.$overrideValue$delegate = g4aVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(String str) {
        String str2 = str;
        str2.getClass();
        g4a<Boolean> g4aVar = this.$customBucketDialogShown$delegate;
        int i = DebugProctorActivity.t0;
        g4aVar.setValue(Boolean.FALSE);
        Integer numB = vve.B(10, str2);
        if (numB != null) {
            this.$overrideValue$delegate.setValue(numB);
            this.$editor.b = numB;
        }
        return j6g.a;
    }
}
