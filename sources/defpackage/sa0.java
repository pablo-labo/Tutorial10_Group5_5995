package defpackage;

import android.os.Build;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class sa0 implements hdf {
    public final View a;
    public final Function1<ccf, ccf> b;
    public final gu5<sl8> c;
    public final y4a d = new y4a();
    public final qme e = new qme(new na0(this, 0));
    public final me f = new me(this, 3);
    public final ne g = new ne(this, 2);
    public ActionMode h;
    public ta0 i;

    public static final class a implements ccf {
        public final b a;
        public final oa0 b;
        public final pa0 c;
        public final View d;

        public a(b bVar, oa0 oa0Var, pa0 pa0Var, View view) {
            this.a = bVar;
            this.b = oa0Var;
            this.c = pa0Var;
            this.d = view;
        }

        @Override // defpackage.ccf
        public final qtc a() {
            return (qtc) this.c.invoke();
        }

        @Override // defpackage.ccf
        public final boolean b(Menu menu) {
            e(menu);
            return menu.size() > 0;
        }

        @Override // defpackage.ccf
        public final void c() {
            this.a.close();
        }

        @Override // defpackage.ccf
        public final boolean d(Menu menu) {
            return e(menu);
        }

        public final boolean e(Menu menu) {
            int i;
            ycf ycfVar = (ycf) this.b.invoke();
            if (wl7.b(ycfVar, null)) {
                return false;
            }
            menu.clear();
            List<xcf> list = ycfVar.a;
            int size = list.size();
            int i2 = 1;
            int i3 = 1;
            for (int i4 = 0; i4 < size; i4++) {
                xcf xcfVar = list.get(i4);
                if (xcfVar instanceof edf) {
                    i = i2 + 1;
                    final edf edfVar = (edf) xcfVar;
                    MenuItem menuItemAdd = menu.add(i3, i2, i2, edfVar.b);
                    menuItemAdd.setShowAsAction(2);
                    menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: ra0
                        @Override // android.view.MenuItem.OnMenuItemClickListener
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            edfVar.d.invoke(this.a);
                            return true;
                        }
                    });
                } else {
                    if (xcfVar instanceof ldf) {
                        if (Build.VERSION.SDK_INT >= 28) {
                            i = i2 + 1;
                            ldf ldfVar = (ldf) xcfVar;
                            xjf.a(menu, i2, this.d.getContext(), ldfVar.b, ldfVar.c);
                        }
                    } else if (xcfVar instanceof jdf) {
                        i3++;
                    }
                }
                i2 = i;
            }
            return true;
        }
    }

    public static final class b implements kdf {
        public final go1 a = h22.a(0, 7, null);

        @Override // defpackage.kdf
        public final void close() {
            this.a.f(j6g.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public sa0(View view, Function1<? super ccf, ? extends ccf> function1, gu5<? extends sl8> gu5Var) {
        this.a = view;
        this.b = function1;
        this.c = gu5Var;
    }

    @Override // defpackage.hdf
    public final Object a(zcf zcfVar, c1f c1fVar) {
        Object objB = y4a.b(this.d, new ua0(this, zcfVar, null), c1fVar);
        return objB == g13.a ? objB : j6g.a;
    }
}
