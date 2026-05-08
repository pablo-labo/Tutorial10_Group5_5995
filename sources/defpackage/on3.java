package defpackage;

import defpackage.hmb;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$2$1", f = "FloatingActionButton.kt", l = {282}, m = "invokeSuspend")
public final class on3 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ ki5 $animatable;
    final /* synthetic */ ei7 $interactionSource;
    private /* synthetic */ Object L$0;
    int label;

    public static final class a<T> implements wi5 {
        public final /* synthetic */ ArrayList a;
        public final /* synthetic */ e13 b;
        public final /* synthetic */ ki5 c;

        public a(ArrayList arrayList, e13 e13Var, ki5 ki5Var) {
            this.a = arrayList;
            this.b = e13Var;
            this.c = ki5Var;
        }

        @Override // defpackage.wi5
        public final Object a(Object obj, lu2 lu2Var) {
            ci7 ci7Var = (ci7) obj;
            boolean z = ci7Var instanceof hk6;
            ArrayList arrayList = this.a;
            if (z) {
                arrayList.add(ci7Var);
            } else if (ci7Var instanceof ik6) {
                arrayList.remove(((ik6) ci7Var).a);
            } else if (ci7Var instanceof zl5) {
                arrayList.add(ci7Var);
            } else if (ci7Var instanceof am5) {
                arrayList.remove(((am5) ci7Var).a);
            } else if (ci7Var instanceof hmb.b) {
                arrayList.add(ci7Var);
            } else if (ci7Var instanceof hmb.c) {
                arrayList.remove(((hmb.c) ci7Var).a);
            } else if (ci7Var instanceof hmb.a) {
                arrayList.remove(((hmb.a) ci7Var).a);
            }
            u63.Y(this.b, null, null, new nn3(this.c, (ci7) z92.Z0(arrayList), null), 3);
            return j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public on3(ei7 ei7Var, ki5 ki5Var, lu2<? super on3> lu2Var) {
        super(2, lu2Var);
        this.$interactionSource = ei7Var;
        this.$animatable = ki5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        on3 on3Var = new on3(this.$interactionSource, this.$animatable, lu2Var);
        on3Var.L$0 = obj;
        return on3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((on3) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
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
        e13 e13Var = (e13) this.L$0;
        ArrayList arrayList = new ArrayList();
        nde ndeVarB = this.$interactionSource.b();
        a aVar = new a(arrayList, e13Var, this.$animatable);
        this.label = 1;
        ndeVarB.e(aVar, this);
        return g13.a;
    }
}
