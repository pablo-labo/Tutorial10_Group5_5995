package com.google.android.play.core.integrity;

import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.m8h;
import defpackage.t8h;

/* JADX INFO: loaded from: classes2.dex */
final class af extends t8h {
    final /* synthetic */ byte[] a;
    final /* synthetic */ Long b;
    final /* synthetic */ Parcelable c;
    final /* synthetic */ TaskCompletionSource d;
    final /* synthetic */ IntegrityTokenRequest e;
    final /* synthetic */ aj f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af(aj ajVar, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l, Parcelable parcelable, TaskCompletionSource taskCompletionSource2, IntegrityTokenRequest integrityTokenRequest) {
        super(taskCompletionSource);
        this.a = bArr;
        this.b = l;
        this.c = parcelable;
        this.d = taskCompletionSource2;
        this.e = integrityTokenRequest;
        this.f = ajVar;
    }

    @Override // defpackage.t8h
    public final void a(Exception exc) {
        if (exc instanceof com.google.android.play.integrity.internal.af) {
            super.a(new IntegrityServiceException(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // defpackage.t8h
    public final void b() {
        try {
            aj ajVar = this.f;
            ((m8h) ajVar.a.n).o(aj.a(ajVar, this.a, this.b, this.c), new ai(this.f, this.d));
        } catch (RemoteException e) {
            this.f.b.a(e, "requestIntegrityToken(%s)", this.e);
            this.d.trySetException(new IntegrityServiceException(-100, e));
        }
    }
}
