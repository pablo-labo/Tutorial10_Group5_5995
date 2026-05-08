package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import defpackage.fib;
import defpackage.p7d;
import defpackage.vf0;
import vf0.b;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a<R extends p7d, A extends vf0.b> extends BasePendingResult<R> {
    public abstract void i(A a);

    public final void j(Status status) {
        fib.a("Failed result must not be success", !status.s0());
        f(c(status));
    }
}
