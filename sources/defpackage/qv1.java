package defpackage;

import defpackage.pv1;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class qv1<M extends Member> implements pv1<M> {
    public final M a;
    public final Type b;
    public final Class<?> c;
    public final List<Type> d;

    public static final class a extends qv1<Constructor<?>> implements yk1 {
        public final Object e;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(Constructor<?> constructor, Object obj) {
            Class<?> declaringClass = constructor.getDeclaringClass();
            declaringClass.getClass();
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            genericParameterTypes.getClass();
            super(constructor, declaringClass, null, (Type[]) (genericParameterTypes.length <= 2 ? new Type[0] : pyd.n(genericParameterTypes, 1, genericParameterTypes.length - 1)));
            this.e = obj;
        }

        @Override // defpackage.pv1
        public final Object call(Object[] objArr) {
            objArr.getClass();
            pv1.a.a(this, objArr);
            Constructor constructor = (Constructor) this.a;
            md2 md2Var = new md2(3);
            md2Var.b(this.e);
            md2Var.c(objArr);
            md2Var.b(null);
            ArrayList arrayList = (ArrayList) md2Var.a;
            return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
        }
    }

    public static final class b extends qv1<Constructor<?>> {
        @Override // defpackage.pv1
        public final Object call(Object[] objArr) {
            objArr.getClass();
            pv1.a.a(this, objArr);
            Constructor constructor = (Constructor) this.a;
            md2 md2Var = new md2(2);
            md2Var.c(objArr);
            md2Var.b(null);
            ArrayList arrayList = (ArrayList) md2Var.a;
            return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
        }
    }

    public static final class c extends qv1<Constructor<?>> implements yk1 {
        public final Object e;

        /* JADX WARN: Illegal instructions before constructor call */
        public c(Constructor<?> constructor, Object obj) {
            Class<?> declaringClass = constructor.getDeclaringClass();
            declaringClass.getClass();
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            genericParameterTypes.getClass();
            super(constructor, declaringClass, null, genericParameterTypes);
            this.e = obj;
        }

        @Override // defpackage.pv1
        public final Object call(Object[] objArr) {
            objArr.getClass();
            pv1.a.a(this, objArr);
            Constructor constructor = (Constructor) this.a;
            md2 md2Var = new md2(2);
            md2Var.b(this.e);
            md2Var.c(objArr);
            ArrayList arrayList = (ArrayList) md2Var.a;
            return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
        }
    }

    public static final class d extends qv1<Constructor<?>> {
        @Override // defpackage.pv1
        public final Object call(Object[] objArr) {
            objArr.getClass();
            pv1.a.a(this, objArr);
            return ((Constructor) this.a).newInstance(Arrays.copyOf(objArr, objArr.length));
        }
    }

    public static abstract class e extends qv1<Field> {

        public static final class a extends e implements yk1 {
            public final Object e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Object obj, Field field) {
                super(field, false);
                field.getClass();
                this.e = obj;
            }

            @Override // qv1.e, defpackage.pv1
            public final Object call(Object[] objArr) {
                objArr.getClass();
                pv1.a.a(this, objArr);
                return ((Field) this.a).get(this.e);
            }
        }

        public static final class b extends e implements yk1 {
        }

        public static final class c extends e {
        }

        public static final class d extends e {
            @Override // defpackage.qv1
            public final void c(Object[] objArr) {
                objArr.getClass();
                pv1.a.a(this, objArr);
                d(ut0.k0(objArr));
            }
        }

        /* JADX INFO: renamed from: qv1$e$e, reason: collision with other inner class name */
        public static final class C0400e extends e {
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public e(Field field, boolean z) {
            Type genericType = field.getGenericType();
            genericType.getClass();
            super(field, genericType, z ? field.getDeclaringClass() : null, new Type[0]);
        }

        @Override // defpackage.pv1
        public Object call(Object[] objArr) {
            objArr.getClass();
            c(objArr);
            return ((Field) this.a).get(this.c != null ? ut0.j0(objArr) : null);
        }
    }

    public static abstract class f extends qv1<Field> {
        public final boolean e;

        public static final class a extends f implements yk1 {
            public final Object f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Field field, boolean z, Object obj) {
                super(field, z, false);
                field.getClass();
                this.f = obj;
            }

            @Override // qv1.f, defpackage.pv1
            public final Object call(Object[] objArr) throws IllegalAccessException {
                objArr.getClass();
                c(objArr);
                ((Field) this.a).set(this.f, ut0.j0(objArr));
                return j6g.a;
            }
        }

        public static final class b extends f implements yk1 {
            @Override // qv1.f, defpackage.pv1
            public final Object call(Object[] objArr) throws IllegalAccessException {
                objArr.getClass();
                c(objArr);
                ((Field) this.a).set(null, ut0.u0(objArr));
                return j6g.a;
            }
        }

        public static final class c extends f {
        }

        public static final class d extends f {
            @Override // qv1.f, defpackage.qv1
            public final void c(Object[] objArr) {
                objArr.getClass();
                super.c(objArr);
                d(ut0.k0(objArr));
            }
        }

        public static final class e extends f {
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public f(Field field, boolean z, boolean z2) {
            Class cls = Void.TYPE;
            cls.getClass();
            super(field, cls, z2 ? field.getDeclaringClass() : null, new Type[]{field.getGenericType()});
            this.e = z;
        }

        @Override // defpackage.qv1
        public void c(Object[] objArr) {
            objArr.getClass();
            pv1.a.a(this, objArr);
            if (this.e && ut0.u0(objArr) == null) {
                l5.q("null is not allowed as a value for this property.");
            }
        }

        @Override // defpackage.pv1
        public Object call(Object[] objArr) throws IllegalAccessException {
            objArr.getClass();
            c(objArr);
            ((Field) this.a).set(this.c != null ? ut0.j0(objArr) : null, ut0.u0(objArr));
            return j6g.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public qv1(Member member, Type type, Class cls, Type[] typeArr) {
        List<Type> listE0;
        this.a = member;
        this.b = type;
        this.c = cls;
        if (cls != null) {
            md2 md2Var = new md2(2);
            ArrayList arrayList = (ArrayList) md2Var.a;
            md2Var.b(cls);
            md2Var.c(typeArr);
            listE0 = u63.a0(arrayList.toArray(new Type[arrayList.size()]));
        } else {
            listE0 = ut0.E0(typeArr);
        }
        this.d = listE0;
    }

    @Override // defpackage.pv1
    public final List<Type> a() {
        return this.d;
    }

    @Override // defpackage.pv1
    public final boolean b() {
        return false;
    }

    public void c(Object[] objArr) {
        pv1.a.a(this, objArr);
    }

    public final void d(Object obj) {
        if (obj == null || !this.a.getDeclaringClass().isInstance(obj)) {
            l5.q("An object member requires the object instance passed as the first argument.");
        }
    }

    @Override // defpackage.pv1
    public final M getMember() {
        return this.a;
    }

    @Override // defpackage.pv1
    public final Type getReturnType() {
        return this.b;
    }

    public static abstract class g extends qv1<Method> {
        public final boolean e;

        public static final class a extends g implements yk1 {
            public final Object f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Object obj, Method method) {
                super(4, method, false);
                method.getClass();
                this.f = obj;
            }

            @Override // defpackage.pv1
            public final Object call(Object[] objArr) {
                objArr.getClass();
                pv1.a.a(this, objArr);
                return e(this.f, objArr);
            }
        }

        public static final class b extends g implements yk1 {
            @Override // defpackage.pv1
            public final Object call(Object[] objArr) {
                objArr.getClass();
                pv1.a.a(this, objArr);
                return e(null, objArr);
            }
        }

        public static final class c extends g implements yk1 {
            public final boolean f;
            public final Object g;

            /* JADX WARN: Illegal instructions before constructor call */
            public c(Method method, boolean z, Object obj) {
                Type[] genericParameterTypes = method.getGenericParameterTypes();
                genericParameterTypes.getClass();
                super(method, false, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : pyd.n(genericParameterTypes, 1, genericParameterTypes.length)));
                this.f = z;
                this.g = obj;
            }

            @Override // defpackage.pv1
            public final Object call(Object[] objArr) {
                objArr.getClass();
                pv1.a.a(this, objArr);
                md2 md2Var = new md2(2);
                md2Var.b(this.g);
                md2Var.c(objArr);
                ArrayList arrayList = (ArrayList) md2Var.a;
                return e(null, arrayList.toArray(new Object[arrayList.size()]));
            }
        }

        public static final class d extends g implements yk1 {
            public final Object[] f;

            /* JADX WARN: Illegal instructions before constructor call */
            public d(Method method, Object[] objArr) {
                method.getClass();
                objArr.getClass();
                Type[] genericParameterTypes = method.getGenericParameterTypes();
                genericParameterTypes.getClass();
                super(method, false, (Type[]) ut0.h0(objArr.length, genericParameterTypes).toArray(new Type[0]));
                this.f = objArr;
            }

            @Override // defpackage.pv1
            public final Object call(Object[] objArr) {
                objArr.getClass();
                pv1.a.a(this, objArr);
                md2 md2Var = new md2(2);
                md2Var.c(this.f);
                md2Var.c(objArr);
                ArrayList arrayList = (ArrayList) md2Var.a;
                return e(null, arrayList.toArray(new Object[arrayList.size()]));
            }
        }

        public static final class e extends g {
            @Override // defpackage.pv1
            public final Object call(Object[] objArr) {
                objArr.getClass();
                pv1.a.a(this, objArr);
                return e(objArr[0], objArr.length <= 1 ? new Object[0] : pyd.n(objArr, 1, objArr.length));
            }
        }

        public static final class f extends g {
            @Override // defpackage.pv1
            public final Object call(Object[] objArr) {
                objArr.getClass();
                pv1.a.a(this, objArr);
                d(ut0.k0(objArr));
                return e(null, objArr.length <= 1 ? new Object[0] : pyd.n(objArr, 1, objArr.length));
            }
        }

        /* JADX INFO: renamed from: qv1$g$g, reason: collision with other inner class name */
        public static final class C0401g extends g {
            @Override // defpackage.pv1
            public final Object call(Object[] objArr) {
                objArr.getClass();
                pv1.a.a(this, objArr);
                return e(null, objArr);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public g(Method method, boolean z, Type[] typeArr) {
            Type genericReturnType = method.getGenericReturnType();
            genericReturnType.getClass();
            super(method, genericReturnType, z ? method.getDeclaringClass() : null, typeArr);
            this.e = genericReturnType.equals(Void.TYPE);
        }

        public final Object e(Object obj, Object[] objArr) {
            objArr.getClass();
            return this.e ? j6g.a : ((Method) this.a).invoke(obj, Arrays.copyOf(objArr, objArr.length));
        }

        public /* synthetic */ g(int i, Method method, boolean z) {
            this(method, (i & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z, method.getGenericParameterTypes());
        }
    }
}
