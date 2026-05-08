package defpackage;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: loaded from: classes2.dex */
public final class gj1 extends FloatingActionButton.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ BottomAppBar b;

    public class a extends FloatingActionButton.a {
        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.a
        public final void b() {
            int i = BottomAppBar.T0;
        }
    }

    public gj1(BottomAppBar bottomAppBar, int i) {
        this.b = bottomAppBar;
        this.a = i;
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.a
    public final void a(FloatingActionButton floatingActionButton) {
        floatingActionButton.setTranslationX(this.b.A(this.a));
        floatingActionButton.j(new a(), true);
    }
}
