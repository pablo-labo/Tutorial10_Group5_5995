package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.view.Surface;
import androidx.media3.session.legacy.h;
import androidx.media3.session.r;
import androidx.media3.session.s;
import androidx.work.c;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.facebook.react.bridge.Promise;
import defpackage.fpe;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eq2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ eq2(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.b;
                hz8<? extends c.a> hz8Var = (hz8) this.c;
                synchronized (constraintTrackingWorker.b) {
                    try {
                        boolean z = constraintTrackingWorker.c;
                        fbe<c.a> fbeVar = constraintTrackingWorker.d;
                        if (z) {
                            fbeVar.getClass();
                            String str = fq2.a;
                            fbeVar.i(new c.a.b());
                        } else {
                            fbeVar.k(hz8Var);
                        }
                        j6g j6gVar = j6g.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                s sVar = (s) this.b;
                Intent intent = (Intent) this.c;
                r.d dVarE = sVar.e();
                if (dVarE == null) {
                    ComponentName component = intent.getComponent();
                    dVarE = new r.d(new h.b(component != null ? component.getPackageName() : "androidx.media3.session.MediaSessionService", -1, -1), 1008000300, 7, false, null, Bundle.EMPTY);
                }
                if (sVar.q(dVarE, intent)) {
                    return;
                }
                zkd.u("MSessionService", "Ignored unrecognized media button intent.");
                return;
            case 2:
                fpe fpeVar = (fpe) this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.c;
                SurfaceTexture surfaceTexture2 = fpeVar.V;
                Surface surface = fpeVar.W;
                Surface surface2 = new Surface(surfaceTexture);
                fpeVar.V = surfaceTexture;
                fpeVar.W = surface2;
                Iterator<fpe.b> it = fpeVar.a.iterator();
                while (it.hasNext()) {
                    it.next().g(surface2);
                }
                if (surfaceTexture2 != null) {
                    surfaceTexture2.release();
                }
                if (surface != null) {
                    surface.release();
                    return;
                }
                return;
            case 3:
                LinkedList linkedList = (LinkedList) this.b;
                qqf qqfVar = (qqf) this.c;
                Iterator it2 = linkedList.iterator();
                while (it2.hasNext()) {
                    ((nse) it2.next()).k(qqfVar);
                }
                return;
            default:
                ((Promise) this.b).reject("E_OPERATION_ERROR", (String) this.c);
                return;
        }
    }
}
