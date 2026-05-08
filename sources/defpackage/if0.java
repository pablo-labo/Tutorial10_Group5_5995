package defpackage;

import defpackage.j14;
import defpackage.lf0;
import defpackage.w5c;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class if0 implements Function1 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ if0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        e04 e04Var;
        j5c j5cVarA;
        j5c j5cVarA2;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                xx9 xx9Var = (xx9) obj;
                xx9Var.getClass();
                return xx9Var.l().h(((ei8) obj2).v());
            case 1:
                j14.b bVar = (j14.b) obj2;
                n8a n8aVar = (n8a) obj;
                n8aVar.getClass();
                h04 h04Var = j14.this.b;
                byte[] bArr = bVar.c.get(n8aVar);
                if (bArr == null) {
                    return null;
                }
                k5c k5cVar = (k5c) k5c.b.c(new ByteArrayInputStream(bArr), h04Var.a.p);
                if (k5cVar == null) {
                    return null;
                }
                gn9 gn9Var = h04Var.i;
                h04 h04Var2 = gn9Var.a;
                o8a o8aVar = h04Var2.b;
                hyf hyfVar = h04Var2.d;
                k5cVar.getClass();
                List<t4c> listI = k5cVar.I();
                listI.getClass();
                List<t4c> list = listI;
                ArrayList arrayList = new ArrayList(t92.r0(list, 10));
                for (t4c t4cVar : list) {
                    cf0 cf0Var = gn9Var.b;
                    t4cVar.getClass();
                    arrayList.add(cf0Var.a(t4cVar, o8aVar));
                }
                lf0 nf0Var = arrayList.isEmpty() ? lf0.a.a : new nf0(arrayList);
                q5c q5cVar = (q5c) ch5.d.c(k5cVar.L());
                switch (q5cVar == null ? -1 : w5c.a.b[q5cVar.ordinal()]) {
                    case 1:
                        e04Var = d04.d;
                        e04Var.getClass();
                        break;
                    case 2:
                        e04Var = d04.a;
                        e04Var.getClass();
                        break;
                    case 3:
                        e04Var = d04.b;
                        e04Var.getClass();
                        break;
                    case 4:
                        e04Var = d04.c;
                        e04Var.getClass();
                        break;
                    case 5:
                        e04Var = d04.e;
                        e04Var.getClass();
                        break;
                    case 6:
                        e04Var = d04.f;
                        e04Var.getClass();
                        break;
                    default:
                        e04Var = d04.a;
                        e04Var.getClass();
                        break;
                }
                s14 s14Var = new s14(h04Var2.a.a, h04Var2.c, nf0Var, q8a.b(o8aVar, k5cVar.M()), e04Var, k5cVar, h04Var2.b, hyfVar, h04Var2.e, h04Var2.g);
                List<l5c> listN = k5cVar.N();
                listN.getClass();
                gxf gxfVar = h04Var2.a(s14Var, listN, h04Var2.b, h04Var2.d, h04Var2.e, h04Var2.f).h;
                List<rxf> listB = gxfVar.b();
                if (k5cVar.U()) {
                    j5cVarA = k5cVar.O();
                    j5cVarA.getClass();
                } else {
                    if (!k5cVar.V()) {
                        r6.g("No underlyingType in ProtoBuf.TypeAlias");
                        return null;
                    }
                    j5cVarA = hyfVar.a(k5cVar.P());
                }
                mge mgeVarD = gxfVar.d(j5cVarA, false);
                if (k5cVar.Q()) {
                    j5cVarA2 = k5cVar.J();
                    j5cVarA2.getClass();
                } else {
                    if (!k5cVar.R()) {
                        r6.g("No expandedType in ProtoBuf.TypeAlias");
                        return null;
                    }
                    j5cVarA2 = hyfVar.a(k5cVar.K());
                }
                s14Var.M0(listB, mgeVarD, gxfVar.d(j5cVarA2, false));
                return s14Var;
            case 2:
                yx9 yx9Var = (yx9) obj2;
                mq5 mq5Var = (mq5) obj;
                mq5Var.getClass();
                return yx9Var.f.a(yx9Var, mq5Var, yx9Var.c);
            default:
                float[] fArr = ((if9) obj).a;
                sl8 sl8Var = (sl8) obj2;
                if (sl8Var.d()) {
                    ojh.m(sl8Var).A(sl8Var, fArr);
                }
                return j6g.a;
        }
    }
}
