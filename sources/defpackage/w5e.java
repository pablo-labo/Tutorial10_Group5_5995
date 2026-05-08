package defpackage;

import defpackage.pm8;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class w5e {
    public static final Comparator<f5e>[] a;
    public static final a b;

    public static final class a extends mj8 implements Function2<f5e, f5e, Integer> {
        public static final a a = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(f5e f5eVar, f5e f5eVar2) {
            w4e w4eVar = f5eVar.d;
            r5e<Float> r5eVar = k5e.s;
            return Integer.valueOf(Float.compare(((Number) w4eVar.f(r5eVar, u5e.a)).floatValue(), ((Number) f5eVar2.d.f(r5eVar, v5e.a)).floatValue()));
        }
    }

    public static final class b<T> implements Comparator {
        public final /* synthetic */ Comparator a;

        public b(Comparator comparator) {
            pm8.c cVar = pm8.F0;
            this.a = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int iCompare = this.a.compare(t, t2);
            return iCompare != 0 ? iCompare : pm8.I0.compare(((f5e) t).c, ((f5e) t2).c);
        }
    }

    public static final class c<T> implements Comparator {
        public final /* synthetic */ b a;

        public c(b bVar) {
            this.a = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int iCompare = this.a.compare(t, t2);
            return iCompare != 0 ? iCompare : ak2.i(Integer.valueOf(((f5e) t).g), Integer.valueOf(((f5e) t2).g));
        }
    }

    static {
        Comparator<f5e>[] comparatorArr = new Comparator[2];
        int i = 0;
        while (i < 2) {
            Comparator comparator = i == 0 ? hhd.b : g89.b;
            pm8.c cVar = pm8.F0;
            comparatorArr[i] = new c(new b(comparator));
            i++;
        }
        a = comparatorArr;
        b = a.a;
    }

    public static final void a(f5e f5eVar, ArrayList arrayList, s50 s50Var, t50 t50Var, a3a a3aVar) {
        boolean zBooleanValue = ((Boolean) f5eVar.d.f(k5e.m, x5e.a)).booleanValue();
        if ((zBooleanValue || ((Boolean) t50Var.invoke(f5eVar)).booleanValue()) && ((Boolean) s50Var.invoke(f5eVar)).booleanValue()) {
            arrayList.add(f5eVar);
        }
        if (zBooleanValue) {
            a3aVar.h(f5eVar.g, b(f5eVar, s50Var, t50Var, f5e.j(7, f5eVar)));
            return;
        }
        List listJ = f5e.j(7, f5eVar);
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            a((f5e) listJ.get(i), arrayList, s50Var, t50Var, a3aVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.ArrayList b(defpackage.f5e r17, defpackage.s50 r18, defpackage.t50 r19, java.util.List r20) {
        /*
            Method dump skipped, instruction units count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w5e.b(f5e, s50, t50, java.util.List):java.util.ArrayList");
    }
}
