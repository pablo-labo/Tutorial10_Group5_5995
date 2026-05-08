package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.backendservices.common.api.ApiError;
import com.indeed.android.jobsearch.JobSearchApplication;
import com.indeed.android.jobsearch.R;
import com.indeed.android.myjobs.data.remote.api.BrandedAdsLoggingApiService;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lh2 implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ lh2(int i) {
        this.a = 17;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    bVar.D();
                }
                return j6g.a;
            case 1:
                b bVar2 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    bVar2.D();
                }
                return j6g.a;
            case 2:
                b bVar3 = (b) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    vq6.b(z2b.a(R.drawable.ic_idl_profile_24, 0, bVar3), ak2.I(R.string.uip_topnav_profile_icon_description, bVar3), null, 0L, bVar3, 0, 12);
                } else {
                    bVar3.D();
                }
                return j6g.a;
            case 3:
                b bVar4 = (b) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (bVar4.o(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    String strI = ak2.I(R.string.prepare_error_report_title, bVar4);
                    tjf tjfVar = hz6.h;
                    e eVarJ = f.j(e.a.b, 0.0f, 16.0f, 0.0f, 0.0f, 13);
                    Object objV = bVar4.v();
                    if (objV == b.a.a) {
                        objV = new mc(3);
                        bVar4.p(objV);
                    }
                    fif.b(strI, b5e.b(eVarJ, false, (Function1) objV), eu6.k, hh2.t(20), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVar, bVar4, 3072, 0, 65520);
                } else {
                    bVar4.D();
                }
                return j6g.a;
            case 4:
                b bVar5 = (b) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (bVar5.o(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    vg2.c(0, bVar5);
                } else {
                    bVar5.D();
                }
                return j6g.a;
            case 5:
                qpd qpdVar = (qpd) obj;
                qpdVar.getClass();
                ((v3b) obj2).getClass();
                return (BrandedAdsLoggingApiService) ((bad) qpdVar.a(null, fwc.a.b(bad.class), new lve("BrandedAdsLoggingRetrofit"))).b(BrandedAdsLoggingApiService.class);
            case 6:
                JobSearchApplication jobSearchApplication = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new mka();
            case 7:
                JobSearchApplication jobSearchApplication2 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new dt7();
            case 8:
                JobSearchApplication jobSearchApplication3 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new t2g();
            case DatadogLogGenerator.CRASH /* 9 */:
                JobSearchApplication jobSearchApplication4 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new zcd();
            case 10:
                JobSearchApplication jobSearchApplication5 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new mm0();
            case 11:
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new ita();
            case 12:
                ((ApiError) obj).getClass();
                return j6g.a;
            case 13:
                ((ps7) obj).getClass();
                return j6g.a;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                ((ps7) obj).getClass();
                return j6g.a;
            case 15:
                return ((a19) obj2).a.toLanguageTag();
            case 16:
                yd8 yd8Var = (yd8) obj;
                List list = (List) obj2;
                yd8Var.getClass();
                list.getClass();
                ArrayList arrayListP = awd.p(i8e.a, list, true);
                arrayListP.getClass();
                KSerializer kSerializerI = awd.i(yd8Var, arrayListP, new fy(list, 19));
                if (kSerializerI != null) {
                    return qp1.b(kSerializerI);
                }
                return null;
            case 17:
                ((Integer) obj2).getClass();
                q9f.b(ka2.L(1), (b) obj);
                return j6g.a;
            default:
                qpd qpdVar2 = (qpd) obj;
                qpdVar2.getClass();
                ((v3b) obj2).getClass();
                return new rhb((i88) qpdVar2.a(null, fwc.a.b(i88.class), null));
        }
    }

    public /* synthetic */ lh2(int i, byte b) {
        this.a = i;
    }
}
