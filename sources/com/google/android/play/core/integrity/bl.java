package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.s8h;

/* JADX INFO: loaded from: classes2.dex */
final class bl extends bi {
    final /* synthetic */ bn c;
    private final s8h d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super(bnVar, taskCompletionSource);
        this.c = bnVar;
        this.d = new s8h("OnWarmUpIntegrityTokenCallback");
    }

    @Override // com.google.android.play.core.integrity.bi, defpackage.j8h
    public final void e(Bundle bundle) {
        super.e(bundle);
        this.d.b("onWarmUpExpressIntegrityToken", new Object[0]);
        ApiException apiExceptionA = this.c.f.a(bundle);
        TaskCompletionSource taskCompletionSource = this.a;
        if (apiExceptionA != null) {
            taskCompletionSource.trySetException(apiExceptionA);
        } else {
            taskCompletionSource.trySetResult(Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}
