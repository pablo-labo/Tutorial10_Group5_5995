package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ue0 implements pv1 {
    public final Class<?> a;
    public final ArrayList b;
    public final a c;
    public final List<Method> d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final /* synthetic */ a[] c;

        static {
            a aVar = new a("CALL_BY_NAME", 0);
            a = aVar;
            a aVar2 = new a("POSITIONAL_CALL", 1);
            b = aVar2;
            c = new a[]{aVar, aVar2};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) c.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b a;
        public static final b b;
        public static final /* synthetic */ b[] c;

        static {
            b bVar = new b("JAVA", 0);
            a = bVar;
            b bVar2 = new b("KOTLIN", 1);
            b = bVar2;
            c = new b[]{bVar, bVar2};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) c.clone();
        }
    }

    public ue0(Class cls, ArrayList arrayList, a aVar, b bVar, List list) {
        cls.getClass();
        list.getClass();
        this.a = cls;
        this.b = arrayList;
        this.c = aVar;
        this.d = list;
        List list2 = list;
        ArrayList arrayList2 = new ArrayList(t92.r0(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Method) it.next()).getGenericReturnType());
        }
        this.e = arrayList2;
        List<Method> list3 = this.d;
        ArrayList arrayList3 = new ArrayList(t92.r0(list3, 10));
        Iterator<T> it2 = list3.iterator();
        while (it2.hasNext()) {
            Class<?> returnType = ((Method) it2.next()).getReturnType();
            returnType.getClass();
            Class<? extends Object> cls2 = wuc.c.get(returnType);
            if (cls2 != null) {
                returnType = cls2;
            }
            arrayList3.add(returnType);
        }
        this.f = arrayList3;
        List<Method> list4 = this.d;
        ArrayList arrayList4 = new ArrayList(t92.r0(list4, 10));
        Iterator<T> it3 = list4.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((Method) it3.next()).getDefaultValue());
        }
        this.g = arrayList4;
        if (this.c == a.b && bVar == b.a && !z92.d1(this.b, "value").isEmpty()) {
            b0.u("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
            throw null;
        }
    }

    @Override // defpackage.pv1
    public final List<Type> a() {
        return this.e;
    }

    @Override // defpackage.pv1
    public final boolean b() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    @Override // defpackage.pv1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object call(java.lang.Object[] r18) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ue0.call(java.lang.Object[]):java.lang.Object");
    }

    @Override // defpackage.pv1
    public final /* bridge */ /* synthetic */ Member getMember() {
        return null;
    }

    @Override // defpackage.pv1
    public final Type getReturnType() {
        return this.a;
    }

    public /* synthetic */ ue0(Class cls, ArrayList arrayList, a aVar) {
        ArrayList arrayList2 = new ArrayList(t92.r0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(cls.getDeclaredMethod((String) it.next(), null));
        }
        this(cls, arrayList, aVar, b.b, arrayList2);
    }
}
