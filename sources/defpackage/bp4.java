package defpackage;

import android.util.Log;
import com.facebook.react.bridge.UiThreadUtil;
import com.oney.WebRTCModule.g;
import defpackage.cdc;
import defpackage.p0f;
import defpackage.s7f;
import java.util.ArrayList;
import java.util.Map;
import org.webrtc.EglThread;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bp4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bp4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((EglThread) obj).lambda$onRenderWindowClose$3();
                return;
            case 1:
                cdc.a aVar = ((cdc) obj).c;
                if (aVar == null || aVar.f != 2) {
                    return;
                }
                aVar.a(false);
                aVar.j();
                return;
            case 2:
                p0f p0fVar = (p0f) obj;
                if (ie7.g0.enableViewRecycling()) {
                    vqg vqgVar = p0fVar.g;
                    int i2 = p0fVar.n;
                    synchronized (vqgVar) {
                        arrayList = new ArrayList(vqgVar.a.values());
                    }
                    uqg uqgVar = new uqg(i2, arrayList);
                    if (UiThreadUtil.isOnUiThread()) {
                        uqgVar.invoke();
                    } else {
                        UiThreadUtil.runOnUiThread(new m50(uqgVar, 6));
                    }
                }
                p0fVar.m = new loe<>();
                for (Map.Entry<Integer, p0f.b> entry : p0fVar.d.entrySet()) {
                    p0fVar.m.g(entry.getKey().intValue(), p0fVar);
                    p0f.g(entry.getValue());
                }
                p0fVar.d = null;
                p0fVar.f = null;
                p0fVar.h = null;
                p0fVar.i = null;
                p0fVar.c = null;
                p0fVar.e.clear();
                s55.f("p0f", "Surface [" + p0fVar.n + "] was stopped on SurfaceMountingManager.");
                return;
            case 3:
                s7f.a aVar2 = (s7f.a) obj;
                if (aVar2.a) {
                    s7f s7fVar = s7f.this;
                    aVar2.a = false;
                    if (aVar2.b) {
                        aVar2.b = false;
                        s7f.g(s7fVar);
                    }
                    if (aVar2.c) {
                        aVar2.c = false;
                        s7f.e(s7fVar);
                        return;
                    }
                    return;
                }
                return;
            default:
                g gVar = (g) obj;
                try {
                    gVar.d0.addSink(gVar.c0);
                    return;
                } catch (Throwable th) {
                    Log.e(g.g0, "Failed to add renderer", th);
                    return;
                }
        }
    }
}
