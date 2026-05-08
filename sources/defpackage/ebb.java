package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.Looper;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.Pair;
import com.datadog.android.core.internal.CoreFeature;
import com.datadog.android.rum.internal.metric.SessionEndedMetric;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import defpackage.t34;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;

/* JADX INFO: loaded from: classes3.dex */
public final class ebb {
    public final long a;
    public final long b;
    public final t34 c;
    public final List<fbb> d;
    public final gbb e;
    public final Context f;
    public final HashMap g;
    public boolean h;
    public long i;
    public long j;

    public static final class a extends mj8 implements gu5<String> {
        final /* synthetic */ NetworkInfo $networkInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(NetworkInfo networkInfo) {
            super(0);
            this.$networkInfo = networkInfo;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            t34 t34Var = ebb.this.c;
            NetworkInfo networkInfo = this.$networkInfo;
            t34Var.getClass();
            if (networkInfo == null) {
                return "offline";
            }
            String typeName = networkInfo.getTypeName();
            typeName.getClass();
            Locale locale = Locale.getDefault();
            locale.getClass();
            String lowerCase = typeName.toLowerCase(locale);
            lowerCase.getClass();
            return lowerCase.equals("mobile") ? true : lowerCase.equals("wifi") ? lowerCase : "offline";
        }
    }

    public static final class b extends mj8 implements gu5<String> {
        final /* synthetic */ NetworkInfo $networkInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(NetworkInfo networkInfo) {
            super(0);
            this.$networkInfo = networkInfo;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            t34 t34Var = ebb.this.c;
            NetworkInfo networkInfo = this.$networkInfo;
            t34Var.getClass();
            if (networkInfo == null || !wve.E(networkInfo.getTypeName(), "MOBILE", true)) {
                return null;
            }
            return networkInfo.getSubtypeName();
        }
    }

    public static final class c extends mj8 implements gu5<String> {
        final /* synthetic */ Pair<String, Integer> $batteryInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Pair<String, Integer> pair) {
            super(0);
            this.$batteryInfo = pair;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            Pair<String, Integer> pair = this.$batteryInfo;
            if (pair != null) {
                return (String) pair.first;
            }
            return null;
        }
    }

    public static final class d extends mj8 implements gu5<Long> {
        public d() {
            super(0);
        }

        @Override // defpackage.gu5
        public final Long invoke() {
            ebb ebbVar = ebb.this;
            t34 t34Var = ebbVar.c;
            Context context = ebbVar.f;
            t34Var.getClass();
            context.getClass();
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
            }
            return Long.valueOf(memoryInfo.availMem);
        }
    }

    public static final class e extends mj8 implements gu5<Long> {
        public e() {
            super(0);
        }

        @Override // defpackage.gu5
        public final Long invoke() {
            ebb.this.c.getClass();
            return Long.valueOf(new StatFs(Environment.getDataDirectory().getPath()).getFreeBytes());
        }
    }

    public static final class f extends mj8 implements gu5<Boolean> {
        public f() {
            super(0);
        }

        @Override // defpackage.gu5
        public final Boolean invoke() {
            ebb ebbVar = ebb.this;
            t34 t34Var = ebbVar.c;
            Context context = ebbVar.f;
            t34Var.getClass();
            context.getClass();
            return Boolean.valueOf(context.getResources().getConfiguration().orientation == 1);
        }
    }

    public static final class g extends mj8 implements gu5<Integer> {
        final /* synthetic */ Pair<String, Integer> $batteryInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Pair<String, Integer> pair) {
            super(0);
            this.$batteryInfo = pair;
        }

        @Override // defpackage.gu5
        public final Integer invoke() {
            Pair<String, Integer> pair = this.$batteryInfo;
            if (pair != null) {
                return (Integer) pair.second;
            }
            return null;
        }
    }

    public static final class h extends mj8 implements gu5<String> {
        public h() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            ebb.this.c.getClass();
            try {
                return Locale.getDefault().getISO3Language();
            } catch (MissingResourceException unused) {
                return null;
            }
        }
    }

    public static final class i extends mj8 implements gu5<String> {
        public i() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            ebb ebbVar = ebb.this;
            t34 t34Var = ebbVar.c;
            Context context = ebbVar.f;
            t34Var.getClass();
            context.getClass();
            if (!wl7.b(Looper.myLooper(), Looper.getMainLooper())) {
                try {
                    Object[] objArrCopyOf = Arrays.copyOf(new Object[]{context}, 1);
                    Object objInvoke = AdvertisingIdClient.class.getMethod("getAdvertisingIdInfo", (Class[]) Arrays.copyOf(new Class[]{Context.class}, 1)).invoke(null, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                    Object objA = objInvoke != null ? t34.a.a(objInvoke, "isLimitAdTrackingEnabled", new Object[0]) : null;
                    if (wl7.b(objA instanceof Boolean ? (Boolean) objA : null, Boolean.TRUE)) {
                        return "";
                    }
                    Object objA2 = objInvoke != null ? t34.a.a(objInvoke, "getId", new Object[0]) : null;
                    if (objA2 instanceof String) {
                        return (String) objA2;
                    }
                } catch (Exception e) {
                    c49.b("nqf", "Exception getting the Advertising ID: %s", e.toString());
                    return null;
                }
            }
            return null;
        }
    }

    public static final class j extends mj8 implements gu5<String> {
        public j() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            ebb.this.c.getClass();
            return CoreFeature.DEFAULT_SOURCE_NAME;
        }
    }

    public static final class k extends mj8 implements gu5<String> {
        public k() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            ebb.this.c.getClass();
            String str = Build.VERSION.RELEASE;
            str.getClass();
            return str;
        }
    }

    public static final class l extends mj8 implements gu5<String> {
        public l() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            ebb.this.c.getClass();
            String str = Build.MODEL;
            str.getClass();
            return str;
        }
    }

    public static final class m extends mj8 implements gu5<String> {
        public m() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            ebb.this.c.getClass();
            String str = Build.MANUFACTURER;
            str.getClass();
            return str;
        }
    }

    public static final class n extends mj8 implements gu5<String> {
        public n() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            ebb ebbVar = ebb.this;
            t34 t34Var = ebbVar.c;
            Context context = ebbVar.f;
            t34Var.getClass();
            context.getClass();
            Object systemService = context.getSystemService("phone");
            TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
            String networkOperatorName = telephonyManager != null ? telephonyManager.getNetworkOperatorName() : null;
            if (wl7.b(networkOperatorName, "")) {
                return null;
            }
            return networkOperatorName;
        }
    }

    public static final class o extends mj8 implements gu5<Long> {
        public o() {
            super(0);
        }

        @Override // defpackage.gu5
        public final Long invoke() {
            ebb ebbVar = ebb.this;
            t34 t34Var = ebbVar.c;
            Context context = ebbVar.f;
            t34Var.getClass();
            context.getClass();
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
            }
            return Long.valueOf(memoryInfo.totalMem);
        }
    }

    public static final class p extends mj8 implements gu5<Long> {
        public p() {
            super(0);
        }

        @Override // defpackage.gu5
        public final Long invoke() {
            ebb.this.c.getClass();
            return Long.valueOf(new StatFs(Environment.getDataDirectory().getPath()).getTotalBytes());
        }
    }

    public static final class q extends mj8 implements gu5<String> {
        public q() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            ebb ebbVar = ebb.this;
            t34 t34Var = ebbVar.c;
            Context context = ebbVar.f;
            t34Var.getClass();
            context.getClass();
            int i = context.getResources().getDisplayMetrics().widthPixels;
            int i2 = context.getResources().getDisplayMetrics().heightPixels;
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append('x');
            sb.append(i2);
            return sb.toString();
        }
    }

    public static final class r extends mj8 implements gu5<Float> {
        public r() {
            super(0);
        }

        @Override // defpackage.gu5
        public final Float invoke() {
            ebb ebbVar = ebb.this;
            t34 t34Var = ebbVar.c;
            Context context = ebbVar.f;
            t34Var.getClass();
            context.getClass();
            return Float.valueOf(context.getResources().getDisplayMetrics().density);
        }
    }

    public ebb(List list, gbb gbbVar, Context context) {
        t34 t34Var = new t34();
        context.getClass();
        this.a = 1000L;
        this.b = 10000L;
        this.c = t34Var;
        this.d = list;
        this.e = gbbVar;
        this.f = context;
        this.g = new HashMap();
    }

    public final void a() {
        NetworkInfo activeNetworkInfo;
        this.j = System.currentTimeMillis();
        boolean zD = d(fbb.b);
        boolean zD2 = d(fbb.c);
        if (zD || zD2) {
            this.c.getClass();
            Context context = this.f;
            context.getClass();
            Object systemService = context.getSystemService("connectivity");
            NetworkInfo networkInfo = null;
            ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
            if (connectivityManager != null) {
                try {
                    activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                } catch (SecurityException e2) {
                    c49.b("nqf", "Security exception getting NetworkInfo: %s", e2.toString());
                }
            } else {
                activeNetworkInfo = null;
            }
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnected()) {
                    networkInfo = activeNetworkInfo;
                }
            }
            HashMap map = this.g;
            gbb gbbVar = this.e;
            if (zD) {
                gbbVar.getClass();
                yjg.a(new a(networkInfo).invoke(), "networkType", map);
            }
            if (zD2) {
                gbbVar.getClass();
                yjg.a(new b(networkInfo).invoke(), "networkTechnology", map);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ebb.b():void");
    }

    public final void c() {
        Object objA;
        Object objA2;
        Object objA3;
        this.e.getClass();
        new j().invoke();
        HashMap map = this.g;
        yjg.a(CoreFeature.DEFAULT_SOURCE_NAME, "osType", map);
        new k().invoke();
        yjg.a(Build.VERSION.RELEASE, "osVersion", map);
        new l().invoke();
        yjg.a(Build.MODEL, "deviceModel", map);
        new m().invoke();
        yjg.a(Build.MANUFACTURER, "deviceManufacturer", map);
        if (d(fbb.a)) {
            yjg.a(new n().invoke(), "carrier", map);
        }
        if (d(fbb.e)) {
            yjg.a(new o().invoke(), "physicalMemory", map);
        }
        if (d(fbb.Y)) {
            yjg.a(new p().invoke(), "totalStorage", map);
        }
        if (d(fbb.a0)) {
            yjg.a(new q().invoke(), "resolution", map);
        }
        if (d(fbb.b0)) {
            yjg.a(new r().invoke(), "scale", map);
        }
        Pair pair = null;
        if (d(fbb.c0)) {
            String str = (String) new h().invoke();
            yjg.a(str != null ? awe.A0(8, str) : null, "language", map);
        }
        if (d(fbb.d)) {
            yjg.a(new i().invoke(), "androidIdfa", map);
        }
        boolean zD = d(fbb.d0);
        boolean zD2 = d(fbb.e0);
        if (zD || zD2) {
            this.c.getClass();
            Context context = this.f;
            context.getClass();
            if (!wl7.b(Looper.myLooper(), Looper.getMainLooper())) {
                try {
                    Class<?> cls = Class.forName("com.google.android.gms.appset.AppSet");
                    Object[] objArrCopyOf = Arrays.copyOf(new Object[]{context}, 1);
                    Object objInvoke = cls.getMethod("getClient", (Class[]) Arrays.copyOf(new Class[]{Context.class}, 1)).invoke(null, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                    if (objInvoke != null && (objA = t34.a.a(objInvoke, "getAppSetIdInfo", new Object[0])) != null) {
                        Object[] objArrCopyOf2 = Arrays.copyOf(new Object[]{objA}, 1);
                        Object objInvoke2 = Tasks.class.getMethod("await", (Class[]) Arrays.copyOf(new Class[]{Task.class}, 1)).invoke(null, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length));
                        if (objInvoke2 != null && (objA2 = t34.a.a(objInvoke2, "getId", new Object[0])) != null && (objA3 = t34.a.a(objInvoke2, "getScope", new Object[0])) != null) {
                            pair = new Pair((String) objA2, ((Integer) objA3).intValue() == 1 ? SessionEndedMetric.PROCESS_TYPE_VALUE : "developer");
                        }
                    }
                } catch (ClassNotFoundException unused) {
                    c49.a("t34", "AppSetID error: Google Play Services not found", new Object[0]);
                } catch (InvocationTargetException unused2) {
                    c49.a("t34", "AppSetID error: Google Play Services not available", new Object[0]);
                } catch (Exception unused3) {
                    c49.a("t34", "AppSetID error: couldn't connect to Google Play Services", new Object[0]);
                }
            }
            if (zD) {
                yjg.a((String) new cbb(pair).invoke(), "appSetId", map);
            }
            if (zD2) {
                yjg.a((String) new dbb(pair).invoke(), "appSetIdScope", map);
            }
        }
        this.h = true;
    }

    public final boolean d(fbb fbbVar) {
        List<fbb> list = this.d;
        if (list != null) {
            return list.contains(fbbVar);
        }
        return true;
    }
}
