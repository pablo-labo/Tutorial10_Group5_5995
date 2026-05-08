package defpackage;

import com.indeed.android.jobsearch.tosupdate.NullProctorPayloadException;
import defpackage.cd4;
import defpackage.xh8;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zof implements xh8 {
    public static final zof a = new zof();

    /* JADX WARN: Multi-variable type inference failed */
    public final yof a() {
        return (yof) (this instanceof ai8 ? ((ai8) this).d() : (qpd) xh8.a.a().a.b).a(null, fwc.a.b(yof.class), null);
    }

    public final boolean b() {
        dd4 dd4Var = dd4.a;
        ad4 ad4Var = dd4.n().a;
        ad4Var.getClass();
        cd4.a aVar = cd4.a.i0;
        if (ad4Var.e(aVar) == cd4.s2.a.getValue()) {
            ad4 ad4Var2 = dd4.n().a;
            ad4Var2.getClass();
            Long longValue = ad4Var2.b(aVar).getLongValue();
            if (longValue == null) {
                a();
                String strConcat = "shouldShowTosUpdateBanner".concat(": null proctor payload");
                ArrayList arrayList = lz2.a;
                lz2.b("TosUpdateBannerLogger", strConcat, false, new NullProctorPayloadException(strConcat));
                return false;
            }
            bu8 bu8Var = bu8.a;
            bu8Var.getClass();
            if (((Number) bu8.F0.a(bu8.b[43], bu8Var)).longValue() < longValue.longValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
