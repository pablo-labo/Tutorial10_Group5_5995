package defpackage;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableMap;
import defpackage.ftc;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.DynamicCastException;
import expo.modules.kotlin.exception.FieldCastException;
import expo.modules.kotlin.exception.FieldRequiredException;
import expo.modules.kotlin.exception.RecordCastException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.ExpectedType;
import java.io.ObjectStreamClass;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class itc<T extends ftc> extends ge4<T> {
    public final fxf a;
    public final zf8 b;
    public final d2f c;

    public static final class a {
        public final owf<?> a;
        public final w85 b;
        public final boolean c;
        public final ArrayList d;

        public a(owf owfVar, w85 w85Var, boolean z, ArrayList arrayList) {
            owfVar.getClass();
            this.a = owfVar;
            this.b = w85Var;
            this.c = z;
            this.d = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return wl7.b(this.a, aVar.a) && this.b.equals(aVar.b) && this.c == aVar.c && this.d.equals(aVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ia.f((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        }

        public final String toString() {
            return "PropertyDescriptor(typeConverter=" + this.a + ", fieldAnnotation=" + this.b + ", isRequired=" + this.c + ", validators=" + this.d + ")";
        }
    }

    public itc(fxf fxfVar, zf8 zf8Var) {
        zf8Var.getClass();
        this.a = fxfVar;
        this.b = zf8Var;
        this.c = new d2f(new qa(this, 22));
    }

    @Override // defpackage.kka, defpackage.owf
    public final boolean b() {
        return false;
    }

    @Override // defpackage.owf
    public final ExpectedType c() {
        return new ExpectedType(s23.Y);
    }

    @Override // defpackage.ge4
    public final Object e(Object obj, gk0 gk0Var, boolean z) {
        return obj instanceof ReadableMap ? g((ReadableMap) obj, gk0Var, z) : (ftc) obj;
    }

    @Override // defpackage.ge4
    public final Object f(Dynamic dynamic, gk0 gk0Var, boolean z) throws RecordCastException {
        CodedException unexpectedException;
        try {
            ReadableMap readableMapAsMap = dynamic.asMap();
            if (readableMapAsMap != null) {
                return g(readableMapAsMap, gk0Var, z);
            }
            throw new DynamicCastException(fwc.a.b(ReadableMap.class));
        } catch (Throwable th) {
            if (th instanceof CodedException) {
                unexpectedException = (CodedException) th;
            } else if (th instanceof expo.modules.core.errors.CodedException) {
                expo.modules.core.errors.CodedException codedException = (expo.modules.core.errors.CodedException) th;
                unexpectedException = new CodedException(codedException.a(), codedException.getMessage(), codedException.getCause());
            } else {
                unexpectedException = new UnexpectedException(th);
            }
            zf8 zf8Var = this.b;
            zf8Var.getClass();
            throw new RecordCastException("Cannot create a record of the type: '" + zf8Var + "'.", unexpectedException);
        }
    }

    public final T g(ReadableMap readableMap, gk0 gk0Var, boolean z) throws FieldRequiredException {
        gna q20Var;
        FieldCastException fieldCastException;
        Object r20Var;
        oe8 oe8VarA = this.b.a();
        oe8VarA.getClass();
        yd8 yd8Var = (yd8) oe8VarA;
        try {
            Constructor declaredConstructor = jh2.p(yd8Var).getDeclaredConstructor(null);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            q20Var = new p20(declaredConstructor);
        } catch (NoSuchMethodException unused) {
            q20Var = null;
        }
        if (q20Var == null) {
            Iterator it = yd8Var.k().iterator();
            boolean z2 = false;
            Object obj = null;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    List<mf8> parameters = ((ve8) next).getParameters();
                    if (!(parameters instanceof Collection) || !parameters.isEmpty()) {
                        Iterator<T> it2 = parameters.iterator();
                        while (it2.hasNext()) {
                            if (!((mf8) it2.next()).u()) {
                                break;
                            }
                        }
                    }
                    if (z2) {
                        break;
                    }
                    z2 = true;
                    obj = next;
                } else if (!z2) {
                    break;
                }
            }
            obj = null;
            ve8 ve8Var = (ve8) obj;
            q20Var = ve8Var == null ? null : new q20(ve8Var, 10);
            if (q20Var == null) {
                final Class clsP = jh2.p(yd8Var);
                try {
                    try {
                        Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                        declaredMethod.setAccessible(true);
                        Object objInvoke = declaredMethod.invoke(null, Object.class);
                        objInvoke.getClass();
                        final int iIntValue = ((Integer) objInvoke).intValue();
                        final Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                        declaredMethod2.setAccessible(true);
                        r20Var = new c7g() { // from class: b7g
                            @Override // defpackage.c7g
                            public final Object a() {
                                return declaredMethod2.invoke(null, clsP, Integer.valueOf(iIntValue));
                            }
                        };
                    } catch (Throwable unused2) {
                        r20Var = new r20(clsP, 12);
                    }
                } catch (Throwable unused3) {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    r20Var = new z1f(cls.getMethod("allocateInstance", Class.class), declaredField.get(null), clsP);
                }
                q20Var = new r91(r20Var);
            }
        }
        Object objB = q20Var.b();
        for (Map.Entry entry : ((Map) this.c.getValue()).entrySet()) {
            tf8 tf8Var = (tf8) entry.getKey();
            a aVar = (a) entry.getValue();
            String strKey = aVar.b.key();
            if (zve.U(strKey)) {
                strKey = null;
            }
            if (strKey == null) {
                strKey = tf8Var.getName();
            }
            if (readableMap.hasKey(strKey)) {
                Dynamic dynamic = readableMap.getDynamic(strKey);
                try {
                    Field fieldA = zvc.a(tf8Var);
                    fieldA.getClass();
                    try {
                        Object objA = aVar.a.a(dynamic, gk0Var, z);
                        if (objA != null) {
                            for (f95 f95Var : aVar.d) {
                                f95Var.getClass();
                                f95Var.a();
                            }
                        }
                        fieldA.setAccessible(true);
                        fieldA.set(objB, objA);
                        j6g j6gVar = j6g.a;
                        dynamic.recycle();
                    } finally {
                    }
                } catch (Throwable th) {
                    dynamic.recycle();
                    throw th;
                }
            } else if (aVar.c) {
                tf8Var.getClass();
                throw new FieldRequiredException("Value for field '" + tf8Var + "' is required, got nil", null);
            }
        }
        objB.getClass();
        return (T) objB;
    }
}
