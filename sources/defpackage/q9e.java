package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Messenger;
import android.os.Process;
import android.util.Log;
import com.google.firebase.sessions.SessionLifecycleService;
import defpackage.n9e;

/* JADX INFO: loaded from: classes2.dex */
public final class q9e implements p9e {
    public final pf5 a;

    public q9e(pf5 pf5Var) {
        this.a = pf5Var;
    }

    @Override // defpackage.p9e
    public final void a(Messenger messenger, n9e.b bVar) {
        boolean zBindService;
        bVar.getClass();
        pf5 pf5Var = this.a;
        pf5Var.a();
        Context applicationContext = pf5Var.a.getApplicationContext();
        Intent intent = new Intent(applicationContext, (Class<?>) SessionLifecycleService.class);
        Log.d("LifecycleServiceBinder", "Binding service to application.");
        intent.setAction(String.valueOf(Process.myPid()));
        intent.putExtra("ClientCallbackMessenger", messenger);
        try {
            zBindService = applicationContext.bindService(intent, bVar, 65);
        } catch (SecurityException e) {
            Log.w("LifecycleServiceBinder", "Failed to bind session lifecycle service to application.", e);
            zBindService = false;
        }
        if (zBindService) {
            return;
        }
        applicationContext.unbindService(bVar);
        Log.i("LifecycleServiceBinder", "Session lifecycle service binding failed.");
    }
}
