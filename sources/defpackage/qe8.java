package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class qe8 {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ig8.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final cg8 a(oe8 oe8Var, List list, boolean z, List list2) {
        v62 descriptor;
        gwf gwfVar;
        dwf hreVar;
        oe8Var.getClass();
        list.getClass();
        list2.getClass();
        pe8 pe8Var = oe8Var instanceof pe8 ? (pe8) oe8Var : null;
        if (pe8Var == null || (descriptor = pe8Var.getDescriptor()) == null) {
            StringBuilder sb = new StringBuilder("Cannot create type for an unsupported classifier: ");
            sb.append(oe8Var);
            Class<?> cls = oe8Var.getClass();
            sb.append(" (");
            sb.append(cls);
            sb.append(')');
            throw new qi8(sb.toString());
        }
        kwf kwfVarJ = descriptor.j();
        kwfVarJ.getClass();
        List<rxf> parameters = kwfVarJ.getParameters();
        parameters.getClass();
        if (parameters.size() != list.size()) {
            throw new IllegalArgumentException("Class declares " + parameters.size() + " type parameters, but " + list.size() + " were provided.");
        }
        if (list2.isEmpty()) {
            gwf.b.getClass();
            gwfVar = gwf.c;
        } else {
            gwf.b.getClass();
            gwfVar = gwf.c;
        }
        List<rxf> parameters2 = kwfVarJ.getParameters();
        parameters2.getClass();
        List list3 = list;
        ArrayList arrayList = new ArrayList(t92.r0(list3, 10));
        int i = 0;
        for (Object obj : list3) {
            int i2 = i + 1;
            if (i < 0) {
                u63.o0();
                throw null;
            }
            gg8 gg8Var = (gg8) obj;
            cg8 cg8Var = (cg8) gg8Var.b;
            ui8 ui8Var = cg8Var != null ? cg8Var.a : null;
            ig8 ig8Var = gg8Var.a;
            int i3 = ig8Var == null ? -1 : a.a[ig8Var.ordinal()];
            if (i3 == -1) {
                rxf rxfVar = parameters2.get(i);
                rxfVar.getClass();
                hreVar = new hre(rxfVar);
            } else if (i3 == 1) {
                ui8Var.getClass();
                hreVar = new yxf(ui8Var, ylg.INVARIANT);
            } else if (i3 == 2) {
                ui8Var.getClass();
                hreVar = new yxf(ui8Var, ylg.IN_VARIANCE);
            } else {
                if (i3 != 3) {
                    l.g();
                    return null;
                }
                ui8Var.getClass();
                hreVar = new yxf(ui8Var, ylg.OUT_VARIANCE);
            }
            arrayList.add(hreVar);
            i = i2;
        }
        return new cg8(yi8.c(gwfVar, kwfVarJ, arrayList, z, null), null);
    }
}
