package defpackage;

import android.graphics.Rect;
import com.facebook.react.uimanager.events.EventDispatcher;

/* JADX INFO: loaded from: classes2.dex */
public final class tsg implements bx9 {
    public final int a;
    public final int b;
    public final EventDispatcher c;

    public tsg(int i, int i2, EventDispatcher eventDispatcher) {
        this.a = i;
        this.b = i2;
        this.c = eventDispatcher;
    }

    @Override // defpackage.bx9
    public final void a(wsg wsgVar, Rect rect, Rect rect2, boolean z) {
        rect.getClass();
        rect2.getClass();
        this.c.a(new xsg(this.b, this.a, wsgVar, rect, rect2, z));
    }
}
