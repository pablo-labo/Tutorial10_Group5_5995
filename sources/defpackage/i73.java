package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.credentials.playservices.HiddenActivity;
import androidx.media3.session.k;
import androidx.media3.session.r;
import androidx.media3.session.s;
import androidx.media3.session.t;
import androidx.media3.ui.PlayerView;
import com.canhub.cropper.CropImageActivity;
import com.canhub.cropper.CropImageView;
import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnSuccessListener;
import com.indeed.android.jobsearch.LaunchActivity;
import com.swmansion.rnscreens.b;
import defpackage.ax5;
import defpackage.e75;
import defpackage.gdb;
import defpackage.lz8;
import defpackage.wf1;
import expo.modules.video.VideoView;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import org.apache.avro.f;
import org.apache.avro.g;
import org.webrtc.RTCStatsCollectorCallback;
import org.webrtc.RTCStatsReport;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i73 implements n8, lz8.a, e75.a, wf1.d, ax5.f, OnSuccessListener, k.c, t.g, RTCStatsCollectorCallback, h0g, PlayerView.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i73(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // wf1.d
    public long a(long j) {
        ah5 ah5Var = (ah5) this.b;
        return vjg.j((j * ((long) ah5Var.e)) / 1000000, 0L, ah5Var.j - 1);
    }

    @Override // defpackage.h0g
    public void b(haa haaVar) {
        jrd jrdVar = (jrd) this.b;
        if (haaVar == null) {
            return;
        }
        View viewJ = haaVar.j(jrdVar.a);
        if (viewJ instanceof b) {
            ((b) viewJ).g();
        }
    }

    @Override // defpackage.n8
    public void c(Object obj) {
        Uri data;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                j73 j73Var = (j73) obj2;
                ActivityResult activityResult = (ActivityResult) obj;
                CropImageActivity cropImageActivity = (CropImageActivity) j73Var.b.a;
                activityResult.getClass();
                if (activityResult.a != -1) {
                    cropImageActivity.D();
                } else {
                    Intent intent = activityResult.b;
                    if (intent == null || (data = intent.getData()) == null) {
                        data = j73Var.e;
                    }
                    if (data != null) {
                        cropImageActivity.q0 = data;
                        CropImageView cropImageView = cropImageActivity.s0;
                        if (cropImageView != null) {
                            cropImageView.setImageUriAsync(data);
                        }
                    } else {
                        cropImageActivity.D();
                    }
                }
                break;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                ActivityResult activityResult2 = (ActivityResult) obj;
                int i2 = LaunchActivity.e1;
                activityResult2.getClass();
                int i3 = activityResult2.a;
                if (i3 != -1) {
                    ArrayList arrayList = lz2.a;
                    lz2.b("LaunchActivity", p6.c(i3, "Google SignIn - resultCode "), false, new Throwable(p6.c(i3, "Google SignIn - resultCode ")));
                } else {
                    ((ua6) launchActivity.z0.getValue()).b(activityResult2.b, new pq(launchActivity, 9), new wy2(14));
                }
                break;
        }
    }

    @Override // androidx.media3.session.t.g
    public void d(r.d dVar) {
        s sVar = ((t) this.b).g;
        vdb vdbVar = sVar.t;
        if (vjg.Z(vdbVar, sVar.p)) {
            vjg.G(vdbVar);
        } else {
            if (vdbVar == null || !vdbVar.O0(1)) {
                return;
            }
            vdbVar.c();
        }
    }

    @Override // androidx.media3.ui.PlayerView.d
    public void e(boolean z) {
        ((VideoView) this.b).enterFullscreen();
    }

    @Override // e75.a
    public void f(Object obj, ka6 ka6Var) {
        cx5.h(((f.i) this.b).a, ka6Var);
    }

    @Override // ax5.f
    public Object g(Object obj, g gVar) {
        return ((ax5) this.b).p(obj, gVar);
    }

    @Override // androidx.media3.session.k.c
    public void h(androidx.media3.session.g gVar, int i) {
        gVar.x0(k.this.c, i, null);
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        ((gdb.c) obj).S((ox0) this.b);
    }

    @Override // org.webrtc.RTCStatsCollectorCallback
    public void onStatsDelivered(RTCStatsReport rTCStatsReport) {
        ((Promise) this.b).resolve(nve.b(rTCStatsReport));
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        HiddenActivity.handleCreatePublicKeyCredential$lambda$2$lambda$0((Function1) this.b, obj);
    }
}
