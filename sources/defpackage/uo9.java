package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: loaded from: classes.dex */
public class uo9 extends ha1 implements Menu {
    public final nze d;

    public uo9(Context context, nze nzeVar) {
        super(context);
        if (nzeVar != null) {
            this.d = nzeVar;
        } else {
            l5.q("Wrapped Object can not be null.");
            throw null;
        }
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return e(this.d.add(charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.d.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = e(menuItemArr2[i5]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return f(this.d.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public final void clear() {
        jfe jfeVar = (jfe) this.b;
        if (jfeVar != null) {
            jfeVar.clear();
        }
        jfe jfeVar2 = (jfe) this.c;
        if (jfeVar2 != null) {
            jfeVar2.clear();
        }
        this.d.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.d.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        return e(this.d.findItem(i));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return e(this.d.getItem(i));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.d.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return this.d.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.d.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        if (((jfe) this.b) != null) {
            int i2 = 0;
            while (true) {
                jfe jfeVar = (jfe) this.b;
                if (i2 >= jfeVar.c) {
                    break;
                }
                if (((pze) jfeVar.h(i2)).getGroupId() == i) {
                    ((jfe) this.b).j(i2);
                    i2--;
                }
                i2++;
            }
        }
        this.d.removeGroup(i);
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        if (((jfe) this.b) != null) {
            int i2 = 0;
            while (true) {
                jfe jfeVar = (jfe) this.b;
                if (i2 >= jfeVar.c) {
                    break;
                }
                if (((pze) jfeVar.h(i2)).getItemId() == i) {
                    ((jfe) this.b).j(i2);
                    break;
                }
                i2++;
            }
        }
        this.d.removeItem(i);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        this.d.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        this.d.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        this.d.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.d.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.d.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return e(this.d.add(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return f(this.d.addSubMenu(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return e(this.d.add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return f(this.d.addSubMenu(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return e(this.d.add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return f(this.d.addSubMenu(i, i2, i3, i4));
    }
}
