package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Base64;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.LifecycleEventListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class kmc implements LifecycleEventListener, ActivityEventListener {
    public final WeakReference<gk0> a;

    public kmc(gk0 gk0Var) {
        this.a = new WeakReference<>(gk0Var);
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public final void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        activity.getClass();
        gk0 gk0Var = this.a.get();
        if (gk0Var != null) {
            gk0Var.i.a.b(i, i2, intent);
            dy9 dy9Var = gk0Var.b.c;
            spa spaVar = new spa(i, i2, intent);
            dy9Var.getClass();
            i05 i05Var = i05.V;
            if (dy9Var.a(i05Var, activity, spaVar)) {
                return;
            }
            Iterator<zx9<?>> it = dy9Var.iterator();
            while (it.hasNext()) {
                it.next().d(i05Var, activity, spaVar);
            }
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostDestroy() {
        gk0 gk0Var = this.a.get();
        if (gk0Var != null) {
            Activity activityB = gk0Var.b();
            if (activityB != null) {
                if (!(activityB instanceof wi0)) {
                    Activity activityB2 = gk0Var.b();
                    akb.n(l5.l("Current Activity is of incorrect class, expected AppCompatActivity, received ", activityB2 != null ? activityB2.getLocalClassName() : null));
                    return;
                }
                o9 o9Var = gk0Var.i;
                o9Var.getClass();
                ok0 ok0Var = o9Var.a;
                ok0Var.getClass();
                re3 re3Var = new re3((wi0) activityB);
                ArrayList<String> arrayList = ok0Var.f;
                arrayList.getClass();
                Bundle bundle = re3Var.b;
                bundle.putStringArrayList("launchedKeys", arrayList);
                HashMap map = ok0Var.d;
                map.getClass();
                Pair[] pairArr = (Pair[]) nc9.j0(map).toArray(new Pair[0]);
                bundle.putBundle("keyToRequestCode", aq1.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
                HashMap map2 = ok0Var.h;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map2.entrySet()) {
                    if (ok0Var.f.contains((String) entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Pair[] pairArr2 = (Pair[]) nc9.j0(linkedHashMap).toArray(new Pair[0]);
                bundle.putBundle("keyToParamsForFallbackCallback", aq1.a((Pair[]) Arrays.copyOf(pairArr2, pairArr2.length)));
                Bundle bundle2 = ok0Var.i;
                bundle2.getClass();
                bundle.putBundle("pendingResult", bundle2);
                Random random = ok0Var.b;
                random.getClass();
                bundle.putSerializable("random", random);
                SharedPreferences.Editor editorEdit = re3Var.a.edit();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeBundle(bundle);
                byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                String strEncodeToString = Base64.encodeToString(bArrMarshall, 0);
                strEncodeToString.getClass();
                editorEdit.putString("bundle", strEncodeToString);
                editorEdit.putLong("expire", new Date().getTime() + 300000);
                editorEdit.commit();
            }
            gk0Var.b.c.f(i05.e);
            gk0Var.d = true;
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostPause() {
        gk0 gk0Var = this.a.get();
        if (gk0Var != null) {
            gk0Var.b.c.f(i05.d);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostResume() {
        gk0 gk0Var = this.a.get();
        if (gk0Var != null) {
            ohd ohdVar = gk0Var.b;
            Activity activityB = gk0Var.b();
            if (activityB == null) {
                return;
            }
            if (!(activityB instanceof wi0)) {
                Activity activityB2 = gk0Var.b();
                akb.n(l5.l("Current Activity is of incorrect class, expected AppCompatActivity, received ", activityB2 != null ? activityB2.getLocalClassName() : null));
                return;
            }
            int i = 0;
            if (gk0Var.d) {
                gk0Var.d = false;
                ohdVar.c.j();
            }
            o9 o9Var = gk0Var.i;
            wi0 wi0Var = (wi0) activityB;
            o9Var.getClass();
            zi0 zi0Var = o9Var.c;
            zi0Var.getClass();
            zi0Var.b = new WeakReference<>(wi0Var);
            wi0Var.runOnUiThread(new yi0(i, zi0Var, wi0Var));
            ohdVar.c.f(i05.c);
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        gk0 gk0Var = this.a.get();
        if (gk0Var != null) {
            dy9 dy9Var = gk0Var.b.c;
            dy9Var.getClass();
            i05 i05Var = i05.f;
            if (dy9Var.a(i05Var, intent, null)) {
                return;
            }
            Iterator<zx9<?>> it = dy9Var.iterator();
            while (it.hasNext()) {
                it.next().b.d.get(i05Var);
            }
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public final void onUserLeaveHint(Activity activity) {
        activity.getClass();
        gk0 gk0Var = this.a.get();
        if (gk0Var != null) {
            gk0Var.b.c.f(i05.W);
        }
    }
}
