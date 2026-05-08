package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import defpackage.drd;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class h8 implements Application.ActivityLifecycleCallbacks {
    public static final a b = new a();
    public static h8 c;
    public Integer a;

    public static final class a {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
        Integer num = this.a;
        if (num == null || num.intValue() != activity.hashCode()) {
            this.a = Integer.valueOf(activity.hashCode());
            c49.a("h8", "Auto screenview occurred - activity has resumed", new Object[0]);
            try {
                drd drdVarA = drd.a.a(activity);
                HashMap map = new HashMap();
                map.put("event", drdVarA);
                lla.b("SnowplowScreenView", map);
            } catch (Exception e) {
                c49.b("h8", "Method onActivityResumed raised an exception: %s", e);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
    }
}
