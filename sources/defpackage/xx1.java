package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import defpackage.hmb;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.material3.CardElevation$animateElevation$1$1", f = "Card.kt", l = {674}, m = "invokeSuspend")
public final class xx1 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ ei7 $interactionSource;
    final /* synthetic */ SnapshotStateList<ci7> $interactions;
    int label;

    public static final class a<T> implements wi5 {
        public final /* synthetic */ SnapshotStateList<ci7> a;

        public a(SnapshotStateList<ci7> snapshotStateList) {
            this.a = snapshotStateList;
        }

        @Override // defpackage.wi5
        public final Object a(Object obj, lu2 lu2Var) {
            ci7 ci7Var = (ci7) obj;
            boolean z = ci7Var instanceof hk6;
            SnapshotStateList<ci7> snapshotStateList = this.a;
            if (z) {
                snapshotStateList.add(ci7Var);
            } else if (ci7Var instanceof ik6) {
                snapshotStateList.remove(((ik6) ci7Var).a);
            } else if (ci7Var instanceof zl5) {
                snapshotStateList.add(ci7Var);
            } else if (ci7Var instanceof am5) {
                snapshotStateList.remove(((am5) ci7Var).a);
            } else if (ci7Var instanceof hmb.b) {
                snapshotStateList.add(ci7Var);
            } else if (ci7Var instanceof hmb.c) {
                snapshotStateList.remove(((hmb.c) ci7Var).a);
            } else if (ci7Var instanceof hmb.a) {
                snapshotStateList.remove(((hmb.a) ci7Var).a);
            } else if (ci7Var instanceof la4) {
                snapshotStateList.add(ci7Var);
            } else if (ci7Var instanceof ma4) {
                snapshotStateList.remove(((ma4) ci7Var).a);
            } else if (ci7Var instanceof ka4) {
                snapshotStateList.remove(((ka4) ci7Var).a);
            }
            return j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xx1(ei7 ei7Var, SnapshotStateList<ci7> snapshotStateList, lu2<? super xx1> lu2Var) {
        super(2, lu2Var);
        this.$interactionSource = ei7Var;
        this.$interactions = snapshotStateList;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new xx1(this.$interactionSource, this.$interactions, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((xx1) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
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
        nde ndeVarB = this.$interactionSource.b();
        a aVar = new a(this.$interactions);
        this.label = 1;
        ndeVarB.e(aVar, this);
        return g13.a;
    }
}
