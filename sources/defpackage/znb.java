package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import defpackage.kv8;
import defpackage.ynb;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lznb;", "Lrr4;", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "Lj6g;", "onActivityPreCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityCreated", "onActivityPaused", "(Landroid/app/Activity;)V", "onActivityStopped", "lifecycle-process_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class znb extends rr4 {
    final /* synthetic */ ynb this$0;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"znb$a", "Lrr4;", "Landroid/app/Activity;", "activity", "Lj6g;", "onActivityPostStarted", "(Landroid/app/Activity;)V", "onActivityPostResumed", "lifecycle-process_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends rr4 {
        final /* synthetic */ ynb this$0;

        public a(ynb ynbVar) {
            this.this$0 = ynbVar;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            ynb ynbVar = this.this$0;
            int i = ynbVar.a + 1;
            ynbVar.a = i;
            if (i == 1 && ynbVar.d) {
                ynbVar.f.f(kv8.a.ON_START);
                ynbVar.d = false;
            }
        }
    }

    public znb(ynb ynbVar) {
        this.this$0 = ynbVar;
    }

    @Override // defpackage.rr4, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        activity.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            int i = u2d.b;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            fragmentFindFragmentByTag.getClass();
            ((u2d) fragmentFindFragmentByTag).a = this.this$0.W;
        }
    }

    @Override // defpackage.rr4, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        ynb ynbVar = this.this$0;
        int i = ynbVar.b - 1;
        ynbVar.b = i;
        if (i == 0) {
            Handler handler = ynbVar.e;
            handler.getClass();
            handler.postDelayed(ynbVar.V, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle savedInstanceState) {
        activity.getClass();
        ynb.a.a(activity, new a(this.this$0));
    }

    @Override // defpackage.rr4, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        ynb ynbVar = this.this$0;
        int i = ynbVar.a - 1;
        ynbVar.a = i;
        if (i == 0 && ynbVar.c) {
            ynbVar.f.f(kv8.a.ON_STOP);
            ynbVar.d = true;
        }
    }
}
