package defpackage;

import androidx.compose.runtime.b;
import defpackage.grg;

/* JADX INFO: loaded from: classes.dex */
public final class erg {
    public static final brg a(yd8 yd8Var, jrg jrgVar, pd7 pd7Var, p63 p63Var, b bVar) {
        grg grgVarA;
        if (pd7Var != null) {
            irg viewModelStore = jrgVar.getViewModelStore();
            viewModelStore.getClass();
            p63Var.getClass();
            grgVarA = new grg(viewModelStore, pd7Var, p63Var);
        } else if (jrgVar instanceof hg6) {
            irg viewModelStore2 = jrgVar.getViewModelStore();
            grg.c defaultViewModelProviderFactory = ((hg6) jrgVar).getDefaultViewModelProviderFactory();
            viewModelStore2.getClass();
            defaultViewModelProviderFactory.getClass();
            p63Var.getClass();
            grgVarA = new grg(viewModelStore2, defaultViewModelProviderFactory, p63Var);
        } else {
            grgVarA = grg.b.a(jrgVar, null, 6);
        }
        yd8Var.getClass();
        hrg hrgVar = grgVarA.a;
        String strP = yd8Var.p();
        if (strP != null) {
            return hrgVar.a(yd8Var, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strP));
        }
        l5.q("Local and anonymous classes can not be ViewModels");
        return null;
    }
}
