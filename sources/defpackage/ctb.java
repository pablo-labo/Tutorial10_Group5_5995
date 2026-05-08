package defpackage;

import defpackage.p56;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.models.ProfilePreferencesViewModel$getWorkSchedulePreferenceOptions$1", f = "ProfilePreferencesViewModel.kt", l = {752}, m = "invokeSuspend")
public final class ctb extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ aub this$0;

    public static final class a<T> implements Comparator {
        public final /* synthetic */ aub a;

        public a(aub aubVar) {
            this.a = aubVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            aub aubVar = this.a;
            return ak2.i(Integer.valueOf(aubVar.f.indexOf(((p56.d) t).b)), Integer.valueOf(aubVar.f.indexOf(((p56.d) t2).b)));
        }
    }

    public static final class b<T> implements Comparator {
        public final /* synthetic */ aub a;

        public b(aub aubVar) {
            this.a = aubVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            aub aubVar = this.a;
            return ak2.i(Integer.valueOf(aubVar.V.indexOf(((p56.d) t).b)), Integer.valueOf(aubVar.V.indexOf(((p56.d) t2).b)));
        }
    }

    public static final class c<T> implements Comparator {
        public final /* synthetic */ aub a;

        public c(aub aubVar) {
            this.a = aubVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            aub aubVar = this.a;
            return ak2.i(Integer.valueOf(aubVar.W.indexOf(((p56.d) t).b)), Integer.valueOf(aubVar.W.indexOf(((p56.d) t2).b)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctb(aub aubVar, lu2<? super ctb> lu2Var) {
        super(2, lu2Var);
        this.this$0 = aubVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new ctb(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((ctb) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        Object objR;
        List listP1;
        List listP12;
        p56.e eVar;
        List<p56.d> list;
        p56.e eVar2;
        List<p56.d> list2;
        p56.e eVar3;
        List<p56.d> list3;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            xkb xkbVar = this.this$0.b;
            this.label = 1;
            objR = xkbVar.r(this);
            g13 g13Var = g13.a;
            if (objR == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            objR = obj;
        }
        muf mufVar = (muf) objR;
        p56.b bVar = (p56.b) mufVar.d();
        List listP13 = zr4.a;
        if (bVar == null || (eVar3 = bVar.a) == null || (list3 = eVar3.a) == null) {
            listP1 = listP13;
        } else {
            aub aubVar = this.this$0;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list3) {
                if (aubVar.f.contains(((p56.d) obj2).b)) {
                    arrayList.add(obj2);
                }
            }
            listP1 = z92.p1(arrayList, new a(this.this$0));
        }
        p56.b bVar2 = (p56.b) mufVar.e();
        if (bVar2 == null || (eVar2 = bVar2.a) == null || (list2 = eVar2.a) == null) {
            listP12 = listP13;
        } else {
            aub aubVar2 = this.this$0;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : list2) {
                if (aubVar2.V.contains(((p56.d) obj3).b)) {
                    arrayList2.add(obj3);
                }
            }
            listP12 = z92.p1(arrayList2, new b(this.this$0));
        }
        p56.b bVar3 = (p56.b) mufVar.f();
        if (bVar3 != null && (eVar = bVar3.a) != null && (list = eVar.a) != null) {
            aub aubVar3 = this.this$0;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj4 : list) {
                if (aubVar3.W.contains(((p56.d) obj4).b)) {
                    arrayList3.add(obj4);
                }
            }
            listP13 = z92.p1(arrayList3, new c(this.this$0));
        }
        aub aubVar4 = this.this$0;
        vsb vsbVarL = aubVar4.l();
        List<p56.d> list4 = listP1;
        ArrayList arrayList4 = new ArrayList(t92.r0(list4, 10));
        for (p56.d dVar : list4) {
            arrayList4.add(new sjb(dVar.b, dVar.c));
        }
        List<p56.d> list5 = listP12;
        ArrayList arrayList5 = new ArrayList(t92.r0(list5, 10));
        for (p56.d dVar2 : list5) {
            arrayList5.add(new sjb(dVar2.b, dVar2.c));
        }
        List<p56.d> list6 = listP13;
        ArrayList arrayList6 = new ArrayList(t92.r0(list6, 10));
        for (p56.d dVar3 : list6) {
            arrayList6.add(new sjb(dVar3.b, dVar3.c));
        }
        aubVar4.v(vsb.a(vsbVarL, null, null, null, null, arrayList4, null, arrayList5, null, arrayList6, null, null, null, null, null, null, null, null, null, null, null, null, 2096815));
        return j6g.a;
    }
}
