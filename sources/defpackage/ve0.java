package defpackage;

import androidx.fragment.app.g;
import defpackage.awc;
import defpackage.ewc;
import defpackage.hi8;
import defpackage.in9;
import defpackage.ke8;
import defpackage.te8;
import defpackage.vz1;
import defpackage.y52;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
public final class ve0 implements gu5 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ ve0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        t52 t52VarA;
        hi8 hi8Var;
        int i = this.a;
        int iHashCode = 0;
        Object obj = this.b;
        switch (i) {
            case 0:
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    iHashCode += (value instanceof boolean[] ? Arrays.hashCode((boolean[]) value) : value instanceof char[] ? Arrays.hashCode((char[]) value) : value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value instanceof short[] ? Arrays.hashCode((short[]) value) : value instanceof int[] ? Arrays.hashCode((int[]) value) : value instanceof float[] ? Arrays.hashCode((float[]) value) : value instanceof long[] ? Arrays.hashCode((long[]) value) : value instanceof double[] ? Arrays.hashCode((double[]) value) : value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode()) ^ (str.hashCode() * 127);
                }
                return Integer.valueOf(iHashCode);
            case 1:
                return ((rc8) obj).a.d.e();
            case 2:
                ke8 ke8Var = (ke8) obj;
                int i2 = ke8.d;
                a62 a62VarG = ke8Var.G();
                Class<T> cls = ke8Var.b;
                ewc.a aVar = ke8Var.c.getValue().a;
                qf8<Object> qf8Var = te8.a.b[0];
                Object objInvoke = aVar.invoke();
                objInvoke.getClass();
                phd phdVar = (phd) objInvoke;
                g04 g04Var = phdVar.a;
                xx9 xx9Var = g04Var.b;
                if (a62VarG.c && cls.isAnnotationPresent(Metadata.class)) {
                    y52 y52Var = g04Var.t;
                    Set<a62> set = y52.c;
                    y52Var.getClass();
                    t52VarA = (t52) y52Var.b.invoke(new y52.a(a62VarG, null));
                } else {
                    t52VarA = rc5.a(xx9Var, a62VarG);
                }
                if (t52VarA != null) {
                    return t52VarA;
                }
                if (cls.isSynthetic()) {
                    return ke8.F(a62VarG, phdVar);
                }
                awc awcVarA = awc.a.a(cls);
                hi8.a aVar2 = (awcVarA == null || (hi8Var = awcVarA.b) == null) ? null : hi8Var.a;
                switch (aVar2 == null ? -1 : ke8.b.a[aVar2.ordinal()]) {
                    case -1:
                    case 6:
                        akb.p("Unresolved class: ", cls, " (kind = ", aVar2);
                        return null;
                    case 0:
                    default:
                        l.g();
                        return null;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        return ke8.F(a62VarG, phdVar);
                    case 5:
                        akb.p("Unknown class: ", cls, " (kind = ", aVar2);
                        return null;
                }
            case 3:
                ws8 ws8Var = (ws8) obj;
                boolean zIsEmpty = ws8Var.isEmpty();
                mq5 mq5Var = ws8Var.d;
                yx9 yx9Var = ws8Var.c;
                if (zIsEmpty) {
                    return in9.b.b;
                }
                List<lya> listH0 = ws8Var.h0();
                ArrayList arrayList = new ArrayList(t92.r0(listH0, 10));
                Iterator<T> it = listH0.iterator();
                while (it.hasNext()) {
                    arrayList.add(((lya) it.next()).n());
                }
                return vz1.a.a("package view scope for " + mq5Var + " in " + yx9Var.getName(), z92.g1(new fxe(yx9Var, mq5Var), arrayList));
            default:
                return ((g) obj).getViewModelStore();
        }
    }
}
