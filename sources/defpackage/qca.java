package defpackage;

import android.content.Context;
import android.view.SubMenu;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;

/* JADX INFO: loaded from: classes2.dex */
public final class qca extends f {
    public final int A;
    public final Class<?> z;

    public qca(Context context, Class<?> cls, int i) {
        super(context);
        this.z = cls;
        this.A = i;
    }

    @Override // androidx.appcompat.view.menu.f
    public final h a(int i, int i2, int i3, CharSequence charSequence) {
        int size = this.f.size() + 1;
        int i4 = this.A;
        if (size > i4) {
            String simpleName = this.z.getSimpleName();
            l5.q(l6.i(w40.h(i4, "Maximum number of items supported by ", simpleName, " is ", ". Limit can be checked with "), simpleName, "#getMaxItemCount()"));
            return null;
        }
        w();
        h hVarA = super.a(i, i2, i3, charSequence);
        hVarA.f(true);
        v();
        return hVarA;
    }

    @Override // androidx.appcompat.view.menu.f, android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.z.getSimpleName().concat(" does not support submenus"));
    }
}
