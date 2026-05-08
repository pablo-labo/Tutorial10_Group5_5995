package defpackage;

import com.indeed.android.myjobs.data.model.Response;
import defpackage.ap0;
import defpackage.hf3;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.presentation.tabs.ApplicationWithdrawViewModel$onTriggerEvent$1", f = "ApplicationWithdrawViewModel.kt", l = {39, 45}, m = "invokeSuspend")
public final class bp0 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ ap0.a $event;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ap0 this$0;

    @uh3(c = "com.indeed.android.myjobs.presentation.tabs.ApplicationWithdrawViewModel$onTriggerEvent$1$2$1", f = "ApplicationWithdrawViewModel.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<hf3<Response>, lu2<? super j6g>, Object> {
        final /* synthetic */ ap0.a $event;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ap0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ap0.a aVar, ap0 ap0Var, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$event = aVar;
            this.this$0 = ap0Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = new a(this.$event, this.this$0, lu2Var);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(hf3<Response> hf3Var, lu2<? super j6g> lu2Var) {
            return ((a) create(hf3Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            hf3 hf3Var = (hf3) this.L$0;
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                if (!(hf3Var instanceof hf3.c)) {
                    if (hf3Var instanceof hf3.b) {
                        ap0 ap0Var = this.this$0;
                        ap0Var.i();
                        ap0Var.b.setValue(x0h.a(ap0Var.i(), true));
                    } else {
                        if (!(hf3Var instanceof hf3.a)) {
                            l.g();
                            return null;
                        }
                        ap0 ap0Var2 = this.this$0;
                        ap0Var2.i();
                        ap0Var2.b.setValue(x0h.a(ap0Var2.i(), false));
                        ((ap0.a.b) this.$event).b.invoke();
                        ArrayList arrayList = lz2.a;
                        w40.n("Error occurred while withdrawing application", "ApplicationWithdrawViewModel", "Error occurred while withdrawing application", false);
                    }
                    return j6g.a;
                }
                ((ap0.a.b) this.$event).b.invoke();
                this.L$0 = null;
                this.label = 1;
                Object objB = ls3.b(100L, this);
                g13 g13Var = g13.a;
                if (objB == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            ((ap0.a.b) this.$event).a.invoke();
            ap0 ap0Var3 = this.this$0;
            ap0Var3.i();
            ap0Var3.b.setValue(x0h.a(ap0Var3.i(), false));
            return j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp0(ap0.a aVar, ap0 ap0Var, lu2<? super bp0> lu2Var) {
        super(2, lu2Var);
        this.$event = aVar;
        this.this$0 = ap0Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new bp0(this.$event, this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((bp0) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c0, code lost:
    
        if (defpackage.wg2.q((defpackage.vi5) r14, r6, r13) != r4) goto L25;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bp0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
