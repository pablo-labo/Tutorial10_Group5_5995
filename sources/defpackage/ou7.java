package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.n;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ou7 implements p52, tua, Continuation {
    public Object a;
    public final Object b;

    public ou7(Context context) {
        this.b = context;
        this.a = null;
    }

    public File a() {
        if (((File) this.a) == null) {
            this.a = new File(((Context) this.b).getCacheDir(), "volley");
        }
        return (File) this.a;
    }

    @Override // defpackage.tua
    public List b(Integer num) {
        List<fl2> listB = ((tua) this.a).b(null);
        n nVar = (n) this.b;
        int i = nVar.v;
        return i < 0 ? listB : z92.h1(el2.a(nVar, num, i, Integer.valueOf(nVar.F(i, nVar.b))), listB);
    }

    @Override // defpackage.p52
    public o52 o(a62 a62Var) {
        a62Var.getClass();
        bwc bwcVar = (bwc) this.a;
        f14 f14Var = (f14) this.b;
        f14Var.c().c.getClass();
        oi8 oi8VarA = gi8.a(bwcVar, a62Var, us9.g);
        if (oi8VarA == null) {
            return null;
        }
        wuc.a(((awc) oi8VarA).a).equals(a62Var);
        return f14Var.f(oi8VarA);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return ((Integer) task.getResult()).intValue() != 402 ? task : rfh.b((Context) this.a, (Intent) this.b).continueWith(r0i.a, wab.e0);
    }

    public /* synthetic */ ou7(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }
}
