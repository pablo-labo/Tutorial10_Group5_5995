package defpackage;

import com.apollographql.apollo.exception.MissingValueException;
import defpackage.g15;
import defpackage.hva;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class pd2 extends vd2 {
    public final String a;
    public final ka6 b;
    public final List<nd2> c;
    public final List<ld2> d;
    public final List<vd2> e;

    public pd2(String str, ka6 ka6Var, List list, List list2, List list3) {
        str.getClass();
        ka6Var.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.a = str;
        this.b = ka6Var;
        this.c = list;
        this.d = list2;
        this.e = list3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map<String, Object> a(g15.b bVar, Function1<? super ld2, Boolean> function1) {
        List<ld2> list = this.d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (function1.invoke(obj).booleanValue()) {
                arrayList.add(obj);
            }
        }
        ArrayList<ld2> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((ld2) obj2).b instanceof hva.c) {
                arrayList2.add(obj2);
            }
        }
        if (arrayList2.isEmpty()) {
            return bs4.a;
        }
        int iV = kc9.V(t92.r0(arrayList2, 10));
        if (iV < 16) {
            iV = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iV);
        for (ld2 ld2Var : arrayList2) {
            String str = (String) ld2Var.a.a;
            hva<Object> hvaVar = ld2Var.b;
            hvaVar.getClass();
            if (!(hvaVar instanceof hva.c)) {
                throw new MissingValueException();
            }
            Pair pair = new Pair(str, ((hva.c) hvaVar).a);
            linkedHashMap.put(pair.d(), pair.e());
        }
        Object objB = rd2.b(linkedHashMap, bVar);
        objB.getClass();
        return (Map) objB;
    }

    public final String b(g15.b bVar) {
        Map<String, Object> mapA = a(bVar, new od2(0));
        boolean zIsEmpty = mapA.isEmpty();
        String str = this.a;
        if (zIsEmpty) {
            return str;
        }
        try {
            zn1 zn1Var = new zn1();
            so1 so1Var = new so1(zn1Var);
            f.a(so1Var, mapA);
            so1Var.close();
            return str + '(' + zn1Var.z1() + ')';
        } catch (Exception e) {
            l5.r(e);
            return null;
        }
    }
}
