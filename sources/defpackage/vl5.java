package defpackage;

import android.view.View;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class vl5 extends mj8 implements Function1<View, Boolean> {
    final /* synthetic */ int $id;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl5(int i) {
        super(1);
        this.$id = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(View view) {
        return Boolean.valueOf(view.getId() == this.$id);
    }
}
