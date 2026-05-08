package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.models.ProfilePreferencesViewModel$updateMaxCommuteTime$1", f = "ProfilePreferencesViewModel.kt", l = {1025}, m = "invokeSuspend")
public final class ptb extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ gu5<j6g> $onComplete;
    final /* synthetic */ int $timeMinutes;
    int label;
    final /* synthetic */ aub this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ptb(aub aubVar, int i, gu5<j6g> gu5Var, lu2<? super ptb> lu2Var) {
        super(2, lu2Var);
        this.this$0 = aubVar;
        this.$timeMinutes = i;
        this.$onComplete = gu5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new ptb(this.this$0, this.$timeMinutes, this.$onComplete, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((ptb) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        Object objZ;
        int i = this.label;
        b5g b5gVar = b5g.c;
        try {
            if (i == 0) {
                r7d.b(obj);
                ((gme) this.this$0.e).setValue(b5g.b);
                aub aubVar = this.this$0;
                xkb xkbVar = aubVar.b;
                int i2 = this.$timeMinutes;
                String str = aubVar.l().o;
                this.label = 1;
                objZ = xkbVar.z(i2, str, this);
                g13 g13Var = g13.a;
                if (objZ == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
                objZ = obj;
            }
            boolean zBooleanValue = ((Boolean) objZ).booleanValue();
            aub aubVar2 = this.this$0;
            if (zBooleanValue) {
                aubVar2.v(vsb.a(aubVar2.l(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new Integer(this.$timeMinutes), null, 1572863));
                aub aubVar3 = this.this$0;
                ((gme) aubVar3.e).setValue(b5g.a);
                this.$onComplete.invoke();
            } else {
                ((gme) aubVar2.e).setValue(b5gVar);
            }
        } catch (Exception unused) {
            ((gme) this.this$0.e).setValue(b5gVar);
        }
        return j6g.a;
    }
}
