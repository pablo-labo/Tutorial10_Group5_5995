package defpackage;

import defpackage.hmb;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.interaction.PressInteractionKt$collectIsPressedAsState$1$1", f = "PressInteraction.kt", l = {85}, m = "invokeSuspend")
public final class imb extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ g4a<Boolean> $isPressed;
    final /* synthetic */ ei7 $this_collectIsPressedAsState;
    int label;

    public static final class a<T> implements wi5 {
        public final /* synthetic */ ArrayList a;
        public final /* synthetic */ g4a<Boolean> b;

        public a(ArrayList arrayList, g4a g4aVar) {
            this.a = arrayList;
            this.b = g4aVar;
        }

        @Override // defpackage.wi5
        public final Object a(Object obj, lu2 lu2Var) {
            ci7 ci7Var = (ci7) obj;
            boolean z = ci7Var instanceof hmb.b;
            ArrayList arrayList = this.a;
            if (z) {
                arrayList.add(ci7Var);
            } else if (ci7Var instanceof hmb.c) {
                arrayList.remove(((hmb.c) ci7Var).a);
            } else if (ci7Var instanceof hmb.a) {
                arrayList.remove(((hmb.a) ci7Var).a);
            }
            this.b.setValue(Boolean.valueOf(!arrayList.isEmpty()));
            return j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public imb(ei7 ei7Var, g4a<Boolean> g4aVar, lu2<? super imb> lu2Var) {
        super(2, lu2Var);
        this.$this_collectIsPressedAsState = ei7Var;
        this.$isPressed = g4aVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new imb(this.$this_collectIsPressedAsState, this.$isPressed, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((imb) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                r7d.b(obj);
                return j6g.a;
            }
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        ArrayList arrayList = new ArrayList();
        nde ndeVarB = this.$this_collectIsPressedAsState.b();
        a aVar = new a(arrayList, this.$isPressed);
        this.label = 1;
        ndeVarB.e(aVar, this);
        return g13.a;
    }
}
