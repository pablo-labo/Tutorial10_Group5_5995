package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f9f implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gu5 b;

    public /* synthetic */ f9f(int i, gu5 gu5Var) {
        this.a = i;
        this.b = gu5Var;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    q9f.e(6, this.b, bVar, "Request Re-engagement Modal");
                } else {
                    bVar.D();
                }
                return j6g.a;
            default:
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((xo8) obj).getClass();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    e.a aVar = e.a.b;
                    e eVarF = g.f(aVar, 1.0f);
                    ehd ehdVarA = chd.a(vs0.e, c20.a.j, bVar2, 6);
                    int iHashCode = Long.hashCode(bVar2.k());
                    t8b t8bVarM = bVar2.m();
                    e eVarC = c.c(bVar2, eVarF);
                    gl2.j.getClass();
                    pm8.a aVar2 = gl2.a.b;
                    if (bVar2.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar2.B();
                    if (bVar2.f()) {
                        bVar2.y(aVar2);
                    } else {
                        bVar2.n();
                    }
                    ygg.y(bVar2, ehdVarA, gl2.a.g);
                    ygg.y(bVar2, t8bVarM, gl2.a.f);
                    gl2.a.C0251a c0251a = gl2.a.j;
                    if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode))) {
                        uz.g(iHashCode, bVar2, iHashCode, c0251a);
                    }
                    ygg.y(bVar2, eVarC, gl2.a.d);
                    gt6.m(ak2.I(R.string.search_overlay_show_more, bVar2), this.b, f.a(aVar, "ShowMoreButton"), null, false, null, null, bVar2, 384, DataOkHttpUploader.HTTP_GATEWAY_TIMEOUT);
                    bVar2.q();
                } else {
                    bVar2.D();
                }
                return j6g.a;
        }
    }
}
