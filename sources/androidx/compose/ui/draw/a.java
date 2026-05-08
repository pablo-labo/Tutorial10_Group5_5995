package androidx.compose.ui.draw;

import androidx.compose.ui.e;
import defpackage.ft1;
import defpackage.gb4;
import defpackage.j6g;
import defpackage.nfa;
import defpackage.ss2;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final e a(e eVar, Function1<? super gb4, j6g> function1) {
        return eVar.o(new DrawBehindElement(function1));
    }

    public static final e b(e eVar, Function1<? super ft1, nfa> function1) {
        return eVar.o(new DrawWithCacheElement(function1));
    }

    public static final e c(e eVar, Function1<? super ss2, j6g> function1) {
        return eVar.o(new DrawWithContentElement(function1));
    }
}
