package androidx.compose.animation;

import androidx.compose.runtime.b;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import defpackage.bd0;
import defpackage.cd0;
import defpackage.ese;
import defpackage.j6g;
import defpackage.mj8;
import defpackage.qd0;
import defpackage.rd0;
import defpackage.th7;
import defpackage.to4;
import defpackage.wu5;
import defpackage.xu5;
import defpackage.z3a;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class g extends mj8 implements wu5<qd0, androidx.compose.runtime.b, Integer, j6g> {
    final /* synthetic */ xu5<bd0, Object, androidx.compose.runtime.b, Integer, j6g> $content;
    final /* synthetic */ SnapshotStateList<Object> $currentlyVisible;
    final /* synthetic */ AnimatedContentTransitionScopeImpl<Object> $rootScope;
    final /* synthetic */ Object $stateForContent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(SnapshotStateList<Object> snapshotStateList, Object obj, AnimatedContentTransitionScopeImpl<Object> animatedContentTransitionScopeImpl, xu5<? super bd0, Object, ? super androidx.compose.runtime.b, ? super Integer, j6g> xu5Var) {
        super(3);
        this.$currentlyVisible = snapshotStateList;
        this.$stateForContent = obj;
        this.$rootScope = animatedContentTransitionScopeImpl;
        this.$content = xu5Var;
    }

    @Override // defpackage.wu5
    public final j6g q(qd0 qd0Var, androidx.compose.runtime.b bVar, Integer num) {
        qd0 qd0Var2 = qd0Var;
        androidx.compose.runtime.b bVar2 = bVar;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? bVar2.K(qd0Var2) : bVar2.x(qd0Var2) ? 4 : 2;
        }
        if (bVar2.o(iIntValue & 1, (iIntValue & 19) != 18)) {
            boolean zK = bVar2.K(this.$currentlyVisible) | bVar2.x(this.$stateForContent) | bVar2.x(this.$rootScope);
            SnapshotStateList<Object> snapshotStateList = this.$currentlyVisible;
            Object obj = this.$stateForContent;
            AnimatedContentTransitionScopeImpl<Object> animatedContentTransitionScopeImpl = this.$rootScope;
            Object objV = bVar2.v();
            b.a.C0020a c0020a = b.a.a;
            if (zK || objV == c0020a) {
                objV = new f(snapshotStateList, obj, animatedContentTransitionScopeImpl);
                bVar2.p(objV);
            }
            to4.b(qd0Var2, (Function1) objV, bVar2);
            z3a<Object, ese<th7>> z3aVar = this.$rootScope.d;
            Object obj2 = this.$stateForContent;
            qd0Var2.getClass();
            z3aVar.m(obj2, ((rd0) qd0Var2).a);
            Object objV2 = bVar2.v();
            if (objV2 == c0020a) {
                objV2 = new cd0(qd0Var2);
                bVar2.p(objV2);
            }
            this.$content.j((cd0) objV2, this.$stateForContent, bVar2, 0);
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
