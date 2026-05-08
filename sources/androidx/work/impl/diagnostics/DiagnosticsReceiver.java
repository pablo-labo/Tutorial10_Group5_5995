package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import defpackage.a2h;
import defpackage.fsa;
import defpackage.q25;
import defpackage.w2h;
import defpackage.z39;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    public static final String a = z39.f("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        z39 z39VarD = z39.d();
        String str = a;
        z39VarD.a(str, "Requesting diagnostics");
        try {
            w2h w2hVarA = w2h.a(context);
            fsa fsaVarA = new fsa.a(DiagnosticsWorker.class).a();
            w2hVarA.getClass();
            List listSingletonList = Collections.singletonList(fsaVarA);
            if (listSingletonList.isEmpty()) {
                throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
            }
            new a2h(w2hVarA, null, q25.b, listSingletonList).R();
        } catch (IllegalStateException e) {
            z39.d().c(str, "WorkManager is not initialized", e);
        }
    }
}
