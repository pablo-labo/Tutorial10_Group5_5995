package defpackage;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.graphics.drawable.IconCompat;
import androidx.fragment.app.g;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.errorprone.annotations.RestrictedInheritance;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* JADX INFO: loaded from: classes2.dex */
@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", allowlistAnnotations = {wah.class, ebh.class}, explanation = "Sub classing of GMS Core's APIs are restricted to GMS Core client libs and testing fakes.", link = "go/gmscore-restrictedinheritance")
public final class na6 extends oa6 {
    public static final Object c = new Object();
    public static final na6 d = new na6();

    public static AlertDialog e(Activity activity, int i, mbh mbhVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(fah.b(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        String string = i != 1 ? i != 2 ? i != 3 ? resources.getString(R.string.ok) : resources.getString(com.indeed.android.jobsearch.R.string.common_google_play_services_enable_button) : resources.getString(com.indeed.android.jobsearch.R.string.common_google_play_services_update_button) : resources.getString(com.indeed.android.jobsearch.R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, mbhVar);
        }
        String strC = fah.c(activity, i);
        if (strC != null) {
            builder.setTitle(strC);
        }
        Log.w("GoogleApiAvailability", p6.c(i, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void f(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof g) {
                lr5 lr5VarU = ((g) activity).u();
                mze mzeVar = new mze();
                fib.j(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                mzeVar.f0 = alertDialog;
                if (onCancelListener != null) {
                    mzeVar.g0 = onCancelListener;
                }
                mzeVar.L(lr5VarU, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        lw4 lw4Var = new lw4();
        fib.j(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        lw4Var.a = alertDialog;
        if (onCancelListener != null) {
            lw4Var.b = onCancelListener;
        }
        lw4Var.show(fragmentManager, str);
    }

    @Override // defpackage.oa6
    @ResultIgnorabilityUnspecified
    public final int b(Context context) {
        return c(context, oa6.a);
    }

    @ResultIgnorabilityUnspecified
    public final void d(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        AlertDialog alertDialogE = e(googleApiActivity, i, new tah(super.a(googleApiActivity, "d", i), googleApiActivity), googleApiActivity2);
        if (alertDialogE == null) {
            return;
        }
        f(googleApiActivity, alertDialogE, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    @TargetApi(20)
    public final void g(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        Log.w("GoogleApiAvailability", bg.d(i, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i == 18) {
            new zah(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strE = i == 6 ? fah.e(context, "common_google_play_services_resolution_required_title") : fah.c(context, i);
        if (strE == null) {
            strE = context.getResources().getString(com.indeed.android.jobsearch.R.string.common_google_play_services_notification_ticker);
        }
        String strD = (i == 6 || i == 19) ? fah.d(context, "common_google_play_services_resolution_required_text", fah.a(context)) : fah.b(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        fib.i(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        pla plaVar = new pla(context, null);
        plaVar.o = true;
        plaVar.c(16, true);
        plaVar.e = pla.b(strE);
        ola olaVar = new ola();
        olaVar.b = pla.b(strD);
        plaVar.e(olaVar);
        PackageManager packageManager = context.getPackageManager();
        if (pnb.X == null) {
            pnb.X = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (pnb.X.booleanValue()) {
            plaVar.w.icon = context.getApplicationInfo().icon;
            plaVar.j = 2;
            if (pnb.F(context)) {
                plaVar.b.add(new mla(IconCompat.a(null, "", 2131231049), resources.getString(com.indeed.android.jobsearch.R.string.common_open_on_phone), pendingIntent));
            } else {
                plaVar.g = pendingIntent;
            }
        } else {
            plaVar.w.icon = R.drawable.stat_sys_warning;
            plaVar.w.tickerText = pla.b(resources.getString(com.indeed.android.jobsearch.R.string.common_google_play_services_notification_ticker));
            plaVar.w.when = System.currentTimeMillis();
            plaVar.g = pendingIntent;
            plaVar.f = pla.b(strD);
        }
        synchronized (c) {
        }
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
        String string = context.getResources().getString(com.indeed.android.jobsearch.R.string.common_google_play_services_notification_channel_name);
        if (notificationChannel == null) {
            notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
        } else if (!string.contentEquals(notificationChannel.getName())) {
            notificationChannel.setName(string);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        plaVar.t = "com.google.android.gms.availability";
        Notification notificationA = plaVar.a();
        if (i == 1 || i == 2 || i == 3) {
            bb6.a.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, notificationA);
    }

    @ResultIgnorabilityUnspecified
    public final void h(Activity activity, vv8 vv8Var, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogE = e(activity, i, new hbh(super.a(activity, "d", i), vv8Var), onCancelListener);
        if (alertDialogE == null) {
            return;
        }
        f(activity, alertDialogE, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
