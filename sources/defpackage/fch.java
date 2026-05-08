package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.widget.ProgressBar;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class fch implements Runnable {
    public final ach a;
    public final /* synthetic */ kch b;

    public fch(kch kchVar, ach achVar) {
        this.b = kchVar;
        this.a = achVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.a) {
            ConnectionResult connectionResult = this.a.b;
            boolean z = (connectionResult.b == 0 || connectionResult.c == null) ? false : true;
            kch kchVar = this.b;
            if (z) {
                vv8 vv8Var = kchVar.mLifecycleFragment;
                Activity activity = kchVar.getActivity();
                PendingIntent pendingIntent = connectionResult.c;
                fib.i(pendingIntent);
                int i = this.a.a;
                int i2 = GoogleApiActivity.b;
                Intent intent = new Intent(activity, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", pendingIntent);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", false);
                vv8Var.startActivityForResult(intent, 1);
                return;
            }
            if (kchVar.d.a(kchVar.getActivity(), null, connectionResult.b) != null) {
                kch kchVar2 = this.b;
                kchVar2.d.h(kchVar2.getActivity(), kchVar2.mLifecycleFragment, connectionResult.b, this.b);
                return;
            }
            int i3 = connectionResult.b;
            kch kchVar3 = this.b;
            if (i3 != 18) {
                kchVar3.a(connectionResult, this.a.a);
                return;
            }
            na6 na6Var = kchVar3.d;
            Activity activity2 = kchVar3.getActivity();
            na6Var.getClass();
            ProgressBar progressBar = new ProgressBar(activity2, null, R.attr.progressBarStyleLarge);
            progressBar.setIndeterminate(true);
            progressBar.setVisibility(0);
            AlertDialog.Builder builder = new AlertDialog.Builder(activity2);
            builder.setView(progressBar);
            builder.setMessage(fah.b(activity2, 18));
            builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
            AlertDialog alertDialogCreate = builder.create();
            na6.f(activity2, alertDialogCreate, "GooglePlayServicesUpdatingDialog", kchVar3);
            kch kchVar4 = this.b;
            Context applicationContext = kchVar4.getActivity().getApplicationContext();
            kt1 kt1Var = new kt1(this, alertDialogCreate);
            kchVar4.d.getClass();
            IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
            intentFilter.addDataScheme("package");
            dah dahVar = new dah(kt1Var);
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 33) {
                applicationContext.registerReceiver(dahVar, intentFilter, i4 >= 33 ? 2 : 0);
            } else {
                applicationContext.registerReceiver(dahVar, intentFilter);
            }
            dahVar.a = applicationContext;
            if (bb6.b(applicationContext)) {
                return;
            }
            kch kchVar5 = this.b;
            kchVar5.b.set(null);
            och ochVar = ((k9h) kchVar5).f.c0;
            ochVar.sendMessage(ochVar.obtainMessage(3));
            if (alertDialogCreate.isShowing()) {
                alertDialogCreate.dismiss();
            }
            synchronized (dahVar) {
                try {
                    Context context = dahVar.a;
                    if (context != null) {
                        context.unregisterReceiver(dahVar);
                    }
                    dahVar.a = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
