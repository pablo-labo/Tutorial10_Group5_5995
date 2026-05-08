package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import androidx.compose.ui.layout.w;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.webview.modal.ModalWebview;
import com.indeed.android.jsmappservices.bridge.ShowSearchOverlayData;
import com.indeed.android.tare.broadcast.JSTBroadcastEvent;
import defpackage.fr0;
import defpackage.lx5;
import defpackage.m7e;
import defpackage.pn5;
import defpackage.sjf;
import defpackage.sp7;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hp0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hp0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 2;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((fr0) obj2).r(new fr0.b.e(((Boolean) obj).booleanValue()));
                return j6g.a;
            case 1:
                p91 p91Var = (p91) obj2;
                qf8<Object>[] qf8VarArr = p91.i0;
                if (((yc9) ((jz2) obj).a()) != null) {
                    ArrayList arrayList = lz2.a;
                    lz2.d(p91Var.Q(), "markStateAsInvalidEvent", false, null);
                    p91Var.S();
                }
                return j6g.a;
            case 2:
                y91 y91Var = (y91) obj2;
                Intent intent = (Intent) obj;
                intent.getClass();
                ((gme) y91Var.e).setValue(Boolean.TRUE);
                y91Var.V.a(intent);
                return j6g.a;
            case 3:
                return new wc1((rc1) obj2);
            case 4:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((gme) ((lu8) obj2).q).setValue(bool);
                return j6g.a;
            case 5:
                rh4 rh4Var = (rh4) obj2;
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-tab-edit-driving-license", "delete", null, null, 12));
                rh4Var.Q().l((String) obj, new wm1(rh4Var, i2));
                return j6g.a;
            case 6:
                return o6.a((p63) obj, (t41) obj2);
            case 7:
                c88 c88Var = (c88) obj2;
                lx5.b bVar = (lx5.b) obj;
                bVar.getClass();
                bVar.a("jobKey", c88Var.a);
                bVar.a("newAppStatus", c88Var.o);
                return j6g.a;
            case 8:
                w wVar = (w) obj2;
                w.a aVar = (w.a) obj;
                if (aVar.k() == vl8.a || aVar.p() == 0) {
                    w.a.d(aVar, wVar);
                    wVar.h0(lh7.d(0L, wVar.e), 0.0f, null);
                } else {
                    long jP = ((long) (aVar.p() - wVar.a)) << 32;
                    w.a.d(aVar, wVar);
                    wVar.h0(lh7.d(jP, wVar.e), 0.0f, null);
                }
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                z88 z88Var = (z88) obj2;
                int i3 = z88.m0;
                if (new d8c(w8c.c).b(((z0g) cr8.p(z0g.class)).a(345600000L), false)) {
                    z88Var.R().h(s8c.HOMEPAGE);
                } else {
                    z88Var.R().g(false);
                }
                return j6g.a;
            case 10:
                yw9 yw9Var = (yw9) obj2;
                ShowSearchOverlayData showSearchOverlayData = (ShowSearchOverlayData) obj;
                showSearchOverlayData.getClass();
                rq7 rq7Var = (rq7) cr8.p(rq7.class);
                lr5 lr5VarU = yw9Var.requireActivity().u();
                lr5VarU.getClass();
                rq7Var.h(lr5VarU, ak2.L(showSearchOverlayData), showSearchOverlayData.d, new g9(yw9Var, 9));
                return j6g.a;
            case 11:
                ModalWebview modalWebview = (ModalWebview) obj2;
                ((Context) obj).getClass();
                return modalWebview;
            case 12:
                mfb mfbVar = (mfb) obj2;
                j62 j62Var = (j62) obj;
                j62Var.getClass();
                j62.a(j62Var, "type", mve.b);
                j62.a(j62Var, "value", i7e.c("kotlinx.serialization.Polymorphic<" + mfbVar.a.r() + '>', m7e.a.a, new SerialDescriptor[0]));
                List<? extends Annotation> list = mfbVar.b;
                list.getClass();
                j62Var.b = list;
                return j6g.a;
            case 13:
                ((upb) obj2).k((Throwable) obj);
                return j6g.a;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                sqd sqdVar = (sqd) obj;
                sqdVar.getClass();
                return Boolean.valueOf(sqdVar != ((luc) obj2).element);
            case 15:
                mud mudVar = (mud) obj2;
                int i4 = mud.t0;
                ((JSTBroadcastEvent.ApplyStart) obj).getClass();
                mudVar.M().b.post(new my1(mudVar, 10));
                return j6g.a;
            case 16:
                m6f m6fVar = (m6f) obj2;
                if (((asd) ((jz2) obj).a()) != null) {
                    m6fVar.G();
                }
                return j6g.a;
            case 17:
                Drawable drawable = (Drawable) obj2;
                gb4 gb4Var = (gb4) obj;
                ww1 ww1VarA = gb4Var.w1().a();
                drawable.setBounds(0, 0, (int) Float.intBitsToFloat((int) (gb4Var.c() >> 32)), (int) Float.intBitsToFloat((int) (gb4Var.c() & 4294967295L)));
                drawable.draw(z40.a(ww1VarA));
                return j6g.a;
            case 18:
                sjf sjfVar = (sjf) obj2;
                String str = ((le0) obj).b;
                sjf.a aVar2 = sjfVar.o0;
                if (aVar2 == null) {
                    sjf.a aVar3 = new sjf.a(sjfVar.d0, str);
                    j3b j3bVar = new j3b(str, sjfVar.e0, sjfVar.f0, sjfVar.g0, sjfVar.h0, sjfVar.i0, sjfVar.j0);
                    j3bVar.d(sjfVar.c2().i);
                    aVar3.d = j3bVar;
                    sjfVar.o0 = aVar3;
                } else if (!wl7.b(str, aVar2.b)) {
                    aVar2.b = str;
                    j3b j3bVar2 = aVar2.d;
                    if (j3bVar2 != null) {
                        tjf tjfVar = sjfVar.e0;
                        pn5.a aVar4 = sjfVar.f0;
                        int i5 = sjfVar.g0;
                        boolean z = sjfVar.h0;
                        int i6 = sjfVar.i0;
                        int i7 = sjfVar.j0;
                        j3bVar2.a = str;
                        j3bVar2.b = tjfVar;
                        j3bVar2.c = aVar4;
                        j3bVar2.d = i5;
                        j3bVar2.e = z;
                        j3bVar2.f = i6;
                        j3bVar2.g = i7;
                        j3bVar2.s = (j3bVar2.s << 2) | 2;
                        j3bVar2.c();
                    }
                }
                us3.f(sjfVar).U();
                us3.f(sjfVar).S();
                fb4.a(sjfVar);
                return Boolean.TRUE;
            default:
                return new lsf((csf) obj2);
        }
    }
}
