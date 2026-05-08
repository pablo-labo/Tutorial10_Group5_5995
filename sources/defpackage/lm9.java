package defpackage;

import android.util.Pair;
import androidx.media3.exoplayer.i;
import androidx.media3.exoplayer.source.h;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import com.oney.WebRTCModule.WebRTCModule;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lm9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ lm9(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                Pair pair = (Pair) obj3;
                ((i.a) obj4).b.h.x(((Integer) pair.first).intValue(), (h.b) pair.second, (uz8) obj2, (nj9) obj);
                break;
            default:
                ((WebRTCModule) obj4).lambda$mediaStreamTrackApplyConstraints$21((String) obj3, (ReadableMap) obj2, (Promise) obj);
                break;
        }
    }
}
