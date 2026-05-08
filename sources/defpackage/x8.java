package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;

/* JADX INFO: loaded from: classes.dex */
public final class x8 extends o8<IntentSenderRequest, ActivityResult> {
    @Override // defpackage.o8
    public final Intent a(Object obj, Context context) {
        IntentSenderRequest intentSenderRequest = (IntentSenderRequest) obj;
        intentSenderRequest.getClass();
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
        intentPutExtra.getClass();
        return intentPutExtra;
    }

    @Override // defpackage.o8
    public final Object c(Intent intent, int i) {
        return new ActivityResult(intent, i);
    }
}
