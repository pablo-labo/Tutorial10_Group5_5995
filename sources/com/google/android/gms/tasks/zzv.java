package com.google.android.gms.tasks;

import android.app.Activity;
import defpackage.nv8;
import defpackage.vv8;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzv extends nv8 {
    private final List zza;

    private zzv(vv8 vv8Var) {
        super(vv8Var);
        this.zza = new ArrayList();
        this.mLifecycleFragment.c("TaskOnStopCallback", this);
    }

    public static zzv zza(Activity activity) {
        zzv zzvVar;
        vv8 fragment = nv8.getFragment(activity);
        synchronized (fragment) {
            try {
                zzvVar = (zzv) fragment.h(zzv.class, "TaskOnStopCallback");
                if (zzvVar == null) {
                    zzvVar = new zzv(fragment);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzvVar;
    }

    @Override // defpackage.nv8
    public final void onStop() {
        synchronized (this.zza) {
            try {
                Iterator it = this.zza.iterator();
                while (it.hasNext()) {
                    zzq zzqVar = (zzq) ((WeakReference) it.next()).get();
                    if (zzqVar != null) {
                        zzqVar.zzc();
                    }
                }
                this.zza.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzb(zzq zzqVar) {
        synchronized (this.zza) {
            this.zza.add(new WeakReference(zzqVar));
        }
    }
}
