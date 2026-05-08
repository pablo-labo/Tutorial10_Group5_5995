package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class hg5 implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ ig5 b;

    public class a implements Runnable {
        public final /* synthetic */ hg5 a;

        public a(hg5 hg5Var) {
            this.a = hg5Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            gg6 gg6VarA = gg6.a();
            gg6VarA.getClass();
            xjg.a();
            gg6VarA.d.set(true);
            hg5.this.b.b = true;
            View view = hg5.this.a;
            view.getViewTreeObserver().removeOnDrawListener(this.a);
            hg5.this.b.a.clear();
        }
    }

    public hg5(ig5 ig5Var, View view) {
        this.b = ig5Var;
        this.a = view;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        xjg.f().post(new a(this));
    }
}
