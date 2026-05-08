package defpackage;

import android.view.DragEvent;
import android.view.View;
import androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidComposeView;
import defpackage.ot0;

/* JADX INFO: loaded from: classes.dex */
public final class e70 implements View.OnDragListener, p94 {
    public final r94 a = new r94(null);
    public final ot0<t94> b = new ot0<>(0);
    public final AndroidDragAndDropManager$modifier$1 c = new qx9<r94>() { // from class: androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1
        @Override // defpackage.qx9
        public final e.c a() {
            return this.b.a;
        }

        @Override // defpackage.qx9
        public final /* bridge */ /* synthetic */ void b(e.c cVar) {
        }

        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return this.b.a.hashCode();
        }
    };

    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1] */
    public e70(AndroidComposeView.h hVar) {
    }

    @Override // defpackage.p94
    public final boolean a(r94 r94Var) {
        return this.b.contains(r94Var);
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        o94 o94Var = new o94(dragEvent);
        int action = dragEvent.getAction();
        ot0<t94> ot0Var = this.b;
        r94 r94Var = this.a;
        switch (action) {
            case 1:
                r94Var.getClass();
                huc hucVar = new huc();
                q94 q94Var = new q94(o94Var, r94Var, hucVar);
                if (q94Var.invoke(r94Var) == itf.a) {
                    pg8.Y(r94Var, q94Var);
                }
                boolean z = hucVar.element;
                ot0Var.getClass();
                ot0.a aVar = new ot0.a();
                while (aVar.hasNext()) {
                    ((t94) aVar.next()).v0(o94Var);
                }
                break;
            case 2:
                r94Var.A1(o94Var);
                break;
            case 4:
                r94Var.U(o94Var);
                ot0Var.clear();
                break;
            case 5:
                r94Var.M(o94Var);
                break;
            case 6:
                r94Var.u1(o94Var);
                break;
        }
        return false;
    }
}
