package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class nmd extends mj8 implements Function2<b, Integer, j6g> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function2<b, Integer, j6g> $bottomBar;
    final /* synthetic */ wu5<gza, b, Integer, j6g> $content;
    final /* synthetic */ mzg $contentWindowInsets;
    final /* synthetic */ Function2<b, Integer, j6g> $fab;
    final /* synthetic */ int $fabPosition;
    final /* synthetic */ Function2<b, Integer, j6g> $snackbar;
    final /* synthetic */ Function2<b, Integer, j6g> $topBar;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public nmd(int i, Function2<? super b, ? super Integer, j6g> function2, wu5<? super gza, ? super b, ? super Integer, j6g> wu5Var, Function2<? super b, ? super Integer, j6g> function22, Function2<? super b, ? super Integer, j6g> function23, mzg mzgVar, Function2<? super b, ? super Integer, j6g> function24, int i2) {
        super(2);
        this.$fabPosition = i;
        this.$topBar = function2;
        this.$content = wu5Var;
        this.$snackbar = function22;
        this.$fab = function23;
        this.$contentWindowInsets = mzgVar;
        this.$bottomBar = function24;
        this.$$changed = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        num.intValue();
        dmd.b(this.$fabPosition, this.$topBar, this.$content, this.$snackbar, this.$fab, this.$contentWindowInsets, this.$bottomBar, bVar, ka2.L(this.$$changed | 1));
        return j6g.a;
    }
}
