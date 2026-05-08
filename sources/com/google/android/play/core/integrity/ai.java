package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.o8h;
import defpackage.s8h;

/* JADX INFO: loaded from: classes2.dex */
final class ai extends o8h {
    final /* synthetic */ aj a;
    private final s8h b = new s8h("OnRequestIntegrityTokenCallback");
    private final TaskCompletionSource c;

    public ai(aj ajVar, TaskCompletionSource taskCompletionSource) {
        this.a = ajVar;
        this.c = taskCompletionSource;
    }

    @Override // defpackage.p8h
    public final void b(Bundle bundle) {
        this.a.a.d(this.c);
        this.b.b("onRequestIntegrityToken", new Object[0]);
        ApiException apiExceptionA = this.a.f.a(bundle);
        if (apiExceptionA != null) {
            this.c.trySetException(apiExceptionA);
            return;
        }
        String string = bundle.getString("token");
        if (string == null) {
            this.c.trySetException(new IntegrityServiceException(-100, null));
            return;
        }
        ah ahVar = new ah(this, this.a.c, bundle.getLong("request.token.sid"));
        TaskCompletionSource taskCompletionSource = this.c;
        a aVar = new a();
        aVar.b(string);
        aVar.a(ahVar);
        taskCompletionSource.trySetResult(aVar.c());
    }
}
