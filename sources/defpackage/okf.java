package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.appcompat.app.c;
import androidx.fragment.app.g;
import com.indeed.android.jobsearch.R;

/* JADX INFO: loaded from: classes2.dex */
public final class okf extends ClickableSpan {
    public final /* synthetic */ g a;
    public final /* synthetic */ a1 b;
    public final /* synthetic */ luc<c> c;

    public okf(g gVar, a1 a1Var, luc lucVar) {
        this.a = gVar;
        this.b = a1Var;
        this.c = lucVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) throws Exception {
        view.getClass();
        this.b.invoke();
        c cVar = this.c.element;
        if (cVar != null) {
            cVar.dismiss();
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.getClass();
        textPaint.setColor(this.a.getColor(R.color.color_666666));
        textPaint.setUnderlineText(true);
    }
}
