package com.android.billingclient.api;

import android.os.Bundle;
import android.os.ResultReceiver;
import com.android.billingclient.api.a;
import defpackage.hqh;
import defpackage.ooh;
import defpackage.s7i;

/* JADX INFO: loaded from: classes.dex */
final class zzay extends ResultReceiver {
    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        a.C0109a c0109aA = a.a();
        c0109aA.a = i;
        if (i == 0) {
            c0109aA.a();
            throw null;
        }
        if (bundle == null) {
            int i2 = b.a;
            throw null;
        }
        c0109aA.b = ooh.b("BillingClient", bundle);
        int i3 = bundle.getInt("INTERNAL_LOG_ERROR_REASON");
        s7i s7iVarA = i3 != 0 ? s7i.a(i3) : s7i.BILLING_RESULT_RECEIVED_FROM_PHONESKY;
        a aVarA = c0109aA.a();
        String string = bundle.getString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS");
        int i4 = hqh.a;
        hqh.a(s7iVarA, 16, aVarA, string);
        throw null;
    }
}
