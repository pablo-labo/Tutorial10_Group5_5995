package defpackage;

import androidx.activity.result.ActivityResult;
import androidx.media3.exoplayer.d;
import androidx.media3.session.g;
import androidx.media3.session.k;
import androidx.media3.session.m;
import androidx.media3.session.y;
import androidx.media3.session.z;
import com.facebook.react.runtime.ReactHostImpl;
import com.facebook.react.runtime.a;
import com.indeed.android.jobsearch.webview.modal.ModalWebview;
import defpackage.gdb;
import defpackage.lt7;
import defpackage.lz8;
import defpackage.mt7;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i35 implements lz8.a, kt7, k.c, m.a, a.InterfaceC0133a, n8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i35(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.kt7
    public void a(lt7 lt7Var) {
        ut5 ut5Var = (ut5) this.b;
        lt7Var.getClass();
        if (lt7Var instanceof lt7.a) {
            ArrayList arrayList = lz2.a;
            lz2.d("FsdvWebViewFragment", "SearchOverlayFragment dismissed", false, null);
        } else {
            if (!(lt7Var instanceof lt7.b)) {
                l.g();
                return;
            }
            mt7.b bVar = ((lt7.b) lt7Var).a;
            if (bVar != null) {
                ut5Var.G().h(bVar.b, false, true);
            } else {
                l.g();
            }
        }
    }

    public boolean b(Object obj) {
        zb5 zb5Var = (zb5) this.b;
        ((Map.Entry) obj).getClass();
        return !zb5Var.b.contains(r1.getKey());
    }

    @Override // defpackage.n8
    public void c(Object obj) {
        com.indeed.android.jobsearch.viewjob.a aVar = (com.indeed.android.jobsearch.viewjob.a) this.b;
        ActivityResult activityResult = (ActivityResult) obj;
        int i = com.indeed.android.jobsearch.viewjob.a.H0;
        activityResult.getClass();
        vw9 vw9Var = aVar.j0;
        if (vw9Var == null) {
            wl7.g("modalWebChromeClient");
            throw null;
        }
        ModalWebview modalWebview = aVar.B0;
        if (modalWebview == null) {
            wl7.g("webview");
            throw null;
        }
        String url = modalWebview.getUrl();
        if (url == null) {
            url = "";
        }
        vw9Var.i(url, activityResult.a, activityResult.b);
    }

    @Override // androidx.media3.session.m.a
    public void f(k kVar) {
        v9e v9eVar = (v9e) this.b;
        if (kVar.o0() && kVar.k.isEmpty()) {
            v9e v9eVar2 = kVar.p.c;
            if (v9eVar2.c >= v9eVar.c || !y.a(v9eVar, v9eVar2)) {
                return;
            }
            kVar.p = kVar.p.j(v9eVar);
        }
    }

    @Override // com.facebook.react.runtime.a.InterfaceC0133a
    public Object get() {
        ReactHostImpl reactHostImpl = (ReactHostImpl) this.b;
        AtomicInteger atomicInteger = ReactHostImpl.A;
        reactHostImpl.t("getOrCreateReactContext()", "Creating BridgelessReactContext");
        return new zm1(reactHostImpl.a, reactHostImpl);
    }

    @Override // androidx.media3.session.k.c
    public void h(g gVar, int i) {
        k kVar = k.this;
        gVar.x0(kVar.c, i, kVar.z);
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((gdb.c) obj).E(((d) obj2).R);
                break;
            default:
                z zVar = (z) obj2;
                ((gdb.c) obj).z(zVar.r, zVar.s);
                break;
        }
    }
}
