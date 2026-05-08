package defpackage;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.a;
import androidx.fragment.app.g;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class nv8 {
    protected final vv8 mLifecycleFragment;

    public nv8(vv8 vv8Var) {
        this.mLifecycleFragment = vv8Var;
    }

    public static vv8 getFragment(mv8 mv8Var) {
        vfh vfhVar;
        yrh yrhVar;
        Activity activity = mv8Var.a;
        if (!(activity instanceof g)) {
            if (activity == null) {
                l5.q("Can't get fragment for unexpected activity.");
                return null;
            }
            WeakHashMap weakHashMap = vfh.b;
            WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
            if (weakReference != null && (vfhVar = (vfh) weakReference.get()) != null) {
                return vfhVar;
            }
            try {
                vfh vfhVar2 = (vfh) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                if (vfhVar2 == null || vfhVar2.isRemoving()) {
                    vfhVar2 = new vfh();
                    activity.getFragmentManager().beginTransaction().add(vfhVar2, "LifecycleFragmentImpl").commitAllowingStateLoss();
                }
                weakHashMap.put(activity, new WeakReference(vfhVar2));
                return vfhVar2;
            } catch (ClassCastException e) {
                ja.m("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
                return null;
            }
        }
        g gVar = (g) activity;
        WeakHashMap weakHashMap2 = yrh.b;
        lr5 lr5VarU = gVar.u();
        WeakHashMap weakHashMap3 = yrh.b;
        WeakReference weakReference2 = (WeakReference) weakHashMap3.get(gVar);
        if (weakReference2 != null && (yrhVar = (yrh) weakReference2.get()) != null) {
            return yrhVar;
        }
        try {
            yrh yrhVar2 = (yrh) lr5VarU.D("SLifecycleFragmentImpl");
            if (yrhVar2 == null || yrhVar2.isRemoving()) {
                yrhVar2 = new yrh();
                a aVar = new a(lr5VarU);
                aVar.d(0, yrhVar2, "SLifecycleFragmentImpl", 1);
                aVar.h(true);
            }
            weakHashMap3.put(gVar, new WeakReference(yrhVar2));
            return yrhVar2;
        } catch (ClassCastException e2) {
            ja.m("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e2);
            return null;
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity getActivity() {
        Activity activityU = this.mLifecycleFragment.u();
        fib.i(activityU);
        return activityU;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onCreate(Bundle bundle) {
    }

    public void onDestroy() {
    }

    public void onResume() {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    public static vv8 getFragment(Activity activity) {
        return getFragment(new mv8(activity));
    }

    public static vv8 getFragment(ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }
}
