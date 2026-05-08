package defpackage;

import androidx.navigation.b;
import androidx.navigation.c;
import androidx.navigation.k;
import androidx.navigation.r;
import androidx.navigation.s;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public class eba<D extends k> {
    public final s<? extends D> a;
    public final int b;
    public final String c;
    public final Map<zf8, ? extends r<?>> d;
    public final LinkedHashMap e;
    public final ArrayList f;
    public final LinkedHashMap g;

    public eba(s<? extends D> sVar, yd8<?> yd8Var, Map<zf8, r<?>> map) throws IllegalAccessException, InvocationTargetException {
        String str;
        map.getClass();
        int iB = yd8Var != null ? ygd.b(awd.m(yd8Var)) : -1;
        if (yd8Var != null) {
            KSerializer kSerializerM = awd.m(yd8Var);
            vgd vgdVar = new vgd(kSerializerM);
            if (kSerializerM instanceof mfb) {
                vgdVar.invoke();
                throw null;
            }
            qgd qgdVar = new qgd(kSerializerM);
            wgd wgdVar = new wgd(qgdVar);
            int c = kSerializerM.get$$serialDesc().getC();
            for (int i = 0; i < c; i++) {
                String strE = kSerializerM.get$$serialDesc().e(i);
                r<Object> rVarA = ygd.a(kSerializerM.get$$serialDesc().h(i), map);
                if (rVarA == null) {
                    l5.q(ygd.e(strE, kSerializerM.get$$serialDesc().h(i).getA(), kSerializerM.get$$serialDesc().getA(), map.toString()));
                    throw null;
                }
                wgdVar.q(Integer.valueOf(i), strE, rVarA);
            }
            str = qgdVar.b + qgdVar.c + qgdVar.d;
        } else {
            str = null;
        }
        this(sVar, iB, str);
        if (yd8Var != null) {
            KSerializer kSerializerM2 = awd.m(yd8Var);
            tgd tgdVar = new tgd(kSerializerM2);
            if (kSerializerM2 instanceof mfb) {
                tgdVar.invoke();
                throw null;
            }
            int c2 = kSerializerM2.get$$serialDesc().getC();
            ArrayList<u8a> arrayList = new ArrayList(c2);
            for (int i2 = 0; i2 < c2; i2++) {
                String strE2 = kSerializerM2.get$$serialDesc().e(i2);
                ugd ugdVar = new ugd(kSerializerM2, i2, map, strE2);
                strE2.getClass();
                c cVar = new c();
                ugdVar.invoke(cVar);
                arrayList.add(new u8a(strE2, cVar.a.a()));
            }
            for (u8a u8aVar : arrayList) {
                this.e.put(u8aVar.a, u8aVar.b);
            }
        }
        this.d = map;
    }

    public D a() {
        D d = (D) b();
        d.d = null;
        for (Map.Entry entry : this.e.entrySet()) {
            String str = (String) entry.getKey();
            b bVar = (b) entry.getValue();
            str.getClass();
            bVar.getClass();
            d.V.put(str, bVar);
        }
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            d.a((aba) it.next());
        }
        for (Map.Entry entry2 : this.g.entrySet()) {
            d.j(((Number) entry2.getKey()).intValue(), (laa) entry2.getValue());
        }
        String str2 = this.c;
        if (str2 != null) {
            d.k(str2);
        }
        int i = this.b;
        if (i != -1) {
            d.W = i;
            d.c = null;
        }
        return d;
    }

    public D b() {
        return (D) this.a.a();
    }

    public eba(s<? extends D> sVar, int i, String str) {
        this.a = sVar;
        this.b = i;
        this.c = str;
        this.e = new LinkedHashMap();
        this.f = new ArrayList();
        this.g = new LinkedHashMap();
    }
}
