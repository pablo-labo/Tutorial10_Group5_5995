package defpackage;

import android.database.SQLException;
import android.util.Log;
import androidx.media3.session.legacy.c;
import androidx.media3.session.y;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.a;
import com.indeed.android.rnace.RNAceModule;
import com.oney.WebRTCModule.f;
import defpackage.mt3;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import org.webrtc.EglRenderer;
import org.webrtc.PeerConnection;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dt3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dt3(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        int i = this.a;
        String str = null;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                mt3.a aVar = (mt3.a) obj;
                try {
                    ((Runnable) obj2).run();
                    return;
                } catch (Exception e) {
                    aVar.a(e);
                    throw e;
                }
            case 1:
                ((EglRenderer) obj2).lambda$release$0((CountDownLatch) obj);
                return;
            case 2:
                c.h hVar = (c.h) obj;
                try {
                    List list = (List) ((ebe) obj2).get();
                    hVar.c(list == null ? null : y.g(list));
                    return;
                } catch (InterruptedException | CancellationException | ExecutionException e2) {
                    zkd.U("MLSLegacyStub", "Library operation failed", e2);
                    hVar.c(null);
                    return;
                }
            case 3:
                f fVar = (f) obj2;
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putInt("pcId", fVar.b);
                switch (f.a.b[((PeerConnection.IceConnectionState) obj).ordinal()]) {
                    case 1:
                        str = "new";
                        break;
                    case 2:
                        str = "checking";
                        break;
                    case 3:
                        str = "connected";
                        break;
                    case 4:
                        str = "completed";
                        break;
                    case 5:
                        str = "failed";
                        break;
                    case 6:
                        str = "disconnected";
                        break;
                    case 7:
                        str = "closed";
                        break;
                }
                writableMapCreateMap.putString("iceConnectionState", str);
                fVar.i.sendEvent("peerConnectionIceConnectionChanged", writableMapCreateMap);
                return;
            case 4:
                RNAceModule.closeAceResumeCreation$lambda$1((lr5) obj2, (Promise) obj);
                return;
            case 5:
                ((a) obj2).a = ((j42) obj).a();
                return;
            default:
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                try {
                    ysf<v33> ysfVar = ((x2d) obj2).h;
                    jnb jnbVar = jnb.c;
                    if (ysfVar instanceof dtf) {
                        etf.a().d.a(((dtf) ysfVar).a.d(jnbVar), 1);
                    } else {
                        String strConcat = "TRuntime.".concat("ForcedSender");
                        if (Log.isLoggable(strConcat, 5)) {
                            Log.w(strConcat, String.format("Expected instance of `TransportImpl`, got `%s`.", ysfVar));
                        }
                    }
                    break;
                } catch (SQLException unused) {
                }
                countDownLatch.countDown();
                return;
        }
    }
}
