package defpackage;

import defpackage.b5c;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes3.dex */
public class jwc extends iwc {
    public static te8 l(iv1 iv1Var) {
        re8 owner = iv1Var.getOwner();
        return owner instanceof te8 ? (te8) owner : ur4.b;
    }

    @Override // defpackage.iwc
    public final ve8 a(pv5 pv5Var) {
        te8 te8VarL = l(pv5Var);
        String name = pv5Var.getName();
        String signature = pv5Var.getSignature();
        Object boundReceiver = pv5Var.getBoundReceiver();
        te8VarL.getClass();
        name.getClass();
        signature.getClass();
        return new ye8(te8VarL, name, signature, null, boundReceiver);
    }

    @Override // defpackage.iwc
    public final yd8 b(Class cls) {
        return uu1.a(cls);
    }

    @Override // defpackage.iwc
    public final re8 c(Class cls) {
        kn2 kn2Var = uu1.a;
        cls.getClass();
        return (re8) uu1.b.a(cls);
    }

    @Override // defpackage.iwc
    public final ef8 d(t3a t3aVar) {
        return new ff8(l(t3aVar), t3aVar.getName(), t3aVar.getSignature(), t3aVar.getBoundReceiver());
    }

    @Override // defpackage.iwc
    public final gf8 e(v3a v3aVar) {
        return new hf8(l(v3aVar), v3aVar.getName(), v3aVar.getSignature(), v3aVar.getBoundReceiver());
    }

    @Override // defpackage.iwc
    public final rf8 f(i4c i4cVar) {
        return new sf8(l(i4cVar), i4cVar.getName(), i4cVar.getSignature(), i4cVar.getBoundReceiver());
    }

    @Override // defpackage.iwc
    public final tf8 g(k4c k4cVar) {
        return new uf8(l(k4cVar), k4cVar.getName(), k4cVar.getSignature(), k4cVar.getBoundReceiver());
    }

    @Override // defpackage.iwc
    public final vf8 h(m4c m4cVar) {
        return new wf8(l(m4cVar), m4cVar.getName(), m4cVar.getSignature());
    }

    @Override // defpackage.iwc
    public final String i(fv5 fv5Var) throws IOException {
        ye8 ye8VarB;
        Metadata metadata = (Metadata) fv5Var.getClass().getAnnotation(Metadata.class);
        ye8 ye8Var = null;
        if (metadata != null) {
            String[] strArrD1 = metadata.d1();
            if (strArrD1.length == 0) {
                strArrD1 = null;
            }
            if (strArrD1 != null) {
                String[] strArrD2 = metadata.d2();
                s45 s45Var = pd8.a;
                strArrD2.getClass();
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(ag1.a(strArrD1));
                s45 s45Var2 = pd8.a;
                hd8 hd8VarG = pd8.g(byteArrayInputStream, strArrD2);
                s45 s45Var3 = pd8.a;
                b5c.a aVar = b5c.b;
                aVar.getClass();
                e92 e92Var = new e92(byteArrayInputStream);
                rp9 rp9Var = (rp9) aVar.a(e92Var, s45Var3);
                try {
                    e92Var.a(0);
                    p3.b(rp9Var);
                    Pair pair = new Pair(hd8VarG, (b5c) rp9Var);
                    hd8 hd8Var = (hd8) pair.a();
                    b5c b5cVar = (b5c) pair.b();
                    us9 us9Var = new us9(metadata.mv(), (metadata.xi() & 8) != 0);
                    Class<?> cls = fv5Var.getClass();
                    m5c m5cVarA0 = b5cVar.a0();
                    m5cVarA0.getClass();
                    ye8Var = new ye8(ur4.b, (sfe) akg.f(cls, b5cVar, hd8Var, new hyf(m5cVarA0), us9Var, dwc.a));
                } catch (InvalidProtocolBufferException e) {
                    e.b(rp9Var);
                    throw e;
                }
            }
        }
        if (ye8Var == null || (ye8VarB = akg.b(ye8Var)) == null) {
            return super.i(fv5Var);
        }
        pz3 pz3Var = lwc.a;
        kv5 kv5VarF = ye8VarB.z();
        StringBuilder sb = new StringBuilder();
        lwc.a(kv5VarF, sb);
        List<rlg> listI = kv5VarF.i();
        listI.getClass();
        z92.V0(listI, sb, ", ", "(", ")", op1.e, 48);
        sb.append(" -> ");
        ui8 returnType = kv5VarF.getReturnType();
        returnType.getClass();
        sb.append(lwc.a.X(returnType));
        return sb.toString();
    }

    @Override // defpackage.iwc
    public final String j(mj8 mj8Var) {
        return i(mj8Var);
    }

    @Override // defpackage.iwc
    public final zf8 k(yd8 yd8Var, List list, boolean z) {
        if (!(yd8Var instanceof k52)) {
            return qe8.a(yd8Var, list, z, Collections.EMPTY_LIST);
        }
        Class<?> clsJ = ((k52) yd8Var).j();
        kn2 kn2Var = uu1.a;
        clsJ.getClass();
        list.getClass();
        if (list.isEmpty()) {
            return z ? (zf8) uu1.d.a(clsJ) : (zf8) uu1.c.a(clsJ);
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) uu1.e.a(clsJ);
        Pair pair = new Pair(list, Boolean.valueOf(z));
        Object obj = concurrentHashMap.get(pair);
        if (obj == null) {
            cg8 cg8VarA = qe8.a(uu1.a(clsJ), list, z, zr4.a);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(pair, cg8VarA);
            obj = objPutIfAbsent == null ? cg8VarA : objPutIfAbsent;
        }
        return (zf8) obj;
    }
}
