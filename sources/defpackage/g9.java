package defpackage;

import android.os.Bundle;
import android.os.Looper;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.d;
import androidx.media3.exoplayer.source.k;
import androidx.media3.session.j;
import androidx.media3.session.m;
import androidx.media3.session.q;
import androidx.media3.session.z;
import app.rive.runtime.kotlin.RiveAnimationView;
import com.android.volley.VolleyError;
import defpackage.a2d;
import defpackage.gdb;
import defpackage.l6d;
import defpackage.lt7;
import defpackage.lz8;
import defpackage.mt7;
import defpackage.v20;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import okhttp3.EventListener;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g9 implements n8, lz8.a, a2d.b, m.a, kt7, k.a, l6d.a, EventListener.Factory {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g9(v20.a aVar, tog togVar) {
        this.a = 1;
        this.b = togVar;
    }

    @Override // defpackage.kt7
    public void a(lt7 lt7Var) {
        yw9 yw9Var = (yw9) this.b;
        lt7Var.getClass();
        if (lt7Var instanceof lt7.a) {
            ArrayList arrayList = lz2.a;
            lz2.d("ModalWebviewFragment", "SearchOverlayFragment dismissed", false, null);
        } else {
            if (!(lt7Var instanceof lt7.b)) {
                l.g();
                return;
            }
            mt7.b bVar = ((lt7.b) lt7Var).a;
            if (bVar != null) {
                yw9Var.N().loadUrl(bVar.b);
            } else {
                l.g();
            }
        }
    }

    @Override // a2d.b
    public void b(long j, g4b g4bVar) {
        gz1.a(j, g4bVar, ((ps5) this.b).K);
    }

    @Override // defpackage.n8
    public void c(Object obj) {
        ((Function1) ((ese) this.b).getValue()).invoke(obj);
    }

    @Override // l6d.a
    public void e(VolleyError volleyError) throws IOException {
        RiveAnimationView.loadFromNetwork$lambda$5((String) this.b, volleyError);
    }

    @Override // androidx.media3.session.m.a
    public void f(androidx.media3.session.k kVar) {
        Bundle bundle = (Bundle) this.b;
        if (kVar.o0()) {
            qyc qycVar = kVar.t;
            qyc qycVar2 = kVar.u;
            kVar.I = bundle;
            qyc qycVarQ1 = androidx.media3.session.k.q1(kVar.s, kVar.r, kVar.v, kVar.y, bundle);
            kVar.t = qycVarQ1;
            kVar.u = androidx.media3.session.k.p1(qycVarQ1, kVar.r, kVar.I, kVar.v, kVar.y);
            boolean zEquals = kVar.t.equals(qycVar);
            kVar.u.equals(qycVar2);
            j jVarZ0 = kVar.Z0();
            jVarZ0.getClass();
            ka2.q(Looper.myLooper() == jVarZ0.e.getLooper());
            q.b bVar = jVarZ0.d;
            bVar.getClass();
            if (zEquals) {
                return;
            }
            bVar.x();
        }
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 1:
                tog togVar = (tog) obj2;
                ((v20) obj).a(togVar);
                int i2 = togVar.a;
                break;
            case 2:
                adb adbVar = (adb) obj2;
                ((gdb.c) obj).l0(adbVar.e, adbVar.l);
                break;
            case 3:
                ((gdb.c) obj).h0(d.this.Q);
                break;
            case 4:
            default:
                ((gdb.c) obj).g((PlaybackException) obj2);
                break;
            case 5:
                ((gdb.c) obj).E((oj9) obj2);
                break;
            case 6:
                ((gdb.c) obj).U(((z) obj2).w);
                break;
        }
    }

    public /* synthetic */ g9(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
