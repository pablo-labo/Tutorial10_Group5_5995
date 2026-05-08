package defpackage;

import android.animation.Animator;
import android.util.Log;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.r;
import defpackage.ax5;
import defpackage.e75;
import defpackage.tw1;
import java.util.List;
import org.apache.avro.g;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kq3 implements tw1.a, e75.e {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kq3(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.wg3
    public Object j(Object obj, ka6 ka6Var) {
        e75.b bVar = (e75.b) this.a;
        g gVar = (g) this.b;
        if (obj instanceof vw5) {
            vw5 vw5Var = (vw5) obj;
            long jN0 = ka6Var.N0();
            vw5Var.clear();
            while (jN0 > 0) {
                for (long j = 0; j < jN0; j++) {
                    vw5Var.add(bVar.j(vw5Var.peek(), ka6Var));
                }
                jN0 = ka6Var.S();
            }
            return vw5Var;
        }
        long jN02 = ka6Var.N0();
        List bVar2 = obj instanceof List ? (List) obj : new ax5.b((int) jN02, gVar);
        bVar2.clear();
        while (jN02 > 0) {
            for (long j2 = 0; j2 < jN02; j2++) {
                bVar2.add(bVar.j(null, ka6Var));
            }
            jN02 = ka6Var.S();
        }
        return bVar2;
    }

    @Override // tw1.a
    public void onCancel() {
        Animator animator = (Animator) this.a;
        r.b bVar = (r.b) this.b;
        animator.end();
        if (FragmentManager.K(2)) {
            Log.v("FragmentManager", "Animator from operation " + bVar + " has been canceled.");
        }
    }
}
