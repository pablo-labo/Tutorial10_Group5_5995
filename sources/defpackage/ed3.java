package defpackage;

import android.app.job.JobParameters;
import android.media.metrics.PlaybackErrorEvent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.oney.WebRTCModule.b;
import com.oney.WebRTCModule.f;
import org.webrtc.PeerConnection;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ed3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ed3(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                b bVar = (b) obj2;
                b.EnumC0189b enumC0189b = (b.EnumC0189b) obj;
                b.EnumC0189b enumC0189b2 = bVar.d;
                if (enumC0189b != enumC0189b2) {
                    bVar.d = enumC0189b;
                    bVar.c(enumC0189b2);
                    break;
                }
                break;
            case 1:
                int i2 = JobInfoSchedulerService.a;
                ((JobInfoSchedulerService) obj2).jobFinished((JobParameters) obj, false);
                break;
            case 2:
                ((rj9) obj2).d.reportPlaybackErrorEvent((PlaybackErrorEvent) obj);
                break;
            default:
                f fVar = (f) obj2;
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putInt("pcId", fVar.b);
                switch (f.a.d[((PeerConnection.SignalingState) obj).ordinal()]) {
                    case 1:
                        str = "stable";
                        break;
                    case 2:
                        str = "have-local-offer";
                        break;
                    case 3:
                        str = "have-local-pranswer";
                        break;
                    case 4:
                        str = "have-remote-offer";
                        break;
                    case 5:
                        str = "have-remote-pranswer";
                        break;
                    case 6:
                        str = "closed";
                        break;
                    default:
                        str = null;
                        break;
                }
                writableMapCreateMap.putString("signalingState", str);
                fVar.i.sendEvent("peerConnectionSignalingStateChanged", writableMapCreateMap);
                break;
        }
    }
}
