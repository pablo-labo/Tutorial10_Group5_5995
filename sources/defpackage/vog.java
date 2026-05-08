package defpackage;

import com.oney.WebRTCModule.WebRTCModule;
import java.util.HashMap;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicInteger;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* JADX INFO: loaded from: classes3.dex */
public final class vog {
    public static final /* synthetic */ int e = 0;
    public final HashMap a = new HashMap();
    public final Timer b = new Timer("VideoTrackMutedTimer");
    public final int c;
    public final WebRTCModule d;

    public class a implements VideoSink {
        public uog a;
        public volatile boolean b;
        public final AtomicInteger c = new AtomicInteger();
        public boolean d;
        public final String e;

        public a(String str) {
            this.e = str;
        }

        @Override // org.webrtc.VideoSink
        public final void onFrame(VideoFrame videoFrame) {
            this.c.addAndGet(1);
        }
    }

    public vog(WebRTCModule webRTCModule, int i) {
        this.c = i;
        this.d = webRTCModule;
    }
}
