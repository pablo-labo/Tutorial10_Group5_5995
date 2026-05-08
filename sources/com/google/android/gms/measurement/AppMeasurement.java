package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.Keep;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzae;
import com.google.android.gms.measurement.internal.zzkq;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.a0i;
import defpackage.a6i;
import defpackage.awd;
import defpackage.c8i;
import defpackage.f8i;
import defpackage.fib;
import defpackage.ht0;
import defpackage.i0i;
import defpackage.j7i;
import defpackage.lfh;
import defpackage.m4i;
import defpackage.mxg;
import defpackage.rs3;
import defpackage.x5i;
import defpackage.yei;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class AppMeasurement {
    public static volatile AppMeasurement d;
    public final i0i a;
    public final j7i b;
    public final boolean c;

    public static class ConditionalUserProperty {

        @Keep
        public boolean mActive;

        @Keep
        public String mAppId;

        @Keep
        public long mCreationTimestamp;

        @Keep
        public String mExpiredEventName;

        @Keep
        public Bundle mExpiredEventParams;

        @Keep
        public String mName;

        @Keep
        public String mOrigin;

        @Keep
        public long mTimeToLive;

        @Keep
        public String mTimedOutEventName;

        @Keep
        public Bundle mTimedOutEventParams;

        @Keep
        public String mTriggerEventName;

        @Keep
        public long mTriggerTimeout;

        @Keep
        public String mTriggeredEventName;

        @Keep
        public Bundle mTriggeredEventParams;

        @Keep
        public long mTriggeredTimestamp;

        @Keep
        public Object mValue;

        @VisibleForTesting
        public final Bundle a() {
            Bundle bundle = new Bundle();
            String str = this.mAppId;
            if (str != null) {
                bundle.putString("app_id", str);
            }
            String str2 = this.mOrigin;
            if (str2 != null) {
                bundle.putString("origin", str2);
            }
            String str3 = this.mName;
            if (str3 != null) {
                bundle.putString("name", str3);
            }
            Object obj = this.mValue;
            if (obj != null) {
                mxg.g(bundle, obj);
            }
            String str4 = this.mTriggerEventName;
            if (str4 != null) {
                bundle.putString("trigger_event_name", str4);
            }
            bundle.putLong("trigger_timeout", this.mTriggerTimeout);
            String str5 = this.mTimedOutEventName;
            if (str5 != null) {
                bundle.putString("timed_out_event_name", str5);
            }
            Bundle bundle2 = this.mTimedOutEventParams;
            if (bundle2 != null) {
                bundle.putBundle("timed_out_event_params", bundle2);
            }
            String str6 = this.mTriggeredEventName;
            if (str6 != null) {
                bundle.putString("triggered_event_name", str6);
            }
            Bundle bundle3 = this.mTriggeredEventParams;
            if (bundle3 != null) {
                bundle.putBundle("triggered_event_params", bundle3);
            }
            bundle.putLong("time_to_live", this.mTimeToLive);
            String str7 = this.mExpiredEventName;
            if (str7 != null) {
                bundle.putString("expired_event_name", str7);
            }
            Bundle bundle4 = this.mExpiredEventParams;
            if (bundle4 != null) {
                bundle.putBundle("expired_event_params", bundle4);
            }
            bundle.putLong("creation_timestamp", this.mCreationTimestamp);
            bundle.putBoolean(AppStateModule.APP_STATE_ACTIVE, this.mActive);
            bundle.putLong("triggered_timestamp", this.mTriggeredTimestamp);
            return bundle;
        }
    }

    public AppMeasurement(i0i i0iVar) {
        fib.i(i0iVar);
        this.a = i0iVar;
        this.b = null;
        this.c = false;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Keep
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        if (d == null) {
            synchronized (AppMeasurement.class) {
                try {
                    if (d == null) {
                        j7i j7iVar = (j7i) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                        if (j7iVar != null) {
                            d = new AppMeasurement(j7iVar);
                        } else {
                            d = new AppMeasurement(i0i.b(context, new zzae(0L, 0L, true, null, null, null, null), null));
                        }
                    }
                } finally {
                }
            }
        }
        return d;
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        if (this.c) {
            this.b.zza(str);
            return;
        }
        i0i i0iVar = this.a;
        lfh lfhVarP = i0iVar.p();
        i0iVar.c0.getClass();
        lfhVarP.l(SystemClock.elapsedRealtime(), str);
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (this.c) {
            this.b.b(str, str2, bundle);
            return;
        }
        m4i m4iVar = this.a.e0;
        i0i.h(m4iVar);
        m4iVar.g();
        m4iVar.a.c0.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        fib.f(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        m4iVar.zzq().m(new rs3(1, m4iVar, bundle2));
    }

    @VisibleForTesting
    @Keep
    public void clearConditionalUserPropertyAs(String str, String str2, String str3, Bundle bundle) {
        if (this.c) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        m4i m4iVar = this.a.e0;
        i0i.h(m4iVar);
        fib.f(str);
        m4iVar.a.getClass();
        throw new IllegalStateException("Unexpected call on client side");
    }

    @Keep
    public void endAdUnitExposure(String str) {
        if (this.c) {
            this.b.zzb(str);
            return;
        }
        i0i i0iVar = this.a;
        lfh lfhVarP = i0iVar.p();
        i0iVar.c0.getClass();
        lfhVarP.p(SystemClock.elapsedRealtime(), str);
    }

    @Keep
    public long generateEventId() {
        if (this.c) {
            return this.b.zze();
        }
        yei yeiVar = this.a.a0;
        i0i.c(yeiVar);
        return yeiVar.i0();
    }

    @Keep
    public String getAppInstanceId() {
        if (this.c) {
            return this.b.zzc();
        }
        m4i m4iVar = this.a.e0;
        i0i.h(m4iVar);
        m4iVar.g();
        return m4iVar.V.get();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> listX;
        if (this.c) {
            listX = this.b.c(str, str2);
        } else {
            m4i m4iVar = this.a.e0;
            i0i.h(m4iVar);
            m4iVar.g();
            if (Thread.currentThread() == m4iVar.zzq().c) {
                m4iVar.zzr().f.b("Cannot get conditional user properties from analytics worker thread");
                listX = new ArrayList<>(0);
            } else if (awd.s()) {
                m4iVar.zzr().f.b("Cannot get conditional user properties from main thread");
                listX = new ArrayList<>(0);
            } else {
                AtomicReference atomicReference = new AtomicReference();
                a0i a0iVar = m4iVar.a.Y;
                i0i.i(a0iVar);
                a0iVar.j(atomicReference, 5000L, "get conditional user properties", new a6i(m4iVar, atomicReference, str, str2));
                List list = (List) atomicReference.get();
                if (list == null) {
                    m4iVar.zzr().f.a(null, "Timed out waiting for get conditional user properties");
                    listX = new ArrayList<>();
                } else {
                    listX = yei.X(list);
                }
            }
        }
        ArrayList arrayList = new ArrayList(listX != null ? listX.size() : 0);
        for (Bundle bundle : listX) {
            ConditionalUserProperty conditionalUserProperty = new ConditionalUserProperty();
            fib.i(bundle);
            conditionalUserProperty.mAppId = (String) mxg.f(bundle, "app_id", String.class, null);
            conditionalUserProperty.mOrigin = (String) mxg.f(bundle, "origin", String.class, null);
            conditionalUserProperty.mName = (String) mxg.f(bundle, "name", String.class, null);
            conditionalUserProperty.mValue = mxg.f(bundle, "value", Object.class, null);
            conditionalUserProperty.mTriggerEventName = (String) mxg.f(bundle, "trigger_event_name", String.class, null);
            conditionalUserProperty.mTriggerTimeout = ((Long) mxg.f(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            conditionalUserProperty.mTimedOutEventName = (String) mxg.f(bundle, "timed_out_event_name", String.class, null);
            conditionalUserProperty.mTimedOutEventParams = (Bundle) mxg.f(bundle, "timed_out_event_params", Bundle.class, null);
            conditionalUserProperty.mTriggeredEventName = (String) mxg.f(bundle, "triggered_event_name", String.class, null);
            conditionalUserProperty.mTriggeredEventParams = (Bundle) mxg.f(bundle, "triggered_event_params", Bundle.class, null);
            conditionalUserProperty.mTimeToLive = ((Long) mxg.f(bundle, "time_to_live", Long.class, 0L)).longValue();
            conditionalUserProperty.mExpiredEventName = (String) mxg.f(bundle, "expired_event_name", String.class, null);
            conditionalUserProperty.mExpiredEventParams = (Bundle) mxg.f(bundle, "expired_event_params", Bundle.class, null);
            conditionalUserProperty.mActive = ((Boolean) mxg.f(bundle, AppStateModule.APP_STATE_ACTIVE, Boolean.class, Boolean.FALSE)).booleanValue();
            conditionalUserProperty.mCreationTimestamp = ((Long) mxg.f(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            conditionalUserProperty.mTriggeredTimestamp = ((Long) mxg.f(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(conditionalUserProperty);
        }
        return arrayList;
    }

    @VisibleForTesting
    @Keep
    public List<ConditionalUserProperty> getConditionalUserPropertiesAs(String str, String str2, String str3) {
        if (this.c) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        m4i m4iVar = this.a.e0;
        i0i.h(m4iVar);
        fib.f(str);
        m4iVar.a.getClass();
        throw new IllegalStateException("Unexpected call on client side");
    }

    @Keep
    public String getCurrentScreenClass() {
        if (this.c) {
            return this.b.zzb();
        }
        m4i m4iVar = this.a.e0;
        i0i.h(m4iVar);
        c8i c8iVar = m4iVar.a.d0;
        i0i.h(c8iVar);
        c8iVar.g();
        f8i f8iVar = c8iVar.c;
        if (f8iVar != null) {
            return f8iVar.b;
        }
        return null;
    }

    @Keep
    public String getCurrentScreenName() {
        if (this.c) {
            return this.b.zza();
        }
        m4i m4iVar = this.a.e0;
        i0i.h(m4iVar);
        c8i c8iVar = m4iVar.a.d0;
        i0i.h(c8iVar);
        c8iVar.g();
        f8i f8iVar = c8iVar.c;
        if (f8iVar != null) {
            return f8iVar.a;
        }
        return null;
    }

    @Keep
    public String getGmpAppId() {
        if (this.c) {
            return this.b.zzd();
        }
        m4i m4iVar = this.a.e0;
        i0i.h(m4iVar);
        return m4iVar.w();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        if (this.c) {
            return this.b.e(str);
        }
        i0i.h(this.a.e0);
        fib.f(str);
        return 25;
    }

    @VisibleForTesting
    @Keep
    public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        if (this.c) {
            return this.b.f(str, str2, z);
        }
        m4i m4iVar = this.a.e0;
        i0i.h(m4iVar);
        m4iVar.g();
        if (Thread.currentThread() == m4iVar.zzq().c) {
            m4iVar.zzr().f.b("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        if (awd.s()) {
            m4iVar.zzr().f.b("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        a0i a0iVar = m4iVar.a.Y;
        i0i.i(a0iVar);
        a0iVar.j(atomicReference, 5000L, "get user properties", new x5i(m4iVar, atomicReference, str, str2, z));
        List<zzkq> list = (List) atomicReference.get();
        if (list == null) {
            m4iVar.zzr().f.a(Boolean.valueOf(z), "Timed out waiting for handle get user properties, includeInternal");
            return Collections.EMPTY_MAP;
        }
        ht0 ht0Var = new ht0(list.size());
        for (zzkq zzkqVar : list) {
            ht0Var.put(zzkqVar.b, zzkqVar.s0());
        }
        return ht0Var;
    }

    @VisibleForTesting
    @Keep
    public Map<String, Object> getUserPropertiesAs(String str, String str2, String str3, boolean z) {
        if (this.c) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        m4i m4iVar = this.a.e0;
        i0i.h(m4iVar);
        fib.f(str);
        m4iVar.a.getClass();
        throw new IllegalStateException("Unexpected call on client side");
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        if (this.c) {
            this.b.d(str, str2, bundle);
            return;
        }
        m4i m4iVar = this.a.e0;
        i0i.h(m4iVar);
        m4iVar.r(str, str2, bundle);
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        fib.i(conditionalUserProperty);
        if (this.c) {
            this.b.a(conditionalUserProperty.a());
            return;
        }
        m4i m4iVar = this.a.e0;
        i0i.h(m4iVar);
        Bundle bundleA = conditionalUserProperty.a();
        m4iVar.a.c0.getClass();
        m4iVar.p(bundleA, System.currentTimeMillis());
    }

    @VisibleForTesting
    @Keep
    public void setConditionalUserPropertyAs(ConditionalUserProperty conditionalUserProperty) {
        fib.i(conditionalUserProperty);
        if (this.c) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        m4i m4iVar = this.a.e0;
        i0i.h(m4iVar);
        fib.f(conditionalUserProperty.a().getString("app_id"));
        m4iVar.a.getClass();
        throw new IllegalStateException("Unexpected call on client side");
    }

    public AppMeasurement(j7i j7iVar) {
        this.b = j7iVar;
        this.a = null;
        this.c = true;
    }
}
