package defpackage;

import android.os.Looper;
import android.view.View;
import defpackage.ky9;
import defpackage.lz9;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f0h implements g0h {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v5, types: [v03] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v7, types: [v03] */
    /* JADX WARN: Type inference failed for: r1v9, types: [T, mz9] */
    @Override // defpackage.g0h
    public final xsc a(View view) {
        v03 v03Var;
        r6b r6bVar;
        LinkedHashMap linkedHashMap = o0h.a;
        v03 v03Var2 = vr4.a;
        d2f d2fVar = hb0.b0;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            v03Var = (v03) hb0.b0.getValue();
        } else {
            v03Var = hb0.c0.get();
            if (v03Var == null) {
                r6.g("no AndroidUiDispatcher for this thread");
                return null;
            }
        }
        v03 v03VarD1 = v03Var.d1(v03Var2);
        ky9 ky9Var = (ky9) v03VarD1.h1(ky9.a.a);
        if (ky9Var != null) {
            r6b r6bVar2 = new r6b(ky9Var);
            pk8 pk8Var = r6bVar2.b;
            synchronized (pk8Var.a) {
                pk8Var.d = false;
                j6g j6gVar = j6g.a;
            }
            r6bVar = r6bVar2;
        } else {
            r6bVar = null;
        }
        luc lucVar = new luc();
        lz9 lz9Var = (lz9) v03VarD1.h1(lz9.a.a);
        ?? r1 = lz9Var;
        if (lz9Var == null) {
            ?? mz9Var = new mz9();
            lucVar.element = mz9Var;
            r1 = mz9Var;
        }
        if (r6bVar != null) {
            v03Var2 = r6bVar;
        }
        v03 v03VarD12 = v03VarD1.d1(v03Var2).d1(r1);
        xsc xscVar = new xsc(v03VarD12);
        synchronized (xscVar.b) {
            xscVar.s = true;
            j6g j6gVar2 = j6g.a;
        }
        eu2 eu2VarA = f13.a(v03VarD12);
        zv8 zv8VarA = zte.a(view);
        kv8 lifecycle = zv8VarA != null ? zv8VarA.getLifecycle() : null;
        if (lifecycle != null) {
            view.addOnAttachStateChangeListener(new k0h(view, xscVar));
            lifecycle.a(new l0h(eu2VarA, r6bVar, xscVar, lucVar, view));
            return xscVar;
        }
        ae7.c("ViewTreeLifecycleOwner not found from " + view);
        r40.e();
        return null;
    }
}
