package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.i8h;

/* JADX INFO: loaded from: classes2.dex */
class bi extends i8h {
    final TaskCompletionSource a;
    final /* synthetic */ bn b;

    public bi(bn bnVar, TaskCompletionSource taskCompletionSource) {
        this.b = bnVar;
        this.a = taskCompletionSource;
    }

    @Override // defpackage.j8h
    public final void b(Bundle bundle) {
        this.b.a.d(this.a);
    }

    @Override // defpackage.j8h
    public void c(Bundle bundle) {
        this.b.a.d(this.a);
    }

    @Override // defpackage.j8h
    public final void d(Bundle bundle) {
        this.b.a.d(this.a);
    }

    @Override // defpackage.j8h
    public void e(Bundle bundle) {
        this.b.a.d(this.a);
    }
}
