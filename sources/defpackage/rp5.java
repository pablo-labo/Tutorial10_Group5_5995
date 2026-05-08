package defpackage;

import android.graphics.drawable.Animatable;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class rp5<INFO> implements vu2<INFO> {
    public final ArrayList a = new ArrayList(2);

    @Override // defpackage.vu2
    public final void a(Object obj, String str) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                vu2 vu2Var = (vu2) arrayList.get(i);
                if (vu2Var != null) {
                    vu2Var.a(obj, str);
                }
            } catch (Exception e) {
                e(e, "InternalListener exception in onIntermediateImageSet");
            }
        }
    }

    public final synchronized void b(vu2<? super INFO> vu2Var) {
        this.a.add(vu2Var);
    }

    @Override // defpackage.vu2
    public final synchronized void c(String str, Throwable th) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                vu2 vu2Var = (vu2) this.a.get(i);
                if (vu2Var != null) {
                    vu2Var.c(str, th);
                }
            } catch (Exception e) {
                e(e, "InternalListener exception in onFailure");
            }
        }
    }

    @Override // defpackage.vu2
    public final synchronized void d(String str) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                vu2 vu2Var = (vu2) this.a.get(i);
                if (vu2Var != null) {
                    vu2Var.d(str);
                }
            } catch (Exception e) {
                e(e, "InternalListener exception in onRelease");
            }
        }
    }

    public final synchronized void e(Exception exc, String str) {
        Log.e("FdingControllerListener", str, exc);
    }

    @Override // defpackage.vu2
    public final synchronized void j(String str, INFO info, Animatable animatable) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                vu2 vu2Var = (vu2) this.a.get(i);
                if (vu2Var != null) {
                    vu2Var.j(str, info, animatable);
                }
            } catch (Exception e) {
                e(e, "InternalListener exception in onFinalImageSet");
            }
        }
    }

    @Override // defpackage.vu2
    public final synchronized void l(Object obj, String str) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                vu2 vu2Var = (vu2) this.a.get(i);
                if (vu2Var != null) {
                    vu2Var.l(obj, str);
                }
            } catch (Exception e) {
                e(e, "InternalListener exception in onSubmit");
            }
        }
    }

    @Override // defpackage.vu2
    public final void p(String str, Throwable th) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                vu2 vu2Var = (vu2) arrayList.get(i);
                if (vu2Var != null) {
                    vu2Var.p(str, th);
                }
            } catch (Exception e) {
                e(e, "InternalListener exception in onIntermediateImageFailed");
            }
        }
    }
}
