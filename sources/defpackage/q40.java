package defpackage;

import android.graphics.Rect;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.platform.AndroidComposeView;
import defpackage.rs2;

/* JADX INFO: loaded from: classes.dex */
public final class q40 extends n51 implements z4e, em5 {
    public final abb a;
    public final j5e b;
    public final AndroidComposeView c;
    public final stc d;
    public final String e;
    public final Rect f = new Rect();
    public final AutofillId g;
    public final b3a h;
    public boolean i;

    public q40(abb abbVar, j5e j5eVar, AndroidComposeView androidComposeView, stc stcVar, String str) {
        this.a = abbVar;
        this.b = j5eVar;
        this.c = androidComposeView;
        this.d = stcVar;
        this.e = str;
        androidComposeView.setImportantForAutofill(1);
        AutofillId autofillId = androidComposeView.getAutofillId();
        if (autofillId == null) {
            throw l6.k("Required value was null.");
        }
        this.g = autofillId;
        this.h = new b3a((Object) null);
    }

    @Override // defpackage.em5
    public final void a(an5 an5Var, FocusTargetNode focusTargetNode) {
        pm8 pm8VarF;
        w4e w4eVarG;
        pm8 pm8VarF2;
        w4e w4eVarG2;
        if (an5Var != null && (pm8VarF2 = us3.f(an5Var)) != null && (w4eVarG2 = pm8VarF2.g()) != null && w4eVarG2.a.a(v4e.g)) {
            this.a.a.notifyViewExited(this.c, pm8VarF2.b);
        }
        if (focusTargetNode == null || (pm8VarF = us3.f(focusTargetNode)) == null || (w4eVarG = pm8VarF.g()) == null || !w4eVarG.a.a(v4e.g)) {
            return;
        }
        int i = pm8VarF.b;
        this.d.a.b(i, new o40(this, i));
    }

    @Override // defpackage.z4e
    public final void b(pm8 pm8Var, w4e w4eVar) {
        le0 le0Var;
        le0 le0Var2;
        w4e w4eVarG = pm8Var.g();
        int i = pm8Var.b;
        String str = null;
        String str2 = (w4eVar == null || (le0Var2 = (le0) x4e.a(w4eVar, k5e.D)) == null) ? null : le0Var2.b;
        if (w4eVarG != null && (le0Var = (le0) x4e.a(w4eVarG, k5e.D)) != null) {
            str = le0Var.b;
        }
        boolean z = false;
        if (str2 != str) {
            AndroidComposeView androidComposeView = this.c;
            abb abbVar = this.a;
            if (str2 == null) {
                abbVar.a(androidComposeView, i, true);
            } else if (str == null) {
                abbVar.a(androidComposeView, i, false);
            } else if (wl7.b((rs2) x4e.a(w4eVarG, k5e.r), rs2.a.a)) {
                abbVar.a.notifyValueChanged(androidComposeView, i, AutofillValue.forText(str.toString()));
            }
        }
        boolean z2 = w4eVar != null && w4eVar.a.a(k5e.q);
        if (w4eVarG != null && w4eVarG.a.a(k5e.q)) {
            z = true;
        }
        if (z2 != z) {
            b3a b3aVar = this.h;
            if (z) {
                b3aVar.a(i);
            } else {
                b3aVar.e(i);
            }
        }
    }
}
