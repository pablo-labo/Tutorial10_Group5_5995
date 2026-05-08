package defpackage;

import android.graphics.Rect;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public interface wjc {
    void getClippingRect(Rect rect);

    boolean getRemoveClippedSubviews();

    void updateClippingRect(Set<Integer> set);
}
