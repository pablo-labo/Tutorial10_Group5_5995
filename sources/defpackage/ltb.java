package defpackage;

import defpackage.p56;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.models.ProfilePreferencesViewModel$setRemoteWorkPreferenceOptions$1", f = "ProfilePreferencesViewModel.kt", l = {151}, m = "invokeSuspend")
public final class ltb extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ aub this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ltb(aub aubVar, lu2<? super ltb> lu2Var) {
        super(2, lu2Var);
        this.this$0 = aubVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new ltb(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((ltb) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        Object objT;
        Iterable iterable;
        p56.e eVar;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            xkb xkbVar = this.this$0.b;
            this.label = 1;
            objT = xkbVar.t(this);
            g13 g13Var = g13.a;
            if (objT == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            objT = obj;
        }
        p56.b bVar = (p56.b) objT;
        if (bVar == null || (eVar = bVar.a) == null || (iterable = eVar.a) == null) {
            iterable = zr4.a;
        }
        aub aubVar = this.this$0;
        vsb vsbVarL = aubVar.l();
        Iterable<p56.d> iterable2 = iterable;
        ArrayList arrayList = new ArrayList(t92.r0(iterable2, 10));
        for (p56.d dVar : iterable2) {
            arrayList.add(new sjb(dVar.b, dVar.c));
        }
        aubVar.v(vsb.a(vsbVarL, null, arrayList, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097149));
        return j6g.a;
    }
}
