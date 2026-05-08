package defpackage;

import androidx.compose.ui.e;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class sia extends mj8 implements Function1<e.b, Boolean> {
    final /* synthetic */ j4a<e.b> $result;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sia(j4a<e.b> j4aVar) {
        super(1);
        this.$result = j4aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(e.b bVar) {
        this.$result.b(bVar);
        return Boolean.TRUE;
    }
}
