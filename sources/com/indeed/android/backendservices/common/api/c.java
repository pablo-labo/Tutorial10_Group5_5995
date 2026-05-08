package com.indeed.android.backendservices.common.api;

import com.indeed.android.backendservices.common.api.a;
import com.indeed.android.backendservices.common.api.b;
import defpackage.av1;
import defpackage.hsa;
import defpackage.j6g;
import defpackage.jv1;
import defpackage.m6d;
import defpackage.rc6;
import kotlin.jvm.functions.Function2;
import okhttp3.Request;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements jv1<Object> {
    public final /* synthetic */ Function2<ApiError, Request, j6g> a;
    public final /* synthetic */ rc6 b;
    public final /* synthetic */ hsa c;

    public c(Function2 function2, rc6 rc6Var, hsa hsaVar) {
        this.a = function2;
        this.b = rc6Var;
        this.c = hsaVar;
    }

    @Override // defpackage.jv1
    public final void a(av1<Object> av1Var, Throwable th) {
        boolean z = th instanceof Exception;
        hsa hsaVar = this.c;
        rc6 rc6Var = this.b;
        Function2<ApiError, Request, j6g> function2 = this.a;
        if (z) {
            Exception exc = (Exception) th;
            function2.invoke(new ApiError(new a.e(), null, null, exc, 6, null), null);
            rc6Var.invoke(hsaVar.a(exc));
        } else {
            Exception exc2 = new Exception(th);
            function2.invoke(new ApiError(new a.e(), null, null, exc2, 6, null), null);
            rc6Var.invoke(hsaVar.a(exc2));
        }
    }

    @Override // defpackage.jv1
    public final void b(av1<Object> av1Var, m6d<Object> m6dVar) {
        this.b.invoke(b.a.b(this.c, m6dVar, this.a));
    }
}
