package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.s8h;

/* JADX INFO: loaded from: classes2.dex */
final class bk extends bi {
    final /* synthetic */ bn c;
    private final s8h d;
    private final long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk(bn bnVar, TaskCompletionSource taskCompletionSource, long j) {
        super(bnVar, taskCompletionSource);
        this.c = bnVar;
        this.d = new s8h("OnRequestIntegrityTokenCallback");
        this.e = j;
    }

    @Override // com.google.android.play.core.integrity.bi, defpackage.j8h
    public final void c(Bundle bundle) {
        super.c(bundle);
        this.d.b("onRequestExpressIntegrityToken", new Object[0]);
        ApiException apiExceptionA = this.c.f.a(bundle);
        if (apiExceptionA != null) {
            this.a.trySetException(apiExceptionA);
            return;
        }
        bj bjVar = new bj(this, this.c.c, bundle.getLong("request.token.sid"));
        TaskCompletionSource taskCompletionSource = this.a;
        b bVar = new b();
        bVar.b(bundle.getString("token"));
        bVar.a(bjVar);
        taskCompletionSource.trySetResult(bVar.c());
    }
}
