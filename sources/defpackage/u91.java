package defpackage;

import android.content.Intent;
import android.os.Looper;
import androidx.activity.result.ActivityResult;
import androidx.compose.ui.platform.ComposeView;
import androidx.credentials.playservices.HiddenActivity;
import androidx.media3.session.g;
import androidx.media3.session.j;
import androidx.media3.session.k;
import androidx.media3.session.m;
import androidx.media3.session.z;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnSuccessListener;
import com.indeed.android.jobsearch.LaunchActivity;
import com.indeed.android.jobsearch.webview.indeedapply.IndeedApplyWebViewFragment;
import com.indeed.android.jsmappservices.bridge.results.CallPhoneNumberResult;
import com.indeed.android.rnonboarding.RnOnboardingFragment;
import com.indeed.android.rnonboarding.detectlocation.RequestAndDetectLocationPermissionDenied;
import defpackage.c2f;
import defpackage.gdb;
import defpackage.lz8;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class u91 implements n8, jg2, lz8.a, OnSuccessListener, k.c, m.a, c2f.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u91(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // c2f.a
    public Object b() {
        return ((s72) this.b).p();
    }

    @Override // defpackage.n8
    public void c(Object obj) {
        Intent intent;
        int i = this.a;
        int i2 = 2;
        int i3 = 0;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                y91 y91Var = (y91) obj2;
                ActivityResult activityResult = (ActivityResult) obj;
                activityResult.getClass();
                if (activityResult.a != -1 || (intent = activityResult.b) == null) {
                    return;
                }
                ((zw8) y91Var.c.getValue()).a(intent, new s91(y91Var, i3), new t5(y91Var, i2), new q2(y91Var, 5));
                return;
            case 1:
                ev1 ev1Var = (ev1) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                sm1 andSet = ev1Var.c.getAndSet(null);
                if (andSet == null) {
                    ArrayList arrayList = lz2.a;
                    lz2.h("CallPhoneHelper", "continuation is gone", null, 12);
                    return;
                }
                String andSet2 = ev1Var.b.getAndSet(null);
                if (andSet2 == null) {
                    ArrayList arrayList2 = lz2.a;
                    lz2.h("CallPhoneHelper", "numberToCall is gone", null, 12);
                    return;
                } else if (zBooleanValue) {
                    ev1Var.b(andSet, andSet2);
                    return;
                } else {
                    andSet.a(new CallPhoneNumberResult(false, false));
                    return;
                }
            case 2:
            case 3:
            case 4:
            default:
                RnOnboardingFragment rnOnboardingFragment = (RnOnboardingFragment) obj2;
                Lazy lazy = rnOnboardingFragment.e;
                Map map = (Map) obj;
                map.getClass();
                if (map.containsValue(Boolean.TRUE) && rnOnboardingFragment.j()) {
                    ((b24) lazy.getValue()).b();
                    return;
                }
                Promise promise = ((b24) lazy.getValue()).c;
                if (promise != null) {
                    promise.reject(new RequestAndDetectLocationPermissionDenied());
                    return;
                }
                return;
            case 5:
                IndeedApplyWebViewFragment indeedApplyWebViewFragment = (IndeedApplyWebViewFragment) obj2;
                ActivityResult activityResult2 = (ActivityResult) obj;
                activityResult2.getClass();
                vw9 vw9Var = indeedApplyWebViewFragment.l0;
                if (vw9Var != null) {
                    String url = indeedApplyWebViewFragment.N().getUrl();
                    if (url == null) {
                        url = "";
                    }
                    vw9Var.i(url, activityResult2.a, activityResult2.b);
                    return;
                }
                return;
            case 6:
                ActivityResult activityResult3 = (ActivityResult) obj;
                int i4 = LaunchActivity.e1;
                activityResult3.getClass();
                f8 f8Var = ((LaunchActivity) obj2).J0;
                if (f8Var == null) {
                    wl7.g("binding");
                    throw null;
                }
                ComposeView composeView = f8Var.c;
                composeView.setVisibility(0);
                composeView.setContent(new ah2(1701937876, new zw4(activityResult3, i2), true));
                return;
        }
    }

    @Override // defpackage.jg2
    public Object d(l7d l7dVar) {
        return this.b;
    }

    @Override // androidx.media3.session.m.a
    public void f(k kVar) {
        boolean z;
        boolean z2;
        gdb.a aVar = (gdb.a) this.b;
        if (kVar.o0() && !Objects.equals(kVar.x, aVar)) {
            kVar.x = aVar;
            gdb.a aVar2 = kVar.y;
            gdb.a aVarT0 = k.T0(kVar.w, aVar);
            kVar.y = aVarT0;
            int i = 0;
            if (aVarT0.equals(aVar2)) {
                z = false;
                z2 = false;
            } else {
                qyc qycVar = kVar.t;
                qyc qycVar2 = kVar.u;
                qyc qycVarQ1 = k.q1(kVar.s, kVar.r, kVar.v, kVar.y, kVar.I);
                kVar.t = qycVarQ1;
                kVar.u = k.p1(qycVarQ1, kVar.r, kVar.I, kVar.v, kVar.y);
                z = !kVar.t.equals(qycVar);
                z2 = !kVar.u.equals(qycVar2);
                kVar.i.f(13, new wg9(kVar, i));
            }
            if (z2) {
                j jVarZ0 = kVar.Z0();
                jVarZ0.getClass();
                ka2.q(Looper.myLooper() == jVarZ0.e.getLooper());
                jVarZ0.d.getClass();
            }
            if (z) {
                j jVarZ02 = kVar.Z0();
                jVarZ02.getClass();
                ka2.q(Looper.myLooper() == jVarZ02.e.getLooper());
                jVarZ02.d.x();
            }
        }
    }

    @Override // androidx.media3.session.k.c
    public void h(g gVar, int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case DatadogLogGenerator.CRASH /* 9 */:
                gVar.P0(((k) obj).c, i);
                break;
            default:
                gVar.x0(k.this.c, i, null);
                break;
        }
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 3:
                ((gdb.c) obj).n(((adb) obj2).n);
                break;
            case 7:
                ((gdb.c) obj).T((dqf) obj2);
                break;
            default:
                ((gdb.c) obj).A(((z) obj2).A);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        HiddenActivity.handleCreatePassword$lambda$14$lambda$12((Function1) this.b, obj);
    }
}
