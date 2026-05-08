package defpackage;

import defpackage.ere;
import defpackage.me8;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class yo8 implements ehb {
    public static final /* synthetic */ qf8<Object>[] i;
    public final mp8 a;
    public final fu7 b;
    public final sma c;
    public final fla d;
    public final dw7 e;
    public final fla f;
    public final boolean g;
    public final boolean h;

    static {
        l4c l4cVar = new l4c(yo8.class, "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;", 0);
        iwc iwcVar = fwc.a;
        i = new qf8[]{iwcVar.g(l4cVar), z3.i(yo8.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0, iwcVar), z3.i(yo8.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0, iwcVar)};
    }

    public yo8(fu7 fu7Var, mp8 mp8Var, boolean z) {
        mp8Var.getClass();
        fu7Var.getClass();
        this.a = mp8Var;
        this.b = fu7Var;
        sv7 sv7Var = mp8Var.a;
        aue aueVar = sv7Var.a;
        this.c = aueVar.e(new c5(this, 3));
        int i2 = 2;
        this.d = aueVar.f(new ae8(this, i2));
        this.e = sv7Var.j.a(fu7Var);
        this.f = aueVar.f(new be8(this, i2));
        this.g = false;
        this.h = z;
    }

    @Override // defpackage.ehb
    public final boolean a() {
        return this.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final up2<?> b(gu7 gu7Var) {
        ui8 ui8VarH;
        if (gu7Var instanceof pvc) {
            return web.l(((pvc) gu7Var).b, null);
        }
        if (gu7Var instanceof av7) {
            av7 av7Var = (av7) gu7Var;
            return new dw4(av7Var.a(), av7Var.b());
        }
        boolean z = gu7Var instanceof avc;
        mp8 mp8Var = this.a;
        if (z) {
            avc avcVar = (avc) gu7Var;
            n8a name = avcVar.getName();
            if (name == null) {
                name = kc8.b;
            }
            name.getClass();
            ArrayList arrayListC = avcVar.c();
            if (!pnb.D((mge) zte.c(this.d, i[1]))) {
                t52 t52VarD = b04.d(this);
                t52VarD.getClass();
                rlg rlgVarK = ygg.k(name, t52VarD);
                if (rlgVarK == null || (ui8VarH = rlgVarK.getType()) == null) {
                    ui8VarH = mp8Var.a.o.l().h(lx4.c(kx4.q0, new String[0]));
                }
                ArrayList arrayList = new ArrayList(t92.r0(arrayListC, 10));
                Iterator it = arrayListC.iterator();
                while (it.hasNext()) {
                    up2<?> up2VarB = b((gu7) it.next());
                    if (up2VarB == null) {
                        up2VarB = new jma(null);
                    }
                    arrayList.add(up2VarB);
                }
                return new uyf(arrayList, ui8VarH);
            }
        } else {
            if (gu7Var instanceof zuc) {
                return new kf0(new yo8(new xuc(((zuc) gu7Var).b), mp8Var, false));
            }
            if (gu7Var instanceof jvc) {
                Class<?> cls = ((jvc) gu7Var).b;
                ui8 ui8VarD = mp8Var.d.d(cls.isPrimitive() ? new tvc(cls) : ((cls instanceof GenericArrayType) || cls.isArray()) ? new bvc(cls) : cls instanceof WildcardType ? new yvc((WildcardType) cls) : new kvc(cls), wab.A(jyf.b, false, null, 7));
                if (!pnb.D(ui8VarD)) {
                    ui8 type = ui8VarD;
                    int i2 = 0;
                    while (ei8.z(type)) {
                        type = ((wxf) z92.k1(type.K0())).getType();
                        type.getClass();
                        i2++;
                    }
                    v62 v62VarD = type.M0().d();
                    if (v62VarD instanceof t52) {
                        a62 a62VarF = b04.f(v62VarD);
                        return a62VarF == null ? new me8(new me8.a.C0318a(ui8VarD)) : new me8(a62VarF, i2);
                    }
                    if (v62VarD instanceof rxf) {
                        mq5 mq5VarG = ere.a.a.g();
                        return new me8(new a62(mq5VarG.b(), mq5VarG.a.f()), 0);
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.af0
    public final qne g() {
        return this.e;
    }

    @Override // defpackage.af0
    public final ui8 getType() {
        return (mge) zte.c(this.d, i[1]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.af0
    public final mq5 h() {
        qf8<Object> qf8Var = i[0];
        sma smaVar = this.c;
        smaVar.getClass();
        qf8Var.getClass();
        return (mq5) smaVar.invoke();
    }

    @Override // defpackage.af0
    public final Map<n8a, up2<?>> i() {
        return (Map) zte.c(this.f, i[2]);
    }

    public final String toString() {
        return mz3.a.x(this, null);
    }
}
