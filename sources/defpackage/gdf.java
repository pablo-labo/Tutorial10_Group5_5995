package defpackage;

import defpackage.p3a;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class gdf {

    public /* synthetic */ class a extends qv5 implements Function1<Function1<? super xcf, ? extends Boolean>, j6g> {
        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(Function1<? super xcf, ? extends Boolean> function1) {
            ((wcf) this.receiver).b.g(function1);
            return j6g.a;
        }
    }

    public static final ycf a(ts3 ts3Var) {
        jdf jdfVar;
        wcf wcfVar = new wcf();
        pg8.W(ts3Var, adf.a, new w34(12, new bt(wcfVar, 18), new a(1, wcfVar, wcf.class, "addFilter", "addFilter$foundation_release(Lkotlin/jvm/functions/Function1;)V", 0)));
        p3a p3aVar = new p3a((Object) null);
        p3a<xcf> p3aVar2 = wcfVar.a;
        Object[] objArr = p3aVar2.a;
        int i = p3aVar2.b;
        xcf xcfVar = null;
        int i2 = 0;
        boolean z = true;
        while (true) {
            jdfVar = jdf.b;
            if (i2 >= i) {
                break;
            }
            xcf xcfVar2 = (xcf) objArr[i2];
            if (!z || xcfVar2 != jdfVar) {
                if (xcfVar2 == jdfVar && xcfVar == jdfVar) {
                    z = false;
                    break;
                    break;
                }
                if (xcfVar2 != jdfVar) {
                    p3a<Function1<xcf, Boolean>> p3aVar3 = wcfVar.b;
                    Object[] objArr2 = p3aVar3.a;
                    int i3 = p3aVar3.b;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (!((Boolean) ((Function1) objArr2[i4]).invoke(xcfVar2)).booleanValue()) {
                            z = false;
                            break;
                        }
                    }
                }
                p3aVar.g(xcfVar2);
                z = false;
                xcfVar = xcfVar2;
            }
            i2++;
        }
        if (((xcf) (p3aVar.d() ? null : p3aVar.a[p3aVar.b - 1])) == jdfVar) {
            p3aVar.k(p3aVar.b - 1);
        }
        List list = p3aVar.c;
        List list2 = list;
        if (list == null) {
            p3a.b<E> bVar = new p3a.b<>(p3aVar);
            p3aVar.c = bVar;
            list2 = bVar;
        }
        return new ycf(list2);
    }
}
