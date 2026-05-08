package com.wlappdebug;

import com.wlappdebug.DebugProctorActivity;
import defpackage.g4a;
import defpackage.j6g;
import defpackage.mj8;
import defpackage.zve;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 extends mj8 implements Function1<String, j6g> {
    final /* synthetic */ DebugProctorActivity.e $editor;
    final /* synthetic */ g4a<String> $overridePayloadString$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(DebugProctorActivity.e eVar, g4a<String> g4aVar) {
        super(1);
        this.$editor = eVar;
        this.$overridePayloadString$delegate = g4aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(String str) {
        String str2 = str;
        str2.getClass();
        if (zve.U(str2)) {
            str2 = null;
        }
        g4a<String> g4aVar = this.$overridePayloadString$delegate;
        int i = DebugProctorActivity.t0;
        g4aVar.setValue(str2);
        this.$editor.c = str2;
        return j6g.a;
    }
}
