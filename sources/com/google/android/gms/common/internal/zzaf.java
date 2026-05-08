package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;
import defpackage.fib;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaf extends Exception {
    public final ConnectionResult zza;

    public zzaf(ConnectionResult connectionResult) {
        fib.a("ResolvableConnectionException can only be created with a connection result containing a resolution.", (connectionResult.b == 0 || connectionResult.c == null) ? false : true);
        this.zza = connectionResult;
    }
}
