package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.m8h;
import defpackage.t8h;

/* JADX INFO: loaded from: classes2.dex */
final class ag extends t8h {
    final /* synthetic */ Bundle a;
    final /* synthetic */ Activity b;
    final /* synthetic */ TaskCompletionSource c;
    final /* synthetic */ int d;
    final /* synthetic */ aj e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(aj ajVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i) {
        super(taskCompletionSource);
        this.a = bundle;
        this.b = activity;
        this.c = taskCompletionSource2;
        this.d = i;
        this.e = ajVar;
    }

    @Override // defpackage.t8h
    public final void b() {
        try {
            aj ajVar = this.e;
            ((m8h) ajVar.a.n).g(this.a, ajVar.e.a(this.b, this.c, ajVar.a));
        } catch (RemoteException e) {
            this.e.b.a(e, "requestAndShowDialog(%s)", Integer.valueOf(this.d));
            this.c.trySetException(new IntegrityServiceException(-100, e));
        }
    }
}
