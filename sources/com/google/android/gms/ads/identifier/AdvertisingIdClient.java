package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.util.VisibleForTesting;
import defpackage.bi1;
import defpackage.bxh;
import defpackage.fib;
import defpackage.oa6;
import defpackage.quh;
import defpackage.r40;
import defpackage.uz;
import defpackage.w0i;
import defpackage.zo2;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class AdvertisingIdClient {
    private final Context mContext;
    private bi1 zze;
    private quh zzf;
    private boolean zzg;
    private final Object zzh;
    private zza zzi;
    private final boolean zzj;
    private final long zzk;

    public static final class Info {
        private final String zzq;
        private final boolean zzr;

        public Info(String str, boolean z) {
            this.zzq = str;
            this.zzr = z;
        }

        public final String getId() {
            return this.zzq;
        }

        public final boolean isLimitAdTrackingEnabled() {
            return this.zzr;
        }

        public final String toString() {
            String str = this.zzq;
            boolean z = this.zzr;
            StringBuilder sb = new StringBuilder(uz.c(7, str));
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    @VisibleForTesting
    public static class zza extends Thread {
        private WeakReference<AdvertisingIdClient> zzm;
        private long zzn;
        CountDownLatch zzo = new CountDownLatch(1);
        boolean zzp = false;

        public zza(AdvertisingIdClient advertisingIdClient, long j) {
            this.zzm = new WeakReference<>(advertisingIdClient);
            this.zzn = j;
            start();
        }

        private final void disconnect() {
            AdvertisingIdClient advertisingIdClient = this.zzm.get();
            if (advertisingIdClient != null) {
                advertisingIdClient.finish();
                this.zzp = true;
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                if (this.zzo.await(this.zzn, TimeUnit.MILLISECONDS)) {
                    return;
                }
                disconnect();
            } catch (InterruptedException unused) {
                disconnect();
            }
        }
    }

    @VisibleForTesting
    private AdvertisingIdClient(Context context, long j, boolean z, boolean z2) {
        Context applicationContext;
        this.zzh = new Object();
        fib.i(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.mContext = context;
        this.zzg = false;
        this.zzk = j;
        this.zzj = z2;
    }

    public static Info getAdvertisingIdInfo(Context context) {
        float f;
        Info info;
        long jElapsedRealtime;
        zzb zzbVar = new zzb(context);
        boolean z = zzbVar.getBoolean("gads:ad_id_app_context:enabled", false);
        float f2 = zzbVar.getFloat("gads:ad_id_app_context:ping_ratio", 0.0f);
        String string = zzbVar.getString("gads:ad_id_use_shared_preference:experiment_id", "");
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, z, zzbVar.getBoolean("gads:ad_id_use_persistent_service:enabled", false));
        try {
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            advertisingIdClient.zza(false);
            info = advertisingIdClient.getInfo();
            jElapsedRealtime = SystemClock.elapsedRealtime() - jElapsedRealtime2;
            f = f2;
        } catch (Throwable th) {
            th = th;
            f = f2;
        }
        try {
            advertisingIdClient.zza(info, z, f, jElapsedRealtime, string, null);
            return info;
        } catch (Throwable th2) {
            th = th2;
            Throwable th3 = th;
            try {
                advertisingIdClient.zza(null, z, f, -1L, string, th3);
                throw th3;
            } finally {
                advertisingIdClient.finish();
            }
        }
    }

    public static boolean getIsAdIdFakeForDebugLogging(Context context) {
        zzb zzbVar = new zzb(context);
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, zzbVar.getBoolean("gads:ad_id_app_context:enabled", false), zzbVar.getBoolean("com.google.android.gms.ads.identifier.service.PERSISTENT_START", false));
        try {
            advertisingIdClient.zza(false);
            return advertisingIdClient.zzb();
        } finally {
            advertisingIdClient.finish();
        }
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean z) {
    }

    @VisibleForTesting
    private final boolean zza(Info info, boolean z, float f, long j, String str, Throwable th) {
        if (Math.random() > f) {
            return false;
        }
        HashMap map = new HashMap();
        map.put("app_context", z ? "1" : "0");
        if (info != null) {
            map.put("limit_ad_tracking", info.isLimitAdTrackingEnabled() ? "1" : "0");
        }
        if (info != null && info.getId() != null) {
            map.put("ad_id_size", Integer.toString(info.getId().length()));
        }
        if (th != null) {
            map.put("error", th.getClass().getName());
        }
        if (str != null && !str.isEmpty()) {
            map.put("experiment_id", str);
        }
        map.put("tag", "AdvertisingIdClient");
        map.put("time_spent", Long.toString(j));
        new com.google.android.gms.ads.identifier.zza(this, map).start();
        return true;
    }

    private final boolean zzb() {
        boolean zZzc;
        fib.h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.zzg) {
                    synchronized (this.zzh) {
                        zza zzaVar = this.zzi;
                        if (zzaVar == null || !zzaVar.zzp) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        zza(false);
                        if (!this.zzg) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                    }
                }
                fib.i(this.zze);
                fib.i(this.zzf);
                try {
                    zZzc = this.zzf.zzc();
                } catch (RemoteException e2) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e2);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zza();
        return zZzc;
    }

    public void finalize() throws Throwable {
        finish();
        super.finalize();
    }

    public final void finish() {
        fib.h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.mContext == null || this.zze == null) {
                    return;
                }
                try {
                    if (this.zzg) {
                        zo2.b().c(this.mContext, this.zze);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.zzg = false;
                this.zzf = null;
                this.zze = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Info getInfo() {
        Info info;
        fib.h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.zzg) {
                    synchronized (this.zzh) {
                        zza zzaVar = this.zzi;
                        if (zzaVar == null || !zzaVar.zzp) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        zza(false);
                        if (!this.zzg) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                    }
                }
                fib.i(this.zze);
                fib.i(this.zzf);
                try {
                    info = new Info(this.zzf.getId(), this.zzf.zzb());
                } catch (RemoteException e2) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e2);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zza();
        return info;
    }

    public void start() {
        zza(true);
    }

    public AdvertisingIdClient(Context context) {
        this(context, 30000L, false, false);
    }

    @VisibleForTesting
    private static quh zza(Context context, bi1 bi1Var) throws IOException {
        try {
            IBinder iBinderA = bi1Var.a();
            int i = bxh.a;
            IInterface iInterfaceQueryLocalInterface = iBinderA.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            return iInterfaceQueryLocalInterface instanceof quh ? (quh) iInterfaceQueryLocalInterface : new w0i(iBinderA);
        } catch (InterruptedException unused) {
            r40.h("Interrupted exception");
            return null;
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    private final void zza() {
        synchronized (this.zzh) {
            zza zzaVar = this.zzi;
            if (zzaVar != null) {
                zzaVar.zzo.countDown();
                try {
                    this.zzi.join();
                } catch (InterruptedException unused) {
                }
            }
            if (this.zzk > 0) {
                this.zzi = new zza(this, this.zzk);
            }
        }
    }

    @VisibleForTesting
    private final void zza(boolean z) {
        fib.h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.zzg) {
                    finish();
                }
                bi1 bi1VarZza = zza(this.mContext, this.zzj);
                this.zze = bi1VarZza;
                this.zzf = zza(this.mContext, bi1VarZza);
                this.zzg = true;
                if (z) {
                    zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static bi1 zza(Context context, boolean z) throws GooglePlayServicesNotAvailableException, IOException {
        String str;
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            int iC = oa6.b.c(context, 12451000);
            if (iC == 0 || iC == 2) {
                String str2 = z ? "com.google.android.gms.ads.identifier.service.PERSISTENT_START" : "com.google.android.gms.ads.identifier.service.START";
                bi1 bi1Var = new bi1();
                Intent intent = new Intent(str2);
                intent.setPackage("com.google.android.gms");
                try {
                    if (zo2.b().a(context, intent, bi1Var, 1)) {
                        return bi1Var;
                    }
                    str = "Connection failure";
                } catch (Throwable th) {
                    throw new IOException(th);
                }
            } else {
                str = "Google Play services not available";
            }
            r40.h(str);
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            throw new GooglePlayServicesNotAvailableException();
        }
    }
}
