package defpackage;

import android.os.Process;
import androidx.media3.exoplayer.video.g;
import androidx.media3.session.r;
import androidx.media3.session.s;
import androidx.media3.session.t;
import androidx.media3.session.x;
import com.datadog.android.rum.internal.domain.scope.RumRawEvent;
import com.datadog.android.rum.internal.monitor.DatadogRumMonitor;
import com.facebook.react.bridge.BridgeReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.UiThreadUtil;
import defpackage.fmc;
import org.webrtc.EglRenderer;
import org.webrtc.VideoFileRenderer;
import org.webrtc.VideoFrame;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xf3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xf3(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                DatadogRumMonitor.handleEvent$lambda$6((DatadogRumMonitor) this.b, (RumRawEvent) this.c);
                return;
            case 1:
                ((EglRenderer) this.b).lambda$releaseEglSurface$3((Runnable) this.c);
                return;
            case 2:
                ((s) this.b).g.m1((r.d) this.c, Integer.MIN_VALUE, 12, x.o1(new ia(11)));
                return;
            case 3:
                t tVar = (t) this.b;
                vdb vdbVar = (vdb) this.c;
                tVar.k.b(tVar.F(vdbVar));
                tVar.i.s(vdbVar.V().a(17) ? vdbVar.M() : emf.a);
                return;
            case 4:
                fmc fmcVar = (fmc) this.b;
                fmc.c cVar = (fmc.c) this.c;
                ReactMarker.logMarker(ReactMarkerConstants.REACT_CONTEXT_THREAD_END);
                synchronized (fmcVar.s) {
                    while (fmcVar.s.booleanValue()) {
                        try {
                            fmcVar.s.wait();
                        } catch (InterruptedException unused) {
                        }
                        break;
                    }
                    break;
                }
                fmcVar.r = true;
                try {
                    Process.setThreadPriority(-4);
                    ReactMarker.logMarker(ReactMarkerConstants.VM_INIT);
                    BridgeReactContext bridgeReactContextC = fmcVar.c(cVar.a.create(), cVar.b);
                    try {
                        fmcVar.d = null;
                        ReactMarker.logMarker(ReactMarkerConstants.PRE_SETUP_REACT_CONTEXT_START);
                        rx0 rx0Var = new rx0(fmcVar, 8);
                        bridgeReactContextC.runOnNativeModulesQueueThread(new ek9(3, fmcVar, bridgeReactContextC));
                        UiThreadUtil.runOnUiThread(rx0Var);
                        return;
                    } catch (Exception e) {
                        fmcVar.h.handleException(e);
                        return;
                    }
                } catch (Exception e2) {
                    fmcVar.r = false;
                    fmcVar.d = null;
                    fmcVar.h.handleException(e2);
                    return;
                }
            case 5:
                ((VideoFileRenderer) this.b).lambda$onFrame$0((VideoFrame) this.c);
                return;
            default:
                g.a aVar = (g.a) this.b;
                ak3 ak3Var = (ak3) this.c;
                g gVar = aVar.b;
                String str = vjg.a;
                gVar.j(ak3Var);
                return;
        }
    }
}
