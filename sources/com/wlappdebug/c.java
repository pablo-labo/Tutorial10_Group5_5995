package com.wlappdebug;

import android.view.View;
import com.wlappdebug.DebugActivity;
import defpackage.j6g;
import defpackage.mj8;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends mj8 implements Function1<View, j6g> {
    final /* synthetic */ DebugActivity.a $action;
    final /* synthetic */ DebugActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(DebugActivity.a aVar, DebugActivity debugActivity) {
        super(1);
        this.$action = aVar;
        this.this$0 = debugActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(View view) {
        view.getClass();
        this.$action.getClass();
        throw null;
    }
}
