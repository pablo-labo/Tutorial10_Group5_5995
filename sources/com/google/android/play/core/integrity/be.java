package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.i7h;
import defpackage.t8h;

/* JADX INFO: loaded from: classes2.dex */
final class be extends t8h {
    final /* synthetic */ Context a;
    final /* synthetic */ bn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be(bn bnVar, TaskCompletionSource taskCompletionSource, Context context) {
        super(taskCompletionSource);
        this.a = context;
        this.b = bnVar;
    }

    @Override // defpackage.t8h
    public final void b() {
        this.b.d.trySetResult(Integer.valueOf(i7h.a(this.a)));
    }
}
