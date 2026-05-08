package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.r;
import com.indeed.android.backendservices.common.api.ApiError;
import com.indeed.android.jobsearch.JobSearchApplication;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jobsearch.forcedupgrade.ForcedUpgradeFragment;
import defpackage.cd4;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;
import okhttp3.Request;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class js0 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ js0(e8a e8aVar, int i) {
        this.a = 0;
        this.b = e8aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ArrayList arrayList;
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ks0.b((e8a) obj3, (b) obj, ka2.L(1));
                break;
            case 1:
                o97 o97Var = (o97) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    cif.b(ak2.I(R.string.comment_placeholder, bVar), null, o97Var.c.a.b, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o97Var.j.g, bVar, 0, 0, 65530);
                } else {
                    bVar.D();
                }
                break;
            case 2:
                g4a g4aVar = (g4a) obj3;
                String str = (String) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                str.getClass();
                List list = (List) g4aVar.getValue();
                if (list != null) {
                    arrayList = new ArrayList();
                    for (Object obj4 : list) {
                        if (!wl7.b((String) obj4, str)) {
                            arrayList.add(obj4);
                        }
                    }
                } else {
                    arrayList = null;
                }
                g4aVar.setValue(arrayList);
                if (zBooleanValue) {
                    List list2 = (List) g4aVar.getValue();
                    g4aVar.setValue(list2 != null ? z92.g1(str, list2) : null);
                }
                break;
            case 3:
                ForcedUpgradeFragment forcedUpgradeFragment = (ForcedUpgradeFragment) obj3;
                b bVar2 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zX = bVar2.x(forcedUpgradeFragment);
                    Object objV = bVar2.v();
                    if (zX || objV == b.a.a) {
                        objV = new j30(forcedUpgradeFragment, 7);
                        bVar2.p(objV);
                    }
                    fp5.a((gu5) objV, bVar2, 0);
                } else {
                    bVar2.D();
                }
                break;
            case 4:
                ((zk6) ((f97) obj3).f.getValue()).getClass();
                zk6.b((ApiError) obj, (Request) obj2);
                break;
            case 5:
                q87 q87Var = (q87) obj3;
                JobSearchApplication jobSearchApplication = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                break;
            case 6:
                fma fmaVar = (fma) obj3;
                b bVar3 = (b) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i2 = fma.s0;
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ne4 ne4Var = p97.a;
                    dd4 dd4Var = dd4.a;
                    ad4 ad4Var = dd4.n().a;
                    ad4Var.getClass();
                    ad4Var.e(cd4.a.D0);
                    cd4.i3.a.getClass();
                    rm2.a(ne4Var.a(h07.a), bh2.c(-408847927, new he4(fmaVar, 5), bVar3), bVar3, 56);
                } else {
                    bVar3.D();
                }
                break;
            case 7:
                dbc dbcVar = (dbc) obj3;
                b bVar4 = (b) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (bVar4.o(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    g4a g4aVarA = r.a(((d4g) dbcVar.b.getValue()).c, bVar4);
                    b4g.p(((c4g) g4aVarA.getValue()).b, ((c4g) g4aVarA.getValue()).c, ((c4g) g4aVarA.getValue()).a, ((c4g) g4aVarA.getValue()).d, false, bVar4, 0, 48);
                } else {
                    bVar4.D();
                }
                break;
            default:
                hed hedVar = (hed) obj3;
                b bVar5 = (b) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (bVar5.o(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    rm2.a(b4g.a.a(Boolean.TRUE), bh2.c(-1655901033, new vz2(hedVar, 6), bVar5), bVar5, 56);
                } else {
                    bVar5.D();
                }
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ js0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
