package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.swmansion.rnscreens.utils.ScreenDummyLayoutHelper;
import defpackage.jq7;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o7 implements gu5 {
    public final /* synthetic */ int a;

    public /* synthetic */ o7(int i) {
        this.a = i;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        switch (this.a) {
            case 0:
                p7[] p7VarArrValues = p7.values();
                p7VarArrValues.getClass();
                return new aw4(p7VarArrValues, "com.indeed.android.messaging.api.messaging.logging.ActionType");
            case 1:
                return j6g.a;
            case 2:
                return j6g.a;
            case 3:
                return j6g.a;
            case 4:
                return j6g.a;
            case 5:
                io7[] io7VarArrValues = io7.values();
                io7VarArrValues.getClass();
                return new aw4(io7VarArrValues, "com.indeed.android.rnmessaging.api.logging.ItemType");
            case 6:
                return new gt0(ni1.a, 0);
            case 7:
                iwc iwcVar = fwc.a;
                return new atd("com.indeed.android.tare.nav.JSTLandingScreen", iwcVar.b(jq7.class), new yd8[]{iwcVar.b(jq7.a.class), iwcVar.b(jq7.b.class), iwcVar.b(jq7.c.class), iwcVar.b(jq7.d.class), iwcVar.b(jq7.f.class), iwcVar.b(jq7.g.class), iwcVar.b(jq7.h.class), iwcVar.b(jq7.i.class), iwcVar.b(jq7.j.class), iwcVar.b(jq7.k.class), iwcVar.b(jq7.l.class), iwcVar.b(jq7.m.class), iwcVar.b(jq7.o.class), iwcVar.b(jq7.p.class), iwcVar.b(jq7.q.class), iwcVar.b(jq7.r.class), iwcVar.b(jq7.s.class), iwcVar.b(jq7.t.class), iwcVar.b(jq7.u.class), iwcVar.b(jq7.v.class), iwcVar.b(jq7.w.class), iwcVar.b(jq7.x.class), iwcVar.b(jq7.y.class), iwcVar.b(jq7.z.class), iwcVar.b(jq7.a0.class), iwcVar.b(jq7.b0.class), iwcVar.b(jq7.c0.class), iwcVar.b(jq7.d0.class), iwcVar.b(jq7.e0.class), iwcVar.b(jq7.f0.class)}, new KSerializer[]{new rna("Ace", jq7.a.INSTANCE, new Annotation[0]), jq7.b.a.a, jq7.c.a.a, new rna("CCPA", jq7.d.INSTANCE, new Annotation[0]), jq7.f.a.a, new rna("CookiePolicy", jq7.g.INSTANCE, new Annotation[0]), jq7.h.a.a, jq7.i.a.a, new rna("IndeedNumberOneJobSearchSiteClaims", jq7.j.INSTANCE, new Annotation[0]), jq7.k.a.a, jq7.l.a.a, new rna("interviewPrepHistory", jq7.m.INSTANCE, new Annotation[0]), new rna("Messaging", jq7.o.INSTANCE, new Annotation[0]), jq7.p.a.a, new rna("MyJobs", jq7.q.INSTANCE, new Annotation[0]), jq7.r.a.a, jq7.s.a.a, new rna("PrivacyPolicy", jq7.t.INSTANCE, new Annotation[0]), new rna("Profile", jq7.u.INSTANCE, new Annotation[0]), jq7.v.a.a, jq7.w.a.a, new rna("RegPromo", jq7.x.INSTANCE, new Annotation[0]), new rna("ResumeCoach", jq7.y.INSTANCE, new Annotation[0]), jq7.z.a.a, jq7.a0.a.a, jq7.b0.a.a, new rna("TermsOfService", jq7.c0.INSTANCE, new Annotation[0]), jq7.d0.a.a, jq7.e0.a.a, jq7.f0.a.a}, new Annotation[0]);
            case 8:
                return aq3.Companion.serializer();
            case DatadogLogGenerator.CRASH /* 9 */:
                return j6g.a;
            case 10:
                return j6g.a;
            case 11:
                return cu1.a;
            case 12:
                epa epaVar = epa.a;
                return epa.a().a();
            case 13:
                m2c.b(hvb.Z, "");
                return j6g.a;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                ScreenDummyLayoutHelper.a aVar = ScreenDummyLayoutHelper.Y;
                return "[RNScreens] ReactContext missing in onHostResume! This should not happen.";
            case 15:
                mve mveVar = mve.a;
                return new by8(mveVar, mveVar);
            case 16:
                return j6g.a;
            default:
                return new e72();
        }
    }
}
