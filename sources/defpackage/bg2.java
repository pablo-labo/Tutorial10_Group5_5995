package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import androidx.activity.ComponentActivity;
import com.facebook.react.bridge.Promise;
import com.oney.WebRTCModule.WebRTCModule;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bg2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ bg2(Object obj, int i, int i2, Object obj2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.d;
        int i2 = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((ComponentActivity.e) obj2).a(i2, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj));
                break;
            case 1:
                ((WebRTCModule) obj2).lambda$peerConnectionGetStats$34(i2, (Promise) obj);
                break;
            default:
                ((WebRTCModule) obj2).lambda$dataChannelDispose$40(i2, (String) obj);
                break;
        }
    }
}
