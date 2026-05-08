package defpackage;

import com.google.android.gms.internal.measurement.zzev;
import com.google.android.gms.internal.measurement.zzfw;
import com.google.android.gms.internal.measurement.zzie;
import defpackage.dzh;
import dzh.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dzh<MessageType extends dzh<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends zth<MessageType, BuilderType> {
    private static Map<Object, dzh<?, ?>> zzd = new ConcurrentHashMap();
    protected x7i zzb = x7i.f;
    private int zzc = -1;

    public static abstract class a<MessageType extends dzh<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends xth<MessageType, BuilderType> {
        public final MessageType a;
        public MessageType b;
        public boolean c = false;

        public a(MessageType messagetype) {
            this.a = messagetype;
            this.b = (MessageType) messagetype.j(4);
        }

        public static void i(MessageType messagetype, MessageType messagetype2) {
            l5i l5iVar = l5i.c;
            l5iVar.getClass();
            l5iVar.a(messagetype.getClass()).h(messagetype, messagetype2);
        }

        @Override // defpackage.p3i
        public final /* synthetic */ l3i c() {
            throw null;
        }

        public final /* synthetic */ Object clone() {
            a aVar = (a) this.a.j(5);
            aVar.h(l());
            return aVar;
        }

        public final void h(dzh dzhVar) {
            if (this.c) {
                k();
                this.c = false;
            }
            i(this.b, dzhVar);
        }

        public final void j(byte[] bArr, int i, lxh lxhVar) throws zzfw {
            if (this.c) {
                k();
                this.c = false;
            }
            try {
                l5i l5iVar = l5i.c;
                MessageType messagetype = this.b;
                l5iVar.getClass();
                l5iVar.a(messagetype.getClass()).d(this.b, bArr, 0, i, new yuh(lxhVar));
            } catch (zzfw e) {
                throw e;
            } catch (IOException e2) {
                l6.p("Reading from byte array should not throw IOException.", e2);
            } catch (IndexOutOfBoundsException unused) {
                throw zzfw.a();
            }
        }

        public final void k() {
            MessageType messagetype = (MessageType) this.b.j(4);
            i(messagetype, this.b);
            this.b = messagetype;
        }

        public final dzh l() {
            boolean z = this.c;
            MessageType messagetype = this.b;
            if (z) {
                return messagetype;
            }
            l5i l5iVar = l5i.c;
            l5iVar.getClass();
            l5iVar.a(messagetype.getClass()).b(messagetype);
            this.c = true;
            return this.b;
        }

        public final dzh m() {
            dzh dzhVarL = l();
            boolean zA = true;
            byte bByteValue = ((Byte) dzhVarL.j(1)).byteValue();
            if (bByteValue != 1) {
                if (bByteValue == 0) {
                    zA = false;
                } else {
                    l5i l5iVar = l5i.c;
                    l5iVar.getClass();
                    zA = l5iVar.a(dzhVarL.getClass()).a(dzhVarL);
                    dzhVarL.j(2);
                }
            }
            if (zA) {
                return dzhVarL;
            }
            throw new zzie();
        }
    }

    public static abstract class b<MessageType extends b<MessageType, BuilderType>, BuilderType> extends dzh<MessageType, BuilderType> implements p3i {
        protected uxh<e> zzc = uxh.d;

        public final uxh<e> r() {
            uxh<e> uxhVar = this.zzc;
            if (uxhVar.b) {
                this.zzc = (uxh) uxhVar.clone();
            }
            return this.zzc;
        }
    }

    public static class c<T extends dzh<T, ?>> extends buh<T> {
    }

    public static class d<ContainingType extends l3i, Type> extends uoh {
    }

    public static final class e implements cyh<e> {
        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        @Override // defpackage.cyh
        public final c9i zzb() {
            throw new NoSuchMethodError();
        }

        @Override // defpackage.cyh
        public final lai zzc() {
            throw new NoSuchMethodError();
        }

        @Override // defpackage.cyh
        public final boolean zzd() {
            throw new NoSuchMethodError();
        }
    }

    public enum f {
        public static final /* synthetic */ int[] a = {1, 2, 3, 4, 5, 6, 7};
    }

    public static Object k(Method method, dzh dzhVar, Object... objArr) {
        try {
            return method.invoke(dzhVar, objArr);
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

    public static <T extends dzh<?, ?>> T l(Class<T> cls) {
        T t = (T) zzd.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (T) zzd.get(cls);
            } catch (ClassNotFoundException e2) {
                ja.m("Class initialization cannot fail.", e2);
                return null;
            }
        }
        if (t != null) {
            return t;
        }
        T t2 = (T) ((dzh) r8i.b(cls)).j(6);
        if (t2 != null) {
            zzd.put(cls, t2);
            return t2;
        }
        bg.h();
        return null;
    }

    public static <E> e0i<E> m(e0i<E> e0iVar) {
        int size = e0iVar.size();
        return e0iVar.zza(size == 0 ? 10 : size << 1);
    }

    public static b2i n(wzh wzhVar) {
        int size = wzhVar.size();
        int i = size == 0 ? 10 : size << 1;
        b2i b2iVar = (b2i) wzhVar;
        if (i >= b2iVar.c) {
            return new b2i(Arrays.copyOf(b2iVar.b, i), b2iVar.c);
        }
        o6.h();
        return null;
    }

    public static <T extends dzh<?, ?>> void o(Class<T> cls, T t) {
        zzd.put(cls, t);
    }

    @Override // defpackage.p3i
    public final /* synthetic */ l3i c() {
        return (dzh) j(6);
    }

    @Override // defpackage.l3i
    public final void d(zzev zzevVar) {
        l5i l5iVar = l5i.c;
        l5iVar.getClass();
        w5i w5iVarA = l5iVar.a(getClass());
        qwh qwhVar = zzevVar.d;
        if (qwhVar == null) {
            qwhVar = new qwh(zzevVar);
        }
        w5iVarA.g(this, qwhVar);
    }

    @Override // defpackage.l3i
    public final int e() {
        if (this.zzc == -1) {
            l5i l5iVar = l5i.c;
            l5iVar.getClass();
            this.zzc = l5iVar.a(getClass()).c(this);
        }
        return this.zzc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        l5i l5iVar = l5i.c;
        l5iVar.getClass();
        return l5iVar.a(getClass()).i(this, (dzh) obj);
    }

    @Override // defpackage.l3i
    public final /* synthetic */ a f() {
        a aVar = (a) j(5);
        aVar.h(this);
        return aVar;
    }

    @Override // defpackage.l3i
    public final /* synthetic */ a g() {
        return (a) j(5);
    }

    @Override // defpackage.zth
    public final int h() {
        return this.zzc;
    }

    public final int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        l5i l5iVar = l5i.c;
        l5iVar.getClass();
        int iE = l5iVar.a(getClass()).e(this);
        this.zza = iE;
        return iE;
    }

    @Override // defpackage.zth
    public final void i(int i) {
        this.zzc = i;
    }

    public abstract Object j(int i);

    public final <MessageType extends dzh<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType p() {
        return (BuilderType) j(5);
    }

    public final BuilderType q() {
        BuilderType buildertype = (BuilderType) j(5);
        buildertype.h(this);
        return buildertype;
    }

    public final String toString() {
        String string = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        i4i.c(this, sb, 0);
        return sb.toString();
    }
}
