package defpackage;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.credentials.playservices.HiddenActivity;
import androidx.fragment.app.g;
import androidx.media3.common.a;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.mediacodec.d;
import androidx.media3.session.k;
import androidx.media3.session.r;
import androidx.media3.session.s;
import androidx.media3.session.z;
import app.rive.runtime.kotlin.core.CDNAssetLoader;
import com.android.volley.VolleyError;
import com.google.android.gms.tasks.OnFailureListener;
import com.indeed.android.jobsearch.LaunchActivity;
import com.indeed.android.jobsearch.webview.IndeedWebView;
import defpackage.c2f;
import defpackage.gdb;
import defpackage.jq7;
import defpackage.l6d;
import defpackage.lt7;
import defpackage.lz8;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class t91 implements n8, l6d.a, lz8.a, OnFailureListener, MediaCodecUtil.c, k.c, s.e, kt7, c2f.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t91(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.kt7
    public void a(lt7 lt7Var) {
        mud mudVar = (mud) this.b;
        int i = mud.t0;
        lt7Var.getClass();
        if (lt7Var instanceof lt7.a) {
            ArrayList arrayList = lz2.a;
            lz2.d("SearchTabFragment", "SearchOverlayFragment dismissed", false, null);
            return;
        }
        if (!(lt7Var instanceof lt7.b)) {
            l.g();
            return;
        }
        g activity = mudVar.getActivity();
        if (activity == null || !mudVar.isAdded()) {
            return;
        }
        rq7 rq7Var = (rq7) cr8.p(rq7.class);
        lr5 lr5VarU = activity.u();
        lr5VarU.getClass();
        rq7Var.f(lr5VarU, mh2.k(mudVar), new jq7.a0(((lt7.b) lt7Var).a), "SearchTabFragment");
    }

    @Override // c2f.a
    public Object b() {
        t2h t2hVar = (t2h) this.b;
        Iterator<atf> it = t2hVar.b.O().iterator();
        while (it.hasNext()) {
            t2hVar.c.a(it.next(), 1);
        }
        return null;
    }

    @Override // defpackage.n8
    public void c(Object obj) {
        IndeedWebView indeedWebView;
        Intent intent;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ActivityResult activityResult = (ActivityResult) obj;
                activityResult.getClass();
                mq6 mq6VarG = ((y91) obj2).G();
                int i2 = activityResult.a;
                Intent intent2 = activityResult.b;
                w97 w97Var = mq6VarG.Y;
                if (w97Var != null && (indeedWebView = mq6VarG.V) != null) {
                    String url = indeedWebView.getUrl();
                    if (url == null) {
                        url = "";
                    }
                    w97Var.i(url, i2, intent2);
                }
                break;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                ActivityResult activityResult2 = (ActivityResult) obj;
                int i3 = LaunchActivity.e1;
                activityResult2.getClass();
                if (activityResult2.a == -1 && (intent = activityResult2.b) != null) {
                    ((zw8) launchActivity.B0.getValue()).a(intent, new s91(launchActivity, 1), new t5(launchActivity, 4), new q2(launchActivity, 16));
                    break;
                }
                break;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.c
    public int d(Object obj) {
        a aVar = (a) this.b;
        d dVar = (d) obj;
        String str = dVar.b;
        return ((str.equals(aVar.n) || str.equals(MediaCodecUtil.b(aVar))) && dVar.c(aVar, false) && dVar.d(aVar)) ? 1 : 0;
    }

    @Override // l6d.a
    public void e(VolleyError volleyError) {
        CDNAssetLoader.loadContents$lambda$0((CDNAssetLoader) this.b, volleyError);
    }

    @Override // androidx.media3.session.k.c
    public void h(androidx.media3.session.g gVar, int i) {
        k kVar = k.this;
        gVar.x0(kVar.c, i, kVar.z);
    }

    @Override // androidx.media3.session.s.e
    public void i(r.c cVar, int i) {
        cVar.e(i, (Bundle) this.b);
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 2:
                adb adbVar = (adb) obj2;
                ((gdb.c) obj).V(adbVar.m, adbVar.l);
                break;
            default:
                ((gdb.c) obj).a(((z) obj2).l);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        HiddenActivity.handleCreatePublicKeyCredential$lambda$2$lambda$1((HiddenActivity) this.b, exc);
    }
}
