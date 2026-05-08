package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class lze extends ActionMode {
    public final Context a;
    public final i7 b;

    public static class a {
        public final ActionMode.Callback a;
        public final Context b;
        public final ArrayList<lze> c = new ArrayList<>();
        public final jfe<Menu, Menu> d = new jfe<>();

        public a(Context context, ActionMode.Callback callback) {
            this.b = context;
            this.a = callback;
        }

        public final lze a(i7 i7Var) {
            ArrayList<lze> arrayList = this.c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                lze lzeVar = arrayList.get(i);
                if (lzeVar != null && lzeVar.b == i7Var) {
                    return lzeVar;
                }
            }
            lze lzeVar2 = new lze(this.b, i7Var);
            arrayList.add(lzeVar2);
            return lzeVar2;
        }

        public final boolean b(i7 i7Var, MenuItem menuItem) {
            return this.a.onActionItemClicked(a(i7Var), new fo9(this.b, (pze) menuItem));
        }

        public final boolean c(i7 i7Var, Menu menu) {
            lze lzeVarA = a(i7Var);
            jfe<Menu, Menu> jfeVar = this.d;
            Menu uo9Var = jfeVar.get(menu);
            if (uo9Var == null) {
                uo9Var = new uo9(this.b, (nze) menu);
                jfeVar.put(menu, uo9Var);
            }
            return this.a.onCreateActionMode(lzeVarA, uo9Var);
        }
    }

    public lze(Context context, i7 i7Var) {
        this.a = context;
        this.b = i7Var;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.b.T();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.b.U();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new uo9(this.a, this.b.W());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.b.X();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.b.Y();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.b.c;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.b.a0();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.b.b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.b.b0();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.b.c0();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.b.g0(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.b.i0(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.b.c = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.b.k0(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.b.l0(z);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.b.h0(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.b.j0(i);
    }
}
