package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class ok2 extends ClickableSpan {
    public final rx8 a;

    public ok2(rx8 rx8Var) {
        this.a = rx8Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        rx8 rx8Var = this.a;
        tx8 tx8VarA = rx8Var.a();
        if (tx8VarA != null) {
            tx8VarA.a(rx8Var);
        }
    }
}
