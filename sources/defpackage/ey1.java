package defpackage;

import android.content.SharedPreferences;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.indeed.android.backendservices.common.api.ApiError;
import com.indeed.android.jobsearch.JobSearchApplication;
import com.indeed.android.jobsearch.R;
import com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource;
import defpackage.bad;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ey1 implements Function2 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                fy1.a(ka2.L(1), (b) obj);
                return j6g.a;
            case 1:
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, bVar, 0);
                    int iHashCode = Long.hashCode(bVar.k());
                    t8b t8bVarM = bVar.m();
                    e.a aVar = e.a.b;
                    e eVarC = c.c(bVar, aVar);
                    gl2.j.getClass();
                    pm8.a aVar2 = gl2.a.b;
                    if (bVar.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar.B();
                    if (bVar.f()) {
                        bVar.y(aVar2);
                    } else {
                        bVar.n();
                    }
                    ygg.y(bVar, ob2VarA, gl2.a.g);
                    ygg.y(bVar, t8bVarM, gl2.a.f);
                    gl2.a.C0251a c0251a = gl2.a.j;
                    if (bVar.f() || !wl7.b(bVar.v(), Integer.valueOf(iHashCode))) {
                        uz.g(iHashCode, bVar, iHashCode, c0251a);
                    }
                    ygg.y(bVar, eVarC, gl2.a.d);
                    fif.b(ak2.I(R.string.prepare_error_report_body, bVar), f.j(aVar, 0.0f, 8.0f, 0.0f, 0.0f, 13), eu6.k, hh2.t(16), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, hz6.b, bVar, 3120, 0, 65520);
                    c3c.b(androidx.compose.ui.platform.f.a(f.j(g.f(aVar, 1.0f), 0.0f, 8.0f, 0.0f, 0.0f, 13), "ProgressIndicator"), eu6.c, 0L, bVar, 6, 12);
                    bVar.q();
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 2:
                b bVar2 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar2.o(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    vg2.d(0, bVar2);
                } else {
                    bVar2.D();
                }
                return j6g.a;
            case 3:
                qpd qpdVar = (qpd) obj;
                qpdVar.getClass();
                ((v3b) obj2).getClass();
                iwc iwcVar = fwc.a;
                OkHttpClient okHttpClient = (OkHttpClient) qpdVar.a(null, iwcVar.b(OkHttpClient.class), null);
                be6 be6Var = (be6) qpdVar.a(null, iwcVar.b(be6.class), null);
                String str = (String) qpdVar.a(null, iwcVar.b(String.class), new lve("resumeContactsBaseUrl"));
                bad.b bVar3 = new bad.b();
                bVar3.a(str);
                bVar3.d.add(be6Var);
                bVar3.b = okHttpClient;
                return bVar3.b();
            case 4:
                File file = (File) obj;
                String str2 = (String) obj2;
                file.getClass();
                str2.getClass();
                File file2 = new File(file, str2);
                try {
                    return new BufferedOutputStream(new FileOutputStream(file2));
                } catch (IOException unused) {
                    ArrayList arrayList = lz2.a;
                    lz2.c("FileLogging", l6.g(file2, "Failed to create log file "), false, null, 12);
                    return new ByteArrayOutputStream();
                }
            case 5:
                qpd qpdVar2 = (qpd) obj;
                JobSearchApplication jobSearchApplication = JobSearchApplication.X;
                qpdVar2.getClass();
                ((v3b) obj2).getClass();
                return new g00(ee3.i(qpdVar2));
            case 6:
                JobSearchApplication jobSearchApplication2 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new o1g();
            case 7:
                qpd qpdVar3 = (qpd) obj;
                JobSearchApplication jobSearchApplication3 = JobSearchApplication.X;
                qpdVar3.getClass();
                ((v3b) obj2).getClass();
                return new sbf((p87) qpdVar3.a(null, fwc.a.b(p87.class), null), (OkHttpClient) epa.f0.getValue());
            case 8:
                qpd qpdVar4 = (qpd) obj;
                JobSearchApplication jobSearchApplication4 = JobSearchApplication.X;
                qpdVar4.getClass();
                ((v3b) obj2).getClass();
                SharedPreferences sharedPreferences = ee3.i(qpdVar4).getSharedPreferences("nonBackedUpPrefs", 0);
                sharedPreferences.getClass();
                return new om0(sharedPreferences);
            case DatadogLogGenerator.CRASH /* 9 */:
                qpd qpdVar5 = (qpd) obj;
                qpdVar5.getClass();
                ((v3b) obj2).getClass();
                iwc iwcVar2 = fwc.a;
                return new ConversationsRemoteDataSource((lr9) qpdVar5.a(null, iwcVar2.b(lr9.class), null), (ita) qpdVar5.a(null, iwcVar2.b(ita.class), null));
            case 10:
                ((ApiError) obj).getClass();
                return j6g.a;
            case 11:
                ((ps7) obj).getClass();
                return j6g.a;
            case 12:
                ((ps7) obj).getClass();
                return j6g.a;
            default:
                qpd qpdVar6 = (qpd) obj;
                qpdVar6.getClass();
                ((v3b) obj2).getClass();
                return new qhb((i88) qpdVar6.a(null, fwc.a.b(i88.class), null));
        }
    }

    public /* synthetic */ ey1(int i, byte b) {
        this.a = i;
    }
}
