package defpackage;

import android.net.Uri;
import android.util.Log;
import androidx.media3.exoplayer.d;
import androidx.media3.session.l;
import androidx.media3.session.r;
import androidx.media3.session.s;
import androidx.media3.session.t;
import androidx.media3.session.z;
import com.canhub.cropper.CropImageActivity;
import com.canhub.cropper.CropImageView;
import com.datadog.android.core.internal.metrics.BatchMetricsDispatcher;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.material.navigation.NavigationBarView;
import com.oney.WebRTCModule.e;
import defpackage.gdb;
import defpackage.lz8;
import defpackage.wr3;
import defpackage.z71;
import java.util.ArrayList;
import java.util.Iterator;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import org.webrtc.VideoSource;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class r20 implements wr3.a, n8, z71.a, e.b, lz8.a, s.e, t.g, v84, NavigationBarView.b, c7g, Continuation, VideoSink {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r20(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.c7g
    public Object a() {
        throw new IllegalArgumentException(m6.f((Class) this.b, "Cannot allocate "));
    }

    @Override // z71.a
    public void b(Object obj, Object obj2) {
        d dVar = (d) this.b;
        ((Integer) obj).getClass();
        Integer num = (Integer) obj2;
        final int iIntValue = num.intValue();
        dVar.y1();
        dVar.p1(num, 1, 10);
        dVar.p1(num, 2, 10);
        dVar.m.f(21, new lz8.a() { // from class: h35
            @Override // lz8.a
            public final void invoke(Object obj3) {
                ((gdb.c) obj3).r(iIntValue);
            }
        });
    }

    @Override // defpackage.n8
    public void c(Object obj) {
        CropImageActivity cropImageActivity = (CropImageActivity) this.b;
        Uri uri = (Uri) obj;
        int i = CropImageActivity.x0;
        if (uri == null) {
            cropImageActivity.D();
            return;
        }
        cropImageActivity.q0 = uri;
        CropImageView cropImageView = cropImageActivity.s0;
        if (cropImageView != null) {
            cropImageView.setImageUriAsync(uri);
        }
    }

    @Override // androidx.media3.session.t.g
    public void d(r.d dVar) {
        ((t) this.b).g.t.G0();
    }

    @Override // com.oney.WebRTCModule.e.b
    public void e(String str, ArrayList arrayList) {
        e eVar = (e) this.b;
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("streamId", str);
        if (arrayList.size() == 0) {
            eVar.e.reject(new RuntimeException("No ScreenTrackInfo found."));
        } else {
            writableMapCreateMap.putMap(BatchMetricsDispatcher.TRACK_KEY, (ReadableMap) arrayList.get(0));
            eVar.e.resolve(writableMapCreateMap);
        }
    }

    @Override // defpackage.v84
    public double f(double d) {
        hrf hrfVar = (hrf) this.b;
        double d2 = hrfVar.b;
        double d3 = hrfVar.c;
        double d4 = hrfVar.d;
        return d >= hrfVar.e ? Math.pow((d2 * d) + d3, hrfVar.a) + hrfVar.f : (d4 * d) + hrfVar.g;
    }

    @Override // androidx.media3.session.s.e
    public void i(r.c cVar, int i) {
        cVar.h(i, (gdb.a) this.b);
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 6:
                ((gdb.c) obj).W(((z) obj2).n);
                break;
            default:
                ((gdb.c) obj).o0(((l.c) obj2).a.g);
                break;
        }
    }

    @Override // wr3.a
    public void j(j6c j6cVar) {
        s20 s20Var = (s20) this.b;
        cr8 cr8Var = cr8.c;
        cr8Var.k("AnalyticsConnector now available.");
        n20 n20Var = (n20) j6cVar.get();
        b36 b36Var = new b36(n20Var);
        t23 t23Var = new t23();
        c0h c0hVarB = n20Var.b("clx", t23Var);
        if (c0hVarB == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register AnalyticsConnectorListener with Crashlytics origin.", null);
            }
            c0hVarB = n20Var.b("crash", t23Var);
            if (c0hVarB != null) {
                Log.w("FirebaseCrashlytics", "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.", null);
            }
        }
        if (c0hVarB == null) {
            cr8Var.K(null, "Could not register Firebase Analytics listener; a listener is already registered.");
            return;
        }
        cr8Var.k("Registered Firebase Analytics listener.");
        gm1 gm1Var = new gm1();
        vh1 vh1Var = new vh1(b36Var);
        synchronized (s20Var) {
            try {
                Iterator it = s20Var.c.iterator();
                while (it.hasNext()) {
                    gm1Var.d((hm1) it.next());
                }
                t23Var.b = gm1Var;
                t23Var.a = vh1Var;
                s20Var.b = gm1Var;
                s20Var.a = vh1Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        ((VideoSource) this.b).lambda$setVideoProcessor$1(videoFrame);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.b;
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult(task.getResult());
            return null;
        }
        if (task.getException() == null) {
            return null;
        }
        taskCompletionSource.trySetException(task.getException());
        return null;
    }
}
