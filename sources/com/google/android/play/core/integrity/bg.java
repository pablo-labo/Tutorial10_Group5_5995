package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import defpackage.h8h;

/* JADX INFO: loaded from: classes2.dex */
final class bg extends bm {
    final /* synthetic */ StandardIntegrityManager.StandardIntegrityTokenRequest a;
    final /* synthetic */ long b;
    final /* synthetic */ long c;
    final /* synthetic */ TaskCompletionSource d;
    final /* synthetic */ bn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg(bn bnVar, TaskCompletionSource taskCompletionSource, int i, StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest, long j, long j2, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.a = standardIntegrityTokenRequest;
        this.b = j;
        this.c = j2;
        this.d = taskCompletionSource2;
        this.e = bnVar;
    }

    @Override // defpackage.t8h
    public final void b() {
        if (bn.l(this.e)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        if (bn.k(this.e, 0)) {
            a(new StandardIntegrityException(-14, null));
            return;
        }
        try {
            bn bnVar = this.e;
            ((h8h) bnVar.a.n).T(bn.a(bnVar, this.a, this.b, this.c, 0), new bk(this.e, this.d, this.b));
        } catch (RemoteException e) {
            this.e.b.a(e, "requestExpressIntegrityToken(%s, %s, %s)", this.a.requestHash(), this.a.verdictOptOut(), Long.valueOf(this.b));
            this.d.trySetException(new StandardIntegrityException(-100, e));
        }
    }
}
