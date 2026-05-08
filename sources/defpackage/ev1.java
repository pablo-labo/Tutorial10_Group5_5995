package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.indeed.android.jobsearch.LaunchActivity;
import com.indeed.android.jsmappservices.bridge.BridgeDispatcher;
import com.indeed.android.jsmappservices.bridge.results.CallPhoneNumberResult;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class ev1 {
    public final LaunchActivity a;
    public final AtomicReference<String> b = new AtomicReference<>();
    public final AtomicReference<sm1> c = new AtomicReference<>();
    public final e9 d;

    public ev1(LaunchActivity launchActivity) {
        this.a = launchActivity;
        this.d = (e9) launchActivity.t(new v8(), new u91(this, 1));
    }

    public final void a(BridgeDispatcher.c cVar, String str) {
        str.getClass();
        if (this.a.checkSelfPermission("android.permission.CALL_PHONE") == 0) {
            b(cVar, str);
            return;
        }
        this.c.set(cVar);
        this.b.set(str);
        this.d.a("android.permission.CALL_PHONE");
    }

    public final void b(sm1 sm1Var, String str) {
        try {
            this.a.startActivity(new Intent("android.intent.action.CALL", Uri.fromParts("tel", str, null)));
            sm1Var.a(new CallPhoneNumberResult(true, true));
        } catch (Exception e) {
            ArrayList arrayList = lz2.a;
            lz2.h("CallPhoneHelper", "Error starting call", e, 4);
            sm1Var.a(new CallPhoneNumberResult(true, false));
        }
    }
}
