package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.b;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.backendservices.common.api.ApiError;
import com.indeed.android.jobsearch.bottomnav.IanMainFragment;
import com.indeed.android.jobsearch.viewjob.a;
import com.indeed.android.jobsearch.webview.indeedapply.IndeedApplyWebViewFragment;
import defpackage.c20;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.Request;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lr implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lr(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        b.a.C0020a c0020a = b.a.a;
        int i2 = 2;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((nr) obj3).M(ka2.L(1), (b) obj);
                return j6g.a;
            case 1:
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                ((yvb) obj3).I(str, str2);
                return j6g.a;
            case 2:
                ((Integer) obj2).getClass();
                ((h23) obj3).M(ka2.L(1), (b) obj);
                return j6g.a;
            case 3:
                ((Integer) obj2).getClass();
                ((nn4) obj3).M(ka2.L(1), (b) obj);
                return j6g.a;
            case 4:
                IanMainFragment ianMainFragment = (IanMainFragment) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    List list = (List) r.a(ianMainFragment.H().X, bVar).getValue();
                    boolean zX = bVar.x(ianMainFragment);
                    Object objV = bVar.v();
                    if (zX || objV == c0020a) {
                        objV = new tv(ianMainFragment, 10);
                        bVar.p(objV);
                    }
                    wy1.a(list, (Function1) objV, false, bVar, 0, 4);
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 5:
                IndeedApplyWebViewFragment indeedApplyWebViewFragment = (IndeedApplyWebViewFragment) obj3;
                b bVar2 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    rf9.a(null, false, false, false, false, true, bh2.c(1045013718, new ey(indeedApplyWebViewFragment, i2), bVar2), bVar2, 1769472, 31);
                } else {
                    bVar2.D();
                }
                return j6g.a;
            case 6:
                ((Integer) obj2).getClass();
                int i3 = d98.k0;
                ((d98) obj3).L(ka2.L(1), (b) obj);
                return j6g.a;
            case 7:
                vld vldVar = (vld) obj;
                List list2 = (List) ((Function2) obj3).invoke(vldVar, obj2);
                List list3 = list2;
                int size = list3.size();
                for (int i4 = 0; i4 < size; i4++) {
                    Object obj4 = list2.get(i4);
                    if (obj4 != null && !vldVar.a(obj4)) {
                        throw new IllegalArgumentException(("item at index " + i4 + " can't be saved: " + obj4).toString());
                    }
                }
                if (list3.isEmpty()) {
                    return null;
                }
                return new ArrayList(list3);
            case 8:
                ((Integer) obj2).getClass();
                s7b.g((String) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                ps7 ps7Var = (ps7) obj;
                ps7Var.getClass();
                ((wu5) obj3).q(ps7Var, (yr7) obj2, "Languages");
                return j6g.a;
            case 10:
                ((Integer) obj2).getClass();
                nec.e((gu5) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            case 11:
                o97 o97Var = (o97) obj3;
                b bVar3 = (b) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ev6.b(fv6.I5, f.f(e.a.b, 8.0f), null, null, o97Var.c.b.c, null, bVar3, 6, 44);
                } else {
                    bVar3.D();
                }
                return j6g.a;
            case 12:
                ApiError apiError = (ApiError) obj;
                apiError.getClass();
                ((zk6) ((z1g) obj3).c.getValue()).getClass();
                zk6.b(apiError, (Request) obj2);
                return j6g.a;
            case 13:
                ((Integer) obj2).getClass();
                ((t7g) obj3).M(ka2.L(1), (b) obj);
                return j6g.a;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                a aVar = (a) obj3;
                b bVar4 = (b) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                int i5 = a.H0;
                if (bVar4.o(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    jqg jqgVarG = aVar.Q().g();
                    boolean zX2 = bVar4.x(aVar);
                    Object objV2 = bVar4.v();
                    if (zX2 || objV2 == c0020a) {
                        objV2 = new qq(aVar, 28);
                        bVar4.p(objV2);
                    }
                    gu5 gu5Var = (gu5) objV2;
                    boolean zX3 = bVar4.x(aVar);
                    Object objV3 = bVar4.v();
                    if (zX3 || objV3 == c0020a) {
                        objV3 = new a1(aVar, 26);
                        bVar4.p(objV3);
                    }
                    gu5 gu5Var2 = (gu5) objV3;
                    boolean zX4 = bVar4.x(aVar);
                    Object objV4 = bVar4.v();
                    int i6 = 20;
                    if (zX4 || objV4 == c0020a) {
                        objV4 = new fk0(aVar, i6);
                        bVar4.p(objV4);
                    }
                    gu5 gu5Var3 = (gu5) objV4;
                    boolean zX5 = bVar4.x(aVar);
                    Object objV5 = bVar4.v();
                    if (zX5 || objV5 == c0020a) {
                        objV5 = new le(aVar, i6);
                        bVar4.p(objV5);
                    }
                    gu5 gu5Var4 = (gu5) objV5;
                    boolean zX6 = bVar4.x(aVar);
                    Object objV6 = bVar4.v();
                    if (zX6 || objV6 == c0020a) {
                        objV6 = new qr(aVar, 24);
                        bVar4.p(objV6);
                    }
                    gu5 gu5Var5 = (gu5) objV6;
                    boolean zX7 = bVar4.x(aVar);
                    Object objV7 = bVar4.v();
                    if (zX7 || objV7 == c0020a) {
                        objV7 = new xh(aVar, 17);
                        bVar4.p(objV7);
                    }
                    gu5 gu5Var6 = (gu5) objV7;
                    boolean z = aVar.Q().g().k;
                    boolean zX8 = bVar4.x(aVar);
                    Object objV8 = bVar4.v();
                    if (zX8 || objV8 == c0020a) {
                        objV8 = new oe(aVar, 21);
                        bVar4.p(objV8);
                    }
                    iqg.a(jqgVarG, gu5Var, gu5Var2, gu5Var3, gu5Var4, gu5Var5, gu5Var6, z, (gu5) objV8, bVar4, 0);
                } else {
                    bVar4.D();
                }
                return j6g.a;
            default:
                return new lh7(((long) ((c20.c) obj3).a(0, (int) (((th7) obj).a & 4294967295L))) & 4294967295L);
        }
    }

    public /* synthetic */ lr(Object obj, int i, int i2) {
        this.a = i2;
        this.b = obj;
    }
}
