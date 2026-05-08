package defpackage;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public final class wmi extends c1i {
    public Boolean b;
    public dgh c;
    public Boolean d;

    public final long g(String str, svh<Long> svhVar) {
        if (str == null) {
            return svhVar.a(null).longValue();
        }
        String strC = this.c.c(str, svhVar.a);
        if (TextUtils.isEmpty(strC)) {
            return svhVar.a(null).longValue();
        }
        try {
            return svhVar.a(Long.valueOf(Long.parseLong(strC))).longValue();
        } catch (NumberFormatException unused) {
            return svhVar.a(null).longValue();
        }
    }

    public final String h(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
        } catch (ClassNotFoundException e) {
            zzr().f.a(e, "Could not find SystemProperties class");
            return "";
        } catch (IllegalAccessException e2) {
            zzr().f.a(e2, "Could not access SystemProperties.get()");
            return "";
        } catch (NoSuchMethodException e3) {
            zzr().f.a(e3, "Could not find SystemProperties.get() method");
            return "";
        } catch (InvocationTargetException e4) {
            zzr().f.a(e4, "SystemProperties.get() threw an exception");
            return "";
        }
    }

    public final int i(String str, svh<Integer> svhVar) {
        if (str == null) {
            return svhVar.a(null).intValue();
        }
        String strC = this.c.c(str, svhVar.a);
        if (TextUtils.isEmpty(strC)) {
            return svhVar.a(null).intValue();
        }
        try {
            return svhVar.a(Integer.valueOf(Integer.parseInt(strC))).intValue();
        } catch (NumberFormatException unused) {
            return svhVar.a(null).intValue();
        }
    }

    public final double j(String str, svh<Double> svhVar) {
        if (str == null) {
            return svhVar.a(null).doubleValue();
        }
        String strC = this.c.c(str, svhVar.a);
        if (TextUtils.isEmpty(strC)) {
            return svhVar.a(null).doubleValue();
        }
        try {
            return svhVar.a(Double.valueOf(Double.parseDouble(strC))).doubleValue();
        } catch (NumberFormatException unused) {
            return svhVar.a(null).doubleValue();
        }
    }

    public final boolean k(String str, svh<Boolean> svhVar) {
        if (str == null) {
            return svhVar.a(null).booleanValue();
        }
        String strC = this.c.c(str, svhVar.a);
        return TextUtils.isEmpty(strC) ? svhVar.a(null).booleanValue() : svhVar.a(Boolean.valueOf(Boolean.parseBoolean(strC))).booleanValue();
    }

    public final int l() {
        ((gci) ybi.b.zza()).getClass();
        return (!this.a.V.k(null, djh.K0) || e().l0() < 201500) ? 25 : 100;
    }

    @VisibleForTesting
    public final Boolean m(String str) {
        fib.f(str);
        Bundle bundleT = t();
        if (bundleT == null) {
            zzr().f.b("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (bundleT.containsKey(str)) {
            return Boolean.valueOf(bundleT.getBoolean(str));
        }
        return null;
    }

    public final boolean n(String str, svh<Boolean> svhVar) {
        return k(str, svhVar);
    }

    public final long o() {
        awd awdVar = this.a.f;
        return 29000L;
    }

    public final boolean p() {
        awd awdVar = this.a.f;
        Boolean boolM = m("firebase_analytics_collection_deactivated");
        return boolM != null && boolM.booleanValue();
    }

    public final boolean q(String str) {
        return "1".equals(this.c.c(str, "measurement.event_sampling_enabled"));
    }

    public final Boolean r() {
        this.a.getClass();
        ((lhi) mhi.b.zza()).getClass();
        if (!k(null, djh.B0)) {
            return Boolean.TRUE;
        }
        Boolean boolM = m("google_analytics_automatic_screen_reporting_enabled");
        return Boolean.valueOf(boolM == null || boolM.booleanValue());
    }

    public final boolean s() {
        if (this.b == null) {
            Boolean boolM = m("app_measurement_lite");
            this.b = boolM;
            if (boolM == null) {
                this.b = Boolean.FALSE;
            }
        }
        return this.b.booleanValue() || !this.a.e;
    }

    @VisibleForTesting
    public final Bundle t() {
        i0i i0iVar = this.a;
        try {
            if (i0iVar.a.getPackageManager() == null) {
                zzr().f.b("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoA = a5h.a(i0iVar.a).a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, i0iVar.a.getPackageName());
            if (applicationInfoA != null) {
                return applicationInfoA.metaData;
            }
            zzr().f.b("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            zzr().f.a(e, "Failed to load metadata: Package name not found");
            return null;
        }
    }
}
