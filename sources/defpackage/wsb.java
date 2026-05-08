package defpackage;

import defpackage.p56;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.models.ProfilePreferencesViewModel$getJobTypePreferenceOptions$1", f = "ProfilePreferencesViewModel.kt", l = {666}, m = "invokeSuspend")
public final class wsb extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ aub this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wsb(aub aubVar, lu2<? super wsb> lu2Var) {
        super(2, lu2Var);
        this.this$0 = aubVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new wsb(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((wsb) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        Object objL;
        Iterable iterable;
        p56.e eVar;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            xkb xkbVar = this.this$0.b;
            this.label = 1;
            objL = xkbVar.l(this);
            g13 g13Var = g13.a;
            if (objL == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            objL = obj;
        }
        p56.b bVar = (p56.b) objL;
        if (bVar == null || (eVar = bVar.a) == null || (iterable = eVar.a) == null) {
            iterable = zr4.a;
        }
        aub aubVar = this.this$0;
        ArrayList<p56.d> arrayList = new ArrayList();
        for (Object obj2 : iterable) {
            if (aubVar.c.contains(((p56.d) obj2).b)) {
                arrayList.add(obj2);
            }
        }
        aub aubVar2 = this.this$0;
        vsb vsbVarL = aubVar2.l();
        ArrayList arrayList2 = new ArrayList(t92.r0(arrayList, 10));
        for (p56.d dVar : arrayList) {
            arrayList2.add(new sjb(dVar.b, dVar.c));
        }
        aubVar2.v(vsb.a(vsbVarL, null, null, arrayList2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097147));
        return j6g.a;
    }
}
