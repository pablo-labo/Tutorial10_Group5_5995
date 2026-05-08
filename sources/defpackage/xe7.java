package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes.dex */
@sy3
public final class xe7 {
    public final View a;
    public final Lazy b = boa.E(qt8.c, new a());
    public final ine c;

    public static final class a extends mj8 implements gu5<InputMethodManager> {
        public a() {
            super(0);
        }

        @Override // defpackage.gu5
        public final InputMethodManager invoke() {
            Object systemService = xe7.this.a.getContext().getSystemService("input_method");
            systemService.getClass();
            return (InputMethodManager) systemService;
        }
    }

    public xe7(View view) {
        this.a = view;
        this.c = new ine(view);
    }

    public final void a(int i, int i2, int i3, int i4) {
        ((InputMethodManager) this.b.getValue()).updateSelection(this.a, i, i2, i3, i4);
    }
}
