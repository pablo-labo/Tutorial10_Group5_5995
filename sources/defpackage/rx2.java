package defpackage;

import androidx.compose.runtime.r;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.ui.inbox.components.ConversationListKt$ConversationList$5$1", f = "ConversationList.kt", l = {IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT}, m = "invokeSuspend")
public final class rx2 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ e13 $coroutineScope;
    final /* synthetic */ ss8 $listState;
    int label;

    public static final class a<T> implements wi5 {
        public final /* synthetic */ ss8 a;
        public final /* synthetic */ e13 b;

        public a(ss8 ss8Var, e13 e13Var) {
            this.a = ss8Var;
            this.b = e13Var;
        }

        @Override // defpackage.wi5
        public final Object a(Object obj, lu2 lu2Var) {
            if (((Number) obj).intValue() <= 1) {
                ss8 ss8Var = this.a;
                if (ss8Var.j().f() > 0) {
                    u63.Y(this.b, null, null, new qx2(ss8Var, null), 3);
                }
            }
            return j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rx2(ss8 ss8Var, e13 e13Var, lu2<? super rx2> lu2Var) {
        super(2, lu2Var);
        this.$listState = ss8Var;
        this.$coroutineScope = e13Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new rx2(this.$listState, this.$coroutineScope, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((rx2) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            kjd kjdVarH = r.h(new oj(this.$listState, 5));
            a aVar = new a(this.$listState, this.$coroutineScope);
            this.label = 1;
            Object objE = kjdVarH.e(aVar, this);
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
