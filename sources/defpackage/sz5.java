package defpackage;

import android.content.Intent;
import android.os.ResultReceiver;
import androidx.activity.result.ActivityResult;
import com.android.billingclient.api.ProxyBillingActivityV2;
import java.util.regex.Matcher;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class sz5 implements if3, n8 {
    public final Object a;

    public sz5() {
        this.a = new sxc(100);
    }

    @Override // defpackage.if3
    public Object a(Function2 function2, pu2 pu2Var) {
        return ((yge) this.a).a(new ljb(function2, null), pu2Var);
    }

    public boolean b(CharSequence charSequence, bab babVar) {
        String strA = babVar.a();
        if (strA.length() != 0) {
            Matcher matcher = ((sxc) this.a).a(strA).matcher(charSequence);
            return matcher.lookingAt() && matcher.matches();
        }
        return false;
    }

    @Override // defpackage.n8
    public void c(Object obj) {
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.a;
        ActivityResult activityResult = (ActivityResult) obj;
        Intent intent = activityResult.b;
        int i = ooh.a(intent, "ProxyBillingActivityV2").a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.n0;
        if (resultReceiver != null) {
            resultReceiver.send(i, intent == null ? null : intent.getExtras());
        }
        int i2 = activityResult.a;
        if (i2 != -1 || i != 0) {
            ooh.d("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i2 + " and billing's responseCode: " + i);
        }
        proxyBillingActivityV2.finish();
    }

    @Override // defpackage.if3
    public vi5 getData() {
        return ((yge) this.a).d;
    }

    public /* synthetic */ sz5(Object obj) {
        this.a = obj;
    }
}
