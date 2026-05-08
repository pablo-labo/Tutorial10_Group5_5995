package defpackage;

import androidx.compose.ui.e;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import androidx.compose.ui.semantics.ClearAndSetSemanticsElement;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class b5e {
    public static final AtomicInteger a = new AtomicInteger(0);

    public static final e a(e eVar, Function1<? super s5e, j6g> function1) {
        return eVar.o(new ClearAndSetSemanticsElement(function1));
    }

    public static final e b(e eVar, boolean z, Function1<? super s5e, j6g> function1) {
        return eVar.o(new AppendedSemanticsElement(z, function1));
    }
}
