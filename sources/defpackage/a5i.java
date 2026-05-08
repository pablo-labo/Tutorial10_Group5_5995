package defpackage;

import a5i.b;
import defpackage.a5i;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a5i<MessageType extends a5i<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends lzh<MessageType, BuilderType> {
    private static Map<Object, a5i<?, ?>> zzte = new ConcurrentHashMap();
    protected kdi zztc = kdi.e;
    private int zztd = -1;

    public static class a<T extends a5i<T, ?>> extends tzh<T> {
    }

    public static abstract class b<MessageType extends a5i<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends izh<MessageType, BuilderType> {
        public final MessageType a;
        public MessageType b;
        public boolean c = false;

        public b(MessageType messagetype) {
            this.a = messagetype;
            this.b = (MessageType) messagetype.g(4);
        }

        public final /* synthetic */ Object clone() {
            b bVar = (b) this.a.g(5);
            bVar.g(h());
            return bVar;
        }

        @Override // defpackage.a9i
        public final /* synthetic */ x8i e() {
            throw null;
        }

        public final void g(a5i a5iVar) {
            if (this.c) {
                MessageType messagetype = (MessageType) this.b.g(4);
                MessageType messagetype2 = this.b;
                oai oaiVar = oai.c;
                oaiVar.getClass();
                oaiVar.a(messagetype.getClass()).b(messagetype, messagetype2);
                this.b = messagetype;
                this.c = false;
            }
            MessageType messagetype3 = this.b;
            oai oaiVar2 = oai.c;
            oaiVar2.getClass();
            oaiVar2.a(messagetype3.getClass()).b(messagetype3, a5iVar);
        }

        public final a5i h() {
            boolean z = this.c;
            MessageType messagetype = this.b;
            if (z) {
                return messagetype;
            }
            messagetype.getClass();
            oai oaiVar = oai.c;
            oaiVar.getClass();
            oaiVar.a(messagetype.getClass()).f(messagetype);
            this.c = true;
            return this.b;
        }
    }

    public static class c<ContainingType extends x8i, Type> extends ojd {
    }

    public static abstract class d<MessageType extends d<MessageType, BuilderType>, BuilderType> extends a5i<MessageType, BuilderType> implements a9i {
        protected h4i<Object> zztj = h4i.d;

        public final h4i<Object> i() {
            h4i<Object> h4iVar = this.zztj;
            if (h4iVar.b) {
                this.zztj = (h4i) h4iVar.clone();
            }
            return this.zztj;
        }
    }

    public enum e {
        public static final /* synthetic */ int[] a = {1, 2, 3, 4, 5, 6, 7};
    }

    public static Object a(Method method, a5i a5iVar, Object... objArr) {
        try {
            return method.invoke(a5iVar, objArr);
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

    public static <T extends a5i<?, ?>> void b(Class<T> cls, T t) {
        zzte.put(cls, t);
    }

    public static <T extends a5i<?, ?>> T h(Class<T> cls) {
        T t = (T) zzte.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (T) zzte.get(cls);
            } catch (ClassNotFoundException e2) {
                ja.m("Class initialization cannot fail.", e2);
                return null;
            }
        }
        if (t != null) {
            return t;
        }
        T t2 = (T) ((a5i) rdi.i(cls)).g(6);
        if (t2 != null) {
            zzte.put(cls, t2);
            return t2;
        }
        bg.h();
        return null;
    }

    @Override // defpackage.x8i
    public final /* synthetic */ b c() {
        return (b) g(5);
    }

    @Override // defpackage.a9i
    public final boolean d() {
        byte bByteValue = ((Byte) g(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        oai oaiVar = oai.c;
        oaiVar.getClass();
        boolean zH = oaiVar.a(getClass()).h(this);
        g(2);
        return zH;
    }

    @Override // defpackage.a9i
    public final /* synthetic */ x8i e() {
        return (a5i) g(6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((a5i) g(6)).getClass().isInstance(obj)) {
            return false;
        }
        oai oaiVar = oai.c;
        oaiVar.getClass();
        return oaiVar.a(getClass()).d(this, (a5i) obj);
    }

    @Override // defpackage.x8i
    public final /* synthetic */ b f() {
        b bVar = (b) g(5);
        bVar.g(this);
        return bVar;
    }

    public abstract Object g(int i);

    public final int hashCode() {
        int i = this.zzoj;
        if (i != 0) {
            return i;
        }
        oai oaiVar = oai.c;
        oaiVar.getClass();
        int iC = oaiVar.a(getClass()).c(this);
        this.zzoj = iC;
        return iC;
    }

    public final String toString() {
        String string = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        z8i.b(this, sb, 0);
        return sb.toString();
    }
}
