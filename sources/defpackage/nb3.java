package defpackage;

import android.view.View;
import androidx.media3.ui.c;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nb3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nb3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                qb3 qb3Var = (qb3) obj;
                View.OnClickListener onClickListener = qb3Var.a1;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                qb3Var.b1.a();
                break;
            default:
                c cVar = c.this;
                gdb gdbVar = cVar.e1;
                if (gdbVar != null && gdbVar.O0(29)) {
                    cVar.e1.v(cVar.e1.P().a().d(3).h().j().l().b());
                    cVar.i0.dismiss();
                    break;
                }
                break;
        }
    }
}
