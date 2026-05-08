package com.wlappdebug;

import com.wlappdebug.r;
import defpackage.mj8;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends mj8 implements Function1<r.a, CharSequence> {
    final /* synthetic */ DebugActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(DebugActivity debugActivity) {
        super(1);
        this.this$0 = debugActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(r.a aVar) {
        r.a aVar2 = aVar;
        aVar2.getClass();
        ((r.b) this.this$0.s0.getValue()).a(aVar2);
        return "null = null";
    }
}
