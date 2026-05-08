package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.a;
import androidx.datastore.preferences.protobuf.l;
import androidx.datastore.preferences.protobuf.n;
import androidx.datastore.preferences.protobuf.n.a;
import defpackage.a6c;
import defpackage.bg;
import defpackage.f7g;
import defpackage.h91;
import defpackage.ja;
import defpackage.l6;
import defpackage.sp9;
import defpackage.u0h;
import defpackage.uod;
import defpackage.up9;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class n<MessageType extends n<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends androidx.datastore.preferences.protobuf.a<MessageType, BuilderType> {
    private static Map<Object, n<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    protected i0 unknownFields = i0.f;
    protected int memoizedSerializedSize = -1;

    public static abstract class a<MessageType extends n<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a.AbstractC0030a<MessageType, BuilderType> {
        public final MessageType a;
        public MessageType b;
        public boolean c = false;

        public a(MessageType messagetype) {
            this.a = messagetype;
            this.b = (MessageType) messagetype.i(f.d);
        }

        public static void k(n nVar, n nVar2) {
            a6c a6cVar = a6c.c;
            a6cVar.getClass();
            a6cVar.a(nVar.getClass()).f(nVar, nVar2);
        }

        public final Object clone() {
            a aVar = (a) this.a.i(f.e);
            n nVarI = i();
            aVar.j();
            k(aVar.b, nVarI);
            return aVar;
        }

        public final MessageType h() {
            MessageType messagetype = (MessageType) i();
            if (messagetype.l()) {
                return messagetype;
            }
            throw new UninitializedMessageException();
        }

        public final MessageType i() {
            boolean z = this.c;
            MessageType messagetype = this.b;
            if (z) {
                return messagetype;
            }
            messagetype.getClass();
            a6c a6cVar = a6c.c;
            a6cVar.getClass();
            a6cVar.a(messagetype.getClass()).c(messagetype);
            this.c = true;
            return this.b;
        }

        public final void j() {
            if (this.c) {
                MessageType messagetype = (MessageType) this.b.i(f.d);
                k(messagetype, this.b);
                this.b = messagetype;
                this.c = false;
            }
        }
    }

    public static class b<T extends n<T, ?>> extends androidx.datastore.preferences.protobuf.b<T> {
    }

    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends n<MessageType, BuilderType> implements up9 {
        protected l<d> extensions = l.d;

        @Override // androidx.datastore.preferences.protobuf.n, defpackage.sp9
        public final a c() {
            a aVar = (a) i(f.e);
            aVar.j();
            a.k(aVar.b, this);
            return aVar;
        }

        @Override // androidx.datastore.preferences.protobuf.n, defpackage.up9
        public final n d() {
            return (n) i(f.f);
        }

        @Override // androidx.datastore.preferences.protobuf.n, defpackage.sp9
        public final a f() {
            return (a) i(f.e);
        }
    }

    public static final class d implements l.a<d> {
        @Override // androidx.datastore.preferences.protobuf.l.a
        public final u0h b() {
            throw null;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            ((d) obj).getClass();
            return 0;
        }
    }

    public static class e<ContainingType extends sp9, Type> extends h91 {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class f {
        public static final /* synthetic */ f[] V;
        public static final f a;
        public static final f b;
        public static final f c;
        public static final f d;
        public static final f e;
        public static final f f;

        static {
            f fVar = new f("GET_MEMOIZED_IS_INITIALIZED", 0);
            a = fVar;
            f fVar2 = new f("SET_MEMOIZED_IS_INITIALIZED", 1);
            b = fVar2;
            f fVar3 = new f("BUILD_MESSAGE_INFO", 2);
            c = fVar3;
            f fVar4 = new f("NEW_MUTABLE_INSTANCE", 3);
            d = fVar4;
            f fVar5 = new f("NEW_BUILDER", 4);
            e = fVar5;
            f fVar6 = new f("GET_DEFAULT_INSTANCE", 5);
            f = fVar6;
            V = new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6, new f("GET_PARSER", 6)};
        }

        public f() {
            throw null;
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) V.clone();
        }
    }

    public static <T extends n<?, ?>> T j(Class<T> cls) {
        T t = (T) defaultInstanceMap.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (T) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e2) {
                ja.m("Class initialization cannot fail.", e2);
                return null;
            }
        }
        if (t != null) {
            return t;
        }
        T t2 = (T) ((n) f7g.a(cls)).i(f.f);
        if (t2 != null) {
            defaultInstanceMap.put(cls, t2);
            return t2;
        }
        bg.h();
        return null;
    }

    public static Object k(Method method, n nVar, Object... objArr) {
        try {
            return method.invoke(nVar, objArr);
        } catch (IllegalAccessException e2) {
            l6.p("Couldn't use Java reflection to implement protocol message reflection.", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
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

    public static <T extends n<?, ?>> void m(Class<T> cls, T t) {
        defaultInstanceMap.put(cls, t);
    }

    @Override // androidx.datastore.preferences.protobuf.a
    public final int a() {
        return this.memoizedSerializedSize;
    }

    @Override // defpackage.sp9
    public a c() {
        a aVar = (a) i(f.e);
        aVar.j();
        a.k(aVar.b, this);
        return aVar;
    }

    @Override // defpackage.up9
    public n d() {
        return (n) i(f.f);
    }

    @Override // defpackage.sp9
    public final int e() {
        if (this.memoizedSerializedSize == -1) {
            a6c a6cVar = a6c.c;
            a6cVar.getClass();
            this.memoizedSerializedSize = a6cVar.a(getClass()).d(this);
        }
        return this.memoizedSerializedSize;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((n) i(f.f)).getClass().isInstance(obj)) {
            return false;
        }
        a6c a6cVar = a6c.c;
        a6cVar.getClass();
        return a6cVar.a(getClass()).i(this, (n) obj);
    }

    @Override // defpackage.sp9
    public a f() {
        return (a) i(f.e);
    }

    @Override // defpackage.sp9
    public final void g(CodedOutputStream codedOutputStream) {
        a6c a6cVar = a6c.c;
        a6cVar.getClass();
        uod uodVarA = a6cVar.a(getClass());
        g gVar = codedOutputStream.d;
        if (gVar == null) {
            gVar = new g(codedOutputStream);
        }
        uodVarA.h(this, gVar);
    }

    @Override // androidx.datastore.preferences.protobuf.a
    public final void h(int i) {
        this.memoizedSerializedSize = i;
    }

    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        a6c a6cVar = a6c.c;
        a6cVar.getClass();
        int iG = a6cVar.a(getClass()).g(this);
        this.memoizedHashCode = iG;
        return iG;
    }

    public abstract Object i(f fVar);

    public final boolean l() {
        byte bByteValue = ((Byte) i(f.a)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        a6c a6cVar = a6c.c;
        a6cVar.getClass();
        boolean zE = a6cVar.a(getClass()).e(this);
        i(f.b);
        return zE;
    }

    public final String toString() {
        String string = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        y.c(this, sb, 0);
        return sb.toString();
    }
}
