package defpackage;

import defpackage.b5c;
import defpackage.j14;
import defpackage.jp1;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class x1 implements Function1 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ x1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws IOException {
        InputStream inputStreamA;
        int i = this.a;
        kj7 kj7Var = null;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                y1 y1Var = (y1) obj2;
                mq5 mq5Var = (mq5) obj;
                mq5Var.getClass();
                vc8 vc8Var = (vc8) y1Var;
                bwc bwcVar = vc8Var.b;
                if (mq5Var.c(ere.k)) {
                    lp1 lp1Var = bwcVar.b;
                    cp1.m.getClass();
                    String strA = cp1.a(mq5Var);
                    lp1Var.getClass();
                    inputStreamA = lp1.a(strA);
                } else {
                    inputStreamA = null;
                }
                jp1 jp1VarA = inputStreamA != null ? jp1.a.a(mq5Var, vc8Var.a, vc8Var.c, inputStreamA) : null;
                if (jp1VarA == null) {
                    return null;
                }
                g04 g04Var = y1Var.d;
                if (g04Var != null) {
                    jp1VarA.L0(g04Var);
                    return jp1VarA;
                }
                wl7.g("components");
                throw null;
            case 1:
                j14.b bVar = (j14.b) obj2;
                n8a n8aVar = (n8a) obj;
                n8aVar.getClass();
                LinkedHashMap linkedHashMap = bVar.a;
                b5c.a aVar = b5c.b;
                aVar.getClass();
                j14 j14Var = j14.this;
                byte[] bArr = (byte[]) linkedHashMap.get(n8aVar);
                Collection<b5c> collectionW = bArr != null ? a7e.W(v6e.N(new j14.b.a(aVar, new ByteArrayInputStream(bArr), j14Var))) : zr4.a;
                ArrayList arrayList = new ArrayList(collectionW.size());
                for (b5c b5cVar : collectionW) {
                    gn9 gn9Var = j14Var.b.i;
                    b5cVar.getClass();
                    r14 r14VarE = gn9Var.e(b5cVar);
                    if (!j14Var.r(r14VarE)) {
                        r14VarE = null;
                    }
                    if (r14VarE != null) {
                        arrayList.add(r14VarE);
                    }
                }
                j14Var.j(n8aVar, arrayList);
                return r03.i(arrayList);
            case 2:
                kj7 kj7Var2 = (kj7) obj2;
                bj8 bj8Var = (bj8) obj;
                bj8Var.getClass();
                bj8Var.getClass();
                LinkedHashSet<ui8> linkedHashSet = kj7Var2.b;
                ArrayList arrayList2 = new ArrayList(t92.r0(linkedHashSet, 10));
                Iterator<T> it = linkedHashSet.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    arrayList2.add(((ui8) it.next()).O0(bj8Var));
                    z = true;
                }
                if (z) {
                    ui8 ui8Var = kj7Var2.a;
                    ui8 ui8VarO0 = ui8Var != null ? ui8Var.O0(bj8Var) : null;
                    kj7 kj7Var3 = new kj7(new kj7(arrayList2).b);
                    kj7Var3.a = ui8VarO0;
                    kj7Var = kj7Var3;
                }
                if (kj7Var != null) {
                    kj7Var2 = kj7Var;
                }
                return kj7Var2.f();
            default:
                obj.getClass();
                ((mke) obj2).add(obj);
                return j6g.a;
        }
    }
}
