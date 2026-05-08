package defpackage;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.IBinder;
import android.util.LongSparseArray;
import android.view.View;
import android.view.Window;
import androidx.media3.exoplayer.d;
import androidx.media3.exoplayer.e;
import androidx.media3.exoplayer.source.h;
import androidx.media3.session.b;
import androidx.media3.session.f;
import androidx.media3.session.r;
import androidx.media3.session.x;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableMap;
import com.indeed.android.rninterviewprep.RNResumeCoachModule;
import com.oney.WebRTCModule.f;
import defpackage.emf;
import defpackage.m60;
import defpackage.uzg;
import java.util.Arrays;
import java.util.List;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnection;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n60(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.a) {
            case 0:
                m60.b.a((m60) this.b, (LongSparseArray) this.c);
                break;
            case 1:
                ((rpa) this.b).a((wi0) this.c);
                break;
            case 2:
                Context context = (Context) this.b;
                sn2 sn2Var = (sn2) this.c;
                ey0.a = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                sn2Var.d();
                break;
            case 3:
                d dVar = (d) this.b;
                e.C0046e c0046e = (e.C0046e) this.c;
                int i = dVar.I - c0046e.c;
                dVar.I = i;
                boolean z = true;
                if (c0046e.d) {
                    dVar.J = c0046e.e;
                    dVar.K = true;
                }
                if (i == 0) {
                    emf emfVar = c0046e.b.a;
                    if (!dVar.l0.a.p() && emfVar.p()) {
                        dVar.m0 = -1;
                        dVar.n0 = 0L;
                    }
                    if (!emfVar.p()) {
                        List listAsList = Arrays.asList(((xdb) emfVar).l);
                        ka2.q(listAsList.size() == dVar.p.size());
                        for (int i2 = 0; i2 < listAsList.size(); i2++) {
                            ((d.c) dVar.p.get(i2)).c = (emf) listAsList.get(i2);
                        }
                    }
                    long j = -9223372036854775807L;
                    if (dVar.K) {
                        if (c0046e.b.b.equals(dVar.l0.b) && c0046e.b.d == dVar.l0.s) {
                            z = false;
                        }
                        if (z) {
                            if (emfVar.p() || c0046e.b.b.b()) {
                                j = c0046e.b.d;
                            } else {
                                adb adbVar = c0046e.b;
                                h.b bVar = adbVar.b;
                                long j2 = adbVar.d;
                                Object obj = bVar.a;
                                emf.b bVar2 = dVar.o;
                                emfVar.g(obj, bVar2);
                                j = j2 + bVar2.e;
                            }
                        }
                    } else {
                        z = false;
                    }
                    long j3 = j;
                    dVar.K = false;
                    dVar.w1(c0046e.b, 1, z, dVar.J, j3, -1, false);
                }
                break;
            case 4:
                x xVar = (x) this.b;
                f fVar = (f) this.c;
                b<IBinder> bVar3 = xVar.c;
                r.d dVarG = bVar3.g(fVar.asBinder());
                if (dVarG != null) {
                    bVar3.o(dVarG);
                }
                break;
            case 5:
                com.oney.WebRTCModule.f fVar2 = (com.oney.WebRTCModule.f) this.b;
                PeerConnection.PeerConnectionState peerConnectionState = (PeerConnection.PeerConnectionState) this.c;
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putInt("pcId", fVar2.b);
                switch (f.a.a[peerConnectionState.ordinal()]) {
                    case 1:
                        str = "new";
                        break;
                    case 2:
                        str = "connecting";
                        break;
                    case 3:
                        str = "connected";
                        break;
                    case 4:
                        str = "disconnected";
                        break;
                    case 5:
                        str = "failed";
                        break;
                    case 6:
                        str = "closed";
                        break;
                    default:
                        str = null;
                        break;
                }
                writableMapCreateMap.putString("connectionState", str);
                fVar2.i.sendEvent("peerConnectionStateChanged", writableMapCreateMap);
                break;
            case 6:
                RNResumeCoachModule.closeReactFragment$lambda$2((qec) this.b, (Promise) this.c);
                break;
            default:
                Activity activity = (Activity) this.b;
                String str2 = (String) this.c;
                View decorView = activity.getWindow().getDecorView();
                decorView.getClass();
                Window window = activity.getWindow();
                ine ineVar = new ine(decorView);
                int i3 = Build.VERSION.SDK_INT;
                (i3 >= 35 ? new uzg.f(window, ineVar) : i3 >= 30 ? new uzg.d(window, ineVar) : new uzg.c(window, ineVar)).d(str2.equals("dark"));
                break;
        }
    }
}
