package com.google.android.recaptcha.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import defpackage.oa6;
import defpackage.wl7;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzes {
    private final oa6 zza;

    public zzes() {
        this.zza = oa6.b;
    }

    public static final String zzb(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            if (Build.VERSION.SDK_INT >= 30) {
                String initiatingPackageName = packageManager.getInstallSourceInfo(packageName).getInitiatingPackageName();
                return initiatingPackageName == null ? "" : initiatingPackageName;
            }
            String installerPackageName = packageManager.getInstallerPackageName(packageName);
            return installerPackageName == null ? "" : installerPackageName;
        } catch (Exception unused) {
            return "";
        }
    }

    public static final boolean zzc(Context context) {
        try {
            List<PackageInfo> installedPackages = context.getPackageManager().getInstalledPackages(0);
            if ((installedPackages instanceof Collection) && installedPackages.isEmpty()) {
                return false;
            }
            Iterator<T> it = installedPackages.iterator();
            while (it.hasNext()) {
                if (wl7.b(((PackageInfo) it.next()).packageName, "com.android.vending")) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public final boolean zza(Context context) {
        return zzd(context) == 3;
    }

    public final int zzd(Context context) {
        int iB = this.zza.b(context);
        return (iB == 1 || iB == 3 || iB == 9) ? 4 : 3;
    }

    public zzes(oa6 oa6Var) {
        this.zza = oa6Var;
    }
}
