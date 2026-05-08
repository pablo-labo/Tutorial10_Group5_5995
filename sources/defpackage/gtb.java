package defpackage;

import defpackage.te5;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.models.ProfilePreferencesViewModel$getWorkWellbeingPreferencesOptions$1", f = "ProfilePreferencesViewModel.kt", l = {971}, m = "invokeSuspend")
public final class gtb extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ aub this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gtb(aub aubVar, lu2<? super gtb> lu2Var) {
        super(2, lu2Var);
        this.this$0 = aubVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new gtb(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((gtb) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        Object objW;
        vsb vsbVarL;
        te5.g gVar;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            xkb xkbVar = this.this$0.b;
            this.label = 1;
            objW = xkbVar.w(this);
            g13 g13Var = g13.a;
            if (objW == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            objW = obj;
        }
        te5.e eVar = (te5.e) objW;
        te5.f fVar = eVar != null ? eVar.b : null;
        aub aubVar = this.this$0;
        if (fVar == null || (gVar = (te5.g) z92.Q0(fVar.b)) == null) {
            vsbVarL = this.this$0.l();
        } else {
            vsb vsbVarL2 = this.this$0.l();
            String str = gVar.b;
            if (str == null) {
                str = "";
            }
            Integer num = gVar.c;
            ArrayList<te5.a> arrayList = gVar.d;
            ArrayList arrayList2 = new ArrayList(t92.r0(arrayList, 10));
            for (te5.a aVar : arrayList) {
                String str2 = aVar.a;
                String str3 = aVar.b;
                if (str3 == null) {
                    str3 = "";
                }
                arrayList2.add(new sjb(str2, str3));
            }
            vsbVarL = vsb.a(vsbVarL2, null, null, null, null, null, null, null, null, null, null, null, null, null, new g4h(str, num, arrayList2), null, null, null, null, null, null, null, 2088959);
        }
        aubVar.v(vsbVarL);
        return j6g.a;
    }
}
