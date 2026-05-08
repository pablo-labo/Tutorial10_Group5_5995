package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.fasterxml.jackson.databind.JsonNode;
import defpackage.w6;
import defpackage.x1f;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.apache.avro.f;
import org.apache.avro.g;

/* JADX INFO: loaded from: classes3.dex */
public final class e5d extends alg {
    public static final bt4 a;

    public class a extends w6.c {
    }

    static {
        a aVar = new a();
        if (w6.c != null) {
            r6.g("ResolvingGrammarGeneratorAccessor already initialized");
            return;
        }
        w6.c = aVar;
        bt4 bt4Var = new bt4();
        bt4Var.a = 32;
        a = bt4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(defpackage.fo1 r3, org.apache.avro.g r4, com.fasterxml.jackson.databind.JsonNode r5) {
        /*
            Method dump skipped, instruction units count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e5d.a(fo1, org.apache.avro.g, com.fasterxml.jackson.databind.JsonNode):void");
    }

    public static x1f b(f.a aVar, HashMap map) throws IOException {
        if (aVar instanceof f.c) {
            return c(aVar.a, map);
        }
        if (aVar instanceof f.e) {
            String string = aVar.toString();
            x1f.o oVar = x1f.c;
            return new x1f.e(string);
        }
        if (aVar instanceof f.i) {
            x1f x1fVarC = c(aVar.a, map);
            x1f.o oVar2 = x1f.c;
            return new x1f.n(x1fVarC);
        }
        if (aVar instanceof f.C0378f) {
            x1f x1fVarC2 = c(aVar.a, map);
            x1f x1fVarC3 = c(aVar.b, map);
            x1f.o oVar3 = x1f.c;
            return new x1f.l(x1fVarC2, x1fVarC3);
        }
        if (aVar instanceof f.g) {
            f.g gVar = (f.g) aVar;
            x1f x1fVarB = b(gVar.e, map);
            int i = gVar.d;
            x1f.o oVar4 = x1f.c;
            return new x1f.a(new x1f[]{new x1f.p(i, x1fVarB), x1f.b0});
        }
        g gVar2 = aVar.a;
        if (gVar2.K() == g.u.ARRAY) {
            return new x1f.a(new x1f[]{new x1f.k(x1f.d0, b(((f.b) aVar).d, map)), x1f.c0});
        }
        if (gVar2.K() == g.u.MAP) {
            return new x1f.a(new x1f[]{new x1f.k(x1f.f0, b(((f.b) aVar).d, map), x1f.X), x1f.e0});
        }
        if (gVar2.K() == g.u.UNION) {
            f.j jVar = (f.j) aVar;
            if (jVar.e) {
                return c(aVar.b, map);
            }
            f.a[] aVarArr = jVar.d;
            x1f[] x1fVarArr = new x1f[aVarArr.length];
            String[] strArr = new String[aVarArr.length];
            int i2 = 0;
            for (f.a aVar2 : aVarArr) {
                x1fVarArr[i2] = b(aVar2, map);
                strArr[i2] = gVar2.L().get(i2).E();
                i2++;
            }
            x1f.o oVar5 = x1f.c;
            return new x1f.a(new x1f[]{new x1f.b(x1fVarArr, strArr), x1f.g0});
        }
        if (aVar instanceof f.d) {
            f.d dVar = (f.d) aVar;
            int[] iArr = dVar.d;
            int length = iArr.length;
            Object[] objArr = new Object[length];
            for (int i3 = 0; i3 < length; i3++) {
                int i4 = iArr[i3];
                objArr[i3] = i4 >= 0 ? Integer.valueOf(i4) : l5.l("No match for ", dVar.a.A().get(i3));
            }
            int size = dVar.b.A().size();
            x1f.o oVar6 = x1f.c;
            return new x1f.a(new x1f[]{new x1f.d(size, objArr), x1f.a0});
        }
        if (!(aVar instanceof f.h)) {
            l5.q("Unrecognized Resolver.Action: ".concat(String.valueOf(aVar)));
            return null;
        }
        x1f x1fVar = (x1f) map.get(aVar);
        if (x1fVar != null) {
            return x1fVar;
        }
        f.h hVar = (f.h) aVar;
        f.a[] aVarArr2 = hVar.d;
        int i5 = hVar.f;
        g.f[] fVarArr = hVar.e;
        int length2 = ((fVarArr.length - i5) * 3) + aVarArr2.length + 1;
        x1f[] x1fVarArr2 = new x1f[length2];
        x1f.o oVar7 = x1f.c;
        x1f.a aVar3 = new x1f.a(x1fVarArr2);
        map.put(aVar, aVar3);
        int i6 = length2 - 1;
        x1fVarArr2[i6] = new x1f.f(fVarArr);
        for (f.a aVar4 : aVarArr2) {
            i6--;
            x1fVarArr2[i6] = b(aVar4, map);
        }
        while (i5 < fVarArr.length) {
            g.f fVar = fVarArr[i5];
            g gVar3 = fVar.d;
            w6.b.getClass();
            JsonNode jsonNode = fVar.f;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            fo1 fo1VarA = a.a(byteArrayOutputStream);
            a(fo1VarA, gVar3, jsonNode);
            fo1VarA.flush();
            x1fVarArr2[i6 - 1] = new x1f.c(byteArrayOutputStream.toByteArray());
            x1fVarArr2[i6 - 2] = c(fVar.d, map);
            i6 -= 3;
            x1fVarArr2[i6] = x1f.i0;
            i5++;
        }
        return aVar3;
    }

    public static x1f c(g gVar, HashMap map) {
        switch (gVar.K().ordinal()) {
            case 0:
                x1f x1fVar = (x1f) map.get(gVar);
                if (x1fVar != null) {
                    return x1fVar;
                }
                int size = gVar.C().size();
                x1f[] x1fVarArr = new x1f[size + 1];
                x1f.o oVar = x1f.c;
                x1f.a aVar = new x1f.a(x1fVarArr);
                map.put(gVar, aVar);
                x1fVarArr[size] = new x1f.f((g.f[]) gVar.C().toArray(new g.f[0]));
                Iterator<g.f> it = gVar.C().iterator();
                while (it.hasNext()) {
                    size--;
                    x1fVarArr[size] = c(it.next().d, map);
                }
                return aVar;
            case 1:
                int size2 = gVar.A().size();
                x1f.o oVar2 = x1f.c;
                return new x1f.a(new x1f[]{new x1f.d(size2, null), x1f.a0});
            case 2:
                return new x1f.a(new x1f[]{new x1f.k(x1f.d0, c(gVar.x(), map)), x1f.c0});
            case 3:
                return new x1f.a(new x1f[]{new x1f.k(x1f.f0, c(gVar.M(), map), x1f.X), x1f.e0});
            case 4:
                List<g> listL = gVar.L();
                x1f[] x1fVarArr2 = new x1f[listL.size()];
                String[] strArr = new String[listL.size()];
                int i = 0;
                for (g gVar2 : gVar.L()) {
                    x1fVarArr2[i] = c(gVar2, map);
                    strArr[i] = gVar2.E();
                    i++;
                }
                x1f.o oVar3 = x1f.c;
                return new x1f.a(new x1f[]{new x1f.b(x1fVarArr2, strArr), x1f.b0});
            case 5:
                int iD = gVar.D();
                x1f.o oVar4 = x1f.c;
                return new x1f.a(new x1f[]{new x1f.i(iD), x1f.Z});
            case 6:
                return x1f.X;
            case 7:
                return x1f.Y;
            case 8:
                return x1f.e;
            case DatadogLogGenerator.CRASH /* 9 */:
                return x1f.f;
            case 10:
                return x1f.V;
            case 11:
                return x1f.W;
            case 12:
                return x1f.d;
            case 13:
                return x1f.c;
            default:
                l5.q("Unexpected schema: ".concat(String.valueOf(gVar)));
                return null;
        }
    }
}
