package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class gsf {
    public final k65 a;
    public final bke b;
    public final t12 c;
    public final vmd d;
    public final boolean e;
    public final Map<Object, Object> f;

    public /* synthetic */ gsf(k65 k65Var, bke bkeVar, t12 t12Var, vmd vmdVar, LinkedHashMap linkedHashMap, int i) {
        this((i & 1) != 0 ? null : k65Var, (i & 2) != 0 ? null : bkeVar, (i & 4) != 0 ? null : t12Var, (i & 8) != 0 ? null : vmdVar, (i & 16) == 0, (Map<Object, Object>) ((i & 32) != 0 ? bs4.a : linkedHashMap));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gsf)) {
            return false;
        }
        gsf gsfVar = (gsf) obj;
        return wl7.b(this.a, gsfVar.a) && wl7.b(this.b, gsfVar.b) && wl7.b(this.c, gsfVar.c) && wl7.b(this.d, gsfVar.d) && this.e == gsfVar.e && wl7.b(this.f, gsfVar.f);
    }

    public final int hashCode() {
        k65 k65Var = this.a;
        int iHashCode = (k65Var == null ? 0 : k65Var.hashCode()) * 31;
        bke bkeVar = this.b;
        int iHashCode2 = (iHashCode + (bkeVar == null ? 0 : bkeVar.hashCode())) * 31;
        t12 t12Var = this.c;
        int iHashCode3 = (iHashCode2 + (t12Var == null ? 0 : t12Var.hashCode())) * 31;
        vmd vmdVar = this.d;
        return this.f.hashCode() + ia.f((iHashCode3 + (vmdVar != null ? vmdVar.hashCode() : 0)) * 31, 31, this.e);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.a + ", slide=" + this.b + ", changeSize=" + this.c + ", scale=" + this.d + ", hold=" + this.e + ", effectsMap=" + this.f + ')';
    }

    public gsf(k65 k65Var, bke bkeVar, t12 t12Var, vmd vmdVar, boolean z, Map<Object, Object> map) {
        this.a = k65Var;
        this.b = bkeVar;
        this.c = t12Var;
        this.d = vmdVar;
        this.e = z;
        this.f = map;
    }
}
