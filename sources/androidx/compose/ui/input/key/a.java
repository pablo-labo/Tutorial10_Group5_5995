package androidx.compose.ui.input.key;

import androidx.compose.ui.e;
import defpackage.ng8;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final e a(e eVar, Function1<? super ng8, Boolean> function1) {
        return eVar.o(new KeyInputElement(function1, null));
    }

    public static final e b(e eVar, Function1<? super ng8, Boolean> function1) {
        return eVar.o(new KeyInputElement(null, function1));
    }
}
