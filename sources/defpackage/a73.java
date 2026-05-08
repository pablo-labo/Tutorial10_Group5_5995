package defpackage;

import android.net.Uri;
import androidx.activity.result.ActivityResult;
import androidx.media3.session.l;
import androidx.media3.session.z;
import com.canhub.cropper.CropImageActivity;
import com.canhub.cropper.CropImageView;
import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.indeed.android.jobsearch.webview.external.ExternalActivity;
import com.indeed.android.jobsearch.webview.external.ExternalWebView;
import com.indeed.android.jobsearch.webview.external.a;
import defpackage.gdb;
import defpackage.lz8;
import org.webrtc.RTCStatsCollectorCallback;
import org.webrtc.RTCStatsReport;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a73 implements n8, lz8.a, RTCStatsCollectorCallback, v84, Continuation {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a73(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.n8
    public void c(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                CropImageActivity cropImageActivity = (CropImageActivity) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                int i2 = CropImageActivity.x0;
                if (!zBooleanValue) {
                    cropImageActivity.D();
                    return;
                }
                Uri uri = cropImageActivity.u0;
                if (uri == null) {
                    cropImageActivity.D();
                    return;
                }
                cropImageActivity.q0 = uri;
                CropImageView cropImageView = cropImageActivity.s0;
                if (cropImageView != null) {
                    cropImageView.setImageUriAsync(uri);
                    return;
                }
                return;
            case 1:
                ExternalActivity externalActivity = (ExternalActivity) obj2;
                ActivityResult activityResult = (ActivityResult) obj;
                int i3 = ExternalActivity.H0;
                activityResult.getClass();
                a aVar = externalActivity.y0;
                if (aVar == null) {
                    wl7.g("externalWebChromeClient");
                    throw null;
                }
                ExternalWebView externalWebView = externalActivity.w0;
                if (externalWebView == null) {
                    wl7.g("externalWebView");
                    throw null;
                }
                String url = externalWebView.getUrl();
                if (url == null) {
                    url = "";
                }
                aVar.i(url, activityResult.a, activityResult.b);
                return;
            default:
                qec qecVar = (qec) obj2;
                Boolean bool = (Boolean) obj;
                bool.getClass();
                tdc tdcVar = qecVar.b;
                if (tdcVar != null) {
                    tdcVar.invoke(bool);
                }
                qecVar.b = null;
                return;
        }
    }

    @Override // defpackage.v84
    public double f(double d) {
        hrf hrfVar = (hrf) this.b;
        float[] fArr = ya2.a;
        return ya2.b(hrfVar, d);
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 2:
                ((gdb.c) obj).S(((z) obj2).o);
                break;
            default:
                ((gdb.c) obj).m(((l.c) obj2).a.h);
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
