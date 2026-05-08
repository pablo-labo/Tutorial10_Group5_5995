package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class rad extends h42 {
    public final int b;

    public rad(int i) {
        this.b = i;
    }

    @Override // defpackage.g42
    public final void a(ArrayList arrayList) {
        arrayList.getClass();
        if (this.a) {
            int i = this.b;
            for (int size = arrayList.size() - 1; i < size; size--) {
                Collections.swap(arrayList, i, size);
                i++;
            }
        }
    }
}
