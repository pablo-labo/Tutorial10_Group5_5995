package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.uimanager.ViewGroupManager;
import defpackage.im0;
import defpackage.s55;
import defpackage.tpc;
import defpackage.w92;
import java.util.ArrayList;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class c {
    public final tpc a;
    public int b;
    public int[] c;

    public c(tpc tpcVar) {
        this.a = tpcVar;
    }

    public final int a(int i, int i2) {
        tpc tpcVar;
        int[] iArr = this.c;
        if (iArr != null && (i2 >= iArr.length || iArr[i2] >= i)) {
            s55.p("ReactNative", "getChildDrawingOrder index out of bounds! Please check any custom view manipulations you may have done. childCount = %d, index = %d", Integer.valueOf(i), Integer.valueOf(i2));
            b();
        }
        if (iArr == null) {
            ArrayList arrayList = new ArrayList();
            byte b = 0;
            int i3 = 0;
            while (true) {
                tpcVar = this.a;
                if (i3 >= i) {
                    break;
                }
                arrayList.add(tpcVar.getChildAt(i3));
                i3++;
            }
            final im0 im0Var = new im0(16, b == true ? 1 : 0);
            w92.E0(new Comparator() { // from class: zpg
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ((Number) im0Var.invoke(obj, obj2)).intValue();
                }
            }, arrayList);
            int[] iArr2 = new int[i];
            for (int i4 = 0; i4 < i; i4++) {
                Object obj = arrayList.get(i4);
                obj.getClass();
                iArr2[i4] = tpcVar.indexOfChild((View) obj);
            }
            this.c = iArr2;
            iArr = iArr2;
        }
        return iArr[i2];
    }

    public final void b() {
        this.b = 0;
        tpc tpcVar = this.a;
        int childCount = tpcVar.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = tpcVar.getChildAt(i);
            ViewGroupManager.INSTANCE.getClass();
            if (ViewGroupManager.Companion.a(childAt) != null) {
                this.b++;
            }
        }
        this.c = null;
    }
}
