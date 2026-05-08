package defpackage;

import defpackage.c95;
import defpackage.h3;
import defpackage.in8;
import defpackage.kke;
import defpackage.pi7;
import defpackage.rp9;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class rw5 extends h3 implements Serializable {

    public static abstract class a<MessageType extends rw5, BuilderType extends a> extends h3.a<BuilderType> {
        public ur1 a = ur1.a;

        @Override // 
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public BuilderType clone() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        public abstract BuilderType k(MessageType messagetype);
    }

    public static abstract class b<MessageType extends c<MessageType>, BuilderType extends b<MessageType, BuilderType>> extends a<MessageType, BuilderType> implements tp9 {
        public c95<d> b = c95.d;
        public boolean c;

        public final void l(MessageType messagetype) {
            jke jkeVar;
            if (!this.c) {
                this.b = this.b.clone();
                this.c = true;
            }
            c95<d> c95Var = this.b;
            c95 c95Var2 = ((c) messagetype).extensions;
            c95Var.getClass();
            int i = 0;
            while (true) {
                int size = c95Var2.a.b.size();
                jkeVar = c95Var2.a;
                if (i >= size) {
                    break;
                }
                c95Var.h(jkeVar.b.get(i));
                i++;
            }
            Iterator<Map.Entry<Object, Object>> it = jkeVar.d().iterator();
            while (it.hasNext()) {
                c95Var.h((Map.Entry) it.next());
            }
        }
    }

    public static final class d implements c95.a<d> {
        public final int a;
        public final s0h b;
        public final boolean c;

        public d(int i, s0h s0hVar, boolean z) {
            this.a = i;
            this.b = s0hVar;
            this.c = z;
        }

        @Override // c95.a
        public final t0h b() {
            return this.b.a();
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.a - ((d) obj).a;
        }

        @Override // c95.a
        public final a d(rp9.a aVar, rp9 rp9Var) {
            return ((a) aVar).k((rw5) rp9Var);
        }

        @Override // c95.a
        public final boolean g() {
            return this.c;
        }

        @Override // c95.a
        public final int getNumber() {
            return this.a;
        }

        @Override // c95.a
        public final s0h j() {
            return this.b;
        }

        @Override // c95.a
        public final boolean q() {
            return false;
        }
    }

    public static class e<ContainingType extends rp9, Type> {
        public final ContainingType a;
        public final Type b;
        public final rp9 c;
        public final d d;
        public final Method e;

        public e(ContainingType containingtype, Type type, rp9 rp9Var, d dVar, Class cls) {
            if (containingtype == null) {
                l5.q("Null containingTypeDefaultInstance");
                throw null;
            }
            if (dVar.b == s0h.d && rp9Var == null) {
                l5.q("Null messageDefaultInstance");
                throw null;
            }
            this.a = containingtype;
            this.b = type;
            this.c = rp9Var;
            this.d = dVar;
            if (!pi7.a.class.isAssignableFrom(cls)) {
                this.e = null;
                return;
            }
            try {
                this.e = cls.getMethod("valueOf", Integer.TYPE);
            } catch (NoSuchMethodException e) {
                String name = cls.getName();
                l6.p(m6.h(new StringBuilder(name.length() + 52), "Generated message class \"", name, "\" missing method \"valueOf\"."), e);
                throw null;
            }
        }

        public final Object a(Object obj) {
            if (this.d.b.a() != t0h.ENUM) {
                return obj;
            }
            try {
                return this.e.invoke(null, (Integer) obj);
            } catch (IllegalAccessException e) {
                l6.p("Couldn't use Java reflection to implement protocol message reflection.", e);
                return null;
            } catch (InvocationTargetException e2) {
                Throwable cause = e2.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                l6.p("Unexpected exception thrown by generated accessor method.", cause);
                return null;
            }
        }

        public final Object b(Object obj) {
            return this.d.b.a() == t0h.ENUM ? Integer.valueOf(((pi7.a) obj).getNumber()) : obj;
        }
    }

    public static e a(rp9 rp9Var, rp9 rp9Var2, int i, s0h s0hVar, Class cls) {
        return new e(rp9Var, Collections.EMPTY_LIST, rp9Var2, new d(i, s0hVar, true), cls);
    }

    public static e b(rp9 rp9Var, Object obj, rp9 rp9Var2, int i, s0h s0hVar, Class cls) {
        return new e(rp9Var, obj, rp9Var2, new d(i, s0hVar, false), cls);
    }

    public static abstract class c<MessageType extends c<MessageType>> extends rw5 implements tp9 {
        private final c95<d> extensions;

        public class a {
            public final Iterator<Map.Entry<d, Object>> a;
            public Map.Entry<d, Object> b;

            public a(c cVar) {
                Iterator<Map.Entry<d, Object>> it;
                c95 c95Var = cVar.extensions;
                boolean z = c95Var.c;
                jke jkeVar = c95Var.a;
                if (z) {
                    Iterator<Map.Entry<K, Object>> it2 = ((kke.d) jkeVar.entrySet()).iterator();
                    in8.b bVar = new in8.b();
                    bVar.a = it2;
                    it = bVar;
                } else {
                    it = ((kke.d) jkeVar.entrySet()).iterator();
                }
                this.a = it;
                if (it.hasNext()) {
                    this.b = it.next();
                }
            }

            public final void a(int i, f92 f92Var) {
                while (true) {
                    Map.Entry<d, Object> entry = this.b;
                    if (entry == null || entry.getKey().a >= i) {
                        return;
                    }
                    d key = this.b.getKey();
                    Object value = this.b.getValue();
                    c95 c95Var = c95.d;
                    s0h s0hVar = key.b;
                    int i2 = key.a;
                    if (key.c) {
                        Iterator it = ((List) value).iterator();
                        while (it.hasNext()) {
                            c95.l(f92Var, s0hVar, i2, it.next());
                        }
                    } else if (value instanceof in8) {
                        c95.l(f92Var, s0hVar, i2, ((in8) value).a());
                    } else {
                        c95.l(f92Var, s0hVar, i2, value);
                    }
                    Iterator<Map.Entry<d, Object>> it2 = this.a;
                    if (it2.hasNext()) {
                        this.b = it2.next();
                    } else {
                        this.b = null;
                    }
                }
            }
        }

        public c(b<MessageType, ?> bVar) {
            bVar.b.g();
            bVar.c = false;
            this.extensions = bVar.b;
        }

        public final boolean j() {
            jke jkeVar = this.extensions.a;
            int i = 0;
            while (true) {
                if (i >= jkeVar.b.size()) {
                    Iterator<Map.Entry<Object, Object>> it = jkeVar.d().iterator();
                    while (it.hasNext()) {
                        if (!c95.f(it.next())) {
                        }
                    }
                    return true;
                }
                if (!c95.f(jkeVar.b.get(i))) {
                    break;
                }
                i++;
            }
            return false;
        }

        public final int k() {
            jke jkeVar = this.extensions.a;
            int iD = 0;
            for (int i = 0; i < jkeVar.b.size(); i++) {
                kke<K, V>.b bVar = jkeVar.b.get(i);
                iD += c95.d((c95.a) bVar.getKey(), bVar.getValue());
            }
            for (Map.Entry<Object, Object> entry : jkeVar.d()) {
                iD += c95.d((c95.a) entry.getKey(), entry.getValue());
            }
            return iD;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [Type, java.util.ArrayList] */
        public final <Type> Type l(e<MessageType, Type> eVar) {
            r(eVar);
            c95<d> c95Var = this.extensions;
            d dVar = eVar.d;
            Type type = (Type) c95Var.e(dVar);
            if (type == null) {
                return eVar.b;
            }
            if (!dVar.c) {
                return (Type) eVar.a(type);
            }
            if (dVar.b.a() != t0h.ENUM) {
                return type;
            }
            ?? r0 = (Type) new ArrayList();
            Iterator it = ((List) type).iterator();
            while (it.hasNext()) {
                r0.add(eVar.a(it.next()));
            }
            return r0;
        }

        public final <Type> Type m(e<MessageType, List<Type>> eVar, int i) {
            r(eVar);
            c95<d> c95Var = this.extensions;
            d dVar = eVar.d;
            c95Var.getClass();
            if (!dVar.c) {
                l5.q("getRepeatedField() can only be called on repeated fields.");
                return null;
            }
            Object objE = c95Var.e(dVar);
            if (objE != null) {
                return (Type) eVar.a(((List) objE).get(i));
            }
            k20.o();
            return null;
        }

        public final <Type> int n(e<MessageType, List<Type>> eVar) {
            r(eVar);
            c95<d> c95Var = this.extensions;
            d dVar = eVar.d;
            c95Var.getClass();
            if (!dVar.c) {
                l5.q("getRepeatedField() can only be called on repeated fields.");
                return 0;
            }
            Object objE = c95Var.e(dVar);
            if (objE == null) {
                return 0;
            }
            return ((List) objE).size();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <Type> boolean o(e<MessageType, Type> eVar) {
            r(eVar);
            c95<d> c95Var = this.extensions;
            d dVar = eVar.d;
            c95Var.getClass();
            if (!dVar.c) {
                return c95Var.a.get(dVar) != null;
            }
            l5.q("hasField() can only be called on non-repeated fields.");
            return false;
        }

        public final void p() {
            this.extensions.g();
        }

        /* JADX WARN: Removed duplicated region for block: B:4:0x001b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean q(defpackage.e92 r9, defpackage.f92 r10, defpackage.s45 r11, int r12) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            /*
                Method dump skipped, instruction units count: 269
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: rw5.c.q(e92, f92, s45, int):boolean");
        }

        public final void r(e<MessageType, ?> eVar) {
            if (eVar.a == g()) {
                return;
            }
            l5.q("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }

        public c() {
            this.extensions = new c95<>();
        }
    }
}
