package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import defpackage.etf;
import defpackage.fhg;
import defpackage.ihg;
import defpackage.j10;
import defpackage.ja;
import defpackage.jnb;
import defpackage.mnb;
import defpackage.v31;

/* JADX INFO: loaded from: classes2.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        etf.b(context);
        if (queryParameter == null) {
            ja.k("Null backendName");
            return;
        }
        jnb jnbVarB = mnb.b(iIntValue);
        byte[] bArrDecode = queryParameter2 != null ? Base64.decode(queryParameter2, 0) : null;
        ihg ihgVar = etf.a().d;
        ihgVar.e.execute(new fhg(ihgVar, new v31(queryParameter, bArrDecode, jnbVarB), i, new j10()));
    }
}
