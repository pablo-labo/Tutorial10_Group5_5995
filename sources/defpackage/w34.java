package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.bridge.ReadableMap;
import com.indeed.android.rninterviewprep.RNInterviewPrepModule;
import defpackage.c87;
import defpackage.gdf;
import defpackage.ig3;
import defpackage.lx5;
import defpackage.u34;
import defpackage.ude;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class w34 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w34(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ig3.b bVar;
        ig3 ig3VarA;
        ig3.b bVar2;
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj3;
                Map map = (Map) obj;
                str.getClass();
                map.put("bannerImageUrl", str);
                map.put("imageLoaded", ((u34.c) obj2).b);
                return j6g.a;
            case 1:
                lx5.b bVar3 = (lx5.b) obj;
                w40.l(bVar3, "subTabName", "SAVED", "userJobStatus", (String) obj3);
                bVar3.a("myjobsPageTk", ie7.Z);
                bVar3.a("appTk", (String) obj2);
                return j6g.a;
            case 2:
                ((d3a) obj3).c((ci7) obj2);
                return j6g.a;
            case 3:
                xm5 xm5Var = (xm5) obj;
                xm5Var.getClass();
                boolean zC = xm5Var.c();
                pxc pxcVar = qw6.a;
                ((g4a) obj2).setValue(Boolean.valueOf(zC));
                ((Function1) obj3).invoke(Boolean.valueOf(xm5Var.c()));
                return j6g.a;
            case 4:
                g4a g4aVar = (g4a) obj2;
                if (!((hee) obj3).c()) {
                    g4aVar.setValue(null);
                }
                return j6g.a;
            case 5:
                vu5 vu5Var = (jd7) obj3;
                hd7 hd7Var = (hd7) obj2;
                y3b y3bVar = (y3b) obj;
                y3bVar.getClass();
                d2f d2fVar = c87.a;
                String strA = c87.a.a(ez2.b);
                if (strA == null) {
                    return j6g.a;
                }
                y3bVar.b("old_ctk", strA);
                y3bVar.b("new_ctk", hd7Var.b.a);
                return j6g.a;
            case 6:
                s5e s5eVar = (s5e) obj;
                o5e.f(s5eVar, (String) obj3);
                s5eVar.a(v4e.b, new r5(null, new hh(10, (gu5) obj2)));
                return j6g.a;
            case 7:
                Function1 function1 = (Function1) obj3;
                ig3 ig3Var = (ig3) obj2;
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                if (ig3Var != null) {
                    ig3.b bVar4 = ig3Var.c;
                    if (bVar4 != null) {
                        bVar2 = new ig3.b(bool, zBooleanValue ? null : bVar4.b, zBooleanValue ? null : bVar4.c);
                    } else {
                        bVar2 = null;
                    }
                    ig3VarA = ig3.a(ig3Var, null, bool, bVar2, 1);
                } else {
                    ig3 ig3Var2 = v1c.b;
                    ig3.b bVar5 = ig3Var2.c;
                    if (bVar5 != null) {
                        bVar = new ig3.b(bool, zBooleanValue ? null : bVar5.b, zBooleanValue ? null : bVar5.c);
                    } else {
                        bVar = null;
                    }
                    ig3VarA = ig3.a(ig3Var2, null, bool, bVar, 1);
                }
                function1.invoke(ig3VarA);
                return j6g.a;
            case 8:
                return RNInterviewPrepModule.logInterviewPrepEvent$lambda$1((ReadableMap) obj3, (RNInterviewPrepModule) obj2, (lx5.b) obj);
            case DatadogLogGenerator.CRASH /* 9 */:
                iy3 iy3Var = (iy3) obj3;
                m94 m94Var = (m94) obj;
                ((g4a) obj2).setValue(new th7((((long) iy3Var.x0(m94.b(m94Var.a))) << 32) | (((long) iy3Var.x0(m94.a(m94Var.a))) & 4294967295L)));
                return j6g.a;
            case 10:
                vde vdeVarI = ((ude) obj3).i();
                fv6 fv6Var = fv6.o3;
                ude.c.x xVar = (ude.c.x) ((ude.c) obj2);
                String str2 = xVar.a;
                String str3 = xVar.b;
                return vde.a(vdeVarI, null, false, false, null, null, null, new uz6(fv6Var, str2, str3.length() > 0 ? str3 : null, xVar.c, true, 96), null, false, null, null, null, 4031);
            case 11:
                ((String) obj).getClass();
                ((Function2) obj3).invoke((zie) obj2, Boolean.FALSE);
                return j6g.a;
            default:
                bt btVar = (bt) obj3;
                gdf.a aVar = (gdf.a) obj2;
                jtf jtfVar = (jtf) obj;
                if (jtfVar instanceof ox) {
                    btVar.invoke(((ox) jtfVar).d0);
                } else {
                    if (!(jtfVar instanceof vb5)) {
                        r6.g("TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.");
                        return null;
                    }
                    aVar.invoke(null);
                }
                return Boolean.TRUE;
        }
    }
}
