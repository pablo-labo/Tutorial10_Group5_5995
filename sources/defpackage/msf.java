package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.csf;
import defpackage.wle;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class msf {
    public static final wd a = new wd(12);
    public static final Lazy b = boa.E(qt8.c, new pl0(13));

    public static final class a implements l74 {
        public final /* synthetic */ csf a;

        public a(csf csfVar) {
            this.a = csfVar;
        }

        @Override // defpackage.l74
        public final void dispose() {
            csf csfVar = this.a;
            csfVar.j();
            csfVar.a.e();
        }
    }

    public static final <S, T, V extends ge0> void a(csf<S> csfVar, csf<S>.d<T, V> dVar, T t, T t2, jf5<T> jf5Var, b bVar, int i) {
        int i2;
        c cVarH = bVar.h(867041821);
        if ((i & 6) == 0) {
            i2 = (cVarH.K(csfVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.K(dVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 0 ? cVarH.K(t) : cVarH.x(t) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? cVarH.K(t2) : cVarH.x(t2) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? cVarH.K(jf5Var) : cVarH.x(jf5Var) ? 16384 : 8192;
        }
        if (!cVarH.o(i2 & 1, (i2 & 9363) != 9362)) {
            cVarH.D();
        } else if (csfVar.h()) {
            dVar.z(t, t2, jf5Var);
        } else {
            dVar.A(t2, jf5Var);
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new v3f(csfVar, dVar, t, t2, jf5Var, i, 1);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final csf.a b(csf csfVar, mvf mvfVar, String str, b bVar, int i, int i2) {
        csf.a.C0199a c0199a;
        if ((i2 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean zK = bVar.K(csfVar);
        Object objV = bVar.v();
        b.a.C0020a c0020a = b.a.a;
        if (zK || objV == c0020a) {
            objV = new csf.a(mvfVar, str);
            bVar.p(objV);
        }
        csf.a aVar = (csf.a) objV;
        boolean zK2 = bVar.K(csfVar) | bVar.x(aVar);
        Object objV2 = bVar.v();
        if (zK2 || objV2 == c0020a) {
            objV2 = new qs0(15, csfVar, aVar);
            bVar.p(objV2);
        }
        to4.b(aVar, (Function1) objV2, bVar);
        if (csfVar.h() && (c0199a = (csf.a.C0199a) ((gme) aVar.b).getValue()) != null) {
            csf<S> csfVar2 = csf.this;
            c0199a.a.z((T) c0199a.c.invoke((Object) csfVar2.f().b()), (T) c0199a.c.invoke((Object) csfVar2.f().a()), (jf5<T>) ((jf5) c0199a.b.invoke(csfVar2.f())));
        }
        return aVar;
    }

    public static final csf.d c(csf csfVar, Object obj, Object obj2, jf5 jf5Var, lvf lvfVar, b bVar, int i) {
        boolean zK = bVar.K(csfVar);
        Object objV = bVar.v();
        Object obj3 = b.a.a;
        if (zK || objV == obj3) {
            wle.e.getClass();
            wle wleVarA = wle.a.a();
            Function1<Object, j6g> function1E = wleVarA != null ? wleVarA.e() : null;
            wle wleVarB = wle.a.b(wleVarA);
            try {
                ge0 ge0Var = (ge0) lvfVar.a().invoke(obj2);
                ge0Var.d();
                objV = new csf.d(obj, ge0Var, lvfVar);
                wle.a.e(wleVarA, wleVarB, function1E);
                bVar.p(objV);
            } catch (Throwable th) {
                wle.a.e(wleVarA, wleVarB, function1E);
                throw th;
            }
        }
        csf.d dVar = (csf.d) objV;
        a(csfVar, dVar, obj, obj2, jf5Var, bVar, 0);
        boolean zK2 = bVar.K(csfVar) | bVar.K(dVar);
        Object objV2 = bVar.v();
        if (zK2 || objV2 == obj3) {
            objV2 = new aj(7, csfVar, dVar);
            bVar.p(objV2);
        }
        to4.b(dVar, (Function1) objV2, bVar);
        return dVar;
    }

    public static final csf d(rsf rsfVar, String str, b bVar, int i) {
        int i2 = (i & 14) ^ 6;
        boolean z = true;
        boolean z2 = (i2 > 4 && bVar.K(rsfVar)) || (i & 6) == 4;
        Object objV = bVar.v();
        Object obj = b.a.a;
        if (z2 || objV == obj) {
            wle.e.getClass();
            wle wleVarA = wle.a.a();
            Function1<Object, j6g> function1E = wleVarA != null ? wleVarA.e() : null;
            wle wleVarB = wle.a.b(wleVarA);
            try {
                Object csfVar = new csf(rsfVar, null, str);
                wle.a.e(wleVarA, wleVarB, function1E);
                bVar.p(csfVar);
                objV = csfVar;
            } catch (Throwable th) {
                wle.a.e(wleVarA, wleVarB, function1E);
                throw th;
            }
        }
        csf csfVar2 = (csf) objV;
        if (rsfVar instanceof cyd) {
            bVar.L(-1357588631);
            cyd cydVar = (cyd) rsfVar;
            Object value = ((gme) cydVar.c).getValue();
            Object value2 = ((gme) cydVar.b).getValue();
            if ((i2 <= 4 || !bVar.K(rsfVar)) && (i & 6) != 4) {
                z = false;
            }
            Object objV2 = bVar.v();
            if (z || objV2 == obj) {
                objV2 = new ksf(rsfVar, null);
                bVar.p(objV2);
            }
            to4.f(value, value2, (Function2) objV2, bVar);
            bVar.F();
        } else {
            bVar.L(-1357127072);
            csfVar2.a(rsfVar.b(), bVar, 0);
            bVar.F();
        }
        boolean zK = bVar.K(csfVar2);
        Object objV3 = bVar.v();
        if (zK || objV3 == obj) {
            objV3 = new hp0(csfVar2, 19);
            bVar.p(objV3);
        }
        to4.b(csfVar2, (Function1) objV3, bVar);
        return csfVar2;
    }

    public static final <T> csf<T> e(T t, String str, b bVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        Object objV = bVar.v();
        b.a.C0020a c0020a = b.a.a;
        if (objV == c0020a) {
            objV = new csf(new i4a(t), null, str);
            bVar.p(objV);
        }
        csf<T> csfVar = (csf) objV;
        csfVar.a(t, bVar, (i & 8) | 48 | (i & 14));
        Object objV2 = bVar.v();
        if (objV2 == c0020a) {
            objV2 = new m91(csfVar, 15);
            bVar.p(objV2);
        }
        to4.b(csfVar, (Function1) objV2, bVar);
        return csfVar;
    }
}
