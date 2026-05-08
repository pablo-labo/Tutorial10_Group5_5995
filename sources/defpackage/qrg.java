package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class qrg {
    public Interpolator c;
    public rrg d;
    public boolean e;
    public long b = -1;
    public final a f = new a();
    public final ArrayList<prg> a = new ArrayList<>();

    public class a extends oie {
        public boolean a = false;
        public int b = 0;

        public a() {
        }

        @Override // defpackage.oie, defpackage.rrg
        public final void b() {
            if (this.a) {
                return;
            }
            this.a = true;
            rrg rrgVar = qrg.this.d;
            if (rrgVar != null) {
                rrgVar.b();
            }
        }

        @Override // defpackage.rrg
        public final void c() {
            int i = this.b + 1;
            this.b = i;
            qrg qrgVar = qrg.this;
            if (i == qrgVar.a.size()) {
                rrg rrgVar = qrgVar.d;
                if (rrgVar != null) {
                    rrgVar.c();
                }
                this.b = 0;
                this.a = false;
                qrgVar.e = false;
            }
        }
    }

    public final void a() {
        if (this.e) {
            Iterator<prg> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.e = false;
        }
    }

    public final void b() {
        View view;
        if (this.e) {
            return;
        }
        for (prg prgVar : this.a) {
            long j = this.b;
            if (j >= 0) {
                prgVar.c(j);
            }
            Interpolator interpolator = this.c;
            if (interpolator != null && (view = prgVar.a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.d != null) {
                prgVar.d(this.f);
            }
            View view2 = prgVar.a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.e = true;
    }
}
