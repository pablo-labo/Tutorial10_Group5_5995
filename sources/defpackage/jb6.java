package defpackage;

import android.graphics.ColorSpace;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class jb6 {
    public final Object a;
    public final Object b;

    public jb6(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.a = new int[size];
        this.b = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.a)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.b)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public jb6(int i) {
        switch (i) {
            case 4:
                this.a = new ConcurrentHashMap(16, 0.75f, 10);
                this.b = new ReferenceQueue();
                break;
            default:
                this.a = new AtomicInteger();
                this.b = new AtomicInteger();
                break;
        }
    }

    public jb6(h37 h37Var, h37 h37Var2) {
        this.a = h37Var;
        this.b = h37Var2;
    }

    public jb6(int i, int i2, ColorSpace colorSpace) {
        this.a = colorSpace;
        this.b = (i == -1 || i2 == -1) ? null : new Pair(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public jb6(int i, int i2) {
        this.a = new int[]{i, i2};
        this.b = new float[]{0.0f, 1.0f};
    }

    public jb6(int i, int i2, int i3) {
        this.a = new int[]{i, i2, i3};
        this.b = new float[]{0.0f, 0.5f, 1.0f};
    }
}
