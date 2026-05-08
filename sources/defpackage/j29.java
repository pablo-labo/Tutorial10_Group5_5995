package defpackage;

import defpackage.x4h;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public class j29 implements aue {
    public static final String d;
    public static final a e;
    public final zfe a;
    public final d.a b;
    public final String c;

    public static class a extends j29 {
        @Override // defpackage.j29
        public final m h(Object obj, String str) {
            return new m(null, true);
        }
    }

    public static class b<K, V> extends c<K, V> implements eu1<K, V> {
        public static /* synthetic */ void a(int i) {
            String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 3 ? 3 : 2];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "computation";
            } else if (i != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            }
            if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            } else {
                objArr[1] = "computeIfAbsent";
            }
            if (i == 2) {
                objArr[2] = "computeIfAbsent";
            } else if (i != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i == 3) {
                throw new IllegalStateException(str2);
            }
        }
    }

    public static class c<K, V> extends j<e<K, V>, V> {
    }

    public interface d {
        public static final a a = new a();

        public static class a implements d {
        }
    }

    public static class e<K, V> {
        public final K a;
        public final gu5<? extends V> b;

        public e(K k, gu5<? extends V> gu5Var) {
            this.a = k;
            this.b = gu5Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && e.class == obj.getClass() && this.a.equals(((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    public static class f<T> implements sma<T> {
        public final j29 a;
        public final gu5<? extends T> b;
        public volatile Object c = l.a;

        public f(j29 j29Var, gu5<? extends T> gu5Var) {
            this.a = j29Var;
            this.b = gu5Var;
        }

        public void a(T t) {
        }

        public m<T> b(boolean z) {
            m<T> mVarH = this.a.h(null, "in a lazy value");
            if (mVarH != null) {
                return mVarH;
            }
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue", "recursionDetected"));
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x004d A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #0 {all -> 0x0026, blocks: (B:7:0x0015, B:9:0x001b, B:15:0x002a, B:17:0x0035, B:22:0x0042, B:24:0x004a, B:25:0x004d, B:29:0x005c, B:31:0x0062, B:33:0x0066, B:34:0x006d, B:35:0x0074, B:36:0x0075, B:37:0x007b, B:26:0x004f), top: B:40:0x0015, inners: #1 }] */
        @Override // defpackage.gu5
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public T invoke() throws java.lang.Throwable {
            /*
                r5 = this;
                j29$l r0 = j29.l.c
                j29$l r1 = j29.l.b
                java.lang.Object r2 = r5.c
                boolean r3 = r2 instanceof j29.l
                if (r3 != 0) goto Le
                defpackage.x4h.a(r2)
                return r2
            Le:
                j29 r2 = r5.a
                zfe r2 = r2.a
                r2.lock()
                java.lang.Object r2 = r5.c     // Catch: java.lang.Throwable -> L26
                boolean r3 = r2 instanceof j29.l     // Catch: java.lang.Throwable -> L26
                if (r3 != 0) goto L28
                defpackage.x4h.a(r2)     // Catch: java.lang.Throwable -> L26
                j29 r5 = r5.a
                zfe r5 = r5.a
                r5.unlock()
                return r2
            L26:
                r0 = move-exception
                goto L7c
            L28:
                if (r2 != r1) goto L3f
                r5.c = r0     // Catch: java.lang.Throwable -> L26
                r3 = 1
                j29$m r3 = r5.b(r3)     // Catch: java.lang.Throwable -> L26
                boolean r4 = r3.b     // Catch: java.lang.Throwable -> L26
                if (r4 != 0) goto L3f
                T r0 = r3.a     // Catch: java.lang.Throwable -> L26
            L37:
                j29 r5 = r5.a
                zfe r5 = r5.a
                r5.unlock()
                return r0
            L3f:
                if (r2 != r0) goto L4d
                r0 = 0
                j29$m r0 = r5.b(r0)     // Catch: java.lang.Throwable -> L26
                boolean r2 = r0.b     // Catch: java.lang.Throwable -> L26
                if (r2 != 0) goto L4d
                T r0 = r0.a     // Catch: java.lang.Throwable -> L26
                goto L37
            L4d:
                r5.c = r1     // Catch: java.lang.Throwable -> L26
                gu5<? extends T> r0 = r5.b     // Catch: java.lang.Throwable -> L5b
                java.lang.Object r0 = r0.invoke()     // Catch: java.lang.Throwable -> L5b
                r5.a(r0)     // Catch: java.lang.Throwable -> L5b
                r5.c = r0     // Catch: java.lang.Throwable -> L5b
                goto L37
            L5b:
                r0 = move-exception
                boolean r2 = defpackage.ie7.o(r0)     // Catch: java.lang.Throwable -> L26
                if (r2 != 0) goto L75
                java.lang.Object r2 = r5.c     // Catch: java.lang.Throwable -> L26
                if (r2 != r1) goto L6d
                x4h$b r1 = new x4h$b     // Catch: java.lang.Throwable -> L26
                r1.<init>(r0)     // Catch: java.lang.Throwable -> L26
                r5.c = r1     // Catch: java.lang.Throwable -> L26
            L6d:
                j29 r1 = r5.a     // Catch: java.lang.Throwable -> L26
                j29$d$a r1 = r1.b     // Catch: java.lang.Throwable -> L26
                r1.getClass()     // Catch: java.lang.Throwable -> L26
                throw r0     // Catch: java.lang.Throwable -> L26
            L75:
                j29$l r1 = j29.l.a     // Catch: java.lang.Throwable -> L26
                r5.c = r1     // Catch: java.lang.Throwable -> L26
                java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0     // Catch: java.lang.Throwable -> L26
                throw r0     // Catch: java.lang.Throwable -> L26
            L7c:
                j29 r5 = r5.a
                zfe r5 = r5.a
                r5.unlock()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: j29.f.invoke():java.lang.Object");
        }
    }

    public static abstract class g<T> extends f<T> {
        public volatile yn9 d;

        @Override // j29.f
        public final void a(T t) {
            this.d = new yn9(t);
            try {
                l29 l29Var = (l29) this;
                if (t != null) {
                    l29Var.e.invoke(t);
                } else {
                    l29.d(2);
                    throw null;
                }
            } finally {
                this.d = null;
            }
        }

        @Override // j29.f, defpackage.gu5
        public T invoke() {
            yn9 yn9Var = this.d;
            if (yn9Var == null || ((Thread) yn9Var.b) != Thread.currentThread()) {
                return (T) super.invoke();
            }
            if (((Thread) yn9Var.b) == Thread.currentThread()) {
                return (T) yn9Var.a;
            }
            r6.g("No value in this thread (hasValue should be checked before)");
            return null;
        }
    }

    public static class h<T> extends f<T> implements fla<T> {
        @Override // j29.f, defpackage.gu5
        public final T invoke() {
            T t = (T) super.invoke();
            if (t != null) {
                return t;
            }
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue", "invoke"));
        }
    }

    public static abstract class i<T> extends g<T> implements fla<T> {
        @Override // j29.g, j29.f, defpackage.gu5
        public final T invoke() {
            T t = (T) super.invoke();
            if (t != null) {
                return t;
            }
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute", "invoke"));
        }
    }

    public static class j<K, V> implements on9<K, V> {
        public final j29 a;
        public final ConcurrentHashMap b;
        public final Function1<? super K, ? extends V> c;

        public j(j29 j29Var, ConcurrentHashMap concurrentHashMap, Function1 function1) {
            this.a = j29Var;
            this.b = concurrentHashMap;
            this.c = function1;
        }

        public static /* synthetic */ void a(int i) {
            String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 3 || i == 4) ? 2 : 3];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "compute";
            } else if (i == 3 || i == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[0] = "storageManager";
            }
            if (i == 3) {
                objArr[1] = "recursionDetected";
            } else if (i != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
            if (i != 3 && i != 4) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i != 3 && i != 4) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        public final AssertionError b(K k, Object obj) {
            AssertionError assertionError = new AssertionError("Inconsistent key detected. " + l.b + " is expected, was: " + obj + ", most probably race condition detected on input " + k + " under " + this.a);
            j29.i(assertionError);
            return assertionError;
        }

        public final AssertionError d(K k, Object obj) {
            AssertionError assertionError = new AssertionError("Race condition detected on input " + k + ". Old value is " + obj + " under " + this.a);
            j29.i(assertionError);
            return assertionError;
        }

        public final AssertionError f(K k, Throwable th) {
            AssertionError assertionError = new AssertionError("Unable to remove " + k + " under " + this.a, th);
            j29.i(assertionError);
            return assertionError;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public V invoke(K k) throws Throwable {
            Object obj;
            AssertionError assertionErrorF;
            AssertionError assertionErrorF2;
            j29 j29Var = this.a;
            d.a aVar = j29Var.b;
            zfe zfeVar = j29Var.a;
            ConcurrentHashMap concurrentHashMap = this.b;
            V v = (V) concurrentHashMap.get(k);
            Object obj2 = x4h.a;
            RuntimeException runtimeException = (V) null;
            l lVar = l.b;
            if (v != null && v != lVar) {
                x4h.a(v);
                if (v == obj2) {
                    return null;
                }
                return v;
            }
            zfeVar.lock();
            try {
                obj = concurrentHashMap.get(k);
                l lVar2 = l.c;
                if (obj == lVar) {
                    m mVarH = j29Var.h(k, "");
                    if (mVarH == null) {
                        a(3);
                        throw null;
                    }
                    if (!mVarH.b) {
                        return (V) mVarH.a;
                    }
                    obj = lVar2;
                }
                if (obj == lVar2) {
                    m mVarH2 = j29Var.h(k, "");
                    if (mVarH2 == null) {
                        a(3);
                        throw null;
                    }
                    if (!mVarH2.b) {
                        return (V) mVarH2.a;
                    }
                }
            } finally {
            }
            if (obj != null) {
                x4h.a(obj);
                Object obj3 = runtimeException;
                if (obj != obj2) {
                    obj3 = (V) obj;
                }
                return (V) obj3;
            }
            try {
                concurrentHashMap.put(k, lVar);
                V vInvoke = this.c.invoke(k);
                if (vInvoke != null) {
                    obj2 = vInvoke;
                }
                Object objPut = concurrentHashMap.put(k, obj2);
                if (objPut == lVar) {
                    return vInvoke;
                }
                runtimeException = (V) d(k, objPut);
                throw runtimeException;
            } catch (Throwable th) {
                if (ie7.o(th)) {
                    try {
                        Object objRemove = concurrentHashMap.remove(k);
                        if (objRemove != lVar) {
                            throw b(k, objRemove);
                        }
                        throw th;
                    } finally {
                    }
                }
                if (th == runtimeException) {
                    try {
                        concurrentHashMap.remove(k);
                        aVar.getClass();
                        throw th;
                    } finally {
                    }
                }
                Object objPut2 = concurrentHashMap.put(k, new x4h.b(th));
                if (objPut2 != lVar) {
                    throw d(k, objPut2);
                }
                aVar.getClass();
                throw th;
            }
            zfeVar.unlock();
        }
    }

    public static class k<K, V> extends j<K, V> implements nn9<K, V> {
        @Override // j29.j, kotlin.jvm.functions.Function1
        public final V invoke(K k) {
            V v = (V) super.invoke(k);
            if (v != null) {
                return v;
            }
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull", "invoke"));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class l {
        public static final l a;
        public static final l b;
        public static final l c;
        public static final /* synthetic */ l[] d;

        static {
            l lVar = new l("NOT_COMPUTED", 0);
            a = lVar;
            l lVar2 = new l("COMPUTING", 1);
            b = lVar2;
            l lVar3 = new l("RECURSION_WAS_DETECTED", 2);
            c = lVar3;
            d = new l[]{lVar, lVar2, lVar3};
        }

        public l() {
            throw null;
        }

        public static l valueOf(String str) {
            return (l) Enum.valueOf(l.class, str);
        }

        public static l[] values() {
            return (l[]) d.clone();
        }
    }

    public static class m<T> {
        public final T a;
        public final boolean b;

        public m(T t, boolean z) {
            this.a = t;
            this.b = z;
        }

        public final String toString() {
            return this.b ? "FALL_THROUGH" : String.valueOf(this.a);
        }
    }

    static {
        String canonicalName = j29.class.getCanonicalName();
        canonicalName.getClass();
        int iW = zve.W(canonicalName, 0, 6, ".");
        d = iW == -1 ? "" : canonicalName.substring(0, iW);
        e = new a("NO_LOCKS", wab.Y);
    }

    public j29() {
        throw null;
    }

    public j29(String str, zfe zfeVar) {
        this.a = zfeVar;
        this.b = d.a;
        this.c = str;
    }

    public static void i(AssertionError assertionError) {
        StackTraceElement[] stackTrace = assertionError.getStackTrace();
        int length = stackTrace.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            } else if (!stackTrace[i2].getClassName().startsWith(d)) {
                break;
            } else {
                i2++;
            }
        }
        List listSubList = Arrays.asList(stackTrace).subList(i2, length);
        assertionError.setStackTrace((StackTraceElement[]) listSubList.toArray(new StackTraceElement[listSubList.size()]));
    }

    @Override // defpackage.aue
    public final b a() {
        return new b(this, new ConcurrentHashMap(3, 1.0f, 2), new m29());
    }

    @Override // defpackage.aue
    public final l29 b(x4 x4Var, y4 y4Var) {
        return new l29(this, x4Var, y4Var);
    }

    @Override // defpackage.aue
    public final k29 c(gu5 gu5Var) {
        return new k29(this, gu5Var);
    }

    @Override // defpackage.aue
    public final j d(Function1 function1) {
        return new j(this, new ConcurrentHashMap(3, 1.0f, 2), function1);
    }

    @Override // defpackage.aue
    public final f e(gu5 gu5Var) {
        return new f(this, gu5Var);
    }

    @Override // defpackage.aue
    public final h f(gu5 gu5Var) {
        return new h(this, gu5Var);
    }

    @Override // defpackage.aue
    public final k g(Function1 function1) {
        return new k(this, new ConcurrentHashMap(3, 1.0f, 2), function1);
    }

    public m h(Object obj, String str) {
        StringBuilder sb = new StringBuilder("Recursion detected ");
        sb.append(str);
        sb.append(obj == null ? "" : t40.i(obj, "on input: "));
        sb.append(" under ");
        sb.append(this);
        AssertionError assertionError = new AssertionError(sb.toString());
        i(assertionError);
        throw assertionError;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(" (");
        return l6.i(sb, this.c, ")");
    }

    public j29(String str) {
        this(str, new gga(0));
    }
}
