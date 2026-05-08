package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.util.Pair;
import androidx.media3.exoplayer.drm.a;
import androidx.media3.exoplayer.i;
import androidx.media3.exoplayer.source.h;
import androidx.media3.exoplayer.video.a;
import com.facebook.react.bridge.Promise;
import com.oney.WebRTCModule.WebRTCModule;
import eha.d;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w71(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                z71 z71Var = (z71) obj2;
                if (z71Var.f == 0) {
                    z71Var.b(obj);
                }
                break;
            case 1:
                a.this.g.a((tog) obj);
                break;
            case 2:
                a.C0043a c0043a = (a.C0043a) obj2;
                ((androidx.media3.exoplayer.drm.a) obj).Z(c0043a.a, c0043a.b);
                break;
            case 3:
                Pair pair = (Pair) obj;
                ((i.a) obj2).b.h.Z(((Integer) pair.first).intValue(), (h.b) pair.second);
                break;
            case 4:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                ((Context) obj).registerReceiver(((eha) obj2).new d(), intentFilter);
                break;
            default:
                ((WebRTCModule) obj2).lambda$getAudioDevice$43((Promise) obj);
                break;
        }
    }
}
