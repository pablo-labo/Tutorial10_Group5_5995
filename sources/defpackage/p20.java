package defpackage;

import androidx.activity.result.ActivityResult;
import androidx.media3.session.n;
import androidx.media3.session.z;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.indeed.android.jobsearch.webview.indeedapply.IndeedApplyWebViewFragment;
import defpackage.gdb;
import defpackage.lz8;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class p20 implements im1, n8, lz8.a, wu0, gna, v84, Continuation {
    public final /* synthetic */ Object a;

    public /* synthetic */ p20(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.wu0
    public hz8 apply(Object obj) {
        return n.g((n) this.a, (wu8) obj);
    }

    @Override // defpackage.gna
    public Object b() {
        return ((Constructor) this.a).newInstance(null);
    }

    @Override // defpackage.n8
    public void c(Object obj) {
        IndeedApplyWebViewFragment indeedApplyWebViewFragment = (IndeedApplyWebViewFragment) this.a;
        ActivityResult activityResult = (ActivityResult) obj;
        activityResult.getClass();
        int i = activityResult.a;
        if (i == -1) {
            ((ua6) indeedApplyWebViewFragment.w0.getValue()).b(activityResult.b, new vx0(indeedApplyWebViewFragment, 4), new nv(indeedApplyWebViewFragment, 9));
        } else {
            ArrayList arrayList = lz2.a;
            lz2.b("IndeedApplyWebViewFragment", p6.c(i, "Google SignIn - resultCode "), false, new Throwable(p6.c(i, "Google SignIn - resultCode ")));
        }
    }

    @Override // defpackage.im1
    public void d(hm1 hm1Var) {
        s20 s20Var = (s20) this.a;
        synchronized (s20Var) {
            try {
                if (s20Var.b instanceof r54) {
                    s20Var.c.add(hm1Var);
                }
                s20Var.b.d(hm1Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.v84
    public double f(double d) {
        hrf hrfVar = (hrf) this.a;
        float[] fArr = ya2.a;
        return ya2.c(hrfVar, d);
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        ((gdb.c) obj).v(((z) this.a).i);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        ((CountDownLatch) this.a).countDown();
        return null;
    }
}
