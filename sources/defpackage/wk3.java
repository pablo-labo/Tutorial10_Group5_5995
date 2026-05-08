package defpackage;

import androidx.media3.session.g;
import androidx.media3.session.k;
import androidx.media3.session.l;
import androidx.media3.session.r;
import androidx.media3.session.t;
import androidx.media3.session.z;
import androidx.media3.ui.PlayerView;
import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.gdb;
import defpackage.lz8;
import defpackage.v20;
import expo.modules.video.VideoView;
import java.io.IOException;
import org.webrtc.RTCStatsCollectorCallback;
import org.webrtc.RTCStatsReport;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wk3 implements lz8.a, k.c, t.g, RTCStatsCollectorCallback, v84, Continuation, PlayerView.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wk3(v20.a aVar, uz8 uz8Var, nj9 nj9Var, IOException iOException, boolean z) {
        this.a = 0;
        this.b = nj9Var;
    }

    @Override // androidx.media3.session.t.g
    public void d(r.d dVar) {
        ((t) this.b).g.t.f();
    }

    @Override // androidx.media3.ui.PlayerView.d
    public void e(boolean z) {
        ((VideoView) this.b).enterFullscreen();
    }

    @Override // defpackage.v84
    public double f(double d) {
        hrf hrfVar = (hrf) this.b;
        float[] fArr = ya2.a;
        return ya2.d(hrfVar, d);
    }

    @Override // androidx.media3.session.k.c
    public void h(g gVar, int i) {
        gVar.T0(((k) this.b).c, i);
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((v20) obj).i((nj9) obj2);
                break;
            case 1:
                ((gdb.c) obj).T((dqf) obj2);
                break;
            case 2:
            default:
                ((gdb.c) obj).v(((l.c) obj2).a.i);
                break;
            case 3:
                ((gdb.c) obj).K(((z) obj2).p.a);
                break;
        }
    }

    @Override // org.webrtc.RTCStatsCollectorCallback
    public void onStatsDelivered(RTCStatsReport rTCStatsReport) {
        ((Promise) this.b).resolve(nve.b(rTCStatsReport));
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.b;
        if (task.isSuccessful()) {
            taskCompletionSource.setResult(task.getResult());
            return null;
        }
        if (task.getException() == null) {
            return null;
        }
        taskCompletionSource.setException(task.getException());
        return null;
    }

    public /* synthetic */ wk3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
