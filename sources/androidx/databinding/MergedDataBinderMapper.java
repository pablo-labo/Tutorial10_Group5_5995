package androidx.databinding;

import android.util.Log;
import android.view.View;
import defpackage.qpg;
import defpackage.ud3;
import defpackage.vd3;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class MergedDataBinderMapper extends ud3 {
    public final HashSet a = new HashSet();
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();

    @Override // defpackage.ud3
    public final qpg b(vd3 vd3Var, View view, int i) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            qpg qpgVarB = ((ud3) it.next()).b(vd3Var, view, i);
            if (qpgVarB != null) {
                return qpgVarB;
            }
        }
        CopyOnWriteArrayList<String> copyOnWriteArrayList = this.c;
        boolean z = false;
        for (String str : copyOnWriteArrayList) {
            try {
                Class<?> cls = Class.forName(str);
                if (ud3.class.isAssignableFrom(cls)) {
                    c((ud3) cls.newInstance());
                    copyOnWriteArrayList.remove(str);
                    z = true;
                }
            } catch (ClassNotFoundException unused) {
            } catch (IllegalAccessException e) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e);
            } catch (InstantiationException e2) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e2);
            }
        }
        if (z) {
            return b(vd3Var, view, i);
        }
        return null;
    }

    public final void c(ud3 ud3Var) {
        if (this.a.add(ud3Var.getClass())) {
            this.b.add(ud3Var);
            Iterator<ud3> it = ud3Var.a().iterator();
            while (it.hasNext()) {
                c(it.next());
            }
        }
    }
}
