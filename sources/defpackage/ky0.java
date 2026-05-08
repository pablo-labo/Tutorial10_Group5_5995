package defpackage;

import android.media.session.MediaController;
import android.os.Handler;
import android.os.RemoteException;
import android.util.Log;
import androidx.media3.exoplayer.d;
import androidx.media3.session.l;
import androidx.media3.session.legacy.MediaControllerCompat;
import androidx.media3.session.legacy.MediaSessionCompat;
import androidx.media3.session.legacy.b;
import androidx.media3.session.r;
import androidx.media3.session.s;
import androidx.media3.session.t;
import androidx.media3.session.x;
import com.facebook.react.bridge.Callback;
import com.indeed.android.rnonboarding.RnOnboardingFragment;
import com.indeed.android.rnonboarding.RnOnboardingModule;
import com.oney.WebRTCModule.WebRTCModule;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ky0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ky0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ry0 ry0Var = (ry0) this.b;
                ak3 ak3Var = (ak3) this.c;
                d.a aVar = ry0Var.b;
                String str = vjg.a;
                d.this.s.u0(ak3Var);
                return;
            case 1:
                iz4 iz4Var = (iz4) this.b;
                qx4 qx4Var = (qx4) this.c;
                Iterator<Function1<qx4, j6g>> it = iz4Var.c.iterator();
                while (it.hasNext()) {
                    it.next().invoke(qx4Var);
                }
                return;
            case 2:
                final sg9 sg9Var = (sg9) this.b;
                T t = (T) this.c;
                sg9Var.X = t;
                if (sg9Var.Y) {
                    sg9Var.l(t);
                }
                sg9Var.a(new tm1(3, sg9Var, t), new Executor() { // from class: rg9
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        vjg.T(sg9Var.W, runnable);
                    }
                });
                return;
            case 3:
                l lVar = (l) this.b;
                MediaControllerCompat mediaControllerCompat = new MediaControllerCompat(lVar.a, (MediaSessionCompat.Token) this.c);
                lVar.i = mediaControllerCompat;
                l.b bVar = lVar.e;
                Handler handler = lVar.b.e;
                if (!mediaControllerCompat.b.add(bVar)) {
                    Log.w("MediaControllerCompat", "the callback has already been registered");
                    return;
                }
                if (handler == null) {
                    handler = new Handler();
                }
                bVar.n(handler);
                MediaControllerCompat.MediaControllerImplApi21 mediaControllerImplApi21 = mediaControllerCompat.a;
                MediaController mediaController = mediaControllerImplApi21.a;
                MediaControllerCompat.a.C0061a c0061a = bVar.a;
                c0061a.getClass();
                mediaController.registerCallback(c0061a, handler);
                synchronized (mediaControllerImplApi21.b) {
                    b bVarA = mediaControllerImplApi21.e.a();
                    if (bVarA != null) {
                        MediaControllerCompat.MediaControllerImplApi21.a aVar2 = new MediaControllerCompat.MediaControllerImplApi21.a(bVar);
                        mediaControllerImplApi21.d.put(bVar, aVar2);
                        bVar.c = aVar2;
                        try {
                            bVarA.i1(aVar2);
                            bVar.m(13, null, null);
                        } catch (RemoteException | SecurityException e) {
                            Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                        }
                    } else {
                        bVar.c = null;
                        mediaControllerImplApi21.c.add(bVar);
                    }
                    break;
                }
                return;
            case 4:
                s sVar = (s) this.b;
                r.d dVar = (r.d) this.c;
                x xVar = sVar.g;
                xVar.getClass();
                xVar.m1(dVar, Integer.MIN_VALUE, 1, x.o1(new z65(1, xVar, dVar)));
                return;
            case 5:
                t tVar = (t) this.b;
                tVar.k.b(tVar.F((vdb) this.c));
                return;
            case 6:
                ((kob) this.b).b((r2h) this.c, false);
                return;
            case 7:
                RnOnboardingModule.onCompleteOnboarding$lambda$1((RnOnboardingFragment) this.b, (LinkedHashMap) this.c);
                return;
            default:
                ((WebRTCModule) this.b).lambda$enumerateDevices$12((Callback) this.c);
                return;
        }
    }
}
