package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.material3.ModalBottomSheetKt$Scrim$dismissSheet$1$1", f = "ModalBottomSheet.kt", l = {415}, m = "invokeSuspend")
public final class bw9 extends c1f implements Function2<efb, lu2<? super j6g>, Object> {
    final /* synthetic */ gu5<j6g> $onDismissRequest;
    private /* synthetic */ Object L$0;
    int label;

    public static final class a extends mj8 implements Function1<ooa, j6g> {
        final /* synthetic */ gu5<j6g> $onDismissRequest;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(gu5<j6g> gu5Var) {
            super(1);
            this.$onDismissRequest = gu5Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(ooa ooaVar) {
            long j = ooaVar.a;
            this.$onDismissRequest.invoke();
            return j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw9(gu5<j6g> gu5Var, lu2<? super bw9> lu2Var) {
        super(2, lu2Var);
        this.$onDismissRequest = gu5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        bw9 bw9Var = new bw9(this.$onDismissRequest, lu2Var);
        bw9Var.L$0 = obj;
        return bw9Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(efb efbVar, lu2<? super j6g> lu2Var) {
        return ((bw9) create(efbVar, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            efb efbVar = (efb) this.L$0;
            a aVar = new a(this.$onDismissRequest);
            this.label = 1;
            Object objE = i8f.e(efbVar, aVar, this);
            g13 g13Var = g13.a;
            if (objE == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
        }
        return j6g.a;
    }
}
