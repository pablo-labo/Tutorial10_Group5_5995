package defpackage;

import androidx.appcompat.widget.Toolbar;
import androidx.media3.session.k;
import androidx.media3.session.z;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.queue.MessageQueueThreadImpl;
import com.facebook.react.common.futures.SimpleSettableFuture;
import com.facebook.react.modules.core.a;
import com.indeed.android.rnprofile.RNProfileScreenModule;
import com.swmansion.rnscreens.b;
import defpackage.j42;
import java.nio.ByteBuffer;
import org.webrtc.EglRenderer;
import org.webrtc.JniCommon;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class z84 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z84(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((a94) obj).a = false;
                return;
            case 1:
                ((EglRenderer) obj).renderFrameOnRenderThread();
                return;
            case 2:
                ((nj) obj).invoke();
                return;
            case 3:
                JniCommon.nativeFreeByteBuffer((ByteBuffer) obj);
                return;
            case 4:
                k kVar = (k) obj;
                z zVar = kVar.H;
                if (zVar != null) {
                    kVar.l1(zVar, z.a.c);
                    return;
                }
                return;
            case 5:
                MessageQueueThreadImpl.Companion.startNewBackgroundThread$lambda$1((SimpleSettableFuture) obj);
                return;
            case 6:
                ((rdb) obj).m.start();
                return;
            case 7:
                RNProfileScreenModule.openResumeUploadFlow$lambda$2((Promise) obj);
                return;
            case 8:
                a aVar = (a) obj;
                synchronized (aVar.b) {
                    if (!aVar.d) {
                        j42.a aVar2 = aVar.a;
                        if (aVar2 == null) {
                            UiThreadUtil.runOnUiThread(new z84(aVar, 8));
                        } else {
                            aVar2.b(aVar.e);
                            aVar.d = true;
                        }
                    }
                    j6g j6gVar = j6g.a;
                }
                return;
            case DatadogLogGenerator.CRASH /* 9 */:
                ((b) obj).g();
                return;
            default:
                ((Toolbar) obj).p();
                return;
        }
    }
}
