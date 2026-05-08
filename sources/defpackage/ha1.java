package defpackage;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class ha1 {
    public final Object a;
    public Object b;
    public Object c;

    public ha1(xed xedVar) {
        xedVar.getClass();
        this.a = xedVar;
        this.b = new AtomicBoolean(false);
        this.c = new d2f(new ig(this, 23));
    }

    public zze c() {
        xed xedVar = (xed) this.a;
        xedVar.a();
        if (((AtomicBoolean) this.b).compareAndSet(false, true)) {
            return (zze) ((d2f) this.c).getValue();
        }
        String strD = d();
        xedVar.getClass();
        xedVar.a();
        xedVar.b();
        return xedVar.l().getWritableDatabase().O0(strD);
    }

    public abstract String d();

    public MenuItem e(MenuItem menuItem) {
        if (!(menuItem instanceof pze)) {
            return menuItem;
        }
        pze pzeVar = (pze) menuItem;
        if (((jfe) this.b) == null) {
            this.b = new jfe();
        }
        MenuItem menuItem2 = (MenuItem) ((jfe) this.b).get(pzeVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        fo9 fo9Var = new fo9((Context) this.a, pzeVar);
        ((jfe) this.b).put(pzeVar, fo9Var);
        return fo9Var;
    }

    public SubMenu f(SubMenu subMenu) {
        if (!(subMenu instanceof a0f)) {
            return subMenu;
        }
        a0f a0fVar = (a0f) subMenu;
        if (((jfe) this.c) == null) {
            this.c = new jfe();
        }
        SubMenu subMenu2 = (SubMenu) ((jfe) this.c).get(a0fVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        rwe rweVar = new rwe((Context) this.a, a0fVar);
        ((jfe) this.c).put(a0fVar, rweVar);
        return rweVar;
    }

    public void g(zze zzeVar) {
        zzeVar.getClass();
        if (zzeVar == ((zze) ((d2f) this.c).getValue())) {
            ((AtomicBoolean) this.b).set(false);
        }
    }

    public ha1(Context context) {
        this.a = context;
    }
}
