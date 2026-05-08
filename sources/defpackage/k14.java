package defpackage;

import defpackage.g5c;
import defpackage.j14;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class k14 implements Function1 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ k14(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                j14.b bVar = (j14.b) obj2;
                n8a n8aVar = (n8a) obj;
                n8aVar.getClass();
                LinkedHashMap linkedHashMap = bVar.b;
                g5c.a aVar = g5c.b;
                aVar.getClass();
                j14 j14Var = j14.this;
                byte[] bArr = (byte[]) linkedHashMap.get(n8aVar);
                Collection<g5c> collectionW = bArr != null ? a7e.W(v6e.N(new j14.b.a(aVar, new ByteArrayInputStream(bArr), j14Var))) : zr4.a;
                ArrayList arrayList = new ArrayList(collectionW.size());
                for (g5c g5cVar : collectionW) {
                    gn9 gn9Var = j14Var.b.i;
                    g5cVar.getClass();
                    arrayList.add(gn9Var.f(g5cVar));
                }
                j14Var.k(n8aVar, arrayList);
                return r03.i(arrayList);
            default:
                ((List) obj2).get(((Number) obj).intValue());
                return null;
        }
    }
}
