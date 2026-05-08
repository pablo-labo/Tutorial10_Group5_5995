package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.ui.e;
import defpackage.lgf;
import defpackage.ojh;
import defpackage.qtc;
import defpackage.sl8;
import defpackage.tu2;
import defpackage.web;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final e a(e eVar, tu2 tu2Var, Function1 function1, lgf lgfVar, Function1 function12) {
        return eVar.o(new TextContextMenuToolbarHandlerElement(tu2Var, function1, lgfVar, function12));
    }

    public static final qtc b(qtc qtcVar, sl8 sl8Var, sl8 sl8Var2) {
        if (!sl8Var.d() || !sl8Var2.d()) {
            return qtc.e;
        }
        return web.a(sl8Var2.G(ojh.m(sl8Var), qtcVar.d()), qtcVar.c());
    }
}
