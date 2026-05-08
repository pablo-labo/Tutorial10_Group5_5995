package com.android.billingclient.api;

import android.os.Bundle;
import android.os.ResultReceiver;
import defpackage.ooh;

/* JADX INFO: loaded from: classes.dex */
final class zzax extends ResultReceiver {
    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        int i2 = ooh.a;
        if (bundle != null) {
            bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
            bundle.getString("IN_APP_MESSAGE_PURCHASE_TOKEN");
        }
        throw null;
    }
}
