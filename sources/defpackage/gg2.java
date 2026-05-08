package defpackage;

import androidx.media3.session.s;
import androidx.media3.ui.b;
import com.google.firebase.installations.a;
import com.swmansion.gesturehandler.core.c;
import java.util.concurrent.atomic.AtomicBoolean;
import org.webrtc.EglBase14Impl;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gg2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gg2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                hg2.a((hg2) obj);
                break;
            case 1:
                ((b) obj).f(false);
                break;
            case 2:
                ((EglBase14Impl.EglConnection) obj).lambda$new$0();
                break;
            case 3:
                iq4 iq4Var = (iq4) obj;
                AtomicBoolean atomicBoolean = iq4Var.c;
                if (atomicBoolean.compareAndSet(false, true)) {
                    try {
                        iq4Var.m.b(iq4Var.D, iq4Var.E);
                        iq4Var.a(iq4Var.y.get());
                    } catch (Throwable th) {
                        atomicBoolean.set(false);
                        c49.b(iq4Var.a, "Received error during emission process: %s", th);
                        return;
                    }
                }
                break;
            case 4:
                ((a) obj).b();
                break;
            case 5:
                ((com.swmansion.gesturehandler.core.b) obj).H();
                break;
            case 6:
                ((c) obj).a(false);
                break;
            case 7:
                s sVar = (s) obj;
                s.d dVar = sVar.u;
                if (dVar != null) {
                    sVar.t.x0(dVar);
                }
                break;
            case 8:
                ((rdb) obj).k();
                break;
            default:
                ((gu5) obj).invoke();
                break;
        }
    }
}
