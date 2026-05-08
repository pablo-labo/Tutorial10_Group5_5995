package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import hkd.a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class hkd implements ekd {
    public static final ko2 e = new ko2(new bj2(12, 0), new uz7(7));
    public final Map<Object, Map<String, List<Object>>> a;
    public final z3a<Object, ikd> b;
    public ikd c;
    public final q2 d;

    public static final class a implements l74 {
        public final /* synthetic */ Object b;
        public final /* synthetic */ lkd c;

        public a(Object obj, lkd lkdVar) {
            this.b = obj;
            this.c = lkdVar;
        }

        @Override // defpackage.l74
        public final void dispose() {
            hkd hkdVar = hkd.this;
            z3a<Object, ikd> z3aVar = hkdVar.b;
            Object obj = this.b;
            ikd ikdVarK = z3aVar.k(obj);
            lkd lkdVar = this.c;
            if (ikdVarK == lkdVar) {
                Map<Object, Map<String, List<Object>>> map = hkdVar.a;
                Map<String, List<Object>> mapE = lkdVar.e();
                if (mapE.isEmpty()) {
                    map.remove(obj);
                } else {
                    map.put(obj, mapE);
                }
            }
        }
    }

    public hkd(Map<Object, Map<String, List<Object>>> map) {
        this.a = map;
        this.b = lnd.b();
        this.d = new q2(this, 22);
    }

    @Override // defpackage.ekd
    public final void c(Object obj) {
        if (this.b.k(obj) == null) {
            this.a.remove(obj);
        }
    }

    @Override // defpackage.ekd
    public final void d(final Object obj, Function2<? super b, ? super Integer, j6g> function2, b bVar, int i) {
        int i2;
        c cVarH = bVar.h(533563200);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.x(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.x(this) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if (cVarH.o(i2 & 1, (i2 & 147) != 146)) {
            cVarH.z(obj);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                q2 q2Var = this.d;
                if (!((Boolean) q2Var.invoke(obj)).booleanValue()) {
                    h5.k(v40.e(obj, "Type of the key ", " is not supported. On Android you can only use types which can be stored inside the Bundle."));
                    return;
                }
                Map<String, List<Object>> map = this.a.get(obj);
                jte jteVar = kkd.a;
                lkd lkdVar = new lkd(new jkd(map, q2Var));
                cVarH.p(lkdVar);
                objV = lkdVar;
            }
            final lkd lkdVar2 = (lkd) objV;
            rm2.b(new i6c[]{kkd.a.a(lkdVar2), v09.a.a(lkdVar2)}, function2, cVarH, (i2 & 112) | 8);
            j6g j6gVar = j6g.a;
            boolean zX = cVarH.x(this) | cVarH.x(obj) | cVarH.x(lkdVar2);
            Object objV2 = cVarH.v();
            if (zX || objV2 == c0020a) {
                objV2 = new Function1() { // from class: fkd
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        hkd hkdVar = this.a;
                        z3a<Object, ikd> z3aVar = hkdVar.b;
                        Object obj3 = obj;
                        if (z3aVar.a(obj3)) {
                            h5.k(v40.e(obj3, "Key ", " was used multiple times "));
                            return null;
                        }
                        hkdVar.a.remove(obj3);
                        lkd lkdVar3 = lkdVar2;
                        z3aVar.m(obj3, lkdVar3);
                        return hkdVar.new a(obj3, lkdVar3);
                    }
                };
                cVarH.p(objV2);
            }
            to4.b(j6gVar, (Function1) objV2, cVarH);
            cVarH.t();
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new gkd(this, obj, function2, i, 0);
        }
    }

    public hkd() {
        this(0);
    }

    public /* synthetic */ hkd(int i) {
        this(new LinkedHashMap());
    }
}
