package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.h8h;

/* JADX INFO: loaded from: classes2.dex */
final class bf extends bm {
    final /* synthetic */ long a;
    final /* synthetic */ TaskCompletionSource b;
    final /* synthetic */ bn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf(bn bnVar, TaskCompletionSource taskCompletionSource, int i, long j, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.a = j;
        this.b = taskCompletionSource2;
        this.c = bnVar;
    }

    @Override // defpackage.t8h
    public final void b() {
        if (bn.l(this.c)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        if (bn.k(this.c, 0)) {
            a(new StandardIntegrityException(-14, null));
            return;
        }
        try {
            bn bnVar = this.c;
            ((h8h) bnVar.a.n).u(bn.b(bnVar, this.a, 0), new bl(this.c, this.b));
        } catch (RemoteException e) {
            this.c.b.a(e, "warmUpIntegrityToken(%s)", Long.valueOf(this.a));
            this.b.trySetException(new StandardIntegrityException(-100, e));
        }
    }
}
