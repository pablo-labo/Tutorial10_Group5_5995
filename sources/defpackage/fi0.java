package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import defpackage.vs0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class fi0 extends mj8 implements Function2<b, Integer, j6g> {
    final /* synthetic */ Function2<b, Integer, j6g> $actionsRow;
    final /* synthetic */ boolean $centeredTitle;
    final /* synthetic */ snf $colors;
    final /* synthetic */ float $expandedHeight;
    final /* synthetic */ Function2<b, Integer, j6g> $navigationIcon;
    final /* synthetic */ unf $scrollBehavior;
    final /* synthetic */ Function2<b, Integer, j6g> $title;
    final /* synthetic */ tjf $titleTextStyle;
    final /* synthetic */ mzg $windowInsets;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fi0(mzg mzgVar, float f, snf snfVar, Function2 function2, tjf tjfVar, boolean z, Function2 function22, ah2 ah2Var) {
        super(2);
        this.$windowInsets = mzgVar;
        this.$expandedHeight = f;
        this.$colors = snfVar;
        this.$title = function2;
        this.$titleTextStyle = tjfVar;
        this.$centeredTitle = z;
        this.$navigationIcon = function22;
        this.$actionsRow = ah2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        if ((num.intValue() & 3) == 2 && bVar2.i()) {
            bVar2.D();
        } else {
            e eVarJ = g.j(ygg.i(c.a(e.a.b, tf7.a, new zzg(this.$windowInsets))), 0.0f, this.$expandedHeight, 1);
            boolean zK = bVar2.K(null);
            Object objV = bVar2.v();
            if (zK || objV == b.a.a) {
                objV = new ei0();
                bVar2.p(objV);
            }
            qsd qsdVar = (qsd) objV;
            snf snfVar = this.$colors;
            long j = snfVar.c;
            long j2 = snfVar.d;
            long j3 = snfVar.e;
            Function2<b, Integer, j6g> function2 = this.$title;
            tjf tjfVar = this.$titleTextStyle;
            boolean z = this.$centeredTitle;
            vs0.c cVar = vs0.e;
            qi0.d(eVarJ, qsdVar, j, j2, j3, function2, tjfVar, 1.0f, cVar, z ? cVar : vs0.a, 0, false, this.$navigationIcon, this.$actionsRow, bVar2, 113246208, 3126);
        }
        return j6g.a;
    }
}
