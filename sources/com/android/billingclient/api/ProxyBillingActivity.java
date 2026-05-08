package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.android.billingclient.api.a;
import com.google.android.apps.common.proguard.UsedByReflection;
import defpackage.hqh;
import defpackage.l5;
import defpackage.l6;
import defpackage.o6i;
import defpackage.ooh;
import defpackage.s7i;
import java.io.IOException;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("PlatformActivityProxy")
public class ProxyBillingActivity extends Activity {
    public ResultReceiver a;
    public boolean b;
    public boolean c;
    public int d;
    public long e;
    public boolean f;

    public final Intent a(s7i s7iVar, long j) {
        Intent intentB = b();
        intentB.putExtra("RESPONSE_CODE", 6);
        intentB.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
        a.C0109a c0109aA = a.a();
        c0109aA.a = 6;
        c0109aA.b = "An internal error occurred.";
        a aVarA = c0109aA.a();
        int i = hqh.a;
        o6i o6iVarA = hqh.a(s7iVar, 2, aVarA, null);
        o6iVarA.getClass();
        try {
            int iZzj = o6iVarA.zzj();
            byte[] bArr = new byte[iZzj];
            Logger logger = com.google.android.gms.internal.play_billing.b.b;
            com.google.android.gms.internal.play_billing.a aVar = new com.google.android.gms.internal.play_billing.a(bArr, iZzj);
            o6iVarA.d(aVar);
            if (aVar.e - aVar.f != 0) {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
            intentB.putExtra("FAILURE_LOGGING_PAYLOAD", bArr);
            intentB.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
            intentB.putExtra("billingClientTransactionId", j);
            intentB.putExtra("wasServiceAutoReconnected", this.f);
            return intentB;
        } catch (IOException e) {
            l6.p(l5.m("Serializing ", o6i.class.getName(), " to a byte array threw an IOException (should never happen)."), e);
            return null;
        }
    }

    public final Intent b() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011a  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onActivityResult(int r8, int r9, android.content.Intent r10) {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.ProxyBillingActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle != null) {
            ooh.c("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.b = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("in_app_message_result_receiver")) {
                this.a = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.c = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            this.d = bundle.getInt("activity_code", 100);
            if (bundle.containsKey("billingClientTransactionId")) {
                this.e = bundle.getLong("billingClientTransactionId");
            }
            if (bundle.containsKey("wasServiceAutoReconnected")) {
                this.f = bundle.getBoolean("wasServiceAutoReconnected");
                return;
            }
            return;
        }
        ooh.c("ProxyBillingActivity", "Launching Play Store billing flow");
        this.d = 100;
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.c = true;
                this.d = 110;
            }
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.a = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
            this.d = 101;
        } else {
            pendingIntent = null;
        }
        if (getIntent().hasExtra("billingClientTransactionId")) {
            this.e = getIntent().getLongExtra("billingClientTransactionId", 0L);
        }
        if (getIntent().hasExtra("wasServiceAutoReconnected")) {
            this.f = getIntent().getBooleanExtra("wasServiceAutoReconnected", false);
        }
        try {
            this.b = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), this.d, new Intent(), 0, 0, 0);
        } catch (IntentSender.SendIntentException e) {
            ooh.e("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e);
            ResultReceiver resultReceiver = this.a;
            if (resultReceiver != null) {
                resultReceiver.send(0, null);
            } else {
                Intent intentA = a(s7i.INTENT_SENDER_EXCEPTION, this.e);
                if (this.c) {
                    intentA.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                }
                sendBroadcast(intentA);
            }
            this.b = false;
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.b) {
            Intent intentB = b();
            intentB.putExtra("RESPONSE_CODE", 1);
            intentB.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            if (this.c) {
                intentB.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            int i = this.d;
            if (i == 110 || i == 100) {
                intentB.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                intentB.putExtra("billingClientTransactionId", this.e);
            }
            sendBroadcast(intentB);
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.a;
        if (resultReceiver != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.b);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.c);
        bundle.putInt("activity_code", this.d);
        bundle.putLong("billingClientTransactionId", this.e);
        bundle.putBoolean("wasServiceAutoReconnected", this.f);
    }
}
