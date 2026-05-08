package defpackage;

import defpackage.qv1;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class glg<M extends Member> implements pv1<M> {
    public final boolean a;
    public final pv1<M> b;
    public final M c;
    public final a d;
    public final oh7[] e;
    public final boolean f;

    public static final class a {
        public final oh7 a;
        public final List<Method>[] b;
        public final Method c;

        public a(oh7 oh7Var, List<Method>[] listArr, Method method) {
            oh7Var.getClass();
            this.a = oh7Var;
            this.b = listArr;
            this.c = method;
        }
    }

    public static final class b implements pv1 {
        public final Method a;
        public final Method b;
        public final ArrayList c;
        public final ArrayList d;
        public final ArrayList e;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v15, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v17, types: [java.util.ArrayList] */
        public b(kv5 kv5Var, te8 te8Var, String str, List<? extends o3b> list) {
            ?? Z;
            te8Var.getClass();
            str.getClass();
            Method methodQ = te8Var.q("constructor-impl", str);
            methodQ.getClass();
            this.a = methodQ;
            Method methodQ2 = te8Var.q("box-impl", zve.d0(str, "V").concat(wuc.b(te8Var.j())));
            methodQ2.getClass();
            this.b = methodQ2;
            List<? extends o3b> list2 = list;
            ArrayList arrayList = new ArrayList(t92.r0(list2, 10));
            Iterator it = list2.iterator();
            while (true) {
                List listZ = null;
                if (!it.hasNext()) {
                    break;
                }
                ui8 type = ((o3b) it.next()).getType();
                type.getClass();
                mge mgeVarA = dyf.a(type);
                ArrayList arrayListE = wuf.e(mgeVarA);
                if (arrayListE == null) {
                    Class clsJ = wuf.j(mgeVarA);
                    if (clsJ != null) {
                        listZ = u63.Z(wuf.d(clsJ, kv5Var));
                    }
                } else {
                    listZ = arrayListE;
                }
                arrayList.add(listZ);
            }
            this.c = arrayList;
            ArrayList arrayList2 = new ArrayList(t92.r0(list2, 10));
            int i = 0;
            for (Object obj : list2) {
                int i2 = i + 1;
                if (i < 0) {
                    u63.o0();
                    throw null;
                }
                v62 v62VarD = ((o3b) obj).getType().M0().d();
                v62VarD.getClass();
                t52 t52Var = (t52) v62VarD;
                List list3 = (List) this.c.get(i);
                if (list3 != null) {
                    List list4 = list3;
                    Z = new ArrayList(t92.r0(list4, 10));
                    Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        Z.add(((Method) it2.next()).getReturnType());
                    }
                } else {
                    Class<?> clsJ2 = akg.j(t52Var);
                    clsJ2.getClass();
                    Z = u63.Z(clsJ2);
                }
                arrayList2.add(Z);
                i = i2;
            }
            this.d = arrayList2;
            this.e = t92.s0(arrayList2);
        }

        @Override // defpackage.pv1
        public final List<Type> a() {
            return this.e;
        }

        @Override // defpackage.pv1
        public final boolean b() {
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r6v2 */
        /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
        @Override // defpackage.pv1
        public final Object call(Object[] objArr) throws IllegalAccessException, InvocationTargetException {
            ?? Z;
            objArr.getClass();
            ArrayList arrayList = this.c;
            arrayList.getClass();
            int length = objArr.length;
            ArrayList<Pair> arrayList2 = new ArrayList(Math.min(t92.r0(arrayList, 10), length));
            int i = 0;
            for (Object obj : arrayList) {
                if (i >= length) {
                    break;
                }
                arrayList2.add(new Pair(objArr[i], obj));
                i++;
            }
            ArrayList arrayList3 = new ArrayList();
            for (Pair pair : arrayList2) {
                Object objA = pair.a();
                List list = (List) pair.b();
                if (list != null) {
                    List list2 = list;
                    Z = new ArrayList(t92.r0(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        Z.add(((Method) it.next()).invoke(objA, null));
                    }
                } else {
                    Z = u63.Z(objA);
                }
                w92.w0(arrayList3, (Iterable) Z);
            }
            Object[] array = arrayList3.toArray(new Object[0]);
            this.a.invoke(null, Arrays.copyOf(array, array.length));
            return this.b.invoke(null, Arrays.copyOf(array, array.length));
        }

        @Override // defpackage.pv1
        public final /* bridge */ /* synthetic */ Member getMember() {
            return null;
        }

        @Override // defpackage.pv1
        public final Type getReturnType() {
            Class<?> returnType = this.b.getReturnType();
            returnType.getClass();
            return returnType;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077 A[LOOP:1: B:25:0x0071->B:27:0x0077, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public glg(defpackage.hv1 r11, defpackage.pv1<? extends M> r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 853
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.glg.<init>(hv1, pv1, boolean):void");
    }

    @Override // defpackage.pv1
    public final List<Type> a() {
        return this.b.a();
    }

    @Override // defpackage.pv1
    public final boolean b() {
        return this.b instanceof qv1.g.a;
    }

    public final oh7 c(int i) {
        oh7[] oh7VarArr = this.e;
        if (i >= 0 && i < oh7VarArr.length) {
            return oh7VarArr[i];
        }
        if (oh7VarArr.length == 0) {
            return new oh7(i, i, 1);
        }
        int length = ((oh7) ut0.u0(oh7VarArr)).b + 1 + (i - oh7VarArr.length);
        return new oh7(length, length, 1);
    }

    @Override // defpackage.pv1
    public final Object call(Object[] objArr) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke;
        Object objE;
        Object objE2;
        objArr.getClass();
        a aVar = this.d;
        oh7 oh7Var = aVar.a;
        List<Method>[] listArr = aVar.b;
        Method method = aVar.c;
        boolean zIsEmpty = oh7Var.isEmpty();
        int i = oh7Var.b;
        int i2 = oh7Var.a;
        if (!zIsEmpty) {
            if (this.f) {
                iy8 iy8Var = new iy8(objArr.length);
                for (int i3 = 0; i3 < i2; i3++) {
                    iy8Var.add(objArr[i3]);
                }
                if (i2 <= i) {
                    while (true) {
                        List<Method> list = listArr[i2];
                        Object obj = objArr[i2];
                        if (list != null) {
                            for (Method method2 : list) {
                                if (obj != null) {
                                    objE2 = method2.invoke(obj, null);
                                } else {
                                    Class<?> returnType = method2.getReturnType();
                                    returnType.getClass();
                                    objE2 = akg.e(returnType);
                                }
                                iy8Var.add(objE2);
                            }
                        } else {
                            iy8Var.add(obj);
                        }
                        if (i2 == i) {
                            break;
                        }
                        i2++;
                    }
                }
                int i4 = i + 1;
                int length = objArr.length - 1;
                if (i4 <= length) {
                    while (true) {
                        iy8Var.add(objArr[i4]);
                        if (i4 == length) {
                            break;
                        }
                        i4++;
                    }
                }
                objArr = iy8Var.l().toArray(new Object[0]);
            } else {
                int length2 = objArr.length;
                Object[] objArr2 = new Object[length2];
                for (int i5 = 0; i5 < length2; i5++) {
                    if (i5 > i || i2 > i5) {
                        objE = objArr[i5];
                    } else {
                        List<Method> list2 = listArr[i5];
                        Method method3 = list2 != null ? (Method) z92.k1(list2) : null;
                        objE = objArr[i5];
                        if (method3 != null) {
                            if (objE != null) {
                                objE = method3.invoke(objE, null);
                            } else {
                                Class<?> returnType2 = method3.getReturnType();
                                returnType2.getClass();
                                objE = akg.e(returnType2);
                            }
                        }
                    }
                    objArr2[i5] = objE;
                }
                objArr = objArr2;
            }
        }
        Object objCall = this.b.call(objArr);
        return (objCall == g13.a || method == null || (objInvoke = method.invoke(null, objCall)) == null) ? objCall : objInvoke;
    }

    @Override // defpackage.pv1
    public final M getMember() {
        return this.c;
    }

    @Override // defpackage.pv1
    public final Type getReturnType() {
        return this.b.getReturnType();
    }
}
