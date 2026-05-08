package defpackage;

import android.os.Build;
import android.view.View;
import defpackage.nzg;
import defpackage.rzg;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class mf7 extends nzg.b implements Runnable, tpa, View.OnAttachStateChangeListener {
    public final xzg c;
    public boolean d;
    public boolean e;
    public rzg f;

    public mf7(xzg xzgVar) {
        super(!xzgVar.s ? 1 : 0);
        this.c = xzgVar;
    }

    @Override // nzg.b
    public final void a(nzg nzgVar) {
        this.d = false;
        this.e = false;
        rzg rzgVar = this.f;
        if (nzgVar.a.a() > 0 && rzgVar != null) {
            rzg.j jVar = rzgVar.a;
            xzg xzgVar = this.c;
            xzgVar.r.f(e0h.a(jVar.g(8)));
            xzgVar.q.f(e0h.a(jVar.g(8)));
            xzg.a(xzgVar, rzgVar);
        }
        this.f = null;
    }

    @Override // defpackage.tpa
    public final rzg b(View view, rzg rzgVar) {
        this.f = rzgVar;
        xzg xzgVar = this.c;
        plg plgVar = xzgVar.q;
        rzg.j jVar = rzgVar.a;
        plgVar.f(e0h.a(jVar.g(8)));
        if (this.d) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.e) {
            xzgVar.r.f(e0h.a(jVar.g(8)));
            xzg.a(xzgVar, rzgVar);
        }
        return xzgVar.s ? rzg.b : rzgVar;
    }

    @Override // nzg.b
    public final void c() {
        this.d = true;
        this.e = true;
    }

    @Override // nzg.b
    public final rzg d(rzg rzgVar, List<nzg> list) {
        xzg xzgVar = this.c;
        xzg.a(xzgVar, rzgVar);
        return xzgVar.s ? rzg.b : rzgVar;
    }

    @Override // nzg.b
    public final nzg.a e(nzg nzgVar, nzg.a aVar) {
        this.d = false;
        return aVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d) {
            this.d = false;
            this.e = false;
            rzg rzgVar = this.f;
            if (rzgVar != null) {
                xzg xzgVar = this.c;
                xzgVar.r.f(e0h.a(rzgVar.a.g(8)));
                xzg.a(xzgVar, rzgVar);
                this.f = null;
            }
        }
    }
}
