package defpackage;

import android.os.RemoteException;
import androidx.media3.session.g;
import androidx.media3.session.k;
import com.facebook.react.bridge.ReadableMap;
import com.oney.WebRTCModule.WebRTCModule;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yg9 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yg9(k kVar, hz8 hz8Var, int i) {
        this.c = kVar;
        this.d = hz8Var;
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        x9e x9eVar;
        int i = this.a;
        Object obj = this.d;
        int i2 = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                k kVar = (k) obj2;
                try {
                    x9eVar = (x9e) ((hz8) obj).get();
                    ka2.o(x9eVar, "SessionResult must not be null");
                } catch (InterruptedException e) {
                    e = e;
                    zkd.U("MCImplBase", "Session operation failed", e);
                    x9eVar = new x9e(-1);
                } catch (CancellationException e2) {
                    zkd.U("MCImplBase", "Session operation cancelled", e2);
                    x9eVar = new x9e(1);
                } catch (ExecutionException e3) {
                    e = e3;
                    zkd.U("MCImplBase", "Session operation failed", e);
                    x9eVar = new x9e(-1);
                }
                g gVar = kVar.D;
                if (gVar != null) {
                    try {
                        gVar.g0(kVar.c, i2, x9eVar.b());
                    } catch (RemoteException unused) {
                        zkd.T("MCImplBase", "Error in sending");
                        return;
                    }
                    break;
                }
                break;
            default:
                ((WebRTCModule) obj2).lambda$peerConnectionSetConfiguration$24(i2, (ReadableMap) obj);
                break;
        }
    }

    public /* synthetic */ yg9(WebRTCModule webRTCModule, int i, ReadableMap readableMap) {
        this.c = webRTCModule;
        this.b = i;
        this.d = readableMap;
    }
}
