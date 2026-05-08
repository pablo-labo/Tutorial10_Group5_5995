package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.h7h;
import defpackage.h8h;

/* JADX INFO: loaded from: classes2.dex */
final class bh extends bm {
    final /* synthetic */ Bundle a;
    final /* synthetic */ Activity b;
    final /* synthetic */ TaskCompletionSource c;
    final /* synthetic */ int d;
    final /* synthetic */ bn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh(bn bnVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i) {
        super(bnVar, taskCompletionSource);
        this.a = bundle;
        this.b = activity;
        this.c = taskCompletionSource2;
        this.d = i;
        this.e = bnVar;
    }

    @Override // defpackage.t8h
    public final void b() {
        if (bn.l(this.e)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.e;
            h7h h7hVar = bnVar.a;
            ((h8h) h7hVar.n).g(this.a, bnVar.e.a(this.b, this.c, h7hVar));
        } catch (RemoteException e) {
            this.e.b.a(e, "requestAndShowDialog(%s)", Integer.valueOf(this.d));
            this.c.trySetException(new StandardIntegrityException(-100, e));
        }
    }
}
