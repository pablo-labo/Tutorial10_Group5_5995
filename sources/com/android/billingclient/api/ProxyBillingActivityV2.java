package com.android.billingclient.api;

import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.activity.ComponentActivity;
import androidx.activity.result.IntentSenderRequest;
import com.google.android.apps.common.proguard.UsedByReflection;
import defpackage.bx1;
import defpackage.e9;
import defpackage.ooh;
import defpackage.sz5;
import defpackage.v;
import defpackage.x8;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("PlatformActivityProxy")
public class ProxyBillingActivityV2 extends ComponentActivity {
    public e9 j0;
    public e9 k0;
    public e9 l0;
    public ResultReceiver m0;
    public ResultReceiver n0;
    public ResultReceiver o0;

    @Override // androidx.activity.ComponentActivity, defpackage.dg2, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.j0 = (e9) t(new x8(), new bx1(this));
        this.k0 = (e9) t(new x8(), new sz5(this));
        this.l0 = (e9) t(new x8(), new v(this));
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.m0 = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
            }
            if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                this.n0 = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
            }
            if (bundle.containsKey("external_offer_flow_result_receiver")) {
                this.o0 = (ResultReceiver) bundle.getParcelable("external_offer_flow_result_receiver");
                return;
            }
            return;
        }
        ooh.c("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.m0 = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            e9 e9Var = this.j0;
            pendingIntent.getClass();
            IntentSender intentSender = pendingIntent.getIntentSender();
            intentSender.getClass();
            e9Var.a(new IntentSenderRequest(intentSender, null, 0, 0));
            return;
        }
        if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.n0 = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            e9 e9Var2 = this.k0;
            pendingIntent2.getClass();
            IntentSender intentSender2 = pendingIntent2.getIntentSender();
            intentSender2.getClass();
            e9Var2.a(new IntentSenderRequest(intentSender2, null, 0, 0));
            return;
        }
        if (getIntent().hasExtra("external_offer_flow_pending_intent")) {
            PendingIntent pendingIntent3 = (PendingIntent) getIntent().getParcelableExtra("external_offer_flow_pending_intent");
            this.o0 = (ResultReceiver) getIntent().getParcelableExtra("external_offer_flow_result_receiver");
            e9 e9Var3 = this.l0;
            pendingIntent3.getClass();
            IntentSender intentSender3 = pendingIntent3.getIntentSender();
            intentSender3.getClass();
            e9Var3.a(new IntentSenderRequest(intentSender3, null, 0, 0));
        }
    }

    @Override // androidx.activity.ComponentActivity, defpackage.dg2, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.m0;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.n0;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
        ResultReceiver resultReceiver3 = this.o0;
        if (resultReceiver3 != null) {
            bundle.putParcelable("external_offer_flow_result_receiver", resultReceiver3);
        }
    }
}
