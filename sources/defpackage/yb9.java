package defpackage;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: loaded from: classes2.dex */
public final class yb9 implements qvf {
    public final pq2 a;

    public final class a<K, V> extends pvf<Map<K, V>> {
        public final rvf a;
        public final rvf b;
        public final hna<? extends Map<K, V>> c;

        public a(yb9 yb9Var, ae6 ae6Var, Type type, pvf<K> pvfVar, Type type2, pvf<V> pvfVar2, hna<? extends Map<K, V>> hnaVar) {
            this.a = new rvf(ae6Var, pvfVar, type);
            this.b = new rvf(ae6Var, pvfVar2, type2);
            this.c = hnaVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pvf
        public final Object a(nb8 nb8Var) throws IOException {
            sb8 sb8VarJ0 = nb8Var.j0();
            if (sb8VarJ0 == sb8.X) {
                nb8Var.l1();
                return null;
            }
            Map<K, V> mapB = this.c.b();
            sb8 sb8Var = sb8.a;
            rvf rvfVar = this.b;
            rvf rvfVar2 = this.a;
            if (sb8VarJ0 == sb8Var) {
                nb8Var.a();
                while (nb8Var.hasNext()) {
                    nb8Var.a();
                    Object objA = rvfVar2.b.a(nb8Var);
                    if (mapB.put(objA, rvfVar.b.a(nb8Var)) != null) {
                        throw new JsonSyntaxException(t40.i(objA, "duplicate key: "));
                    }
                    nb8Var.v();
                }
                nb8Var.v();
                return mapB;
            }
            nb8Var.h();
            while (nb8Var.hasNext()) {
                v1.a.getClass();
                if (nb8Var instanceof cc8) {
                    throw null;
                }
                int iS = nb8Var.W;
                if (iS == 0) {
                    iS = nb8Var.s();
                }
                if (iS == 13) {
                    nb8Var.W = 9;
                } else if (iS == 12) {
                    nb8Var.W = 8;
                } else if (iS == 14) {
                    nb8Var.W = 10;
                } else {
                    StringBuilder sb = new StringBuilder("Expected a name but was ");
                    sb.append(nb8Var.j0());
                    q6.o(sb, nb8Var.b0());
                }
                Object objA2 = rvfVar2.b.a(nb8Var);
                if (mapB.put(objA2, rvfVar.b.a(nb8Var)) != null) {
                    throw new JsonSyntaxException(t40.i(objA2, "duplicate key: "));
                }
            }
            nb8Var.G();
            return mapB;
        }

        @Override // defpackage.pvf
        public final void b(gc8 gc8Var, Object obj) throws IOException {
            Map map = (Map) obj;
            if (map == null) {
                gc8Var.Q();
                return;
            }
            gc8Var.p();
            for (Map.Entry<K, V> entry : map.entrySet()) {
                gc8Var.N(String.valueOf(entry.getKey()));
                this.b.b(gc8Var, entry.getValue());
            }
            gc8Var.G();
        }
    }

    public yb9(pq2 pq2Var) {
        this.a = pq2Var;
    }

    @Override // defpackage.qvf
    public final <T> pvf<T> c(ae6 ae6Var, iyf<T> iyfVar) {
        Type[] actualTypeArguments;
        Type type = iyfVar.b;
        Class<? super T> cls = iyfVar.a;
        if (!Map.class.isAssignableFrom(cls)) {
            return null;
        }
        if (type == Properties.class) {
            actualTypeArguments = new Type[]{String.class, String.class};
        } else {
            if (type instanceof WildcardType) {
                type = ((WildcardType) type).getUpperBounds()[0];
            }
            hh1.p(Map.class.isAssignableFrom(cls));
            Type typeF = defpackage.a.f(type, cls, defpackage.a.d(type, cls, Map.class), new HashMap());
            actualTypeArguments = typeF instanceof ParameterizedType ? ((ParameterizedType) typeF).getActualTypeArguments() : new Type[]{Object.class, Object.class};
        }
        Type type2 = actualTypeArguments[0];
        return new a(this, ae6Var, actualTypeArguments[0], (type2 == Boolean.TYPE || type2 == Boolean.class) ? svf.c : ae6Var.c(new iyf<>(type2)), actualTypeArguments[1], ae6Var.c(new iyf<>(actualTypeArguments[1])), this.a.b(iyfVar));
    }
}
