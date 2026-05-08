package defpackage;

import android.webkit.GeolocationPermissions;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.indeed.android.backendservices.common.api.ApiError;
import com.indeed.android.jobsearch.LaunchActivity;
import com.indeed.android.jsmappservices.util.LocationSensor;
import defpackage.c20;
import defpackage.gl2;
import defpackage.ig3;
import defpackage.pm8;
import defpackage.vs0;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.Request;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uw implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uw(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((vw) obj3).M(ka2.L(1), (b) obj);
                return j6g.a;
            case 1:
                v81 v81Var = (v81) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                qf8<Object>[] qf8VarArr = v81.i0;
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    v81Var.O(0, bVar);
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 2:
                gr2 gr2Var = (gr2) obj3;
                b bVar2 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1c x1cVar = (x1c) gr2Var.f.getValue();
                    boolean zX = bVar2.x(gr2Var);
                    Object objV = bVar2.v();
                    b.a.C0020a c0020a = b.a.a;
                    if (zX || objV == c0020a) {
                        objV = new zh(gr2Var, 6);
                        bVar2.p(objV);
                    }
                    gu5 gu5Var = (gu5) objV;
                    boolean zX2 = bVar2.x(gr2Var);
                    Object objV2 = bVar2.v();
                    if (zX2 || objV2 == c0020a) {
                        objV2 = new nj(gr2Var, 7);
                        bVar2.p(objV2);
                    }
                    gu5 gu5Var2 = (gu5) objV2;
                    ArrayList arrayList = gr2Var.d;
                    t41 t41Var = gr2Var.e;
                    boolean zX3 = bVar2.x(gr2Var);
                    Object objV3 = bVar2.v();
                    if (zX3 || objV3 == c0020a) {
                        objV3 = new nv(gr2Var, 5);
                        bVar2.p(objV3);
                    }
                    gu5 gu5Var3 = (gu5) objV3;
                    boolean zX4 = bVar2.x(gr2Var);
                    Object objV4 = bVar2.v();
                    int i2 = 4;
                    if (zX4 || objV4 == c0020a) {
                        objV4 = new oj(gr2Var, i2);
                        bVar2.p(objV4);
                    }
                    gu5 gu5Var4 = (gu5) objV4;
                    boolean zX5 = bVar2.x(gr2Var);
                    Object objV5 = bVar2.v();
                    if (zX5 || objV5 == c0020a) {
                        objV5 = new fy(gr2Var, i2);
                        bVar2.p(objV5);
                    }
                    gu5 gu5Var5 = (gu5) objV5;
                    boolean zX6 = bVar2.x(gr2Var);
                    Object objV6 = bVar2.v();
                    if (zX6 || objV6 == c0020a) {
                        objV6 = new fk0(gr2Var, i2);
                        bVar2.p(objV6);
                    }
                    pr2.a(x1cVar, gu5Var, gu5Var2, arrayList, t41Var, gu5Var3, gu5Var4, gu5Var5, (gu5) objV6, bVar2, 0);
                } else {
                    bVar2.D();
                }
                return j6g.a;
            case 3:
                Boolean bool = Boolean.FALSE;
                ((g4a) obj3).setValue(new ig3(null, bool, new ig3.b(bool, (s38) obj, (Integer) obj2)));
                return j6g.a;
            case 4:
                LaunchActivity launchActivity = (LaunchActivity) obj3;
                String str = (String) obj;
                GeolocationPermissions.Callback callback = (GeolocationPermissions.Callback) obj2;
                str.getClass();
                callback.getClass();
                if (((LocationSensor) launchActivity.x0.getValue()).c()) {
                    callback.invoke(str, true, false);
                } else {
                    launchActivity.b1 = str;
                    launchActivity.c1 = callback;
                    launchActivity.d1.a(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"});
                }
                return j6g.a;
            case 5:
                fnf fnfVar = (fnf) obj3;
                b bVar3 = (b) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    zmf.a(fnfVar, "InboxScreen", bVar3, 48);
                } else {
                    bVar3.D();
                }
                return j6g.a;
            case 6:
                ((Integer) obj2).getClass();
                int i3 = b8a.o0;
                ((b8a) obj3).L(ka2.L(1), (b) obj);
                return j6g.a;
            case 7:
                ((Integer) obj2).getClass();
                s7b.a((t7b) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            case 8:
                ((Integer) obj2).getClass();
                ((bub) obj3).M(ka2.L(1), (b) obj);
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                Function1 function1 = (Function1) obj3;
                int iIntValue4 = ((Integer) obj).intValue();
                ((Boolean) obj2).booleanValue();
                if (iIntValue4 == 0) {
                    function1.invoke(o18.d);
                } else if (iIntValue4 == 1) {
                    function1.invoke(o18.e);
                } else if (iIntValue4 != 2) {
                    function1.invoke(o18.c);
                } else {
                    function1.invoke(o18.c);
                }
                return j6g.a;
            case 10:
                ApiError apiError = (ApiError) obj;
                apiError.getClass();
                ((zk6) ((osc) obj3).f.getValue()).getClass();
                zk6.b(apiError, (Request) obj2);
                return j6g.a;
            case 11:
                ((Integer) obj2).getClass();
                ((d1d) obj3).M(ka2.L(1), (b) obj);
                return j6g.a;
            case 12:
                ArrayList arrayList2 = (ArrayList) obj3;
                b bVar4 = (b) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (bVar4.o(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    e.a aVar = e.a.b;
                    e eVarD = g.d(aVar, 1.0f);
                    ob2 ob2VarA = mb2.a(new vs0.i(16.0f, true, new us0(z ? 1 : 0)), c20.a.m, bVar4, 54);
                    int iHashCode = Long.hashCode(bVar4.k());
                    t8b t8bVarM = bVar4.m();
                    e eVarC = c.c(bVar4, eVarD);
                    gl2.j.getClass();
                    pm8.a aVar2 = gl2.a.b;
                    if (bVar4.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar4.B();
                    if (bVar4.f()) {
                        bVar4.y(aVar2);
                    } else {
                        bVar4.n();
                    }
                    ygg.y(bVar4, ob2VarA, gl2.a.g);
                    ygg.y(bVar4, t8bVarM, gl2.a.f);
                    gl2.a.C0251a c0251a = gl2.a.j;
                    if (bVar4.f() || !wl7.b(bVar4.v(), Integer.valueOf(iHashCode))) {
                        uz.g(iHashCode, bVar4, iHashCode, c0251a);
                    }
                    ygg.y(bVar4, eVarC, gl2.a.d);
                    fx6.a(arrayList2, null, false, null, bVar4, 0, 14);
                    jh2.f(bVar4, g.h(aVar, v1c.d));
                    bVar4.q();
                } else {
                    bVar4.D();
                }
                return j6g.a;
            default:
                ((Integer) obj2).getClass();
                ((f4h) obj3).M(ka2.L(1), (b) obj);
                return j6g.a;
        }
    }

    public /* synthetic */ uw(Object obj, int i, int i2) {
        this.a = i2;
        this.b = obj;
    }
}
