package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class f7g {
    public static final Logger a = Logger.getLogger(f7g.class.getName());
    public static final Unsafe b;
    public static final Class<?> c;
    public static final e d;
    public static final boolean e;
    public static final boolean f;
    public static final long g;
    public static final boolean h;

    public static class a implements PrivilegedExceptionAction<Unsafe> {
        public static Unsafe a() throws IllegalAccessException {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }

        @Override // java.security.PrivilegedExceptionAction
        public final /* bridge */ /* synthetic */ Unsafe run() {
            return a();
        }
    }

    public static final class b extends e {
        @Override // f7g.e
        public final boolean c(Object obj, long j) {
            return f7g.h ? f7g.g(obj, j) != 0 : f7g.h(obj, j) != 0;
        }

        @Override // f7g.e
        public final byte d(Object obj, long j) {
            return f7g.h ? f7g.g(obj, j) : f7g.h(obj, j);
        }

        @Override // f7g.e
        public final double e(Object obj, long j) {
            return Double.longBitsToDouble(h(obj, j));
        }

        @Override // f7g.e
        public final float f(Object obj, long j) {
            return Float.intBitsToFloat(g(obj, j));
        }

        @Override // f7g.e
        public final void k(Object obj, long j, boolean z) {
            if (f7g.h) {
                f7g.k(obj, j, z ? (byte) 1 : (byte) 0);
            } else {
                f7g.l(obj, j, z ? (byte) 1 : (byte) 0);
            }
        }

        @Override // f7g.e
        public final void l(Object obj, long j, byte b) {
            if (f7g.h) {
                f7g.k(obj, j, b);
            } else {
                f7g.l(obj, j, b);
            }
        }

        @Override // f7g.e
        public final void m(Object obj, long j, double d) {
            p(obj, j, Double.doubleToLongBits(d));
        }

        @Override // f7g.e
        public final void n(Object obj, long j, float f) {
            o(obj, Float.floatToIntBits(f), j);
        }
    }

    public static final class c extends e {
        @Override // f7g.e
        public final boolean c(Object obj, long j) {
            return f7g.h ? f7g.g(obj, j) != 0 : f7g.h(obj, j) != 0;
        }

        @Override // f7g.e
        public final byte d(Object obj, long j) {
            return f7g.h ? f7g.g(obj, j) : f7g.h(obj, j);
        }

        @Override // f7g.e
        public final double e(Object obj, long j) {
            return Double.longBitsToDouble(h(obj, j));
        }

        @Override // f7g.e
        public final float f(Object obj, long j) {
            return Float.intBitsToFloat(g(obj, j));
        }

        @Override // f7g.e
        public final void k(Object obj, long j, boolean z) {
            if (f7g.h) {
                f7g.k(obj, j, z ? (byte) 1 : (byte) 0);
            } else {
                f7g.l(obj, j, z ? (byte) 1 : (byte) 0);
            }
        }

        @Override // f7g.e
        public final void l(Object obj, long j, byte b) {
            if (f7g.h) {
                f7g.k(obj, j, b);
            } else {
                f7g.l(obj, j, b);
            }
        }

        @Override // f7g.e
        public final void m(Object obj, long j, double d) {
            p(obj, j, Double.doubleToLongBits(d));
        }

        @Override // f7g.e
        public final void n(Object obj, long j, float f) {
            o(obj, Float.floatToIntBits(f), j);
        }
    }

    public static final class d extends e {
        @Override // f7g.e
        public final boolean c(Object obj, long j) {
            return this.a.getBoolean(obj, j);
        }

        @Override // f7g.e
        public final byte d(Object obj, long j) {
            return this.a.getByte(obj, j);
        }

        @Override // f7g.e
        public final double e(Object obj, long j) {
            return this.a.getDouble(obj, j);
        }

        @Override // f7g.e
        public final float f(Object obj, long j) {
            return this.a.getFloat(obj, j);
        }

        @Override // f7g.e
        public final void k(Object obj, long j, boolean z) {
            this.a.putBoolean(obj, j, z);
        }

        @Override // f7g.e
        public final void l(Object obj, long j, byte b) {
            this.a.putByte(obj, j, b);
        }

        @Override // f7g.e
        public final void m(Object obj, long j, double d) {
            this.a.putDouble(obj, j, d);
        }

        @Override // f7g.e
        public final void n(Object obj, long j, float f) {
            this.a.putFloat(obj, j, f);
        }
    }

    public static abstract class e {
        public final Unsafe a;

        public e(Unsafe unsafe) {
            this.a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j);

        public abstract byte d(Object obj, long j);

        public abstract double e(Object obj, long j);

        public abstract float f(Object obj, long j);

        public final int g(Object obj, long j) {
            return this.a.getInt(obj, j);
        }

        public final long h(Object obj, long j) {
            return this.a.getLong(obj, j);
        }

        public final Object i(Object obj, long j) {
            return this.a.getObject(obj, j);
        }

        public final long j(Field field) {
            return this.a.objectFieldOffset(field);
        }

        public abstract void k(Object obj, long j, boolean z);

        public abstract void l(Object obj, long j, byte b);

        public abstract void m(Object obj, long j, double d);

        public abstract void n(Object obj, long j, float f);

        public final void o(Object obj, int i, long j) {
            this.a.putInt(obj, j, i);
        }

        public final void p(Object obj, long j, long j2) {
            this.a.putLong(obj, j, j2);
        }

        public final void q(Object obj, long j, Object obj2) {
            this.a.putObject(obj, j, obj2);
        }
    }

    static {
        Class cls;
        boolean z;
        boolean z2;
        e eVar;
        Unsafe unsafeI = i();
        b = unsafeI;
        c = f40.a;
        Class cls2 = Long.TYPE;
        boolean zE = e(cls2);
        Class cls3 = Integer.TYPE;
        boolean zE2 = e(cls3);
        e dVar = null;
        if (unsafeI != null) {
            if (!f40.a()) {
                dVar = new d(unsafeI);
            } else if (zE) {
                dVar = new c(unsafeI);
            } else if (zE2) {
                dVar = new b(unsafeI);
            }
        }
        d = dVar;
        Class cls4 = Byte.TYPE;
        if (unsafeI == null) {
            cls = Field.class;
            z = false;
        } else {
            try {
                Class<?> cls5 = unsafeI.getClass();
                cls5.getMethod("objectFieldOffset", Field.class);
                cls5.getMethod("getLong", Object.class, cls2);
                if (d() == null) {
                    cls = Field.class;
                } else {
                    if (!f40.a()) {
                        cls5.getMethod("getByte", cls2);
                        cls5.getMethod("putByte", cls2, cls4);
                        cls5.getMethod("getInt", cls2);
                        cls5.getMethod("putInt", cls2, cls3);
                        cls5.getMethod("getLong", cls2);
                        cls5.getMethod("putLong", cls2, cls2);
                        cls5.getMethod("copyMemory", cls2, cls2, cls2);
                        cls5.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                    }
                    cls = Field.class;
                    z = true;
                }
            } catch (Throwable th) {
                cls = Field.class;
                a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
            }
            z = false;
        }
        e = z;
        Unsafe unsafe = b;
        if (unsafe == null) {
            z2 = false;
        } else {
            try {
                Class<?> cls6 = unsafe.getClass();
                cls6.getMethod("objectFieldOffset", cls);
                cls6.getMethod("arrayBaseOffset", Class.class);
                cls6.getMethod("arrayIndexScale", Class.class);
                cls6.getMethod("getInt", Object.class, cls2);
                cls6.getMethod("putInt", Object.class, cls2, cls3);
                cls6.getMethod("getLong", Object.class, cls2);
                cls6.getMethod("putLong", Object.class, cls2, cls2);
                cls6.getMethod("getObject", Object.class, cls2);
                cls6.getMethod("putObject", Object.class, cls2, Object.class);
                if (!f40.a()) {
                    cls6.getMethod("getByte", Object.class, cls2);
                    cls6.getMethod("putByte", Object.class, cls2, cls4);
                    cls6.getMethod("getBoolean", Object.class, cls2);
                    cls6.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                    cls6.getMethod("getFloat", Object.class, cls2);
                    cls6.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                    cls6.getMethod("getDouble", Object.class, cls2);
                    cls6.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                }
                z2 = true;
            } catch (Throwable th2) {
                a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
                z2 = false;
            }
        }
        f = z2;
        g = b(byte[].class);
        b(boolean[].class);
        c(boolean[].class);
        b(int[].class);
        c(int[].class);
        b(long[].class);
        c(long[].class);
        b(float[].class);
        c(float[].class);
        b(double[].class);
        c(double[].class);
        b(Object[].class);
        c(Object[].class);
        Field fieldD = d();
        if (fieldD != null && (eVar = d) != null) {
            eVar.j(fieldD);
        }
        h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static <T> T a(Class<T> cls) {
        try {
            return (T) b.allocateInstance(cls);
        } catch (InstantiationException e2) {
            z3.q(e2);
            return null;
        }
    }

    public static int b(Class<?> cls) {
        if (f) {
            return d.a(cls);
        }
        return -1;
    }

    public static void c(Class cls) {
        if (f) {
            d.b(cls);
        }
    }

    public static Field d() {
        Field declaredField;
        Field declaredField2;
        if (f40.a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    public static boolean e(Class<?> cls) {
        if (!f40.a()) {
            return false;
        }
        try {
            Class<?> cls2 = c;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static byte f(long j, byte[] bArr) {
        return d.d(bArr, g + j);
    }

    public static byte g(Object obj, long j) {
        return (byte) ((d.g(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static byte h(Object obj, long j) {
        return (byte) ((d.g(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255);
    }

    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(byte[] bArr, long j, byte b2) {
        d.l(bArr, g + j, b2);
    }

    public static void k(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int iG = d.g(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        m(obj, ((255 & b2) << i) | (iG & (~(255 << i))), j2);
    }

    public static void l(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m(obj, ((255 & b2) << i) | (d.g(obj, j2) & (~(255 << i))), j2);
    }

    public static void m(Object obj, int i, long j) {
        d.o(obj, i, j);
    }

    public static void n(Object obj, long j, long j2) {
        d.p(obj, j, j2);
    }

    public static void o(Object obj, long j, Object obj2) {
        d.q(obj, j, obj2);
    }
}
