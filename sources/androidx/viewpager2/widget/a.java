package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;
import defpackage.ja;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ViewPager2.e {
    public final ArrayList a = new ArrayList(3);

    @Override // androidx.viewpager2.widget.ViewPager2.e
    public final void a(int i) {
        try {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.e) it.next()).a(i);
            }
        } catch (ConcurrentModificationException e) {
            ja.m("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.e
    public final void b(int i, float f, int i2) {
        try {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.e) it.next()).b(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            ja.m("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.e
    public final void c(int i) {
        try {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.e) it.next()).c(i);
            }
        } catch (ConcurrentModificationException e) {
            ja.m("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }
}
