package defpackage;

import android.util.Pair;
import androidx.media3.exoplayer.i;
import androidx.media3.exoplayer.source.h;
import com.facebook.react.bridge.Promise;
import com.oney.WebRTCModule.WebRTCModule;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class km9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ km9(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                Pair pair = (Pair) obj2;
                m20 m20Var = ((i.a) obj3).b.h;
                int iIntValue = ((Integer) pair.first).intValue();
                h.b bVar = (h.b) pair.second;
                bVar.getClass();
                m20Var.G(iIntValue, bVar, (nj9) obj);
                break;
            default:
                ((WebRTCModule) obj3).lambda$mediaStreamTrackSwitchCamera$19((String) obj2, (Promise) obj);
                break;
        }
    }
}
