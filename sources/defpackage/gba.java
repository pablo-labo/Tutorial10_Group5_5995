package defpackage;

import androidx.navigation.k;
import androidx.navigation.l;
import androidx.navigation.n;
import androidx.navigation.r;
import androidx.navigation.u;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Map;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class gba extends eba<l> {
    public final u h;
    public final String i;
    public final Object j;
    public final ArrayList k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gba(u uVar, Object obj, yd8<?> yd8Var, Map<zf8, r<?>> map) {
        super(uVar.b(u.a.a(n.class)), yd8Var, map);
        uVar.getClass();
        obj.getClass();
        map.getClass();
        this.k = new ArrayList();
        this.h = uVar;
        this.j = obj;
    }

    public final l c() throws IllegalAccessException, InvocationTargetException {
        l lVar = (l) super.a();
        ArrayList<k> arrayList = this.k;
        arrayList.getClass();
        for (k kVar : arrayList) {
            if (kVar != null) {
                lVar.l(kVar);
            }
        }
        Object obj = this.j;
        String str = this.i;
        if (str == null && obj == null) {
            if (this.c != null) {
                r6.g("You must set a start destination route");
                return null;
            }
            r6.g("You must set a start destination id");
            return null;
        }
        if (str != null) {
            lVar.t(str);
            return lVar;
        }
        if (obj == null) {
            lVar.s(0);
            return lVar;
        }
        KSerializer kSerializerM = awd.m(fwc.a.b(obj.getClass()));
        fba fbaVar = new fba(obj);
        int iB = ygd.b(kSerializerM);
        k kVarO = lVar.o(iB, lVar, false, null);
        if (kVarO == null) {
            v40.o("Cannot find startDestination ", kSerializerM.get$$serialDesc().getA(), " from NavGraph. Ensure the starting NavDestination was added with route from KClass.");
            return null;
        }
        lVar.t((String) fbaVar.invoke(kVarO));
        lVar.b0 = iB;
        return lVar;
    }

    public final void d(vk2 vk2Var) {
        this.k.add(vk2Var.a());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gba(u uVar, String str, String str2) {
        super(uVar.b(u.a.a(n.class)), -1, str2);
        uVar.getClass();
        str.getClass();
        this.k = new ArrayList();
        this.h = uVar;
        this.i = str;
    }
}
