package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModule;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class knc implements Iterator, ze8 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ knc(Object obj, int i) {
        this.a = i;
        this.c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.b < ((List) this.c).size()) {
                }
                break;
            default:
                if (this.b < ((ViewGroup) this.c).getChildCount()) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                int i2 = this.b;
                this.b = i2 + 1;
                return new ModuleHolder((NativeModule) ((List) obj).get(i2));
            default:
                int i3 = this.b;
                this.b = i3 + 1;
                View childAt = ((ViewGroup) obj).getChildAt(i3);
                if (childAt != null) {
                    return childAt;
                }
                k20.o();
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ViewGroup viewGroup = (ViewGroup) this.c;
                int i = this.b - 1;
                this.b = i;
                viewGroup.removeViewAt(i);
                return;
        }
    }
}
