package defpackage;

import com.linecorp.linesdk.openchat.OpenChatRoomInfo;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.linecorp.linesdk.openchat.ui.OpenChatInfoViewModel$createChatroom$1", f = "OpenChatInfoViewModel.kt", l = {78}, m = "invokeSuspend")
public final class fua extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ hua $openChatParameters;
    int label;
    final /* synthetic */ gua this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fua(gua guaVar, hua huaVar, lu2<? super fua> lu2Var) {
        super(2, lu2Var);
        this.this$0 = guaVar;
        this.$openChatParameters = huaVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new fua(this.this$0, this.$openChatParameters, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((fua) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            this.this$0.Z.j(Boolean.TRUE);
            gua guaVar = this.this$0;
            hua huaVar = this.$openChatParameters;
            this.label = 1;
            obj = gua.h(guaVar, huaVar, this);
            g13 g13Var = g13.a;
            if (obj == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
        }
        ww8<OpenChatRoomInfo> ww8Var = (ww8) obj;
        boolean zD = ww8Var.d();
        gua guaVar2 = this.this$0;
        if (zD) {
            guaVar2.X.j(ww8Var.c());
        } else {
            guaVar2.Y.j(ww8Var);
        }
        this.this$0.Z.j(Boolean.FALSE);
        return j6g.a;
    }
}
