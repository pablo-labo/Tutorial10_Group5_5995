package defpackage;

import defpackage.ei8;
import java.util.EnumMap;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class di8 implements gu5<ei8.a> {
    public final /* synthetic */ ei8 a;

    public di8(ei8 ei8Var) {
        this.a = ei8Var;
    }

    @Override // defpackage.gu5
    public final ei8.a invoke() {
        EnumMap enumMap = new EnumMap(bnb.class);
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        for (bnb bnbVar : bnb.values()) {
            String strC = bnbVar.m().c();
            if (strC == null) {
                ei8.a(47);
                throw null;
            }
            ei8 ei8Var = this.a;
            mge mgeVarO = ei8Var.k(strC).o();
            if (mgeVarO == null) {
                ei8.a(48);
                throw null;
            }
            String strC2 = bnbVar.f().c();
            if (strC2 == null) {
                ei8.a(47);
                throw null;
            }
            mge mgeVarO2 = ei8Var.k(strC2).o();
            if (mgeVarO2 == null) {
                ei8.a(48);
                throw null;
            }
            enumMap.put(bnbVar, mgeVarO2);
            map.put(mgeVarO, mgeVarO2);
            map2.put(mgeVarO2, mgeVarO);
        }
        return new ei8.a(enumMap, map, map2);
    }
}
