package defpackage;

import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.Surface;
import androidx.fragment.app.Fragment;
import androidx.media3.session.l;
import androidx.work.c;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import defpackage.f2;
import defpackage.fpe;
import defpackage.z39;
import java.util.Iterator;
import org.webrtc.EglBase10Impl;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dq2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dq2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) obj;
                if (constraintTrackingWorker.d.a instanceof f2.b) {
                    return;
                }
                Object obj2 = constraintTrackingWorker.getInputData().a.get("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                String str = obj2 instanceof String ? (String) obj2 : null;
                z39 z39VarD = z39.d();
                z39VarD.getClass();
                if (str == null || str.length() == 0) {
                    z39VarD.b(fq2.a, "No worker to delegate to.");
                    fbe<c.a> fbeVar = constraintTrackingWorker.d;
                    fbeVar.getClass();
                    fbeVar.i(new c.a.C0078a());
                    return;
                }
                c cVarA = constraintTrackingWorker.getWorkerFactory().a(constraintTrackingWorker.getApplicationContext(), str, constraintTrackingWorker.a);
                constraintTrackingWorker.e = cVarA;
                if (cVarA == null) {
                    z39VarD.a(fq2.a, "No worker to delegate to.");
                    fbe<c.a> fbeVar2 = constraintTrackingWorker.d;
                    fbeVar2.getClass();
                    fbeVar2.i(new c.a.C0078a());
                    return;
                }
                w2h w2hVarA = w2h.a(constraintTrackingWorker.getApplicationContext());
                w2hVarA.getClass();
                s3h s3hVarD = w2hVarA.c.D();
                String string = constraintTrackingWorker.getId().toString();
                string.getClass();
                r3h r3hVarI = s3hVarD.i(string);
                if (r3hVarI == null) {
                    fbe<c.a> fbeVar3 = constraintTrackingWorker.d;
                    fbeVar3.getClass();
                    String str2 = fq2.a;
                    fbeVar3.i(new c.a.C0078a());
                    return;
                }
                uqf uqfVar = w2hVarA.j;
                uqfVar.getClass();
                yd3 yd3Var = new yd3(uqfVar, constraintTrackingWorker);
                yd3Var.d(u63.Z(r3hVarI));
                String string2 = constraintTrackingWorker.getId().toString();
                string2.getClass();
                if (!yd3Var.c(string2)) {
                    z39VarD.a(fq2.a, "Constraints not met for delegate " + str + ". Requesting retry.");
                    fbe<c.a> fbeVar4 = constraintTrackingWorker.d;
                    fbeVar4.getClass();
                    fbeVar4.i(new c.a.b());
                    return;
                }
                z39VarD.a(fq2.a, "Constraints met for delegate ".concat(str));
                try {
                    c cVar = constraintTrackingWorker.e;
                    cVar.getClass();
                    hz8<c.a> hz8VarStartWork = cVar.startWork();
                    hz8VarStartWork.getClass();
                    hz8VarStartWork.a(new eq2(0, constraintTrackingWorker, hz8VarStartWork), constraintTrackingWorker.getBackgroundExecutor());
                    return;
                } catch (Throwable th) {
                    String str3 = fq2.a;
                    String strM = l5.m("Delegated worker ", str, " threw exception in startWork.");
                    if (((z39.a) z39VarD).c <= 3) {
                        Log.d(str3, strM, th);
                    }
                    synchronized (constraintTrackingWorker.b) {
                        try {
                            if (!constraintTrackingWorker.c) {
                                fbe<c.a> fbeVar5 = constraintTrackingWorker.d;
                                fbeVar5.getClass();
                                fbeVar5.i(new c.a.C0078a());
                                return;
                            } else {
                                z39VarD.a(str3, "Constraints were unmet, Retrying.");
                                fbe<c.a> fbeVar6 = constraintTrackingWorker.d;
                                fbeVar6.getClass();
                                fbeVar6.i(new c.a.b());
                                return;
                            }
                        } finally {
                        }
                    }
                }
            case 1:
                ((EglBase10Impl.EglConnection) obj).lambda$new$0();
                return;
            case 2:
                ((Fragment) obj).lambda$performCreateView$0();
                return;
            case 3:
                l lVar = (l) obj;
                if (lVar.k || lVar.i.a.e.a() != null) {
                    return;
                }
                lVar.X0();
                return;
            case 4:
                fpe fpeVar = (fpe) obj;
                Surface surface = fpeVar.W;
                if (surface != null) {
                    Iterator<fpe.b> it = fpeVar.a.iterator();
                    while (it.hasNext()) {
                        it.next().m();
                    }
                }
                SurfaceTexture surfaceTexture = fpeVar.V;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                }
                fpeVar.V = null;
                fpeVar.W = null;
                return;
            default:
                ((z0) obj).invoke();
                return;
        }
    }
}
